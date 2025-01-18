package com.codestudio.trackizer.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codestudio.trackizer.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val display = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 72.sp,
    lineHeight = 108.sp
)

val headline8 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 56.sp,
    lineHeight = 56.sp
)

val headline7 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 40.sp,
    lineHeight = 40.sp
)

val headline6 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 32.sp,
    lineHeight = 48.sp
)

val headline5 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 24.sp,
    lineHeight = 36.sp
)

val headline4 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 20.sp,
    lineHeight = 32.sp
)

val headline3 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 16.sp,
    lineHeight = 24.sp
)

val headline2 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 14.sp,
    lineHeight = 20.sp
)

val headline1 = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_bold)),
    fontSize = 12.sp,
    lineHeight = 16.sp
)

val subtitle = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_medium)),
    fontSize = 20.sp,
    lineHeight = 32.sp
)

val bodyLarge = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_regular)),
    fontSize = 16.sp,
    lineHeight = 24.sp
)

val bodyMedium = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_regular)),
    fontSize = 14.sp,
    lineHeight = 20.sp
)

val bodySmall = TextStyle(
    fontFamily = FontFamily(Font(R.font.inter_regular)),
    fontSize = 12.sp,
    lineHeight = 16.sp
)