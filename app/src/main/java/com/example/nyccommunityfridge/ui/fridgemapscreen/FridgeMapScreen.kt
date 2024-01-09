package com.example.nyccommunityfridge.ui.fridgemapscreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun FridgeMapScreen(
    modifier: Modifier = Modifier,
    communityFridges: List<CommunityFridge>
){
    val newYork = LatLng(40.7128, -74.0060)
    val cameraPositionState = rememberCameraPositionState{
        position = CameraPosition.fromLatLngZoom(newYork, 12f)
    }

    Box(modifier = modifier.fillMaxSize()) {

        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState,
        ) {
            for (fridge in communityFridges) {
                Marker(
                    state = MarkerState(position = fridge.position),
                    title = fridge.name,
                    flat = true,
                )
            }

        }

        Icon(
            painter = painterResource(id = R.drawable.profile_icon),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(48.dp)
                .padding(top = 16.dp, end = 16.dp)
                .clickable { /*TODO Navigate to login or profile screen*/ }
        )

        BottomSheet(
            goToNearestCommunityFridge = { /*TODO*/ },
            nearestCommunityFridgeAddress = "Fake Address"
        )
    }

}

@Preview
@Composable
fun FridgeMapScreenPreview(){
    NYCCommunityFridgeTheme {
        FridgeMapScreen(communityFridges = listOf())
    }
}