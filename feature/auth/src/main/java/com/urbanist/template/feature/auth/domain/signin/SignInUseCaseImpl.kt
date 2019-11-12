package com.urbanist.template.feature.auth.domain.signin

import com.urbanist.template.feature.auth.domain.entity.AuthUser
import com.urbanist.template.feature.auth.data.repository.AuthRepository
import io.reactivex.Single
import javax.inject.Inject

class SignInUseCaseImpl @Inject constructor(
	private val authRepository: AuthRepository
) : SignInUseCase {

	override operator fun invoke(email: String, password: String): Single<AuthUser> =
		authRepository.signIn(email, password)
}