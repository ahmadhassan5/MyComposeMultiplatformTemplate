package com.ahmadhassan.mycomposemultiplatformtemplate

import androidx.compose.runtime.Composable

/**
 * Created by Ahmad Hassan on 22/03/2023.
 */

@Composable
fun Application() {
    GreetingView(Greeting().greet())
}