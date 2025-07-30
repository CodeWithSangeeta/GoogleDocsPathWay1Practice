package com.practice.googledocspathway1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                            //Greeting UI
                    GreetingImage(
                        stringResource(R.string.happy_birthday_text),
                        stringResource(R.string.from_text),
                        modifier = Modifier.padding(8.dp)
                    )


                  //  Compose tutorial UI
                  //  ComposeTutorial()


                    //Task Manager UI
                  //TaskManager()

                    //Compose Quadrant UI
                   //ComposeQuadrant()

                    //Bussiness Card App UI
                    BusinessCardApp()

                }
            }
        }
    }


@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier) {
    val image = painterResource(R.drawable.bg_image)
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.8F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = message,
            modifier = modifier.padding(24.dp),
            fontSize = 60.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}





@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Sangeeta"
)

@Composable
fun GreetingPreview() {


        GreetingImage(
            stringResource(R.string.happy_birthday_text),
            stringResource(R.string.from_text), modifier = Modifier
        )
    }




