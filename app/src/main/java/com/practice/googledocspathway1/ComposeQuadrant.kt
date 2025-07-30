package com.practice.googledocspathway1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ComposeQuadrant() {
    QuadrantUi(
        text = stringResource(R.string.text_composable),
        textBody = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
        textColor = Color(0xFFEADDFF),
        image = stringResource(R.string.image_composable),
        imageBody = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
        imageColor =Color(0xFFD0BCFF),
        row = stringResource(R.string.row_composable),
        rowBody = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
        rowColor = Color(0xFFB69DF8),
        column = stringResource(R.string.column_composable_text),
        columnBody = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
        columnColor = Color(0xFFF6EDFF)

    )
}


@Composable
fun QuadrantUi(
    text: String,
    textBody: String,
    textColor : Color,
    image: String,
    imageBody: String,
    imageColor : Color,
    row: String,
    rowBody: String,
    rowColor : Color,
    column: String,
    columnBody: String,
    columnColor : Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

     ) {
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(textColor)
                )
                {
                    Column(
                      modifier = Modifier.fillMaxSize()
                          .padding(8.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = text,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                        )
                        Text(
                            text = textBody,
                        )
                    }

                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(imageColor)
                )
                {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Text(
                            text = image,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                        )
                        Text(
                            text = imageBody,
                        )
                    }
                }
            }




        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(rowColor)
            )
            {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .padding(8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = row,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                    )
                    Text(
                        text = rowBody,
                    )
                }

            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(columnColor)
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Text(
                        text = column,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp)
                    )
                    Text(
                        text = columnBody,
                    )
                }
            }
        }


    }


}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposeQuadrantPreview() {
        ComposeQuadrant()


}