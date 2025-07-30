package com.practice.googledocspathway1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCardApp() {
    BusinessCardUi(
        image = painterResource(id = R.drawable.android_logo),
        fullName = stringResource(R.string.jennifer_doe),
        title = stringResource(R.string.android_developer_extraordinaire),
        phone = "+11 (123) 444 555 666",
        share = "@AndroidDev              ",
        emailId = "jen.doe@android.com"
    )
}


@Composable
fun BusinessCardUi(
    image: Painter,
    fullName: String,
    title: String,
    phone: String,
    share: String,
    emailId: String
) {
    Column(
        modifier = Modifier.fillMaxSize()
       .background(Color(189, 218, 173))
    ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                // .padding(0.dp,150.dp,0.dp,0.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier.size(120.dp).background(Color(13,51,115))
                ){
                    Image(
                        painter = image,
                        contentScale = ContentScale.Fit,
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.padding(12.dp))

                Text(
                    text = fullName,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = title,
                    color = Color(20,87,6) ,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp

                )
            }

        }

        Spacer(modifier = Modifier.padding(16.dp))

            Column(
                modifier = Modifier.fillMaxSize().padding(0.dp,0.dp,0.dp,60.dp),
               verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(imageVector = Icons.Default.Phone, contentDescription = phone, tint = Color(53, 104, 23))
                     Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = phone
                    )
                }

                Spacer(modifier = Modifier.padding(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = share, tint = Color(53, 104, 23))
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = share
                    )
                }
                Spacer(modifier = Modifier.padding(8.dp))


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = emailId, tint = Color(53, 104, 23))
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = emailId
                    )
                }


            }
        }






@Preview(showSystemUi = true)
@Composable
fun BusinessCardPreview(modifier: Modifier = Modifier) {
    BusinessCardApp()
}










