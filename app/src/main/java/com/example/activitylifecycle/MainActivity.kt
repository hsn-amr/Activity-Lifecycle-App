package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("We are in \"onCreate\" State")
        Log.d("MainActivity", "We are in \"onCreate\" State")
    }

    override fun onStart() {
        super.onStart()
        print("We are in \"onStart\" State")
        Log.d("MainActivity", "We are in \"onStart\" State")
    }

    override fun onResume() {
        super.onResume()
        print("We are in \"onResume\" State")
        Log.d("MainActivity", "We are in \"onResume\" State")
    }

    override fun onPause() {
        super.onPause()
        print("We are in \"onPause\" State")
        Log.d("MainActivity", "We are in \"onPause\" State")
    }

    override fun onStop() {
        super.onStop()
        print("We are in \"onStop\" State")
        Log.d("MainActivity", "We are in \"onStop\" State")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("We are in \"onDestroy\" State")
        Log.d("MainActivity", "We are in \"onDestroy\" State")
    }
}