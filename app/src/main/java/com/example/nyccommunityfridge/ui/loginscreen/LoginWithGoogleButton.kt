package com.example.nyccommunityfridge.ui.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme


@Composable
fun LoginWithGoogleButton(
    modifier: Modifier = Modifier,
    onClick: ()->Unit
){
   Button(
       elevation = ButtonDefaults.buttonElevation(
           defaultElevation = 16.dp
       ),
       onClick = { onClick() },
       colors = ButtonDefaults.buttonColors(
           containerColor = Color.White
       ),
       modifier = modifier
   ) {
       Row(
           modifier = Modifier
               .fillMaxWidth()
               .height(48.dp),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.Center
       ) {

           Image(
               painter = painterResource(id = R.drawable.google_logo),
               contentDescription = null,
               modifier = Modifier
                   .weight(1f)
                   .size(26.dp)
           )
           Text(
               text = stringResource(R.string.login_with_google),
               modifier = Modifier.weight(2f),
               color = Color.Black
           )
       }
   }
}

@Preview
@Composable
fun LoginWithGoogleButtonPreview(){
    NYCCommunityFridgeTheme {
        LoginWithGoogleButton() {}
    }
}