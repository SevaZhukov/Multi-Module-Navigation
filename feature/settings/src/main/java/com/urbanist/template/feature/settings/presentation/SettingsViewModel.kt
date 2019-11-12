package com.urbanist.template.feature.settings.presentation

import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcher
import com.memebattle.memes.mvvm.eventsdispatcher.EventsDispatcherOwner
import com.memebattle.memes.mvvm.viewmodel.BaseViewModel
import javax.inject.Inject

class SettingsViewModel @Inject constructor(

) : BaseViewModel(), EventsDispatcherOwner<SettingsViewModel.EventsListener> {

	override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()

	interface EventsListener {

	}
}