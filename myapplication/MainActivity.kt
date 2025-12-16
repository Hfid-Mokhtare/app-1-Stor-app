package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout that contains the "create Account" button
        setContentView(R.layout.activity_create_account)

        // 1. Get a reference to the button by its ID
        val createAccountButton: Button = findViewById(R.id.create_account)
        val login : Button = findViewById(R.id.go_to_login)

        login.setOnClickListener {
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        // 2. Set the click listener on the button
        createAccountButton.setOnClickListener {
            // This code runs when the button is clicked:

            // 3. Create an Intent.
            // The Intent specifies the current activity (this) and the
            // destination activity (GetStartActivity::class.java).
            val intent = Intent(this, GetStartActivity::class.java)

            // 4. Start the new activity
            startActivity(intent)
        }
    }
}
