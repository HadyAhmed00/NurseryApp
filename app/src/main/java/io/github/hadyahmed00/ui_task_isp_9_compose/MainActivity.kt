package io.github.hadyahmed00.ui_task_isp_9_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.NavGraphs
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.SignInScreen
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.SingUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DestinationsNavHost(navGraph = NavGraphs.root)


        }
    }
}

