package com.example.nyccommunityfridge.ui.profilescreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
){

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 8.dp) // Adjust the padding as needed
    ) {

        ExitButton(
            modifier = Modifier
                .padding(top = 16.dp)
                .size(24.dp),
            onClick = {
                //TODO
            }
        )

        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to push the ProfilePicture to the center

        ProfilePicture(
            modifier = Modifier
                .size(128.dp)
                .align(Alignment.CenterHorizontally) // Center the ProfilePicture horizontally
        )

        Text(
            text = "About NYCCommunityFridge",
            modifier = Modifier
                .padding(32.dp)
                .clickable {
                    //TODO
                }
                .align(Alignment.CenterHorizontally),
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
        )

        Spacer(modifier = Modifier.weight(1f))

    }
}


@Preview(
    showSystemUi = true
)
@Composable
fun ProfileScreenPreview(){
    NYCCommunityFridgeTheme {
        ProfileScreen()
    }
}
