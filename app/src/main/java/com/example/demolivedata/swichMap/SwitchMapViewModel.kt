package com.example.demolivedata.swichMap

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

data class User(var name: String="", var idUser: Int=0)


class SwitchMapViewModel : ViewModel() {

    private var userIdLiveData = MutableLiveData<User>()

    val liveData = Transformations.switchMap(userIdLiveData) { user ->
        queryUserId(user.idUser)
    }
    private val listData = ArrayList<User>()

    init {
        for (i in 0 until 500) {
            listData.add(User("name$i", i))
        }
    }

    private fun queryUserId(idUser: Int): LiveData<User> {
        val item = listData[idUser]
        return MutableLiveData(item)
    }

    fun setUserId(userId: User) {
        userIdLiveData.value = userId
    }

}