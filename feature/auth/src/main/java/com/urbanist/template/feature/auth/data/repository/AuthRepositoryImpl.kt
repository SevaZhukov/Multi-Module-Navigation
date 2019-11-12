package com.urbanist.template.feature.auth.data.repository

import com.urbanist.template.feature.auth.data.datasource.AuthFBDataSource
import com.urbanist.template.feature.auth.domain.entity.AuthUser
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authFBDataSource: AuthFBDataSource
) : AuthRepository {

    override fun signIn(email: String, password: String): Single<AuthUser> =
        authFBDataSource.signIn(email, password)
            .map { AuthUser(email) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

    override fun signUp(email: String, password: String): Single<AuthUser> =
        authFBDataSource.signUp(email, password)
            .map { AuthUser(email) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
}