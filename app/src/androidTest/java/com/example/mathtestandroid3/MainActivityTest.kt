package com.example.mathtestandroid3

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        onView(withId(R.id.et_first_number)).perform(ViewActions.typeText("4"))
        onView(withId(R.id.et_second_number)).perform(ViewActions.typeText("4"))
        onView(withId(R.id.plusBtn)).perform(ViewActions.click())
        onView(withId(R.id.tv_result)).check(ViewAssertions.matches(ViewMatchers.withText("8")))
    }

    @Test
    fun simpleDivideAdd() {
        onView(withId(R.id.et_first_number)).perform(ViewActions.typeText("8"))
        onView(withId(R.id.et_second_number)).perform(ViewActions.typeText("4"))
        onView(withId(R.id.divideBtn)).perform(ViewActions.click())
        onView(withId(R.id.tv_result)).check(ViewAssertions.matches(ViewMatchers.withText("2")))
    }

}
