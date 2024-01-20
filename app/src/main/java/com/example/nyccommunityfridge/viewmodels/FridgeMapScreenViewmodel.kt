package com.example.nyccommunityfridge.viewmodels

import androidx.lifecycle.ViewModel
import com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge
import dagger.hilt.android.lifecycle.HiltViewModel

sealed interface FridgeMapScreenUiState{
    data class Success(val fridges: List<CommunityFridge>)

    data class Error(val message: String) : FridgeMapScreenUiState
}

@HiltViewModel
class FridgeMapScreenViewmodel : ViewModel() {

    fun getRemoteCommunityFridgeData(){
        //TODO : Get Community Fridge data from firestore
    }

    fun getLocalCommunityFridgeData(){
        //TODO: Get Community Fridge data from room
    }
}