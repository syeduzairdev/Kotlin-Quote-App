package com.example.quoteapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteapp.R
import com.example.quoteapp.models.Quote

@Preview
@Composable
fun QuoteDetail(quote: Quote){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xffE3E3E3)
                    )
                )
            )
    ) {
        Card(elevation = 4.dp,
            modifier = Modifier.padding(32.dp)
        ){
            Column(verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp, 24.dp)

            ) {
                Image(imageVector = Icons.Filled.FormatQuote, contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )
                Text(text = quote.text,
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    style = MaterialTheme.typography.h6

                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = quote.author,
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    style = MaterialTheme.typography.subtitle1

                )
            }
        }
    }
}