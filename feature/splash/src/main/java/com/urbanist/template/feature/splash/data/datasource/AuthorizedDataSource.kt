package com.urbanist.template.feature.splash.data.datasource

interface AuthorizedDataSource {

    fun isAuthorized(): Boolean
}