package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(MainActivity::class.java.name, "Esto es un log v de cosas poco importantes")
        Log.d(MainActivity::class.java.name, "Esto es un log d de debugger")
        Log.i(MainActivity::class.java.name, "Esto es un log i informativo")
        Log.w(MainActivity::class.java.name, "Esto es un log w warning")
        Log.e(MainActivity::class.java.name, "Esto es un log e de errores, mur importante")


    }
}