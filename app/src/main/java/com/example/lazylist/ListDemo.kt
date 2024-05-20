package com.example.lazylist

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListDemo(){
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo() {
//    var myList  = listOf<Int>(1,2,3,4,5,6,7,8,9)
    var myList = getAllMarvelChars()
    LazyColumn(content = {
//        items(100, itemContent = {
//            TextItem(text = "Index $it")
//        })
        itemsIndexed(myList, itemContent = {    index, item ->  
//            TextItem(text = "Hello ${item.name}")
                MarvelItem(item = item)
        })
    })

}
@Composable
fun MarvelItem(item : MarvelChar){
    val context  = LocalContext.current
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(15.dp).
        clickable {
                  Toast.makeText(context,"Clicked ${item.name}",Toast.LENGTH_SHORT).show()
        },
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(painter = painterResource(id = item.image), contentDescription =item.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(100.dp)
                .scale(1.0f)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = item.name, fontSize = 22.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun SimpleColumn() {
    val scroolStatic = rememberScrollState()
    Column (
        modifier = Modifier.verticalScroll(scroolStatic)
    ){
        for(i in 1..100){
            TextItem(text = "Item $i")
        }
    }
    
}

@Composable
fun TextItem(text:String) {
    Text(text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp)
}