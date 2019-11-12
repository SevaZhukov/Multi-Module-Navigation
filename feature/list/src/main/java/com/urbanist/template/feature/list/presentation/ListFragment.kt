package com.urbanist.template.feature.list.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.memebattle.memes.mvvm.fragment.BaseFragment
import com.urbanist.template.feature.list.R
import com.urbanist.template.feature.list.databinding.FragmentListBinding
import com.urbanist.template.feature.list.presentation.navigation.ListNavCommandProvider
import javax.inject.Inject

class ListFragment : BaseFragment<FragmentListBinding>(),
    ListViewModel.EventsListener {

	override val layoutId: Int = R.layout.fragment_list

	@Inject
	lateinit var navCommandProvider: ListNavCommandProvider

	@Inject
	lateinit var viewModel: ListViewModel

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
