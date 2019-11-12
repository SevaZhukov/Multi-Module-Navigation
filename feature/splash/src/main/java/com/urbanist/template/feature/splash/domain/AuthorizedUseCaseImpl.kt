package com.urbanist.template.feature.splash.domain

import com.urbanist.template.feature.splash.data.repository.AuthorizedRepository
import javax.inject.Inject

class AuthorizedUseCaseImpl @Inject constructor(
	private val authorizedRepository: AuthorizedRepository
) : AuthorizedUseCase {

	override operator fun invoke(): Boolean = authorizedRepository.isAuthorized()
}