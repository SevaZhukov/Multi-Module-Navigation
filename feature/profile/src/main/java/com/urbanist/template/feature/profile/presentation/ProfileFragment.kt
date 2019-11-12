package com.urbanist.template.feature.profile.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.urbanist.template.core.di.presentation.fragment.BaseFragment
import com.urbanist.template.feature.profile.R
import com.urbanist.template.feature.profile.databinding.FragmentProfileBinding
import com.urbanist.template.feature.profile.presentation.navigation.ProfileNavCommandProvider
import javax.inject.Inject

class ProfileFragment : BaseFragment<FragmentProfileBinding>(),
	ProfileViewModel.EventsListener {

	override val layoutId: Int = R.layout.fragment_profile

	@Inject
	lateinit var navCommandProvider: ProfileNavCommandProvider

	@Inject
	lateinit var viewModel: ProfileViewModel

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
}
