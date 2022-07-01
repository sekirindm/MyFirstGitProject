package com.vogella.myfirstgitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun main() {
        val a = 5
        val b = 234

        val result = a * b
        print("Результат: $result")
    }
}