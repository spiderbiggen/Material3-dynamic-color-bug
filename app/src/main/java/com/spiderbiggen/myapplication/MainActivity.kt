package com.spiderbiggen.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import com.spiderbiggen.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview("Light")
@Preview("Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(
    "Light - Red",
    group = "dynamic",
    wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE,
)
@Preview(
    "Dark - Red",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "dynamic",
    wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE,
)
@Preview("Light - Blue", group = "dynamic", wallpaper = Wallpapers.BLUE_DOMINATED_EXAMPLE)
@Preview(
    "Dark - Blue",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "dynamic",
    wallpaper = Wallpapers.BLUE_DOMINATED_EXAMPLE
)
@Preview("Light - Green", group = "dynamic", wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE)
@Preview(
    "Dark - Green",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "dynamic",
    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE
)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            Greeting("Android")
        }
    }
}