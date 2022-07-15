package com.example.internshipui_hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val toolbar : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarLogin)
        toolbar.title = resources.getString(R.string.loginActivity);

        val goToRegisterText : TextView = findViewById(R.id.goToRegisterText)
        goToRegisterText.setOnClickListener{
            val registerIntent : Intent = Intent(this, RegisterActivity::class.java)
            startActivity(registerIntent)
        }

    }
}