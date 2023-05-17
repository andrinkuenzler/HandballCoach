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
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class EspressoGameStatsUITest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun espressoGameStatsUITest() {
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

        val materialButton2 = onView(
            allOf(
                withId(R.id.new_game_attack_front_left_button), withText("Front Left:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.new_game_attack_front_left_button), withText("Front Left:1"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())

        val materialButton4 = onView(
            allOf(
                withId(R.id.new_game_attack_back_mid_button), withText("Back Middle:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton4.perform(click())

        val materialButton5 = onView(
            allOf(
                withId(R.id.new_game_attack_front_right_button), withText("Front Right:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton5.perform(click())

        val materialButton6 = onView(
            allOf(
                withId(R.id.new_game_defense_front_left_button), withText("Front Left:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    12
                ),
                isDisplayed()
            )
        )
        materialButton6.perform(click())

        val materialButton7 = onView(
            allOf(
                withId(R.id.new_game_defense_front_left_button), withText("Front Left:1"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    12
                ),
                isDisplayed()
            )
        )
        materialButton7.perform(click())

        val materialButton8 = onView(
            allOf(
                withId(R.id.new_game_defense_front_right_button), withText("Front Right:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    14
                ),
                isDisplayed()
            )
        )
        materialButton8.perform(click())

        val materialButton9 = onView(
            allOf(
                withId(R.id.new_game_defense_front_right_button), withText("Front Right:1"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    14
                ),
                isDisplayed()
            )
        )
        materialButton9.perform(click())

        val materialButton10 = onView(
            allOf(
                withId(R.id.new_game_defense_back_mid_button), withText("Back Middle:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    16
                ),
                isDisplayed()
            )
        )
        materialButton10.perform(click())

        val materialButton11 = onView(
            allOf(
                withId(R.id.new_game_defense_back_mid_button), withText("Back Middle:1"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    16
                ),
                isDisplayed()
            )
        )
        materialButton11.perform(click())

        val materialButton12 = onView(
            allOf(
                withId(R.id.new_game_technical_step), withText("Step Error: 0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    9
                ),
                isDisplayed()
            )
        )
        materialButton12.perform(click())

        val materialButton13 = onView(
            allOf(
                withId(R.id.new_game_technical_catch), withText("Catch Error: 0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    10
                ),
                isDisplayed()
            )
        )
        materialButton13.perform(click())

        val materialButton14 = onView(
            allOf(
                withId(R.id.new_game_technical_catch), withText("Catch Error: 1"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    10
                ),
                isDisplayed()
            )
        )
        materialButton14.perform(click())

        val materialButton15 = onView(
            allOf(
                withId(R.id.new_game_defense_back_left_button), withText("Back Left:0"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    15
                ),
                isDisplayed()
            )
        )
        materialButton15.perform(click())

        val appCompatEditText = onView(
            allOf(
                withId(R.id.new_game_save_game_name),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    20
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("TV Sarnen vs . Test"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.new_game_save_game_name), withText("TV Sarnen vs . Test"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    20
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(pressImeActionButton())

        val materialButton16 = onView(
            allOf(
                withId(R.id.new_game_save_button), withText("Save"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    21
                ),
                isDisplayed()
            )
        )
        materialButton16.perform(click())

        val materialButton17 = onView(
            allOf(
                withId(R.id.main_statistics_button), withText("Game Statistics"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.fragment_host),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton17.perform(click())

        val textView = onView(
            allOf(
                withId(android.R.id.text1), withText("TV Sarnen vs . Test"),
                withParent(
                    allOf(
                        withId(R.id.statistics_spinner),
                        withParent(IsInstanceOf.instanceOf(android.view.ViewGroup::class.java))
                    )
                ),
                isDisplayed()
            )
        )
        textView.check(matches(withText("TV Sarnen vs . Test")))
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
