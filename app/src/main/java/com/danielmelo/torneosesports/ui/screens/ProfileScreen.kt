package com.danielmelo.torneosesports.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Badge
import androidx.compose.material.icons.outlined.MilitaryTech
import androidx.compose.material.icons.outlined.SportsEsports
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.danielmelo.torneosesports.ui.components.PanelCard
import com.danielmelo.torneosesports.ui.components.PrimaryButton
import com.danielmelo.torneosesports.ui.components.ScreenColumn
import com.danielmelo.torneosesports.ui.components.SectionTitle
import com.danielmelo.torneosesports.ui.components.StatCard
import com.danielmelo.torneosesports.ui.theme.Blue
import com.danielmelo.torneosesports.ui.theme.Mint
import com.danielmelo.torneosesports.ui.theme.TextMuted

@Composable
fun ProfileScreen() {
    ScreenColumn {
        SectionTitle("Perfil", Icons.Outlined.AccountCircle, "OFICIAL")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEAF2FF), RoundedCornerShape(14.dp))
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Outlined.SportsEsports,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .background(Blue, CircleShape)
                    .padding(14.dp),
                tint = Color.White,
            )
            Spacer(Modifier.width(12.dp))
            Column {
                Text("Torneos eSports / Vex", fontWeight = FontWeight.ExtraBold)
                Text("Capitán y organizador", color = Blue)
                Text("ID: 2049-POLI", color = TextMuted)
            }
        }
        Row {
            StatCard(Icons.Outlined.Badge, "Colección", "24 torneos", Blue)
            Spacer(Modifier.width(10.dp))
            StatCard(Icons.Outlined.MilitaryTech, "Winrate", "71% victorias", Mint)
        }
        PanelCard {
            Text(
                "Líder del torneo universitario. Especialista en táctica, MOBA y shooters competitivos.",
            )
        }
        Spacer(Modifier.height(4.dp))
        PrimaryButton("Ver roster activo")
    }
}
