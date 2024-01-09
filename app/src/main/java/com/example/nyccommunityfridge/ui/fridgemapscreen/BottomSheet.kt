package com.example.nyccommunityfridge.ui.fridgemapscreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nyccommunityfridge.ui.theme.NYCCommunityFridgeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheet(
    modifier: Modifier = Modifier,
    goToNearestCommunityFridge: ()->Unit,
    nearestCommunityFridgeAddress: String,
){
    BottomSheetScaffold(
        modifier = modifier,
        sheetContent = {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Nearest Community Fridge",
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    modifier = Modifier.padding(16.dp)
                )

                CommunityFridgeInfoCard(
                    communityFridgeAddress = nearestCommunityFridgeAddress,
                    modifier = Modifier.clickable { goToNearestCommunityFridge() }
                        .padding(horizontal = 16.dp)
                )
            }
        },
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) {

    }
}

@Preview
@Composable
fun BottomSheetPreview(){
    NYCCommunityFridgeTheme {
        BottomSheet(
            nearestCommunityFridgeAddress = "1234 8th Street",
            goToNearestCommunityFridge = {}
        )
    }
}

