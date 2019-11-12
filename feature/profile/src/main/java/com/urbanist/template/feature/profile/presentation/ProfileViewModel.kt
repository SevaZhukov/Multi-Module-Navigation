package com.urbanist.template.feature.profile.presentation

import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcher
import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcherOwner
import com.memebattle.memes.mvvm.viewmodel.BaseViewModel
import javax.inject.Inject

class ProfileViewModel @Inject constructor(

) : BaseViewModel(), EventsDispatcherOwner<ProfileViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

	interface EventsListener {

	}
}