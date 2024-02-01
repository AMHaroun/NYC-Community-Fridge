package com.example.nyccommunityfridge.ui.profilescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
){

    Column {

        // TODO: Exit button

        // TODO : Profile picture

        // TODO: About app button

    }

}

@Preview
@Composable
fun ProfileScreenPreview(){
    NYCCommunityFridgeTheme {
        ProfileScreen()
    }
}
