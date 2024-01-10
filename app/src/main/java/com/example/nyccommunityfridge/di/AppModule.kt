package com.example.nyccommunityfridge.di

import android.content.Context
import androidx.room.Room
import com.example.nyccommunityfridge.data.NycCommunityFridgeRepository
import com.example.nyccommunityfridge.data.NycCommunityFridgeRepositoryImpl
import com.example.nyccommunityfridge.data.local.room.dao.CommunityFridgeDao
import com.example.nyccommunityfridge.data.local.room.database.CommunityFridgeDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideLocalDatabase(@ApplicationContext context: Context): CommunityFridgeDatabase{
        return Room.databaseBuilder(
            context,
            CommunityFridgeDatabase::class.java,
            "CommunityFridgeDB"
        ).build()
    }

    @Singleton
    @Provides
    fun provideLocalDatabaseDao(localDatabase: CommunityFridgeDatabase): CommunityFridgeDao {
        return localDatabase.communityFridgeDao
    }

    @Singleton
    @Provides
    fun provideRemoteDatabase(): FirebaseFirestore {
        return Firebase.firestore
    }

    @Singleton
    @Provides
    fun provideNycCommunityFridgeRepository(
        remoteDatabase: FirebaseFirestore,
        localDatabaseDao: CommunityFridgeDao
    ): NycCommunityFridgeRepository {

        return NycCommunityFridgeRepositoryImpl(
            remoteDatabase = remoteDatabase,
            localDatabaseDao = localDatabaseDao
        )

    }
}