package com.example.jacocotestcoveragesamole

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            if(intent.extras?.getString("MESSAGE_FROM_SCREEN_SECOND")!!.isNotEmpty()){
                textView_main.text = intent.extras?.getString("MESSAGE_FROM_SCREEN_SECOND")

            }
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }

    fun onClick(view: View) {

        val navigateToB =  Intent(this@MainActivity,SecondActivity::class.java)
        navigateToB.putExtra("MESSAGE_FROM_SCREEN_MAIN",ed_userName.text.toString())
        startActivity(navigateToB)

    }
}
