package com.moha.baseapp


import android.content.Intent

import android.os.Bundle
import android.view.LayoutInflater

import com.moha.baseapp.databinding.ActivityMainBinding

class MainActivity : Base<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addCallBack()

    }

    override fun addCallBack() {
        binding.apply {
            btn.setOnClickListener {
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Constants.name, name.text)
                startActivity(intent)
            }
        }
    }

    override fun finalResults() {

    }
}


