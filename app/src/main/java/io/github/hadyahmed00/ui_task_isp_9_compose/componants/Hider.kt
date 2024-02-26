package io.github.hadyahmed00.ui_task_isp_9_compose.componants

import android.graphics.fonts.Font
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.hadyahmed00.ui_task_isp_9_compose.R
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.DarkBlue
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.LightDarkBlue

@Composable
fun Hider(
    title : String,
    icon: @Composable (() -> Unit)? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = LightDarkBlue),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment  = Alignment.CenterVertically

    ){
        // this's composable is the hider consest of icon and text
        icon?.invoke()
        Text(text = title,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                color = Color.White,
                fontSize = 20.sp
            )
        )
    }
}

@Preview()
@Composable
fun showHidder() {
    Hider(title = "Home",
        icon = {
            Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription ="home icon",
                tint = Color.White)
        })
}