package com.example.myapplication

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "No señor $name!",
        modifier = modifier
    )
    // comentario aca
    // comentario 3
    // comentario 4
}