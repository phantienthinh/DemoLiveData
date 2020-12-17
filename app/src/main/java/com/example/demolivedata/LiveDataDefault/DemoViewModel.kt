package com.example.demolivedata.LiveDataDefault

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DemoViewModel : ViewModel() {

    private var _currentNumber = MutableLiveData<String>()
    var currentNumber: LiveData<String> = _currentNumber

    init {
        var i = 0
        viewModelScope.launch {
            while (true) {
                delay(1000)
                i++
                _currentNumber.postValue("number: $i")
            }
        }
    }

}