package com.example.nyccommunityfridge.data

import com.example.nyccommunityfridge.model.CommunityFridge
import kotlinx.coroutines.flow.Flow

interface NycCommunityFridgeRepository {

    suspend fun getRemoteCommunityFridges(): List<CommunityFridge>

    suspend fun getLocalCommunityFridges(): Flow<List<com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge>>

    suspend fun saveCommunityFridges(communityFridges: List<CommunityFridge>)

    suspend fun checkForCommunityFridgeUpdates(): Boolean


}