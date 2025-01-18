package com.codestudio.trackizer.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codestudio.trackizer.ui.icons.TrackizerIcons


@Composable
fun BottomNavBar(
    modifier: Modifier = Modifier,
    currentScreen: String,
    onScreenSelected: (String) -> Unit
) {
    val items = listOf(
        "Home" to TrackizerIcons.Home,
        "Budgets" to TrackizerIcons.Budgets,
        "Calendar" to TrackizerIcons.Calendar,
        "Cards" to TrackizerIcons.CreditCard
    )

    Box(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF4E4E61))
        ) {}

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.spacedBy(62.dp)
        ) {
            items.chunked(2).forEach { chunk ->
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF4E4E61))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        chunk.forEach { (screen, icon) ->
                            Icon(
                                modifier = Modifier.clickable {
                                    onScreenSelected(screen)
                                },
                                painter = painterResource(icon),
                                contentDescription = screen,
                                tint = if (currentScreen == screen) Color.White else Color(
                                    0xFFa2a2b5
                                )
                            )
                        }
                    }
                }
            }
        }

        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(bottom = 8.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BNVPrev() {
    var currentScreen by remember { mutableStateOf("Home") }
    BottomNavBar(
        currentScreen = currentScreen,
        onScreenSelected = { selectedScreen -> currentScreen = selectedScreen },
        modifier = Modifier.padding(start = 17.dp, end = 17.dp, bottom = 17.dp)
    )
}
