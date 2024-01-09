package com.example.nyccommunityfridge.di

import com.example.nyccommunityfridge.data.NycCommunityFridgeRepository
import com.example.nyccommunityfridge.data.NycCommunityFridgeRepositoryImpl
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRemoteDatabase(): FirebaseFirestore {
        return Firebase.firestore
    }

    @Singleton
    @Provides
    fun provideNycCommunityFridgeRepository(
        remoteDatabase: FirebaseFirestore
    ): NycCommunityFridgeRepository {

        return NycCommunityFridgeRepositoryImpl(
            remoteDatabase = remoteDatabase
        )

    }
}