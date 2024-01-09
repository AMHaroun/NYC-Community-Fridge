package com.example.nyccommunityfridge.ui.fridgemapscreen

import com.google.android.gms.maps.model.LatLng

data class CommunityFridge(
    val position: LatLng,
    val name: String
)
