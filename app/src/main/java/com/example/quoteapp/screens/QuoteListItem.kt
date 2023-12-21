package com.example.quoteapp.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.quoteapp.R
import com.example.quoteapp.models.Quote


@Composable

fun QuoteListItem(quote:Quote,onClick:()->Unit) {
Card (elevation = 4.dp,
    modifier = Modifier.padding(8.dp)
    ){
    Row (  modifier = Modifier.padding(16.dp)){
Image(imageVector = Icons.Filled.FormatQuote,
    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color.White),
    alignment = Alignment.TopStart,
    modifier = Modifier
        .clickable {onClick()  }
        .size(40.dp)
//        .rotate(180F)

        .background(Color.Black)
    ,
    
    contentDescription = "Quote")
        Spacer(modifier = Modifier.padding(4.dp))

        Column(modifier = Modifier.weight(50f)) {
            Text(text = quote.text,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(0.dp,0.dp,0.dp,0.dp)

            )
            Box(modifier = Modifier
                .background(Color(0xFFEEEEEE))
                .fillMaxWidth(.4f)
                .height(1.dp) )
            Text(text =  quote.author,   style = MaterialTheme.typography.body2,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.padding(top = 4.dp))


        }
    }


}
    }




