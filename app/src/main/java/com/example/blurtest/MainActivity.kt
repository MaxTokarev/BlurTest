package com.example.blurtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.blurtest.ui.theme.BlurTestTheme
import com.skydoves.cloudy.Cloudy
import xBlur

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlurTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxSize(),
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Cloudy {
                            Text(text = "Blured text", style = MaterialTheme.typography.bodyLarge)
                        }
                        Text(
                            text = "Custom blur",
                            modifier = Modifier.xBlur(16, context = LocalContext.current)
                        )
                        Box(modifier = Modifier.blur(10.dp)) {
                            Text(text = "Default Blur")
                        }
                        Text(text = "Non Blured text")
                    }
                }
            }
        }
    }
}
