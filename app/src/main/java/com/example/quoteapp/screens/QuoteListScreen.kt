package com.example.quoteapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quoteapp.R
import com.example.quoteapp.models.Quote

@Composable

fun QuoteListScreen(data:Array<Quote>,onClick:(quote:Quote)->Unit){
    Column {
        Text(text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp,24.dp).
            fillMaxWidth(1f),
            style = MaterialTheme.typography.h5,
            fontFamily = FontFamily(Font(R.font.montserrat_regular))

            )
        QuoteList(data = data,onClick)
    }
}
