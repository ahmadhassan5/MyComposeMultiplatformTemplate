package com.ahmadhassan.mycomposemultiplatformtemplate.android

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ahmadhassan.mycomposemultiplatformtemplate.Application
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent

class MainActivity : PreComposeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Application()
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Application()
}
