package br.com.newton.transparente.utils

import android.widget.EditText
import android.widget.TextView
import br.com.concrete.canarinho.watcher.MascaraNumericaTextWatcher
import br.com.concrete.canarinho.watcher.ValorMonetarioWatcher

fun EditText.handleDate() {
    addTextChangedListener(
        MascaraNumericaTextWatcher.Builder()
            .paraMascara("##/####")
            .build()
    )
}

fun TextView.handleMoneyRS() = addTextChangedListener(
    ValorMonetarioWatcher.Builder()
        .comSimboloReal()
        .comMantemZerosAoLimpar()
        .build()
)