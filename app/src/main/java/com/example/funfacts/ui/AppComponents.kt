package com.example.funfacts.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.funfacts.R

@Composable
fun TopBar(value: String) {
Row (
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically,
) {

    Text(
        text = value,
        color = Color.Black,
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
    )
    
    Spacer(modifier = Modifier.weight(1f))

    Image(
        modifier = Modifier.size(80.dp),
        painter = painterResource(id = R.drawable.logo_ch),
        contentDescription = "Native Mobile"
    )
}
}

/*
@Preview(showBackground = true, )
@Composable
fun TopBarPreview() {
    TopBar()
}*/

@Composable
fun TextComponent(
    textValue: String,
    textSize: TextUnit,
    colorValue: Color = Color.Black
) {

    Text(
        text = textValue,
        fontSize = textSize,
        color = colorValue,
        fontWeight = FontWeight.Light,
        )

}

@Preview(showBackground = true)
@Composable
fun TextComponentPreview() {
    TextComponent(textValue = "Native", textSize = 24.sp)
}

@Composable
fun TextFieldComponent() {
    
}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview() {

}