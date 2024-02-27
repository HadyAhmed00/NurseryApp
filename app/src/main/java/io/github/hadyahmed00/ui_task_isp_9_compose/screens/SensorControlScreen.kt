package io.github.hadyahmed00.ui_task_isp_9_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.Hider
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.AppWhite
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.BabyBlue

@Destination
@Composable
fun SensorControlScreen(
//    navigator: DestinationsNavigator
    title: String,
    icon : Int,
    currentValue : Float
) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppWhite)

    ){
        var sensorValue by remember { mutableStateOf(currentValue.toFloat()) }
        Hider(
            title = title
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "sensors icon",
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp),
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "${title} Sensor Control Screen",
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(
                color = Color.Gray,
                fontSize = 20.sp,
                fontWeight = FontWeight(1000)

            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Needed Sensor Value: $currentValue",
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(
                color = Color.Gray,
                fontSize = 16.sp,
                fontWeight = FontWeight(500)
            )
        )
        Text(
            text = "Current Sensor Value: $sensorValue",
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(
                color = Color.Gray,
                fontSize = 16.sp,
                fontWeight = FontWeight(500)
            )
        )

        Spacer(modifier = Modifier.height(20.dp))
        Slider(
            value = sensorValue,
            onValueChange = { sensorValue = it },
            valueRange = 0f..100f,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp),
            colors = SliderDefaults.colors(
                thumbColor = BabyBlue,
                activeTrackColor = BabyBlue,
                inactiveTrackColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /* TODO: Send sensorValue to sensor */ },
            modifier = Modifier.padding(start = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BabyBlue,

            )
        ) {
            Text(text = "Send", color = Color.White)
        }
    }
}

@Preview
@Composable
fun ShowContlScree() {
//    SensorControlScreen(title = "Temperature")
}