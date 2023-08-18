import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Column{
            Row{
                Button(onClick = {
                    val process = Runtime.getRuntime().exec("npm -version")
                    text = process.waitFor().toString()
                }) {
                    Text(text)
                }
                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
            }
            Row{
                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
            }
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
