package com.urbanist.template.core.di.presentation.events

interface EventsDispatcherOwner<T> {
    val eventsDispatcher: EventsDispatcher<T>
}