package com.practice.googledocspathway1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun ComposeTutorial() {
    JpComposeElements(
        image = painterResource(R.drawable.bg_compose_background),
        heading = stringResource(R.string.jetpack_compose_tutorial),
        intro = stringResource(R.string.jetpack_intro),
        body = stringResource(R.string.jetpack_tutorial_description),
        modifier = Modifier.fillMaxSize()
    )

}

@Composable
fun JpComposeElements(
    image: Painter,
    heading: String,
    intro: String,
    body: String,
    modifier: Modifier
) {
    Box(modifier = Modifier) {
        Column(modifier = Modifier
            .fillMaxWidth()
                .padding(16.dp)) {
            Image(
                painter = image,
                contentDescription = null,
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = heading,
                fontSize = 24.sp,
                //lineHeight = 30.sp,
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = intro,
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = body,
                textAlign = TextAlign.Justify
            )
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JetPackPreview() {
        ComposeTutorial()

}