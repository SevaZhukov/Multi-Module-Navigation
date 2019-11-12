package com.urbanist.template.feature.auth.data.repository

import com.urbanist.template.feature.auth.domain.entity.AuthUser
import io.reactivex.Single

interface AuthRepository {

	fun signIn(email: String, password: String): Single<AuthUser>
	fun signUp(email: String, password: String): Single<AuthUser>
}