package com.example.jacocotestcoveragesamole

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        try {
            if(intent.extras?.getString("MESSAGE_FROM_SCREEN_MAIN")!!.isNotEmpty()){
                tv_show_text.text = intent.extras?.getString("MESSAGE_FROM_SCREEN_MAIN")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun navigate(view : View) {

        //ed_text_person_name
        val navigateToB =  Intent(this@SecondActivity,MainActivity::class.java)
        navigateToB.putExtra("MESSAGE_FROM_SCREEN_SECOND",ed_text_person_name.text.toString())
        startActivity(navigateToB)

    }
}
