package com.ahmadhassan.mycomposemultiplatformtemplate


class DesktopPlatform: Platform {
    override val name: String = "Desktop"
}

actual fun getPlatform(): Platform = DesktopPlatform()