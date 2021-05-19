package com.moha.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.moha.baseapp.databinding.ActivitySecondScreenBinding

class SecondScreen : Base<ActivitySecondScreenBinding>(){
    override val bindingInflater: (LayoutInflater) -> ActivitySecondScreenBinding = ActivitySecondScreenBinding::inflate

}
