package com.example.nyccommunityfridge.data

import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.example.nyccommunityfridge.model.CommunityFridge
import com.google.firebase.firestore.FirebaseFirestore

class NycCommunityFridgeRepositoryImpl(
    val remoteDatabase : FirebaseFirestore,
    val localDatabaseDao: CommunityFridgeDao
): NycCommunityFridgeRepository {
    override suspend fun getRemoteCommunityFridges(): List<CommunityFridge> {
        TODO("Not yet implemented")
    }

    override suspend fun getLocalCommunityFridges(): List<CommunityFridge> {
        TODO("Not yet implemented")
    }

    override suspend fun saveCommunityFridges(communityFridges: List<CommunityFridge>) {
        TODO("Not yet implemented")
    }

    override suspend fun checkForCommunityFridgeUpdates(): Boolean {
        TODO("Not yet implemented")
    }

}