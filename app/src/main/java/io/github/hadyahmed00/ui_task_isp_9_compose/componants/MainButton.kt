package io.github.hadyahmed00.ui_task_isp_9_compose.componants

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.hadyahmed00.ui_task_isp_9_compose.ui.theme.Pink

@Composable
fun MainButton(
    myOnClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
) {
    Button(onClick = myOnClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)

        .then(modifier),
        colors = ButtonDefaults.buttonColors(containerColor = Pink)
    ) {
        Text(text =text,
            fontWeight = FontWeight.Bold
        )
    }
}

/*

@Preview(showBackground = true)
@Composable
fun mypriv() {
    MainButton(myOnClick = {}, text = "Login")
}*/
