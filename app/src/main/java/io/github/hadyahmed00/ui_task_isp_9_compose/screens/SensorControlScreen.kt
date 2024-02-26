package io.github.hadyahmed00.ui_task_isp_9_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.Hider
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue
@Destination
@Composable
fun SensorControlScreen(
//    navigator: DestinationsNavigator
    title: String
) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = DarkBlue)

    ){

        Hider(
            title = title
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_sensors), contentDescription =
                "sensors icon",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "${title} Sensor Control Screen",
            modifier = Modifier.padding(start = 10.dp),
            style = TextStyle(
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight(1000)

            )
        )
    }
}

@Preview
@Composable
fun ShowContlScree() {
    SensorControlScreen(title = "Temperature")
}