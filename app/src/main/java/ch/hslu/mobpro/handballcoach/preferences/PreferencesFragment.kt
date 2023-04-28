package ch.hslu.mobpro.handballcoach.preferences

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import ch.hslu.mobpro.handballcoach.R

class PreferencesFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}