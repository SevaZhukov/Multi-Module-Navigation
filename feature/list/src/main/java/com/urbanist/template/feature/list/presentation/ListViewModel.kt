package com.urbanist.template.feature.list.presentation

import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcher
import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcherOwner
import com.memebattle.memes.mvvm.viewmodel.BaseViewModel
import javax.inject.Inject

class ListViewModel @Inject constructor(

) : BaseViewModel(), EventsDispatcherOwner<ListViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

	interface EventsListener {

	}
}