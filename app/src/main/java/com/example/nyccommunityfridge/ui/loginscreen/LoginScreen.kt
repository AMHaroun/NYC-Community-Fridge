package com.example.nyccommunityfridge.ui.loginscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme
import com.example.nyccommunityfridge.util.NavigationStrings
import com.example.nyccommunityfridge.viewmodels.LoginScreenViewmodel

@Composable
fun LoginScreen(
    viewModel: LoginScreenViewmodel = hiltViewModel(),
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.size(128.dp))

        FridgeLogo()

        Title(modifier = Modifier.padding(top = 32.dp))

        Description(
            modifier = Modifier.padding(
                start = 32.dp,
                end = 32.dp,
                top = 16.dp
            )
        )

        LoginWithGoogleButton(
            modifier = Modifier
                .padding(
                start = 32.dp,
                end = 32.dp,
                top = 32.dp,
                bottom = 16.dp
            ),
            onClick = { viewModel.loginWithGoogle() }
        )
        LoginWithFacebookButton(
            modifier = Modifier.padding(
                horizontal = 32.dp
            ),
            onClick = { viewModel.loginWithFacebook() }
        )

        Text(
            text = stringResource(R.string.skip_login),
            textDecoration = TextDecoration.Underline,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .padding(32.dp)
                .clickable { navController.navigate(route = NavigationStrings.fridgeMapScreen) }
        )
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