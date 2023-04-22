package ch.hslu.mobpro.handballcoach

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import ch.hslu.mobpro.handballcoach.databinding.FragmentNewGameBinding

class NewGameFragment: Fragment(R.layout.fragment_new_game) {

    private var _binding: FragmentNewGameBinding? = null
    private val binding get() = _binding!!
    private lateinit var handballDao: HandballDao

    private val counterViewModel: CounterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val db = HandballDatabase.getDatabase(requireContext())
        handballDao = db.handballDao()

        // Counter Text
        setCounterText()
        setUpCounters()
        binding.newGameResetButton.setOnClickListener{ resetCounters() }

        // Save Game to Room DB
        binding.newGameSaveButton.setOnClickListener{
            val title = binding.newGameSaveGameName.text.toString()
            val attackFrontLeft = counterViewModel.getCounterAttackFrontLeft().toString()
            val attackFrontMid = counterViewModel.getCounterAttackFrontMid().toString()
            val attackFrontRight = counterViewModel.getCounterAttackFrontRight().toString()
            val attackBackLeft = counterViewModel.getCounterAttackBackLeft().toString()
            val attackBackMid = counterViewModel.getCounterAttackBackMid().toString()
            val attackBackRight = counterViewModel.getCounterAttackBackRight().toString()
            val defenseFrontLeft = counterViewModel.getCounterDefenseFrontLeft().toString()
            val defenseFrontMid = counterViewModel.getCounterDefenseFrontMid().toString()
            val defenseFrontRight = counterViewModel.getCounterDefenseFrontRight().toString()
            val defenseBackLeft = counterViewModel.getCounterDefenseBackLeft().toString()
            val defenseBackMid = counterViewModel.getCounterDefenseBackMid().toString()
            val defenseBackRight = counterViewModel.getCounterDefenseBackRight().toString()
            val handball = Handball(
                title = title,
                attackFrontLeft = attackFrontLeft,
                attackFrontMid = attackFrontMid,
                attackFrontRight = attackFrontRight,
                attackBackLeft = attackBackLeft,
                attackBackMid = attackBackMid,
                attackBackRight = attackBackRight,
                defenseFrontLeft = defenseFrontLeft,
                defenseFrontMid = defenseFrontMid,
                defenseFrontRight = defenseFrontRight,
                defenseBackLeft = defenseBackLeft,
                defenseBackMid = defenseBackMid,
                defenseBackRight = defenseBackRight
            )
            handballDao.insert(handball)
            Toast.makeText(requireContext(), "Game saved", Toast.LENGTH_LONG).show()
            resetCounters()
            parentFragmentManager.popBackStack()
        }
    }

    private fun setCounterText() {
        // Attack Front
        binding.newGameAttackFrontLeftButton.text = getString(R.string.new_game_attack_front_left_button) + "" + counterViewModel.getCounterAttackFrontLeft().toString()
        binding.newGameAttackFrontMidButton.text = getString(R.string.new_game_attack_front_mid_button) + "" + counterViewModel.getCounterAttackFrontMid().toString()
        binding.newGameAttackFrontRightButton.text = getString(R.string.new_game_attack_front_right_button) + "" + counterViewModel.getCounterAttackFrontRight().toString()
        // Attack Back
        binding.newGameAttackBackLeftButton.text = getString(R.string.new_game_attack_back_left_button) + "" + counterViewModel.getCounterAttackBackLeft().toString()
        binding.newGameAttackBackMidButton.text = getString(R.string.new_game_attack_back_mid_button) + "" + counterViewModel.getCounterAttackBackMid().toString()
        binding.newGameAttackBackRightButton.text = getString(R.string.new_game_attack_back_right_button) + "" + counterViewModel.getCounterAttackBackRight().toString()
        // Defense Front
        binding.newGameDefenseFrontLeftButton.text = getString(R.string.new_game_defense_front_left_button) + "" + counterViewModel.getCounterDefenseFrontLeft().toString()
        binding.newGameDefenseFrontMidButton.text = getString(R.string.new_game_defense_front_mid_button) + "" + counterViewModel.getCounterDefenseFrontMid().toString()
        binding.newGameDefenseFrontRightButton.text = getString(R.string.new_game_defense_front_right_button) + "" + counterViewModel.getCounterDefenseFrontRight().toString()
        // Defense Back
        binding.newGameDefenseBackLeftButton.text = getString(R.string.new_game_defense_back_left_button) + "" + counterViewModel.getCounterDefenseBackLeft().toString()
        binding.newGameDefenseBackMidButton.text = getString(R.string.new_game_defense_back_mid_button) + "" + counterViewModel.getCounterDefenseBackMid().toString()
        binding.newGameDefenseBackRightButton.text = getString(R.string.new_game_defense_back_right_button) + "" + counterViewModel.getCounterDefenseBackRight().toString()
    }

    private fun setUpCounters() {
        // Attack Front
        val attackFrontLeft = binding.newGameAttackFrontLeftButton
        val attackFrontMid = binding.newGameAttackFrontMidButton
        val attackFrontRight = binding.newGameAttackFrontRightButton
        // Attack Back
        val attackBackLeft = binding.newGameAttackBackLeftButton
        val attackBackMid = binding.newGameAttackBackMidButton
        val attackBackRight = binding.newGameAttackBackRightButton
        // Defense Front
        val defenseFrontLeft = binding.newGameDefenseFrontLeftButton
        val defenseFrontMid = binding.newGameDefenseFrontMidButton
        val defenseFrontRight = binding.newGameDefenseFrontRightButton
        // Defense Back
        val defenseBackLeft = binding.newGameDefenseBackLeftButton
        val defenseBackMid = binding.newGameDefenseBackMidButton
        val defenseBackRight = binding.newGameDefenseBackRightButton

        // Attack Front
        attackFrontLeft.setOnClickListener{ view ->
            counterViewModel.incCounterAttackFrontLeft()
            attackFrontLeft.text = getString(R.string.new_game_attack_front_left_button) + "" + counterViewModel.getCounterAttackFrontLeft().toString()
        }

        attackFrontMid.setOnClickListener{ view ->
            counterViewModel.incCounterAttackFrontMid()
            attackFrontMid.text = getString(R.string.new_game_attack_front_mid_button) + "" + counterViewModel.getCounterAttackFrontMid().toString()
        }

        attackFrontRight.setOnClickListener{ view ->
            counterViewModel.incCounterAttackFrontRight()
            attackFrontRight.text = getString(R.string.new_game_attack_front_right_button) + "" + counterViewModel.getCounterAttackFrontRight().toString()
        }

        // Attack Back
        attackBackLeft.setOnClickListener{ view ->
            counterViewModel.incCounterAttackBackLeft()
            attackBackLeft.text = getString(R.string.new_game_attack_back_left_button) + "" + counterViewModel.getCounterAttackBackLeft().toString()
        }

        attackBackMid.setOnClickListener{ view ->
            counterViewModel.incCounterAttackBackMid()
            attackBackMid.text = getString(R.string.new_game_attack_back_mid_button) + "" + counterViewModel.getCounterAttackBackMid().toString()
        }

        attackBackRight.setOnClickListener{ view ->
            counterViewModel.incCounterAttackBackRight()
            attackBackRight.text = getString(R.string.new_game_attack_back_right_button) + "" + counterViewModel.getCounterAttackBackRight().toString()
        }

        // Defense Front
        defenseFrontLeft.setOnClickListener{ view ->
            counterViewModel.incCounterDefenseFrontLeft()
            defenseFrontLeft.text = getString(R.string.new_game_defense_front_left_button) + "" + counterViewModel.getCounterDefenseFrontLeft().toString()
        }

        defenseFrontMid.setOnClickListener{ view ->
            counterViewModel.incCounterDefenseFrontMid()
            defenseFrontMid.text = getString(R.string.new_game_defense_front_mid_button) + "" + counterViewModel.getCounterDefenseFrontMid().toString()
        }

        defenseFrontRight.setOnClickListener{ view ->
            counterViewModel.incCounterDefenseFrontRight()
            defenseFrontRight.text = getString(R.string.new_game_defense_front_right_button) + "" + counterViewModel.getCounterDefenseFrontRight().toString()
        }

        // Defense Back
        defenseBackLeft.setOnClickListener{ view ->
            counterViewModel.incCounterDefenseBackLeft()
            defenseBackLeft.text = getString(R.string.new_game_defense_back_left_button) + "" + counterViewModel.getCounterDefenseBackLeft().toString()
        }

        defenseBackMid.setOnClickListener{ view ->
            counterViewModel.incCounterDefenseBackMid()
            defenseBackMid.text = getString(R.string.new_game_defense_back_mid_button) + "" + counterViewModel.getCounterDefenseBackMid().toString()
        }

        defenseBackRight.setOnClickListener{ view ->
            counterViewModel.incCounterDefenseBackRight()
            defenseBackRight.text = getString(R.string.new_game_defense_back_right_button) + "" + counterViewModel.getCounterDefenseBackRight().toString()
        }
    }

    private fun resetCounters() {
        counterViewModel.resetAllCounters()
        setCounterText()
    }
}