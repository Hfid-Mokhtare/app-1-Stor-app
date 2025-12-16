package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GetStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // It loads your destination layout file (activity_get_start.xml)
        setContentView(R.layout.activity_get_start)


        // 1. Get a reference to the button by its ID
        val GoToPaymentPage: Button = findViewById(R.id.get_started)

        // 2. Set the click listener on the button
        GoToPaymentPage.setOnClickListener {
            // This code runs when the button is clicked:

            // 3. Create an Intent.
            // The Intent specifies the current activity (this) and the
            // destination activity (GetStartActivity::class.java).
            val intent = Intent(this, PayActivity::class.java)

            // 4. Start the new activity
            startActivity(intent)
        }

    }
}