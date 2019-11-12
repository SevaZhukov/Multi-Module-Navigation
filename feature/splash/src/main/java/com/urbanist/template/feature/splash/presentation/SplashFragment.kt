package com.urbanist.template.feature.splash.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.urbanist.template.core.di.navigation.navigate
import com.urbanist.template.core.di.presentation.fragment.BaseFragment
import com.urbanist.template.feature.splash.R
import com.urbanist.template.feature.splash.databinding.FragmentSplashBinding
import com.urbanist.template.feature.splash.presentation.navigation.SplashNavCommandProvider
import javax.inject.Inject

class SplashFragment : BaseFragment<FragmentSplashBinding>(), SplashViewModel.EventsListener {

	override val layoutId: Int = R.layout.fragment_splash

	@Inject
	lateinit var navCommandProvider: SplashNavCommandProvider

	@Inject
	lateinit var viewModel: SplashViewModel

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		viewModel.eventsDispatcher.bind(this, this)
		return super.onCreateView(inflater, container, savedInstanceState)
	}

	override fun navigateMain() {
		navigate(navCommandProvider.toMain)
	}

	override fun navigateAuth() {
		navigate(navCommandProvider.toAuth)
	}
}
