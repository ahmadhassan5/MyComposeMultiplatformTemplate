import androidx.compose.ui.window.application
import com.ahmadhassan.mycomposemultiplatformtemplate.Application
import moe.tlaster.precompose.PreComposeWindow

fun main() {
    application {
        PreComposeWindow(title = "My Compose", onCloseRequest = ::exitApplication) {
            Application()
        }
    }
}
