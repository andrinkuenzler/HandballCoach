package ch.hslu.mobpro.handballcoach

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ch.hslu.mobpro.handballcoach.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // New Game
        binding.mainNewGameButton.setOnClickListener{
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_host, NewGameFragment())
                .addToBackStack("newGame")
                .commit()
        }

        // Statistics
        binding.mainStatisticsButton.setOnClickListener{
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_host, StatisticsFragment())
                .addToBackStack("statistics")
                .commit()
        }

        // Preferences
        binding.mainPreferencesButton.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_host, PreferencesFragment())
                .addToBackStack("settingsPage")
                .commit()
        }
    }
}