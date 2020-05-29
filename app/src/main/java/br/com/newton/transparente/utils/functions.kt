package br.com.newton.transparente.utils

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager

fun downKeyboard(activity: Activity) {
    val imm: InputMethodManager =
        activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    val view: View = activity.currentFocus!!
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}