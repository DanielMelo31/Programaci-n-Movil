package com.danielmelo.torneosesports.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.danielmelo.torneosesports.ui.components.PanelCard
import com.danielmelo.torneosesports.ui.components.Pill
import com.danielmelo.torneosesports.ui.components.ScreenColumn
import com.danielmelo.torneosesports.ui.components.SectionTitle
import com.danielmelo.torneosesports.ui.theme.Blue
import com.danielmelo.torneosesports.ui.theme.Red
import com.danielmelo.torneosesports.ui.theme.TextMuted

@Composable
fun LiveScreen() {
    ScreenColumn {
        SectionTitle("Transmisiones en vivo", Icons.Outlined.Videocam)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(210.dp)
                .background(
                    Brush.linearGradient(listOf(Color(0xFF101B3E), Color(0xFF193B75))),
                    RoundedCornerShape(14.dp),
                )
                .padding(14.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Pill("● EN DIRECTO", Red)
                Pill("1080p60", Color.White)
            }
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color.White.copy(alpha = 0.2f), CircleShape)
                    .padding(14.dp),
            ) {
                Icon(Icons.Filled.PlayArrow, contentDescription = null, tint = Color.White)
            }
            LinearProgressIndicator(
                progress = { 0.18f },
                modifier = Modifier.fillMaxWidth(),
                color = Blue,
            )
        }
        PanelCard {
            Text("VEX vs CyberPulse - Gran Final Nacional", fontWeight = FontWeight.ExtraBold)
            Spacer(Modifier.height(5.dp))
            Text(
                "Torneo Universitario Intercolegiado Poli eSports League.",
                color = TextMuted,
            )
        }
    }
}
