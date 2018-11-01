package com.shafyanta.lpu.activity.main

import com.shafyanta.lpu.firebase.FBRListener
import com.shafyanta.lpu.firebase.Firebase

class MainPresenter {
    fun loginUser(fbrListener: FBRListener){
        Firebase.loginUser(fbrListener)
    }
}