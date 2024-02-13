package com.example.nyccommunityfridge.ui.fridgemapscreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
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
        sheetPeekHeight = 312.dp,
        sheetTonalElevation = 48.dp,
        sheetContent = {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Nearest Community Fridges",
                    color = Color.Black,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(16.dp)
                )

                //TODO: (Change to Lazy List)
                Column {

                    CommunityFridgeInfoCard(
                        communityFridgeAddress = nearestCommunityFridgeAddress,
                        modifier = Modifier
                            .clickable { goToNearestCommunityFridge() }
                            .padding(horizontal = 16.dp)
                    )
                }
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

