package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class, AppSubcomponents::class])
interface MyAppComponent {

    // Classes that can be injected by this Component
//    fun myInject(activity: MainActivity)
//    fun inject(activity: LoginActivity)
//    fun inject(activity: SettingsActivity)

    // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
//    fun userComponent(): UserComponent.Factory
    fun userManager(): UserManager


    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun myCreateWithContextMethod(@BindsInstance context: Context): MyAppComponent
    }
}