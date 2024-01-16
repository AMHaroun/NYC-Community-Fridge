package com.example.nyccommunityfridge.data

import android.util.Log
import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.example.nyccommunityfridge.model.CommunityFridge
import com.example.nyccommunityfridge.util.Resource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.toObject
import com.google.firebase.firestore.toObjects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await

class NycCommunityFridgeRepositoryImpl(
    val remoteDatabase : FirebaseFirestore,
    val localDatabaseDao: CommunityFridgeDao
): NycCommunityFridgeRepository {
    override suspend fun getRemoteCommunityFridges(): Resource<List<CommunityFridge>> {
        val result = try {
            remoteDatabase.collection("Community Fridges").get().await()
        } catch (e: Exception) {
            e.printStackTrace()
            Log.d("DEBUG", "getRemoteCommunityFridges() {${e.message}}")
            return Resource.Error(message = "Could not get fridge data from remote database")
        }
        return Resource.Success(result.toObjects<CommunityFridge>())
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
        // TODO: (not yet implemented)
    }

    override suspend fun checkForCommunityFridgeUpdates(): Resource<Boolean> {
        val result = try {
            remoteDatabase
                .collection("Updates")
                .document("Community Fridges")
                .get()
                .await()
        } catch (e: Exception) {
            e.printStackTrace()
            Log.d("DEBUG", "saveCommunityFridges() {${e.message}}")
            return Resource.Error(message = "Could not check for updates")
        }
        return Resource.Success(result.toString().toBoolean())
    }

}