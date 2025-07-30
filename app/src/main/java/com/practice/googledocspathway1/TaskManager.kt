package com.practice.googledocspathway1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskManager() {
TaskManagerUi(
    image = painterResource(R.drawable.ic_task_completed),
    completed = stringResource(R.string.all_tasks_completed),
    niceWork = stringResource(R.string.nice_work),
    modifier = Modifier.fillMaxSize()
)
}

@Composable

fun TaskManagerUi(
    image: Painter,
    completed: String,
    niceWork: String,
    modifier: Modifier = Modifier
) {
Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Image(
    painter = image,
     contentDescription = null
    )
    Text(
        text = completed,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(0.dp,24.dp,0.dp,8.dp)
    )
    Text(
        text = niceWork,
        fontSize = 16.sp
    )
}

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TaskManagerPreview() {
        TaskManager()
}