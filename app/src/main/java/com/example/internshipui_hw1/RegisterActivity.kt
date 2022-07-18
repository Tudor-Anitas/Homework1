package com.example.internshipui_hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    private fun passwordsMismatch(password : EditText, repeatPassword : EditText) : Boolean{
        return if(password.text.toString() != repeatPassword.text.toString()){
            repeatPassword.error = "Passwords don't match"
            true
        } else {
            false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val toolbar : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarRegister)
        val passwordEditText : EditText = findViewById(R.id.passwordRegisterEditText)
        val passwordRepeatEditText : EditText = findViewById(R.id.passwordRepeatRegisterEditText)
        val registerButton : Button = findViewById(R.id.registerButton)
        val goToLoginText : TextView = findViewById(R.id.goToLoginText)

        toolbar.title = resources.getString(R.string.registerActivity)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        registerButton.setOnClickListener{
            if(!passwordsMismatch(passwordEditText, passwordRepeatEditText)) {
                val mainIntent: Intent = Intent(this, MainActivity::class.java)
                startActivity(mainIntent)
            }
        }

        goToLoginText.setOnClickListener{
            val loginIntent : Intent = Intent(this, LoginActivity::class.java)
            startActivity(loginIntent)
        }

        passwordRepeatEditText.setOnEditorActionListener{_, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                passwordsMismatch(passwordEditText, passwordRepeatEditText)
            }
             false
        }


    }

}