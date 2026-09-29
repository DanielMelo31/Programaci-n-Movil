package com.danielmelo.torneosesports.ui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Language
import androidx.compose.material.icons.outlined.PhotoLibrary
import androidx.compose.material.icons.outlined.PlayCircle
import androidx.compose.material.icons.outlined.RadioButtonChecked
import androidx.compose.ui.graphics.vector.ImageVector

enum class AppSection(
    val label: String,
    val icon: ImageVector,
) {
    HOME("Inicio", Icons.Outlined.Home),
    PROFILE("Perfil", Icons.Outlined.AccountCircle),
    GALLERY("Fotos", Icons.Outlined.PhotoLibrary),
    LIVE("Video", Icons.Outlined.PlayCircle),
    WEB("Web", Icons.Outlined.Language),
    ACTIONS("Botones", Icons.Outlined.RadioButtonChecked),
}
