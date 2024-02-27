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
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.Hider
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.ReadingPart
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.SensorButton
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.SensorControlScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.AppWhite

@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = AppWhite)
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
                    icon = R.drawable.ic_temp,
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(
                        SensorControlScreenDestination(
                            title = "Temperature",
                            icon = R.drawable.ic_temp,
                            currentValue = 25f
                        )
                    )
                }
            }

            item {
                SensorButton(
                    text = "Humidity",
                    icon = R.drawable.ic_humidity,
                    modifier = Modifier.padding(10.dp)
                ) {

                    navigator.navigate(
                        SensorControlScreenDestination(
                            title = "Humidity",
                            icon = R.drawable.ic_humidity,
                            currentValue = 50f
                        )
                    )
                }
            }
            item {
                SensorButton(
                    text = "Hart Rate",
                    icon = R.drawable.ic_hart,
                    modifier = Modifier.padding(10.dp)
                ) {
                    navigator.navigate(
                        SensorControlScreenDestination(
                            title = "Hart Rate",
                            icon = R.drawable.ic_hart,
                            currentValue = 80f
                        )
                    )

                }
            }
            item {
                SensorButton(
                    text = "Oxygen Level",
                    icon = R.drawable.ic_oxygen,
                    modifier = Modifier.padding(10.dp)
                ) {

                    navigator.navigate(
                        SensorControlScreenDestination(
                            title = "Oxygen Level",
                            icon = R.drawable.ic_oxygen,
                            currentValue = 98f
                        )
                    )

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
