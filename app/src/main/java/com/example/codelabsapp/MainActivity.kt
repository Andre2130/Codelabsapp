package com.example.codelabsapp

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
}
