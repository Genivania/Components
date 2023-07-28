package br.senai.sp.jandira.componentes.login.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.componentes.Components.CaixaDeTexto
import kotlin.math.log

@Composable
fun Form() {
    var emailState = remember {
        mutableStateOf("")

    }
    Card() {
        Column() {
            CaixaDeTexto(
                texto = "E-mail",
                meuType = KeyboardType.Email,
                aoDigitar = {
                    emailState.value = it
                }
            )
            CaixaDeTexto(
                texto = "Senha",
                meuType = KeyboardType.Password,
                aoDigitar = {

                }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}