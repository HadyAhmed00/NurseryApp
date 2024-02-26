package io.github.hadyahmed00.ui_task_isp_9_compose.componants

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.Pink


@Composable
fun SensorButton(
    modifier : Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier),
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.filledTonalButtonColors(
            containerColor = Pink,
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_sensors),
                contentDescription = "sensors icon",
                tint = Color.White,
                modifier = Modifier
                    .padding(10.dp)
                    .height(50.dp)
                    .width(50.dp)
            )

            Text(
                text = text,
                color = Color.White,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.Center),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight(600)

                )
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_next),
                contentDescription = "Next page icon",
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .width(50.dp)
                    .height(50.dp)
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun showSensor() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        SensorButton(text = "Sensors", onClick = {})
    }

}