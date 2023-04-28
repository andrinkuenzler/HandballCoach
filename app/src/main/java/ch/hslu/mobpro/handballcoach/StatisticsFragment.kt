package ch.hslu.mobpro.handballcoach

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import ch.hslu.mobpro.handballcoach.databinding.FragmentStatisticsBinding
import kotlinx.coroutines.launch

class StatisticsFragment: Fragment(R.layout.fragment_statistics), AdapterView.OnItemSelectedListener {

    private var _binding: FragmentStatisticsBinding? = null
    private val binding get() = _binding!!

    private lateinit var handballDao: HandballDao
    private lateinit var gameTitles: List<String>

    private var firstSpinnerSelection = true
    private var currentSelection = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = HandballDatabase.getDatabase(requireContext())
        handballDao = db.handballDao()

        lifecycleScope.launch{
            val games = handballDao.getAllGames()
            gameTitles = games.map { it.title!! }

            val spinner = binding.statisticsSpinner
            val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, gameTitles)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        binding.statisticsSpinner.onItemSelectedListener = this

        binding.statisticsDeleteGame.setOnClickListener { deleteGame() }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (!firstSpinnerSelection) {
            currentSelection = parent!!.getItemAtPosition(position) as String
            showGameStatistics(currentSelection)
        }
        firstSpinnerSelection = false
    }

    override fun onNothingSelected(parent: AdapterView<*>?) { }

    @SuppressLint("SetTextI18n")
    private fun showGameStatistics(gameTitle: String) {
        lifecycleScope.launch{
            val game = handballDao.getGameByTitle(gameTitle)
            binding.statisticsShowTitle.text = getString(R.string.statistics_show_title) + " " + game.title
            binding.statisticsShowAttackFrontLeft.text = getString(R.string.statistics_show_attack_front_left) + " " + game.attackFrontLeft
            binding.statisticsShowAttackFrontMid.text = getString(R.string.statistics_show_attack_front_mid) + " " + game.attackFrontMid
            binding.statisticsShowAttackFrontRight.text = getString(R.string.statistics_show_attack_front_right) + " " + game.attackFrontRight
            binding.statisticsShowAttackBackLeft.text = getString(R.string.statistics_show_attack_back_left) + " " + game.attackBackLeft
            binding.statisticsShowAttackBackMid.text = getString(R.string.statistics_show_attack_back_mid) + " " + game.attackBackMid
            binding.statisticsShowAttackBackRight.text = getString(R.string.statistics_show_attack_back_right) + " " + game.attackBackRight
            binding.statisticsShowDefenseFrontLeft.text = getString(R.string.statistics_show_defense_front_left) + " " + game.defenseFrontLeft
            binding.statisticsShowDefenseFrontMid.text = getString(R.string.statistics_show_defense_front_mid) + " " + game.defenseFrontMid
            binding.statisticsShowDefenseFrontRight.text = getString(R.string.statistics_show_defense_front_right) + " " + game.defenseFrontRight
            binding.statisticsShowDefenseBackLeft.text = getString(R.string.statistics_show_defense_back_left) + " " + game.defenseBackLeft
            binding.statisticsShowDefenseBackMid.text = getString(R.string.statistics_show_defense_back_mid) + " " + game.defenseBackMid
            binding.statisticsShowDefenseBackRight.text = getString(R.string.statistics_show_defense_back_right) + " " + game.defenseBackRight
        }
    }

    private fun deleteGame() {
        if(currentSelection != "") {
            lifecycleScope.launch {
                handballDao.deleteGame(currentSelection)
            }
            Toast.makeText(requireContext(), "Deleted: $currentSelection", Toast.LENGTH_LONG).show()
            parentFragmentManager.popBackStack()
        }

    }
}