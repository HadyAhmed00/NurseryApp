package io.github.hadyahmed00.ui_task_isp_9_compose.screens

import androidx.compose.foundation.background
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.CheckBox
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.InputText
import io.github.hadyahmed00.ui_task_isp_9_compose.componants.MainButton
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.SignInScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.screens.destinations.SingUpScreenDestination
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.Pink
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.white

@Destination
@Composable
fun SingUpScreen( navigator : DestinationsNavigator) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DarkBlue)
    ) {

        val fName = remember {
            mutableStateOf("")
        }
        val lName = remember {
            mutableStateOf("")
        }
        val email = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }
        val showPassword = remember {
            mutableStateOf(false)
        }
        val confirmPassword = remember {
            mutableStateOf("")
        }
        val showConfirmPassword = remember {
            mutableStateOf(false)
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
        )
        Text(
            text = "Sign Up",
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,
            color = Color.White
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )

        Row {

            InputText(
                text = fName.value,
                onTextChange = { fName.value = it },
                mylabel = "First Name",
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.person_fill0_wght400_grad0_opsz24),
                        contentDescription = "",
                        tint= white
                    )
                },
                myKeyboardType = KeyboardType.Text,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
            )
            InputText(
                text = lName.value,
                onTextChange = { lName.value = it },
                mylabel = "Last Name",
                myKeyboardType = KeyboardType.Text
            )
        }


        InputText(
            text = email.value,
            onTextChange = { email.value = it },
            mylabel = "Email",
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_mail_fill),
                    contentDescription = "",
                    tint = white
                )
            },
            myKeyboardType = KeyboardType.Email,
            modifier = Modifier
                .fillMaxWidth()
        )

        InputText(
            text = password.value,
            onTextChange = { password.value = it },
            mylabel = "Password",
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock_fill),
                    contentDescription = "",
                    tint = white
                )
            },
            myKeyboardType = KeyboardType.Password,
            modifier = Modifier
                .fillMaxWidth(),
            isPassword = !showPassword.value,
            passwordIcon = {
                if (showPassword.value) {
                    IconButton(onClick = { showPassword.value = !showPassword.value }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_hide_password),
                            contentDescription = "Hide Password"
                        )
                    }
                } else {
                    IconButton(onClick = { showPassword.value = !showPassword.value }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_show_password),
                            contentDescription = "Show Password",
                            tint = white
                        )
                    }

                }
            }
        )

        InputText(
            text = confirmPassword.value,
            onTextChange = { confirmPassword.value = it },
            mylabel = "Confirm Password",
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock_fill),
                    contentDescription = "",
                    tint = white
                )
            },
            myKeyboardType = KeyboardType.Password,
            modifier = Modifier
                .fillMaxWidth(),
            isPassword = !showConfirmPassword.value,
            passwordIcon = {
                if (showConfirmPassword.value) {
                    IconButton(onClick = { showConfirmPassword.value = !showConfirmPassword.value }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_hide_password),
                            contentDescription = "Hide Password",
                            tint = white

                        )
                    }
                } else {
                    IconButton(onClick = {
                        showConfirmPassword.value = !showConfirmPassword.value
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_show_password),
                            contentDescription = "Show Password",
                            tint = white
                        )
                    }

                }
            }
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CheckBox(
                text = "I Agree with"
            )
            Text(
                text = "Privacy",
                color = Pink,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                text = " and ",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                text = "Policy",
                color = Pink,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

        }

        MainButton(myOnClick = { navigator.navigate(SignInScreenDestination()) }, text = "Sign Up")
    }


}


/*
@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SingUpScreen()
}
*/
