package com.example.codelabsapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun coutMe(view: View){

        //Gets the value of string form the textview
        val countString = textView.text.toString()

        //turn string in textview into a number able to be incremented
        var count: Int = Integer.parseInt(countString)
        count++

        //Displays the new value in the textview
        textView.text = count.toString()
    }

    fun randomMe(view: View){
        //create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        //get current numberfrom textview
        val countString = textView.text.toString()

        //convert countstring to a number
        val count = Integer.parseInt(countString)

        //Add the count to the extras fro the intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        //start the second activity
        startActivity(randomIntent)
    }
}
