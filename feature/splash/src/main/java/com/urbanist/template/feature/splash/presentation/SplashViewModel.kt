package com.urbanist.template.feature.splash.presentation

import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcher
import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcherOwner
import com.memebattle.memes.mvvm.viewmodel.BaseViewModel
import com.urbanist.template.feature.splash.domain.AuthorizedUseCase
import javax.inject.Inject

class SplashViewModel @Inject constructor(
	private val authorizedUseCase: AuthorizedUseCase
) : BaseViewModel(), EventsDispatcherOwner<SplashViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

	init {
		checkAuthorization()
	}

	private fun checkAuthorization() {
		if (authorizedUseCase()) {
			eventsDispatcher.dispatchEvent { navigateMain() }
		} else {
			eventsDispatcher.dispatchEvent { navigateAuth() }
		}
	}

	interface EventsListener {

		fun navigateMain()
		fun navigateAuth()
	}
}