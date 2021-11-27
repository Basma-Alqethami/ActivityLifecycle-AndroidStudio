package com.example.activitylifecycle_androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = "this is onCreate() method"
        Log.i("MainActivity", text)
    }

    override fun onStart() {
        super.onStart()
        var text = "this is onStart() method"
        Log.i("MainActivity", text)
    }

    override fun onResume() {
        super.onResume()
        var text = "this is onResume() method"
        Log.i("MainActivity", text)
    }

    override fun onPause() {
        super.onPause()
        var text = "this is onPause() method"
        Log.i("MainActivity", text)
    }

    override fun onStop() {
        super.onStop()
        var text = "this is onStop() method"
        Log.i("MainActivity", text)
    }

    override fun onDestroy() {
        super.onDestroy()
        var text = "this is onDestroy() method"
        Log.i("MainActivity", text)
    }
}