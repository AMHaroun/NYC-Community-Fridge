package com.example.nyccommunityfridge.data

import com.example.nyccommunityfridge.model.CommunityFridge

interface NycCommunityFridgeRepository {

    suspend fun getRemoteCommunityFridges(): List<CommunityFridge>

    suspend fun getLocalCommunityFridges(): List<CommunityFridge>

    suspend fun saveCommunityFridges(communityFridges: List<CommunityFridge>)

    suspend fun checkForCommunityFridgeUpdates(): Boolean


}