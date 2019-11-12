package com.urbanist.template.core.di.di.module

import com.google.firebase.auth.FirebaseAuth
import com.urbanist.template.core.di.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class FirebaseModule {

    @Provides
    @ApplicationScope
    fun provideFirebaseAuth(): FirebaseAuth =
        FirebaseAuth.getInstance()
}