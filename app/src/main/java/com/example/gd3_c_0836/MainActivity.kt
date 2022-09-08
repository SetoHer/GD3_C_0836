package com.example.gd3_c_0836

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputLayout
import android.content.Intent
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private  lateinit var inputUsername: TextInputLayout
    private  lateinit var  inputPassword: TextInputLayout
    private  lateinit var  mainLayout: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("User Login")

        inputUsername = findViewById(R.id.inputanLayoutUsername)
        inputPassword = findViewById(R.id.inputanLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)
        val btnClear: Button = findViewById(R.id.btnClear)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnClear.setOnClickListener {
            inputUsername.getEditText()?.setText("")
            inputPassword.getEditText()?.setText("")

            Snackbar.make(mainLayout, "Text Cleared Success", Snackbar.LENGTH_LONG).show()
        }

        btnLogin.setOnClickListener(View.OnClickListener {
            var checkLogin = false
            val username: String = inputUsername.getEditText()?.getText().toString()
            val password: String = inputPassword.getEditText()?.getText().toString()

            if (username.isEmpty()) {
                inputUsername.setError("Username must be filled with text")
                checkLogin = false
            }

            if (password.isEmpty()) {
                inputPassword.setError("Password must be filled with text")
                checkLogin = false
            }

            if (username == "admin" && password == "0836") checkLogin = true
            if (!checkLogin) return@OnClickListener
            val moveHome = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(moveHome)
        })

    }
}