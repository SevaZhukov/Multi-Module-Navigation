package com.urbanist.template.core.di.di.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class SharedPreferenceModule {

    private companion object {
        const val PREFERENCES_NAME = "preferences"
    }

    @Provides
    fun provideSharedPreference(context: Context): SharedPreferences =
        context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
}