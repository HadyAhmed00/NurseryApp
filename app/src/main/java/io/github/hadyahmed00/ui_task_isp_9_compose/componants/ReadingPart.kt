package io.github.hadyahmed00.ui_task_isp_9_compose.componants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.Pink

@Composable
fun ReadingPart() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(
            text = "Current Readings",
            style = TextStyle(
                color = Pink,
                fontSize = 28.sp,
                fontWeight = FontWeight(1000)
            )
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            Text(
                text = "Temperature",
                style = TextStyle(
                    color = Pink,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            )

            Text(
                text = "25",
                style = TextStyle(
                    color = Pink,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            Text(
                text = "Humidity",
                style = TextStyle(
                    color = Pink,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            )
            Text(
                text = "25",
                style = TextStyle(
                    color = Pink,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ) {
            Text(
                text = "Pressure",
                style = TextStyle(
                    color = Pink,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            )
            Text(
                text = "25",
                style = TextStyle(
                    color = Pink,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(500)
                )
            )
        }

    }
}



