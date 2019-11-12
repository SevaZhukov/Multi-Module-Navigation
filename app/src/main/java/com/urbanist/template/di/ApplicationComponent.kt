package com.urbanist.template.di

import android.content.Context
import com.urbanist.template.App
import com.urbanist.template.core.di.di.scope.ApplicationScope
import com.urbanist.template.di.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@ApplicationScope
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance appContext: Context): ApplicationComponent
    }
}