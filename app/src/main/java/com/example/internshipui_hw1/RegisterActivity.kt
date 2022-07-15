package com.example.internshipui_hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val toolbar : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarRegister)
        val registerButton : Button = findViewById(R.id.registerButton)
        val goToLoginText : TextView = findViewById(R.id.goToLoginText)

        toolbar.title = resources.getString(R.string.registerActivity)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        registerButton.setOnClickListener{
            val mainIntent : Intent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }

        goToLoginText.setOnClickListener{
            val loginIntent : Intent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }


    }
}