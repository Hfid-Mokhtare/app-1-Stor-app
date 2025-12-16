package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class PayActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Load the checkout layout containing the button and the hidden popup
        setContentView(R.layout.activity_pay)

        // 1. Get references to the interactive elements
        val continueButton: Button = findViewById(R.id.continue_button)
        val popupOverlay: FrameLayout = findViewById(R.id.popup_overlay)
        val goBack: ImageView = findViewById(R.id.go_back)

        goBack.setOnClickListener {

            // 3. Perform the "Go Back" action
            // The finish() method closes the current Activity and returns
            // the user to the previous one in the back stack.
            finish()

        }

        // 2. Set the click listener on the "Continue" button
        continueButton.setOnClickListener {

            // 3. SHOW THE POPUP:
            // When the button is clicked, change the visibility of the FrameLayout
            // from View.GONE (hidden) to View.VISIBLE (shown).
            popupOverlay.visibility = View.VISIBLE

            // OPTIONAL: If you want to change the button color/text to disabled look
            // after the click (as seen in the image):
            continueButton.text = "PROCESSING..."
            // (You would typically change the background color/drawable here too)
        }

        // 4. (OPTIONAL) Add logic to hide the popup when the user taps it
        // This makes the screen functional again after the confirmation.
        popupOverlay.setOnClickListener {
            popupOverlay.visibility = View.GONE
            continueButton.text = "Continue" // Reset the button text
        }
    }
}


