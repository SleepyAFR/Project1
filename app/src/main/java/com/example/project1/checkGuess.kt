package com.example.project1

class checkGuess {
    private fun checkGuess(guess: String) : String {
        var result = ""
        for (i in 0..3) {
            val wordToGuess = ""
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            }
            else if (guess[i] in wordToGuess) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result
    }
}