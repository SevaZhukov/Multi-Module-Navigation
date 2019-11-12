package com.urbanist.template.feature.list.presentation

import com.urbanist.template.core.di.presentation.events.EventsDispatcher
import com.urbanist.template.core.di.presentation.events.EventsDispatcherOwner
import com.urbanist.template.core.di.presentation.viewmodel.BaseViewModel
import javax.inject.Inject

class ListViewModel @Inject constructor(

) : BaseViewModel(),
	EventsDispatcherOwner<ListViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> =
		EventsDispatcher()

	interface EventsListener {

	}
}