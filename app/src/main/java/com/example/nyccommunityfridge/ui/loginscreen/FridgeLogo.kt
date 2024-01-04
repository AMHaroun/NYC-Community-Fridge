package com.example.nyccommunityfridge.ui.loginscreen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nyccommunityfridge.R

@Composable
fun FridgeLogo(
    modifier: Modifier = Modifier
){
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        
        Canvas(modifier = Modifier){
           drawCircle(color = Color.White, radius = 120f)
        }

        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = stringResource(R.string.nyc_community_fridges_logo),
        )

    }

}

@Preview
@Composable
fun FridgeLogoPreview(){
    FridgeLogo(modifier = Modifier.background(Color(0xFF8329FF)))
}