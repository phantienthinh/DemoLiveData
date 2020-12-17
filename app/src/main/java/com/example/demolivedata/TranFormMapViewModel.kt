package com.example.demolivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TranFormMapViewModel : ViewModel() {

    private val _currentTime = MutableLiveData<Long>()

    val currentTimeString = Transformations.map(_currentTime) { time ->
        "Second : $time"
    }

    init {
        var i = 1
        viewModelScope.launch {
            while (true) {
                i++
                delay(1000)
                _currentTime.postValue((i).toLong())
            }
        }
    }

}