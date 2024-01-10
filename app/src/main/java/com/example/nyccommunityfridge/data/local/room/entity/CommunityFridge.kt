package com.example.nyccommunityfridge.data.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CommunityFridge(
    //TODO Add additional fields

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)