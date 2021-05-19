package com.moha.baseapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class Base <VB: ViewBinding> : AppCompatActivity () {

    abstract val bindingInflater:(LayoutInflater) -> VB
    private lateinit var _binding: ViewBinding
    protected val binding = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(_binding.root)


    }
    abstract fun addCallBack()
}


