package com.moha.baseapp


import android.content.Intent
import android.net.Uri
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
        binding.btn.setOnClickListener {
            intent  = Intent(Intent.ACTION_SEND)
            intent.putExtra(Constants.name,binding.name.text.toString())
            startActivity(intent)
        }
    }

    override fun finalResults() {}

}

