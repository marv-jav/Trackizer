package com.codestudio.trackizer.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codestudio.trackizer.ui.theme.accentP100
import com.codestudio.trackizer.ui.theme.gray80
import com.codestudio.trackizer.ui.theme.headline2
import com.codestudio.trackizer.ui.theme.white

@Composable
fun ColoredButton(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(start = 20.dp, end = 20.dp),
        shape = RoundedCornerShape(100f),
        border = BorderStroke(1.dp, Color(0xFFffb9a1)),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(accentP100)
        ) {
            Text(
                "Get Started",
                modifier = Modifier.align(Alignment.Center),
                style = headline2,
                color = white
            )
        }
    }
}

@Composable
fun GreyButton(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(start = 20.dp, end = 20.dp),
        shape = RoundedCornerShape(100f),
        border = BorderStroke(1.dp, Color(0xFF323235))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(gray80)
        ) {
            Text(
                "Get Started",
                modifier = Modifier.align(Alignment.Center),
                style = headline2,
                color = white
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ButtonPrev() {
    Column(modifier = Modifier.background(Color.Black)) {
        Spacer(Modifier.height(16.dp))
        ColoredButton()
        Spacer(Modifier.height(16.dp))
        GreyButton()
        Spacer(Modifier.height(16.dp))
    }
}