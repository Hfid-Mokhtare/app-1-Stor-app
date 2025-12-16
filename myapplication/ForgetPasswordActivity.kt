package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class ForgetPasswordActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout that contains the "create Account" button
        setContentView(R.layout.activity_forget_password)

        val submit: Button = findViewById(R.id.send_email)
        val popupOverlay: FrameLayout = findViewById(R.id.message)


        submit.setOnClickListener {

            // 3. SHOW THE POPUP:
            // When the button is clicked, change the visibility of the FrameLayout
            // from View.GONE (hidden) to View.VISIBLE (shown).
            submit.visibility = View.VISIBLE

            // OPTIONAL: If you want to change the button color/text to disabled look
            // after the click (as seen in the image):
            submit.text = "PROCESSING..."
            // (You would typically change the background color/drawable here too)
        }

        // 4. (OPTIONAL) Add logic to hide the popup when the user taps it
        // This makes the screen functional again after the confirmation.
        popupOverlay.setOnClickListener {
            popupOverlay.visibility = View.GONE
            submit.text = "Continue" // Reset the button text
        }

    }
}