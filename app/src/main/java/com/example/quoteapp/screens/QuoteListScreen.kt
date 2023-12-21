package com.example.quoteapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quoteapp.R
import com.example.quoteapp.models.Quote

@Composable

fun QuoteListScreen(data:Array<Quote>,onClick:(quote:Quote)->Unit){
    var theme= remember { mutableStateOf(false) }

    Column (Modifier.background(MaterialTheme.colors.background)){
        Row {
            Text(text = "Quotes App",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp, 24.dp)
                    .fillMaxWidth(.5f),
                style = MaterialTheme.typography.h5,
                fontFamily = FontFamily(Font(R.font.montserrat_regular))

            )
            Button(onClick= { theme.value = !theme.value }){
                Text(text = "Change Theme")
            }
            
        }

        QuoteList(data = data,onClick)
    }
}
