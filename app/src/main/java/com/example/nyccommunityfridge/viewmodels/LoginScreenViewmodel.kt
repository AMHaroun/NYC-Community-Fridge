package com.example.nyccommunityfridge.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

data class LoginScreenUiState(var loggedIn: Boolean)

@HiltViewModel
class LoginScreenViewmodel : ViewModel() {

    fun isUserLoggedIn(){
        //TODO
    }
}