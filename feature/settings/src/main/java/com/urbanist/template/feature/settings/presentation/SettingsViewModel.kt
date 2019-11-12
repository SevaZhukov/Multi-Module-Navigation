package com.urbanist.template.feature.settings.presentation

import com.urbanist.template.core.di.presentation.events.EventsDispatcher
import com.urbanist.template.core.di.presentation.events.EventsDispatcherOwner
import com.urbanist.template.core.di.presentation.viewmodel.BaseViewModel
import javax.inject.Inject

class SettingsViewModel @Inject constructor(

) : BaseViewModel(),
	EventsDispatcherOwner<SettingsViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> =
		EventsDispatcher()

	interface EventsListener {

	}
}