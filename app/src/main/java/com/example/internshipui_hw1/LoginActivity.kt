package com.example.internshipui_hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class LoginActivity : AppCompatActivity() {

    private fun fieldAreEmpty(username : EditText, password : EditText) : Boolean {
        return username.text.toString().isEmpty() || password.text.toString().isEmpty()
    }

    private fun enableButton(username: EditText, password: EditText, button : Button){
        if(!fieldAreEmpty(username, password)){
            button.isEnabled = true
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val toolbar : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarLogin)
        val loginButton : Button = findViewById(R.id.loginButton)
        val goToRegisterText : TextView = findViewById(R.id.goToRegisterText)
        val usernameEditText : EditText = findViewById(R.id.usernameLoginEditText)
        val passwordEditText : EditText = findViewById(R.id.passwordLoginEditText)

        passwordEditText.addTextChangedListener{
            loginButton.isEnabled =
                usernameEditText.text.toString().isNotEmpty() && passwordEditText.text.toString().isNotEmpty()
        }

        toolbar.title = resources.getString(R.string.loginActivity);

        loginButton.setOnClickListener{
            if(!fieldAreEmpty(usernameEditText, passwordEditText)) {
                val mainActivityIntent: Intent = Intent(this, MainActivity::class.java)
                startActivity(mainActivityIntent)
            }
        }

        goToRegisterText.setOnClickListener{
            val registerIntent : Intent = Intent(this, RegisterActivity::class.java)
            startActivity(registerIntent)
        }

    }
}