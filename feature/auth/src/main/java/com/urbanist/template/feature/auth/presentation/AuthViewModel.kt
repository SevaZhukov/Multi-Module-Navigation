package com.urbanist.template.feature.auth.presentation

import androidx.lifecycle.MutableLiveData
import com.urbanist.template.core.di.presentation.events.EventsDispatcher
import com.urbanist.template.core.di.presentation.events.EventsDispatcherOwner
import com.urbanist.template.core.di.presentation.viewmodel.BaseViewModel
import com.urbanist.template.core.di.presentation.viewmodel.addTo
import com.urbanist.template.feature.auth.domain.signin.SignInUseCase
import com.urbanist.template.feature.auth.domain.signup.SignUpUseCase
import javax.inject.Inject

class AuthViewModel @Inject constructor(
	private val signInUseCase: SignInUseCase,
	private val signUpUseCase: SignUpUseCase
) : BaseViewModel(),
	EventsDispatcherOwner<AuthViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> =
		EventsDispatcher()

	val email = MutableLiveData<String>()
	val password = MutableLiveData<String>()

	val buttonsEnable = MutableLiveData<Boolean>()

	init {
		buttonsEnable.value = true
	}

	fun onSignInClick() {
		val email = email.value
		val password = password.value
		if (email == null || email == "") {
			eventsDispatcher.dispatchEvent { showMessage("Заполните поле почты") }
			return
		}
		if (password == null || password == "") {
			eventsDispatcher.dispatchEvent { showMessage("Заполните поле пароля") }
			return
		}
		buttonsEnable.value = false
		signInUseCase(email, password)
			.subscribe({
				eventsDispatcher.dispatchEvent { navigateMain() }
			}, {
				eventsDispatcher.dispatchEvent { showMessage(it.localizedMessage) }
				buttonsEnable.value = true
			})
			.addTo(compositeDisposable)
	}

	fun onSignUpClick() {
		val email = email.value
		val password = password.value
		if (email == null || email == "") {
			eventsDispatcher.dispatchEvent { showMessage("Заполните поле почты") }
			return
		}
		if (password == null || password == "") {
			eventsDispatcher.dispatchEvent { showMessage("Заполните поле пароля") }
			return
		}
		buttonsEnable.value = false
		signUpUseCase(email, password)
			.subscribe({
				eventsDispatcher.dispatchEvent { navigateMain() }
			}, {
				eventsDispatcher.dispatchEvent { showMessage(it.localizedMessage) }
				buttonsEnable.value = true
			})
			.addTo(compositeDisposable)
	}

	interface EventsListener {
		fun showMessage(message: String)
		fun navigateMain()
	}
}