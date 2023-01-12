package com.example.firstcomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
////            Text("Hello")
////            Text("World") Writing like this makes them stack on top of each other
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .padding(15.dp)
//                    .fillMaxSize(1f)
//                    .background(Color.Gray),
////                    .fillMaxSize(), // Gives whole screen the BG colour
////                verticalArrangement = Arrangement.Bottom // Shifts all items to the bottom of the screen
//                verticalArrangement = Arrangement.SpaceBetween // Gives equal space between all items and space b/w items is maximum
////            1. Arrangement.SpaceEvenly also works in a similar way
////            2. Arrangement.SpaceAround also works in a similar way. To check the differences, run the app
//            ) {
//                Text(text = "Hello")
//                Text(text = "Sparsh and")
//                Text(text = "World")
//
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize(1f)
//                        .background(Color.Green),
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Text(text = "Hello")
//                    Text(text = "Sparsh and")
//                    Text(text = "World")
//                }
//            }
//        }

        setContent {
            Column(modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.5f)
//                .width(300.dp)
//                .requiredWidth(300.dp)
                .fillMaxWidth(0.5f)

//            width - Sets the width of item to the written value. If the value exceeds the size of the screen, then only the full screen is set and the extra is ignored. requiredWidth - Forces the given width to the screen. For example, the text fields below will be cut to accommodate 600dp. fillMaxWidth works the same as fillMaxHeight

                .padding(20.dp)
                .border(5.dp, Color.Magenta) // Padding pushes this border inside by 20dp
                .padding(10.dp) // this padding is given between the border and Text fields inside
//              We can apply multiple borders and paddings as these properties are applied sequentially
            ) {
                Text(text = "Hello", modifier = Modifier
                    .offset(50.dp)
                    .clickable { // Same as onClickListener
                        Toast.makeText(this@MainActivity, "Hello Clicked", Toast.LENGTH_SHORT).show()
                    }
                ) // offset is similar to margin, but offset doesn't push the elements away
                Spacer(modifier = Modifier.height(50.dp)) // It can be used to give margin
                Text(text = "World")
                Text(text = "yesss")
            }
        }
    }
}