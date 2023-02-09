package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.guessEv
import com.example.project1.FourLetterWordList.FourLetterWordList.getRandomFourLetterWord

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flw = getRandomFourLetterWord()
        //set flw to random four letter word
        val guessEv = findViewById<View>(android.R.id.guessEv) as EditText
        var strValue = ""
        var x = 0
        fun sendGuess(view: View) {
            x++
            // Do something in response to button click
            strValue = guessEv.text.toString()
            if (x == 4 && flw != strValue) {
                //if 4 attempts are made and guess is not correct
                strValue.checkGuess()
                val toast = Toast.makeText(applicationContext, "You are out of guesses", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                toast.show()
            }
            if (x <= 4 && flw == strValue) {
                //if attempts are 4 or below and guess is correct
                checkGuess()
                val toast = Toast.makeText(applicationContext, "You guessed the word!", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                toast.show()
            }
            if (x < 4 && flw != strValue) {
                //if attempts are below 4 and guess is incorrect
               checkGuess()
            }
        }
    }

}
