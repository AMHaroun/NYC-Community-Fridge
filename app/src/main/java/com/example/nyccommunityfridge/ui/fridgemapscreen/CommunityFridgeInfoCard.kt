package com.example.nyccommunityfridge.ui.fridgemapscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nyccommunityfridge.R
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@Composable
fun CommunityFridgeInfoCard(
    modifier: Modifier = Modifier,
    communityFridgeAddress: String
){
    Card(
        modifier = modifier
        .fillMaxWidth()
        .height(80.dp),
        elevation = CardDefaults.cardElevation(24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primaryContainer),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = communityFridgeAddress,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                textAlign = TextAlign.Left
            )
        }
    }

}

@Preview
@Composable
fun CommunityFridgeInfoCardPreview(){
    NYCCommunityFridgeTheme {
        CommunityFridgeInfoCard(communityFridgeAddress = "8412 97th Ave Queens, NY")
    }
}