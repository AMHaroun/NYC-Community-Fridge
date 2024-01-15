package com.example.nyccommunityfridge.data

import android.util.Log
import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.example.nyccommunityfridge.model.CommunityFridge
import com.example.nyccommunityfridge.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow

class NycCommunityFridgeRepositoryImpl(
    val remoteDatabase : FirebaseFirestore,
    val localDatabaseDao: CommunityFridgeDao
): NycCommunityFridgeRepository {
    override suspend fun getRemoteCommunityFridges(): Resource<List<CommunityFridge>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLocalCommunityFridges(): Resource<Flow<List<com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge>>> {
        val result = try {
            localDatabaseDao.getCommunityFridges()
        } catch (e: Exception){
            e.printStackTrace()
            Log.d("DEBUG", "getLocalCommunityFridges() {${e.message}}")
            return Resource.Error(message = "Could not get fridge data from offline database")
        }
        return Resource.Success(result)
    }

    override suspend fun saveCommunityFridges(communityFridges: List<CommunityFridge>) {
        TODO("Not yet implemented")
    }

    override suspend fun checkForCommunityFridgeUpdates(): Boolean {
        TODO("Not yet implemented")
    }

}