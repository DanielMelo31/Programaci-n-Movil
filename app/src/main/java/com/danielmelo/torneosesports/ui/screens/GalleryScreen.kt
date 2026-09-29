package com.danielmelo.torneosesports.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.material.icons.outlined.Computer
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.PhotoLibrary
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danielmelo.torneosesports.ui.components.PanelCard
import com.danielmelo.torneosesports.ui.components.ScreenColumn
import com.danielmelo.torneosesports.ui.components.SectionTitle
import com.danielmelo.torneosesports.ui.theme.Blue
import com.danielmelo.torneosesports.ui.theme.Navy
import com.danielmelo.torneosesports.ui.theme.TextMuted

private data class GalleryEvent(
    val title: String,
    val description: String,
    val icon: ImageVector,
)

@Composable
fun GalleryScreen() {
    val events = listOf(
        GalleryEvent("Ceremonia Premiación LoL", "12 Oct · Podio y trofeo", Icons.Outlined.EmojiEvents),
        GalleryEvent("Setup LAN Party Arena", "05 Oct · Cabinas de juego", Icons.Outlined.Computer),
        GalleryEvent("Eliminatorias CS2 Masters", "28 Sep · Fase de grupos", Icons.Outlined.Bolt),
    )

    ScreenColumn {
        SectionTitle("Galería eSports", Icons.Outlined.PhotoLibrary, "EN VIVO")
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(165.dp)
                .background(
                    Brush.linearGradient(listOf(Navy, Color(0xFF163E7D))),
                    RoundedCornerShape(14.dp),
                ),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "MAIN STAGE 01",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 2.sp,
            )
        }
        Text("Gran Final Valorant Arena 2025", color = Blue, fontWeight = FontWeight.ExtraBold)
        events.forEach { event ->
            PanelCard {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(event.icon, contentDescription = null, tint = Navy)
                    Spacer(Modifier.width(12.dp))
                    androidx.compose.foundation.layout.Column {
                        Text(event.title, fontWeight = FontWeight.Bold)
                        Text(event.description, color = TextMuted, fontSize = 11.sp)
                    }
                }
            }
        }
    }
}
