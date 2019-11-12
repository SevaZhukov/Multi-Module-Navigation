package com.urbanist.template.navigation.host

import com.urbanist.template.core.di.navigation.NavHost
import com.urbanist.template.R
import dagger.Module
import dagger.Provides

@Module
class GlobalHostModule {

    @Provides
    fun provideGlobalHostId(): NavHost = NavHost(R.id.host_global)
}