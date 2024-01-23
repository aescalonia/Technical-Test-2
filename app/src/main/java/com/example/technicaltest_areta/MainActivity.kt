package com.example.technicaltest_areta

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameInput = findViewById<EditText>(R.id.editTextUsername)
        val passwordInput = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                if (username == "alfagift-admin" && password == "asdf") {
                    // Login berhasil
                    val intent = Intent(this, StudentList::class.java)
                    startActivity(intent)
                } else {
                    // Tidak valid
                    Toast.makeText(this, "Username atau password tidak valid", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Kolom kosong
                Toast.makeText(this, "Username dan password tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun togglePasswordVisibility() {
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
        val showPasswordImage = findViewById<ImageView>(R.id.imageViewShowPassword)

        if (passwordEditText.inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
            passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            showPasswordImage.setImageResource(R.drawable.baseline_visibility_off_24)
        } else {
            passwordEditText.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            showPasswordImage.setImageResource(R.drawable.baseline_visibility_24)
        }
        passwordEditText.setSelection(passwordEditText.text.length)
    }
}
