package com.example.quoteapp.ui.theme//package com.example.quoteapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorPalatte = darkColors(
    primary = Purple80,
    primaryVariant =Pink80 ,
    secondary = PurpleGrey80,
    background = Color.Black,
    surface = Color.Green
)

private val LightColorPalatte = lightColors(
    primary = Purple40,
    primaryVariant =Pink40 ,
    background = Color.Gray,
    secondary = PurpleGrey40,
    surface = Color.Cyan


)

@Composable
fun QuoteAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors =  if (darkTheme) {
       DarkColorPalatte
    }else{
        LightColorPalatte
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}