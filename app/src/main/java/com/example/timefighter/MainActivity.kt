package com.example.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var gameScoreTextView: TextView
    private lateinit var timeLeftTextView: TextView
    private lateinit var tapMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // connect views to variables
        gameScoreTextView = findViewById(R.id.game_score_tv)
        timeLeftTextView = findViewById(R.id.time_left_tv)
        tapMeButton = findViewById(R.id.tap_me_btn)
    }

    private fun incrementScore() {
        // increment score logic
    }
    private fun resetGame() {
        // reset game logic
    }
    private fun startGame() {
        // start game logic
    }
    private fun endGame() {
        // end game logic
    }
}