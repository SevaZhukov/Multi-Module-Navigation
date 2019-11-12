package com.urbanist.template.di.module

import com.urbanist.template.core.di.di.module.FirebaseModule
import com.urbanist.template.core.di.di.module.RetrofitModule
import com.urbanist.template.core.di.di.module.SharedPreferenceModule
import com.urbanist.template.core.di.di.scope.ActivityScope
import com.urbanist.template.di.module.feature.*
import com.urbanist.template.presentation.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        RetrofitModule::class,
        SharedPreferenceModule::class,
        FirebaseModule::class,
        SplashModule::class,
        AuthModule::class,
        SettingsModule::class,
        ProfileModule::class,
        ListModule::class
    ]
)
interface ApplicationModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            AppActivityModule::class
        ]
    )
    fun appActivityInjector(): MainActivity
}