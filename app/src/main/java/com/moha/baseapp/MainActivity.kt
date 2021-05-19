package com.moha.baseapp


import android.view.LayoutInflater
import com.moha.baseapp.databinding.ActivityMainBinding

class MainActivity : Base<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate


}
