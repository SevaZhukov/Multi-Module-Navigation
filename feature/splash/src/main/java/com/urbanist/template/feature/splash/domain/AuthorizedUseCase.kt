package com.urbanist.template.feature.splash.domain

interface AuthorizedUseCase {

    operator fun invoke(): Boolean
}