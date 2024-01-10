package com.example.nyccommunityfridge.data.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.nyccommunityfridge.data.local.room.entity.CommunityFridge
import kotlinx.coroutines.flow.Flow

@Dao
interface CommunityFridgeDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCommunityFridge(fridge: CommunityFridge)

    @Delete
    suspend fun deleteCommunityFridge(fridge: CommunityFridge)

    @Query("SELECT * FROM communityfridge")
    fun getCommunityFridges(): Flow<List<CommunityFridge>>
}