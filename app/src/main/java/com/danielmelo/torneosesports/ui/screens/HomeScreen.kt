package com.danielmelo.torneosesports.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danielmelo.torneosesports.ui.components.PanelCard
import com.danielmelo.torneosesports.ui.components.Pill
import com.danielmelo.torneosesports.ui.components.PrimaryButton
import com.danielmelo.torneosesports.ui.components.ScreenColumn
import com.danielmelo.torneosesports.ui.components.SectionTitle
import com.danielmelo.torneosesports.ui.components.StatCard
import com.danielmelo.torneosesports.ui.theme.Blue
import com.danielmelo.torneosesports.ui.theme.Mint
import com.danielmelo.torneosesports.ui.theme.Orange

@Composable
fun HomeScreen() {
    ScreenColumn {
        SectionTitle("Bienvenido al torneo", Icons.Outlined.Home)
        PanelCard {
            Text("Poli eSports Hub", fontSize = 18.sp, fontWeight = FontWeight.ExtraBold)
            Text("Temporada 2025", color = Blue, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(10.dp))
            Pill("Servidor online")
        }
        Row {
            StatCard(Icons.Outlined.EmojiEvents, "Torneos", "3 activos", Orange)
            Spacer(Modifier.width(10.dp))
            StatCard(Icons.Outlined.Groups, "Equipos", "48 roster", Mint)
        }
        Spacer(Modifier.height(130.dp))
        PrimaryButton("Explorar reglamento")
    }
}
