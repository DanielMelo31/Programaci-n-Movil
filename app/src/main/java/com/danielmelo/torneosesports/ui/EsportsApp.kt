package com.danielmelo.torneosesports.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danielmelo.torneosesports.ui.model.AppSection
import com.danielmelo.torneosesports.ui.screens.ActionsScreen
import com.danielmelo.torneosesports.ui.screens.GalleryScreen
import com.danielmelo.torneosesports.ui.screens.HomeScreen
import com.danielmelo.torneosesports.ui.screens.LiveScreen
import com.danielmelo.torneosesports.ui.screens.ProfileScreen
import com.danielmelo.torneosesports.ui.screens.WebScreen
import com.danielmelo.torneosesports.ui.theme.Background
import com.danielmelo.torneosesports.ui.theme.Blue
import com.danielmelo.torneosesports.ui.theme.Navy
import com.danielmelo.torneosesports.ui.theme.TextMuted

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EsportsApp() {
    var selected by remember { mutableStateOf(AppSection.HOME) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Torneos eSports",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Navy,
                    titleContentColor = Color.White,
                ),
            )
        },
    ) { padding ->
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Background)
                .padding(padding),
        ) {
            SideNavigation(
                selected = selected,
                onSelected = { selected = it },
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
            ) {
                when (selected) {
                    AppSection.HOME -> HomeScreen()
                    AppSection.PROFILE -> ProfileScreen()
                    AppSection.GALLERY -> GalleryScreen()
                    AppSection.LIVE -> LiveScreen()
                    AppSection.WEB -> WebScreen()
                    AppSection.ACTIONS -> ActionsScreen()
                }
            }
        }
    }
}

@Composable
private fun SideNavigation(
    selected: AppSection,
    onSelected: (AppSection) -> Unit,
) {
    Column(
        modifier = Modifier
            .width(86.dp)
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 7.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AppSection.entries.forEach { item ->
            val active = item == selected
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onSelected(item) }
                    .background(
                        color = if (active) Blue else Color.Transparent,
                        shape = RoundedCornerShape(12.dp),
                    )
                    .padding(vertical = 9.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.label,
                    tint = if (active) Color.White else TextMuted,
                )
                Text(
                    text = item.label,
                    color = if (active) Color.White else TextMuted,
                    fontSize = 10.sp,
                    fontWeight = if (active) FontWeight.Bold else FontWeight.Normal,
                )
            }
            Spacer(Modifier.height(5.dp))
        }
    }
}
