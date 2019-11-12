package com.urbanist.template.feature.auth.domain.signup

import com.urbanist.template.feature.auth.domain.entity.AuthUser
import com.urbanist.template.feature.auth.data.repository.AuthRepository
import io.reactivex.Single
import javax.inject.Inject

class SignUpUseCaseImpl @Inject constructor(
	private val authRepository: AuthRepository
) : SignUpUseCase {

	override operator fun invoke(email: String, password: String): Single<AuthUser> =
		authRepository.signUp(email, password)
}