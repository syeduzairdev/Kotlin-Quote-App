package com.example.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.quoteapp.screens.QuoteDetail
import com.example.quoteapp.screens.QuoteListScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            delay(5000)
            DataManager.loadQuoteJsonFromFile(applicationContext)

        }
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    if (DataManager.isDataLoaded.value){

        if(DataManager.currentPage.value==Pages.LISITNG){
            QuoteListScreen(data =DataManager.data ) {
                DataManager.SwitchPages(it)

            }
        }else{
            DataManager.currentQuote?.let { QuoteDetail(quote = it) }
        }

    }else{
        Box(modifier = Modifier.fillMaxSize(1f),
            contentAlignment = Alignment.Center
            ){
            Text(text = "Quotes Loading....",
                style = MaterialTheme.typography.h6
                )

        }
    }
}

enum class Pages{
    LISITNG,
    DETAILS
}
