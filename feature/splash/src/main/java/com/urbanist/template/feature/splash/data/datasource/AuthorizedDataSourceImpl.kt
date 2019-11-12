package com.urbanist.template.feature.splash.data.datasource

import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject

class AuthorizedDataSourceImpl @Inject constructor(
	private val auth: FirebaseAuth
) : AuthorizedDataSource {

	override fun isAuthorized(): Boolean = auth.currentUser != null
}