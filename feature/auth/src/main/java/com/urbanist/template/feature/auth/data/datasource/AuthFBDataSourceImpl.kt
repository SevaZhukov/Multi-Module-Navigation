package com.urbanist.template.feature.auth.data.datasource

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import io.reactivex.Single
import rxfirebase2.auth.createsUserWithEmailAndPassword
import rxfirebase2.auth.signsInWithEmailAndPassword
import javax.inject.Inject

class AuthFBDataSourceImpl @Inject constructor(
    private val auth: FirebaseAuth
) : AuthFBDataSource {

    override fun signIn(email: String, password: String): Single<FirebaseUser> =
        auth.signsInWithEmailAndPassword(email, password)

    override fun signUp(email: String, password: String): Single<FirebaseUser> =
        auth.createsUserWithEmailAndPassword(email, password)
}