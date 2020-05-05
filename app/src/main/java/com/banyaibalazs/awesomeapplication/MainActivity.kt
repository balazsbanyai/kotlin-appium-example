package com.banyaibalazs.awesomeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun greetings(view: View) {
        AlertDialog.Builder(this)
                .setMessage("Greetings!")
                .setPositiveButton("Hello") { i, v -> i.dismiss() }
                .show()
    }
}
