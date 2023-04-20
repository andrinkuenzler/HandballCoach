package ch.hslu.mobpro.handballcoach

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.preference.PreferenceManager

class PreferencesViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        private const val PREF_LANG_SHORT = "preferences_language_list"
        private const val PREF_THEME_LIST = "preferences_dark_mode_list"
    }

    private val preferences = PreferenceManager
        .getDefaultSharedPreferences(getApplication<Application>().applicationContext)

    fun getTheme() : String {
        val summaryString = StringBuilder()
        summaryString.append(preferences.getString(PREF_THEME_LIST, "System default"))
        return summaryString.toString()
    }

    fun getLanguage(): String {
        val summaryString = StringBuilder()
        summaryString.append(preferences.getString(PREF_LANG_SHORT, "System default"))
        return summaryString.toString()
    }
}