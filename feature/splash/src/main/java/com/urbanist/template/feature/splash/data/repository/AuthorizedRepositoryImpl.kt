package com.urbanist.template.feature.splash.data.repository

import com.urbanist.template.feature.splash.data.datasource.AuthorizedDataSource
import javax.inject.Inject

class AuthorizedRepositoryImpl @Inject constructor(
    private val authorizedDataSource: AuthorizedDataSource
) : AuthorizedRepository {

    override fun isAuthorized(): Boolean = authorizedDataSource.isAuthorized()
}