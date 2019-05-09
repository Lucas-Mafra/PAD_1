package com.example.lol.wakeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtNome : EditText = findViewById<EditText>(R.id.name)
        var txtSobre : EditText = findViewById<EditText>(R.id.midleName)
        var txtAge : EditText = findViewById<EditText>(R.id.age)
        var btnVai : Button = findViewById(R.id.button)

        btnVai.setOnClickListener{
            if(txtAge.text.toString().toInt() >= 18 )
            {
                Toast.makeText(this, "Você é maior de idade", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Você é menor de idade", Toast.LENGTH_LONG).show()
            }
            }
        }


    }

