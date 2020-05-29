package br.com.newton.transparente.utils

import android.widget.EditText
import br.com.concrete.canarinho.watcher.MascaraNumericaTextWatcher

fun EditText.handleDate() {
    addTextChangedListener(
        MascaraNumericaTextWatcher.Builder()
            .paraMascara("##/####")
            .build()
    )
}