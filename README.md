## 🛍️ E-Commerce Flow UI (Android Native)

A simple, visually appealing UI implementation demonstrating key navigation and interaction flows common in modern e-commerce and authentication applications, built using **Android's native XML layout system** and **Kotlin**.

### ✨ Features Demonstrated

This project showcases the XML structure and Kotlin logic for four core mobile application screens:

1.  **Splash Screen/Welcome:** Full-screen background image layering with centered text and a primary action button.
2.  **Authentication (`Create Account`):** Complex form layout using `TextInputLayout` (implied by design) and integrating social login options.
3.  **Checkout Flow:** Multi-row, structured data presentation (`Order`, `Shipping`, `Total`), custom payment method selection, and a sticky action button.
4.  **Modal/Popup Handling:** Demonstrates how to use a hidden `FrameLayout` overlay to display a success message ("Payment done successfully") when a button is clicked.
5.  **Robust Navigation:** Implements `Intent` navigation between Activities and correct use of the `finish()` method for the "Go Back" action.

### 🖼️ Screenshots

**NOTE:** For these images to display correctly on GitHub, you must upload the corresponding files to your repository (e.g., in the root directory or an `images/` folder).

| Welcome Screen | Create Account | Checkout Flow | Success Popup |
| :---: | :---: | :---: | :---: |
| ![Welcome Screen](Screenshot_20251216_173946.jpg) | ![Create Account](Screenshot_20251216_173746.jpg) | ![Checkout Screen](Screenshot 2025-12-16 141921.png) | ![Payment Success](Screenshot 2025-12-16 145920.png) |

### 🛠️ Technology Stack

* **Platform:** Android Native
* **Language:** Kotlin
* **Layouts:** Android XML (`LinearLayout`, `FrameLayout`)
* **Tooling:** Android Studio

### 🏗️ Key Implementation Details

#### **1. XML Structure for Stacking (Splash & Popups)**

The project utilizes `FrameLayout` for screens where content must be layered:
* **Splash Screen:** An `ImageView` (`centerCrop`) is layered beneath a `TextView` and `Button`.
* **Checkout Success Modal:** The primary `LinearLayout` for the checkout form is layered beneath a transparent, full-screen `FrameLayout` (`#99000000` background for dimming) which contains the centered white dialog box.

#### **2. Layout Composition (Checkout Flow)**

The Checkout screen is built using nested `LinearLayout` elements:
* The main vertical `LinearLayout` contains sections for `Price Details` and `Payment Methods`.
* Horizontal `LinearLayouts` are used inside the `Price Details` section to align labels ("Order", "Shipping") with values ("₹ 7,000", "₹ 30") using `android:layout_weight="1"`.

#### **3. Kotlin Navigation (`Intents`)**

Navigation between Activities is handled reliably using explicit `Intents`:

```kotlin
// Example: Navigating from Create Account to Get Started
createAccountButton.setOnClickListener {
    val intent = Intent(this, GetStartActivity::class.java)
    startActivity(intent)
}
