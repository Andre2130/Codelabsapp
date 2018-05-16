package com.example.codelabsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        //Get count from intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //Generate random number
        val random = Random()
        var randomInt = 0
        //Add one because is exclusive
        if(count > 0){
            randomInt = random.nextInt(count + 1)
        }

        //Display the random number
        textview_random.text = Integer.toString(randomInt)

        //substitute the max value into the string resource
        //for teh heading, and update the heding
        textview_lable.text = getString(R.string.random_heading, count)
    }
}
