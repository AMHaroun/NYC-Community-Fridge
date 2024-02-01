package com.example.nyccommunityfridge.ui.profilescreen

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@Composable
fun ProfilePicture(
    modifier: Modifier = Modifier,
    profilePictureUrl: String? = null
){
    if(profilePictureUrl != null){
        AsyncImage(
            model = profilePictureUrl,
            contentDescription = null,
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
    } else {
        Image(
            painter = painterResource(id = R.drawable.profile_icon),
            contentDescription = null,
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
    }

}

@Preview
@Composable
fun ProfilePicturePreview(){
    NYCCommunityFridgeTheme {
        ProfilePicture()
    }
}