package com.example.nyccommunityfridge.data

import com.example.nyccommunityfridge.model.CommunityFridge
import com.example.nyccommunityfridge.util.Resource
import kotlinx.coroutines.flow.Flow

interface NycCommunityFridgeRepository {

    suspend fun getRemoteCommunityFridges(): Resource<List<CommunityFridge>>

    suspend fun getLocalCommunityFridges(): Resource<Flow<List<com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge>>>

    suspend fun saveCommunityFridges(communityFridges: List<CommunityFridge>)

    suspend fun checkForCommunityFridgeUpdates(): Resource<Boolean>


}