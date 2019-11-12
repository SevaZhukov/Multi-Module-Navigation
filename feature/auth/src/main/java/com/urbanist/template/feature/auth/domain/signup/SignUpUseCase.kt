package com.urbanist.template.feature.auth.domain.signup

import com.urbanist.template.feature.auth.domain.entity.AuthUser
import io.reactivex.Single

interface SignUpUseCase {

    operator fun invoke(email: String, password: String): Single<AuthUser>
}