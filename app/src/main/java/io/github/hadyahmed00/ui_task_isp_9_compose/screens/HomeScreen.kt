package io.github.hadyahmed00.ui_task_isp_9_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.Hider
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.ReadingPart
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.SensorButton
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.SensorControlScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue

@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DarkBlue)
    ) {

        Hider(
            title = "Home",
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "home icon",
                    tint = Color.White
                )
            }
        )

        LazyColumn {
            item {
                ReadingPart()
            }
            item {
                SensorButton(
                    text = "Tmeprature",
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(SensorControlScreenDestination("Temperature"))
                }
            }

            item {
                SensorButton(
                    text = "Humidity",
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(SensorControlScreenDestination("Humidity"))
                }
            }
            item {
                SensorButton(
                    text = "Humidity",
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(SensorControlScreenDestination("Humidity"))

                }
            }
            item {
                SensorButton(
                    text = "Humidity",
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(SensorControlScreenDestination("Humidity"))

                }
            }
            item {
                SensorButton(
                    text = "Humidity",
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(SensorControlScreenDestination("Humidity"))

                }
            }


        }


    }


}
/*

@Preview
@Composable
fun showHomeScreen() {
    HomeScreen()
}*/
