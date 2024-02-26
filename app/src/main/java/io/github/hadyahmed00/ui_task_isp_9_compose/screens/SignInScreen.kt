package io.github.hadyahmed00.ui_task_isp_9_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.CheckBox
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.InputText
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.MainButton
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.HomeScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.SignInScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.SingUpScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.Pink

@Destination(start = true)
@Composable
fun SignInScreen(navigator: DestinationsNavigator) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DarkBlue),
        verticalArrangement = Arrangement.Center,


        ) {
        val email = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }
        val showPassword = remember {
            mutableStateOf(false)
        }
        Text(
            text = "Sign In",
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
            color = Color.White
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )

        InputText(
            text = email.value,
            onTextChange = { email.value = it },
            modifier = Modifier.fillMaxWidth(),
            mylabel = "Email",
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_mail_fill),
                    contentDescription = "Email",
                    tint = Color.White
                )
            },
            myKeyboardType = KeyboardType.Email
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )

        InputText(
            text = password.value,
            onTextChange = { password.value = it },
            modifier = Modifier.fillMaxWidth(),
            mylabel = "Password",
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock_fill),
                    contentDescription = "Password",
                    tint = Color.White
                )
            },
            myKeyboardType = KeyboardType.Password,
            isPassword = !showPassword.value,
            passwordIcon = {
                if (showPassword.value) {
                    IconButton(onClick = { showPassword.value = !showPassword.value }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_show_password),
                            contentDescription = "showPassword",
                            tint = Color.White
                        )

                    }
                } else {

                    IconButton(onClick = { showPassword.value = !showPassword.value }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_hide_password),
                            contentDescription = "hidePassword",
                            tint = Color.White
                        )

                    }
                }
            }
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            CheckBox(text = "Remember me")
            Text(
                text = "Forgot Password?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 15.sp,
                color = Pink,
                textAlign = TextAlign.End
            )
        }

        MainButton(myOnClick = { navigator.navigate(HomeScreenDestination()) }, text = "Sign In")

        Text(
            text = "Or SignIn With",
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 15.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "Facebook",
                    tint = Pink
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google",
                    tint = Pink
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_twitterx),
                    contentDescription = "Twitter",
                    tint = Pink
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Don't have an account?",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                text = " Sign Up",
                color = Pink,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }

    }
}

