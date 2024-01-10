package com.example.nyccommunityfridge.data.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge

@Database(
    entities = [CommunityFridge::class],
    version = 1
)
abstract class CommunityFridgeDatabase: RoomDatabase(){

    abstract val communityFridgeDao: CommunityFridgeDao
}