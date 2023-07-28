package br.senai.sp.jandira.componentes.Components

import android.util.Log
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CaixaDeTexto(
    texto: String,
    meuType: KeyboardType,
    estado: String,
    aoDigitar: (Double                                                                                              ) -> Unit
) {
    OutlinedTextField(
        value = estado,
        onValueChange = {
            aoDigitar
        },
        label = {
            Text(text = texto)
        },
        keyboardOptions = KeyboardOptions(keyboardType = meuType)
    )
}

