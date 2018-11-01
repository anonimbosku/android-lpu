package com.shafyanta.lpu.fragment.home

import com.shafyanta.lpu.firebase.FBRListener
import com.shafyanta.lpu.firebase.Firebase

class HomePresenter {
    fun loginUser(fbrListener: FBRListener){
        Firebase.loginUser(fbrListener)
    }
}