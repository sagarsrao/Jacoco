package com.example.jacocotestcoveragesamole

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.*
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest {


    @get:Rule
    val intentsTestRule = IntentsTestRule(MainActivity::class.java)


    @Test
    fun changesTextNewActivity() {
        val resultData = Intent()
        val endText = "my name is sagar"
        resultData.putExtra("sweet_name", endText)
        val result = Instrumentation.ActivityResult(Activity.RESULT_OK, resultData)
        intending(toPackage(SecondActivity::class.simpleName)).respondWith(result)
        closeSoftKeyboard()
        onView(withId(R.id.bt_screen_main)).perform(click())
        onView(withId(R.id.tv_show_text)).check(matches(withText(endText)))
    }


}
