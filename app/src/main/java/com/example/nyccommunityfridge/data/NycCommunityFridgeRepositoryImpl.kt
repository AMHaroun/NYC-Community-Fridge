package com.example.nyccommunityfridge.data

import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.google.firebase.firestore.FirebaseFirestore

class NycCommunityFridgeRepositoryImpl(
    val remoteDatabase : FirebaseFirestore,
    val localDatabaseDao: CommunityFridgeDao
): NycCommunityFridgeRepository {

}