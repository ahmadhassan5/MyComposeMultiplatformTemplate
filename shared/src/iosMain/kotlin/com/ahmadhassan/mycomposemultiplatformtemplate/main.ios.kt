package com.ahmadhassan.mycomposemultiplatformtemplate

import androidx.compose.ui.window.ComposeUIViewController
import moe.tlaster.precompose.PreComposeApplication
import platform.UIKit.UIViewController

/**
 * Created by Ahmad Hassan on 16/03/2023.
 */

fun MainViewController(): UIViewController {

    return PreComposeApplication("My Compose") {
        GreetingView(Greeting().greet())
    }
}