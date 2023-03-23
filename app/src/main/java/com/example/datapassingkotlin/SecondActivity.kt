package com.example.datapassingkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var data1: TextView
    lateinit var data2:TextView
    lateinit var data3:TextView
    lateinit var activity1btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Refer to textview

        //Refer to textview
        data1 = findViewById(R.id.data1txtview)
        data2 = findViewById(R.id.data2txtview)
        data3 = findViewById(R.id.data3txtview)
        activity1btn = findViewById(R.id.activity1btn)

        //Get data from Activity 1

        //Get data from Activity 1
        val Data1 = "Data1: " + intent.extras!!.getString("Data1")
        val Data2 = "Data2: " + intent.extras!!.getString("Data2")
        val Data3 = "Data3: " + intent.extras!!.getString("Data3")

        //Set Data to Text View

        //Set Data to Text View
        data1.text = Data1
        data2.text = Data2
        data3.text = Data3

        activity1btn.setOnClickListener {
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this@SecondActivity, MainActivity::class.java)
        startActivity(intent)
        super.onBackPressed()
    }
}