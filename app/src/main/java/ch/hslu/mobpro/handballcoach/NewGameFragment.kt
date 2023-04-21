package ch.hslu.mobpro.handballcoach

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ch.hslu.mobpro.handballcoach.databinding.FragmentNewGameBinding

class NewGameFragment: Fragment(R.layout.fragment_new_game) {

    private var _binding: FragmentNewGameBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewGameBinding.inflate(inflater, container, false)
        return binding.root
    }
}