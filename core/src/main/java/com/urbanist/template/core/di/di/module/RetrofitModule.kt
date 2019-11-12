package com.urbanist.template.core.di.di.module

import com.urbanist.template.core.BuildConfig
import com.urbanist.template.core.di.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class RetrofitModule {

    private val okHttpClient = OkHttpClient.Builder()
        .followSslRedirects(true)
        .addInterceptor(getInterceptor())
        .build()

    @Provides
    @ApplicationScope
    fun providesRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BACKEND_ENDPOINT)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    private fun getInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BASIC
        return interceptor
    }
}