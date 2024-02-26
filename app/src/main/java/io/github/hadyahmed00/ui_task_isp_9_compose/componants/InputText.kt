@file:Suppress("UNUSED_EXPRESSION")

package io.github.hadyahmed00.ui_task_isp_9_compose.componants

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.Pink
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.gray
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.white

@Composable
fun InputText(
    text: String,
    onTextChange: (String) -> Unit,
    mylabel: String,
    icon: @Composable (() -> Unit)? = null,
    myKeyboardType: KeyboardType,
    isPassword: Boolean = false,
    passwordIcon: @Composable (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {

    val showPassword = remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = text,
        onValueChange = onTextChange,
        label = { Text(text = mylabel) },
        modifier = Modifier
            .background(color = DarkBlue)
            .padding(10.dp)
            .then(modifier),
        singleLine = true,
        leadingIcon = icon,
        keyboardOptions = KeyboardOptions().copy(keyboardType = myKeyboardType),
        shape = RoundedCornerShape(51.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Pink,
            focusedBorderColor = Pink,
            cursorColor = Pink,
            unfocusedLabelColor = gray,
            focusedLabelColor = gray,
            unfocusedLeadingIconColor = gray,
            focusedLeadingIconColor = gray,
            focusedTextColor = white,
            unfocusedTextColor = gray,
        ),
        visualTransformation = if (isPassword && !showPassword.value) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        trailingIcon = passwordIcon
    )

}

/*
@Preview(showBackground = true)
@Composable
fun myPreview() {

        InputText(
            text = "",
            onTextChange = {},
            mylabel = "Email",
            icon = R.drawable.person_fill0_wght400_grad0_opsz24,
            description = "Email",
            myKeyboardType = KeyboardType.Email
        )
}*/