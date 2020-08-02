package com.phrougerie.musicsearcher.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.common.server.converter.StringToIntConverter

class RegisterViewModel : ViewModel() {

    val email: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}