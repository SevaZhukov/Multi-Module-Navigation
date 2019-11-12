package com.urbanist.template.feature.splash.data.repository

interface AuthorizedRepository {

	fun isAuthorized(): Boolean
}