package com.example.datapassingkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var data1: EditText
    private lateinit var data2:EditText
    private lateinit var data3:EditText
    private lateinit var passdata: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data1 = findViewById(R.id.data1)
        data2 = findViewById(R.id.data2)
        data3 = findViewById(R.id.data3)
        passdata = findViewById(R.id.passData)

        passdata.setOnClickListener {
            val Data1 = data1.text.toString()
            val Data2 = data2.text.toString()
            val Data3 = data3.text.toString()

            val i = Intent(this@MainActivity, SecondActivity::class.java)

            i.putExtra("Data1", Data1)
            i.putExtra("Data2", Data2)
            i.putExtra("Data3", Data3)
            startActivity(i)
            finish()
        }
    }
}