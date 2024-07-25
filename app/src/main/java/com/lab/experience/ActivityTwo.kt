package com.lab.experience

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lab.experience.ui.theme.LabExperienceTheme

class ActivityTwo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LabExperienceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val data = intent?.getStringExtra("data")
                    Greeting(data = data)
                }
            }
        }
    }
}

@Composable
fun Greeting(data : String?,modifier: Modifier = Modifier) {
    Column {
        data?.let { Text(text = it) }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LabExperienceTheme {
        Greeting("testing")
    }
}