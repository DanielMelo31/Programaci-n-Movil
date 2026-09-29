package com.danielmelo.torneosesports.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.EditNote
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.PlayCircle
import androidx.compose.material.icons.outlined.RadioButtonChecked
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danielmelo.torneosesports.ui.components.PanelCard
import com.danielmelo.torneosesports.ui.components.ScreenColumn
import com.danielmelo.torneosesports.ui.components.SectionTitle
import com.danielmelo.torneosesports.ui.theme.Blue
import com.danielmelo.torneosesports.ui.theme.Mint
import com.danielmelo.torneosesports.ui.theme.Orange
import com.danielmelo.torneosesports.ui.theme.Red
import com.danielmelo.torneosesports.ui.theme.TextMuted

private data class TournamentAction(
    val title: String,
    val description: String,
    val icon: ImageVector,
    val color: Color,
)

@Composable
fun ActionsScreen() {
    val actions = listOf(
        TournamentAction("Inscribir mi equipo", "Formulario visual de registro", Icons.Outlined.EditNote, Mint),
        TournamentAction("Ver cuadro de torneo", "Esquema visual de eliminatorias", Icons.Outlined.EmojiEvents, Orange),
        TournamentAction("Ver transmisión en vivo", "Acceso visual al streaming", Icons.Outlined.PlayCircle, Red),
        TournamentAction("Tabla de posiciones", "Ranking visual de equipos", Icons.Outlined.BarChart, Blue),
    )

    ScreenColumn {
        SectionTitle("Acciones de torneo", Icons.Outlined.RadioButtonChecked, "OFICIAL")
        actions.forEach { action ->
            PanelCard {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = action.icon,
                        contentDescription = null,
                        modifier = Modifier
                            .background(
                                action.color.copy(alpha = 0.12f),
                                RoundedCornerShape(9.dp),
                            )
                            .padding(9.dp),
                        tint = action.color,
                    )
                    Spacer(Modifier.width(10.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(action.title, fontWeight = FontWeight.ExtraBold)
                        Text(action.description, color = TextMuted, fontSize = 11.sp)
                    }
                    Icon(Icons.Outlined.ArrowForward, contentDescription = null, tint = TextMuted)
                }
            }
        }
    }
}
