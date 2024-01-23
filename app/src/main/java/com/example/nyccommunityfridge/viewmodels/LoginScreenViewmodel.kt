package com.example.nyccommunityfridge.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class LoginScreenUiState(var loggedIn: Boolean)

@HiltViewModel
class LoginScreenViewmodel @Inject constructor() : ViewModel() {

    fun isUserLoggedIn(){
        //TODO
    }
}