package com.danielmelo.torneosesports.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.danielmelo.torneosesports.ui.components.Label
import com.danielmelo.torneosesports.ui.components.PanelCard
import com.danielmelo.torneosesports.ui.components.Pill
import com.danielmelo.torneosesports.ui.components.ScreenColumn
import com.danielmelo.torneosesports.ui.components.SectionTitle
import com.danielmelo.torneosesports.ui.theme.Red
import com.danielmelo.torneosesports.ui.theme.TextMuted

@Composable
fun WebScreen() {
    ScreenColumn {
        SectionTitle("Visor web dinámico", Icons.Outlined.Language)
        Label("DIRECCIÓN URL")
        OutlinedTextField(
            value = "torneos-esports.poligran.edu.co",
            onValueChange = {},
            readOnly = true,
            singleLine = true,
        )
        Pill("URL válida · Protocolo HTTPS")
        PanelCard {
            Pill("EN VIVO", Red)
            Spacer(Modifier.height(9.dp))
            Text(
                "Politécnico vs Javeriana: definición del título",
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Vista visual para noticias y contenido oficial del torneo.",
                color = TextMuted,
            )
        }
    }
}
