package com.urbanist.template.feature.settings.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.urbanist.template.core.di.navigation.NavHost
import com.urbanist.template.core.di.navigation.navigate
import com.urbanist.template.core.di.presentation.fragment.BaseFragment
import com.urbanist.template.feature.settings.R
import com.urbanist.template.feature.settings.databinding.FragmentSettingsBinding
import com.urbanist.template.feature.settings.presentation.navigation.SettingsNavCommandProvider
import javax.inject.Inject

class SettingsFragment : BaseFragment<FragmentSettingsBinding>(),
    SettingsViewModel.EventsListener {

	override val layoutId: Int = R.layout.fragment_settings

	@Inject
	lateinit var globalHost: NavHost

	@Inject
	lateinit var navCommandProvider: SettingsNavCommandProvider

	@Inject
	lateinit var viewModel: SettingsViewModel

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view = super.onCreateView(inflater, container, savedInstanceState)
		viewModel.eventsDispatcher.bind(this, this)
		binding.viewModel = viewModel
		return view
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		binding.signOut.setOnClickListener {
			navigate(navCommandProvider.toAuth, globalHost.id)
		}
	}
}
