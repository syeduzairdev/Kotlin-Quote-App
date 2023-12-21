package com.example.quoteapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quoteapp.models.Quote
import com.google.gson.Gson
import java.nio.charset.Charset

object DataManager {
    var data= emptyArray<Quote>()
    var isDataLoaded= mutableStateOf(false)

    fun loadQuoteJsonFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json= String(buffer, Charsets.UTF_8)
        val gson= Gson()
        data=gson.fromJson(json,Array<Quote>::class.java)
        isDataLoaded.value=true
    }
}