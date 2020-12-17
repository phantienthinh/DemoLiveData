package com.example.demolivedata.singer

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SingerViewModel : ViewModel() {
//    var showToast = MutableLiveData<SingevBoolean>()
    var showToast = SingleLiveEvent<Boolean>()

//    fun showToast() {
//        showToast.value = true
//    }

    fun showToast() {
        showToast.call()
    }
}