package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity(), ChangeFragment {

    private var fragment1: FrameLayout? = null
    private var btnAdd: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setupListener()
    }

    private fun setupViews(){
        fragment1 = findViewById(R.id.Frame1)
        btnAdd = findViewById(R.id.btnAdd)
    }

    private fun setupListener() {
        btnAdd?.setOnClickListener{
            createFragment()
        }
    }

    private fun createFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.Frame1, SecondFragment())
            .commit()

    }

    override fun fragmentChange() {
        supportFragmentManager.beginTransaction().replace(R.id.Frame1, RemoveFragment()).commit()
    }

    override fun fragmentChange1() {
        Toast.makeText(this, "Мда", Toast.LENGTH_LONG).show()    }
    }

