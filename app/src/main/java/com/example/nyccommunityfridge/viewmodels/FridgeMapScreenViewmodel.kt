package com.example.nyccommunityfridge.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nyccommunityfridge.data.NycCommunityFridgeRepository
import com.example.nyccommunityfridge.model.CommunityFridge
import com.example.nyccommunityfridge.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface FridgeMapScreenUiState{
    data class Success(val fridges: List<CommunityFridge>): FridgeMapScreenUiState

    data class Error(val message: String) : FridgeMapScreenUiState
}

@HiltViewModel
class FridgeMapScreenViewmodel @Inject constructor(val repository: NycCommunityFridgeRepository) : ViewModel() {

    var uiState : FridgeMapScreenUiState by mutableStateOf(FridgeMapScreenUiState.Success(listOf()))
    private set
    fun getRemoteCommunityFridgeData(){
        viewModelScope.launch {
            val result = repository.getRemoteCommunityFridges()

            when(result){
                is Resource.Error -> { uiState = FridgeMapScreenUiState.Error(result.message)}
                is Resource.Success -> { uiState = FridgeMapScreenUiState.Success(result.data)}
            }
        }

    }

    fun getLocalCommunityFridgeData(){
        //TODO: Get Community Fridge data from room
    }
}