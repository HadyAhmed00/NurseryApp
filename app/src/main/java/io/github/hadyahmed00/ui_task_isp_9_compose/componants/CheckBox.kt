package io.github.hadyahmed00.ui_task_isp_9_compose.componants

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.AppWhite
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.BabyBlue


@Composable
fun CheckBox(
    text : String
) {

    val myState = remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .background(color = AppWhite)
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = myState.value,
            onCheckedChange = {
                myState.value = it
            },
            colors = CheckboxDefaults.colors(
                checkmarkColor = Gray,
                checkedColor = BabyBlue,
                uncheckedColor = Gray,
            )
        )
        Text(
            text = text,
            color = Gray,
        )
    }
}

/*
@Preview
@Composable
fun myPrev() {
    CheckBox()
}*/
