package com.urbanist.template.feature.auth.data.datasource

import com.google.firebase.auth.FirebaseUser
import io.reactivex.Single

interface AuthFBDataSource {

    fun signIn(email: String, password: String): Single<FirebaseUser>
    fun signUp(email: String, password: String): Single<FirebaseUser>
}