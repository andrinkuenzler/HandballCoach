package ch.hslu.mobpro.handballcoach


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class EspressoMainUITest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun espressoMainUITest() {
        val button = onView(
            allOf(
                withId(R.id.main_new_game_button), withText("GAME VIEW"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button.check(matches(isDisplayed()))

        val button2 = onView(
            allOf(
                withId(R.id.main_statistics_button), withText("GAME STATISTICS"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button2.check(matches(isDisplayed()))

        val button3 = onView(
            allOf(
                withId(R.id.main_preferences_button), withText("SETTINGS"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button3.check(matches(isDisplayed()))
    }
}
