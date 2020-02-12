package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface MyAppComponent {

    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun myInject(activity: MainActivity)

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun myCreateWithContextMethod(@BindsInstance context: Context): MyAppComponent
    }
}