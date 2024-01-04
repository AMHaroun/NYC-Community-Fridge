package com.example.nyccommunityfridge.ui.loginscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.size(128.dp))

        FridgeLogo()

        Title(modifier = Modifier.padding(top = 32.dp))
    }

}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    NYCCommunityFridgeTheme {
        LoginScreen(
            modifier = Modifier.background(MaterialTheme.colorScheme.primary)
        )
    }
}