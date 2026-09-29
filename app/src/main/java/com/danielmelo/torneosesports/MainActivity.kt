package com.danielmelo.torneosesports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.danielmelo.torneosesports.ui.EsportsApp
import com.danielmelo.torneosesports.ui.theme.TorneosEsportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TorneosEsportsTheme {
                EsportsApp()
            }
        }
    }
}
