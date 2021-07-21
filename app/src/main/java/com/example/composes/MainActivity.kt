package com.example.composes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composes.ui.theme.ComposesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    ComposesTheme {
        Surface(color = Color.Yellow) {
            content()
        }
    }
}

@Preview(showBackground = true, name = "Text Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}

@Composable
fun MyScreenContent(names: List<String> = listOf("Android", "there")) {
    Column {
        for (name in names) {
            Greeting(name = name)
            Divider(color = Color.Black)
        }
    }
}