package ch.hslu.mobpro.handballcoach


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class EspressoGameUITest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun esspressoUIGameTest() {
        val materialButton = onView(
            allOf(
                withId(R.id.main_new_game_button), withText("Game View"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val button = onView(
            allOf(
                withId(R.id.new_game_attack_front_left_button), withText("FRONT LEFT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button.check(matches(isDisplayed()))

        val button2 = onView(
            allOf(
                withId(R.id.new_game_attack_front_mid_button), withText("FRONT MIDDLE:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button2.check(matches(isDisplayed()))

        val button3 = onView(
            allOf(
                withId(R.id.new_game_attack_front_right_button), withText("FRONT RIGHT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button3.check(matches(isDisplayed()))

        val button4 = onView(
            allOf(
                withId(R.id.new_game_attack_back_left_button), withText("BACK LEFT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button4.check(matches(isDisplayed()))

        val button5 = onView(
            allOf(
                withId(R.id.new_game_attack_back_mid_button), withText("BACK MIDDLE:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button5.check(matches(isDisplayed()))

        val button6 = onView(
            allOf(
                withId(R.id.new_game_attack_back_right_button), withText("BACK RIGHT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button6.check(matches(isDisplayed()))

        val button7 = onView(
            allOf(
                withId(R.id.new_game_technical_double), withText("DOUBLE ERROR: 0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button7.check(matches(isDisplayed()))

        val button8 = onView(
            allOf(
                withId(R.id.new_game_technical_step), withText("STEP ERROR: 0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button8.check(matches(isDisplayed()))

        val button9 = onView(
            allOf(
                withId(R.id.new_game_technical_catch), withText("CATCH ERROR: 0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button9.check(matches(isDisplayed()))

        val button10 = onView(
            allOf(
                withId(R.id.new_game_defense_front_left_button), withText("FRONT LEFT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button10.check(matches(isDisplayed()))

        val button11 = onView(
            allOf(
                withId(R.id.new_game_defense_front_mid_button), withText("FRONT MIDDLE:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button11.check(matches(isDisplayed()))

        val button12 = onView(
            allOf(
                withId(R.id.new_game_defense_front_right_button), withText("FRONT RIGHT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button12.check(matches(isDisplayed()))

        val button13 = onView(
            allOf(
                withId(R.id.new_game_defense_back_left_button), withText("BACK LEFT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button13.check(matches(isDisplayed()))

        val button14 = onView(
            allOf(
                withId(R.id.new_game_defense_back_mid_button), withText("BACK MIDDLE:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button14.check(matches(isDisplayed()))

        val button15 = onView(
            allOf(
                withId(R.id.new_game_defense_back_right_button), withText("BACK RIGHT:0"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button15.check(matches(isDisplayed()))

        val button16 = onView(
            allOf(
                withId(R.id.new_game_save_button), withText("SAVE"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button16.check(matches(isDisplayed()))

        val button17 = onView(
            allOf(
                withId(R.id.new_game_reset_button), withText("RESET"),
                withParent(withParent(withId(R.id.fragment_host))),
                isDisplayed()
            )
        )
        button17.check(matches(isDisplayed()))
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
