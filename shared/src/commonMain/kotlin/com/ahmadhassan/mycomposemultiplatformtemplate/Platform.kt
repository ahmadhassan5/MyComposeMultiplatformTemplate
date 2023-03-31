package com.ahmadhassan.mycomposemultiplatformtemplate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform