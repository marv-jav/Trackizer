package com.codestudio.trackizer.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codestudio.trackizer.ui.icons.TrackizerIcons
import com.codestudio.trackizer.ui.theme.accentP100

@Composable
fun FloatingActionButton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(66.dp)
            .background(shape = RoundedCornerShape(100.dp), color = Color(0xFF181215))
    ) {
        Card(
            shape = RoundedCornerShape(100.dp),
            modifier = Modifier
                .size(48.dp)
                .align(Alignment.Center),
            colors = CardDefaults.cardColors(containerColor = accentP100),
            border = BorderStroke(width = 1.dp, color = Color(0xFFffb9a1))
        ) {
            Image(painter = painterResource(TrackizerIcons.Plus), contentDescription = "Plus")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FABPrev() {
    FloatingActionButton(modifier = Modifier.padding(20.dp))
}