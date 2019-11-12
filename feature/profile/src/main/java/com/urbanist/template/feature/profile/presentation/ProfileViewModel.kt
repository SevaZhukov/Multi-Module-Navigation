package com.urbanist.template.feature.profile.presentation

import com.urbanist.template.core.di.presentation.events.EventsDispatcher
import com.urbanist.template.core.di.presentation.events.EventsDispatcherOwner
import com.urbanist.template.core.di.presentation.viewmodel.BaseViewModel
import javax.inject.Inject

class ProfileViewModel @Inject constructor(

) : BaseViewModel(),
	EventsDispatcherOwner<ProfileViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> =
		EventsDispatcher()

	interface EventsListener {

	}
}