package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class MainModule {

    //TODO Does the method name for provideStorage matter here? can I name it something else?
    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    @Binds
    abstract fun provideStorageOrCallThisMethodWhateverYouWant(storage: SharedPreferencesStorage): Storage

}