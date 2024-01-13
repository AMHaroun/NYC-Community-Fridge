package com.example.nyccommunityfridge.data

import android.util.Log
import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.example.nyccommunityfridge.model.CommunityFridge
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

class NycCommunityFridgeRepositoryImpl(
    val remoteDatabase : FirebaseFirestore,
    val localDatabaseDao: CommunityFridgeDao
): NycCommunityFridgeRepository {
    override suspend fun getRemoteCommunityFridges(): List<CommunityFridge> {
        TODO("Not yet implemented")
    }

    override suspend fun getLocalCommunityFridges(): Flow<List<com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge>> {
        val result = try {
            localDatabaseDao.getCommunityFridges()
        } catch (e: Exception){
            e.printStackTrace()
            Log.d("DEBUG", "getLocalCommunityFridges() {${e.message}}")
            return emptyFlow()
        }
        return result
    }

    override suspend fun saveCommunityFridges(communityFridges: List<CommunityFridge>) {
        TODO("Not yet implemented")
    }

    override suspend fun checkForCommunityFridgeUpdates(): Boolean {
        TODO("Not yet implemented")
    }

}