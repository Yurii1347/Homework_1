package com.yurii.homework10

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lol", "1 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lol", "1 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lol", "1 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lol", "1 onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lol", "1 onDestroy")
    }

}