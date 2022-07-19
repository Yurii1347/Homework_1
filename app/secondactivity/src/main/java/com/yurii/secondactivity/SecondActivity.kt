package com.yurii.secondactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("lol", "2 onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lol", "2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lol", "2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lol", "2 onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lol", "2 onDestroy")
    }
}