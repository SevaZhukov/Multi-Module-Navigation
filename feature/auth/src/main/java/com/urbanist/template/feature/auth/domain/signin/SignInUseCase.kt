package com.urbanist.template.feature.auth.domain.signin

import com.urbanist.template.feature.auth.domain.entity.AuthUser
import io.reactivex.Single

interface SignInUseCase {

    operator fun invoke(email: String, password: String): Single<AuthUser>
}