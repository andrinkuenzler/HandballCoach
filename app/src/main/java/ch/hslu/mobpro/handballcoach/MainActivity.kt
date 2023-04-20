package ch.hslu.mobpro.handballcoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme()
        setLanguage()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_host, MainFragment())
            .commit()
    }

    private fun setTheme() {
        val preferencesViewModel = PreferencesViewModel(application)
        when(preferencesViewModel.getTheme()) {
            "System default" -> {
                AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM))
                delegate.applyDayNight()
            }
            "Light Mode" -> {
                AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_NO))
                delegate.applyDayNight()
            }
            "Dark Mode" -> {
                AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_YES))
                delegate.applyDayNight()
            }
        }
    }

    private fun setLanguage() {
        val preferencesViewModel = PreferencesViewModel(application)
        when(preferencesViewModel.getLanguage()) {
            "Deutsch" -> {
                AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags("de"))
            }
            "English" -> {
                AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags("en"))
            }
        }
    }
}