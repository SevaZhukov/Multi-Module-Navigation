package com.urbanist.template.feature.auth.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.urbanist.template.core.di.navigation.navigate
import com.urbanist.template.core.di.presentation.fragment.BaseFragment
import com.urbanist.template.feature.auth.R
import com.urbanist.template.feature.auth.databinding.FragmentAuthBinding
import com.urbanist.template.feature.auth.presentation.navigation.AuthNavCommandProvider
import javax.inject.Inject

class AuthFragment : BaseFragment<FragmentAuthBinding>(), AuthViewModel.EventsListener {

    override val layoutId: Int = R.layout.fragment_auth

    @Inject
    lateinit var viewModel: AuthViewModel

    @Inject
    lateinit var navCommandProvider: AuthNavCommandProvider

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

    override fun showMessage(message: String) {
        
    }

    override fun navigateMain() {
        navigate(navCommandProvider.toMain)
    }
}
