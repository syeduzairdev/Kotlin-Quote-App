package com.example.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        QuoteListScreen(data =DataManager.data ) {
            
        }
    }else{
        Box(modifier = Modifier.fillMaxSize(1f),
            contentAlignment = Alignment.Center
            ){
            Text(text = "Loading....",
                style = MaterialTheme.typography.h6
                )

        }
    }
}
