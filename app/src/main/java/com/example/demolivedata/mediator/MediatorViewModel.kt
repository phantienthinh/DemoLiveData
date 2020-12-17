package com.example.demolivedata.mediator

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random


class MediatorViewModel : ViewModel() {

    private val liveData1 = MutableLiveData<String>()
    private val liveData2 = MutableLiveData<String>()

    var liveDataMerger = MediatorLiveData<String>()

    init {
        liveDataMerger.addSource(liveData1) {
            liveDataMerger.value = it
        }
        liveDataMerger.addSource(liveData2) {
            liveDataMerger.value = it
        }
    }


    fun updateLiveData1() {
        liveData1.value = "live data1 : ${Random.nextInt(0,1000)}"
    }

    fun updateLiveData2() {
        liveData1.value = "live data2 : ${Random.nextInt(0,1000)}"
    }

}