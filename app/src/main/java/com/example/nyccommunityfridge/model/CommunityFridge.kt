package com.example.nyccommunityfridge.model

/*
 * Models Community Fridge documents in the Community Fridges collections
 * in our Firestore Database
*/
data class CommunityFridge(
    val address: String,
    val open: Boolean,
    val latitude: Double,
    val longitude: Double,
    val name: String,
    // Some fridges have instagram pages associated with them, this field represents the link to
    // said instagram page
    val instagram: String?,
    // Represents the most recent note left by a user
    val note: String?,
    // Represents a link to the most recent photo left by a user
    val photo: String?
)
