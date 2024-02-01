package com.example.nyccommunityfridge.ui.profilescreen

import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@Composable
fun ExitButton(
    modifier: Modifier = Modifier,
    onClick: ()->Unit
){
    Icon(
        painter = painterResource(id = R.drawable.x_icon),
        contentDescription = stringResource(R.string.exit_button),
        modifier = modifier.clickable { onClick }
    )

}

@Preview
@Composable
fun ExitButtonPreview(){
    NYCCommunityFridgeTheme {
        ExitButton {}
    }
}