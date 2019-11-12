package com.urbanist.template.presentation

import android.os.Bundle
import androidx.navigation.Navigation
import com.urbanist.template.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Navigation.findNavController(this, R.id.host_global)
    }
}