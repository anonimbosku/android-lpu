package com.shafyanta.lpu.fragment.home

import android.support.v4.app.Fragment
import com.shafyanta.lpu.firebase.FBRListener
import com.shafyanta.lpu.firebase.Firebase
import com.shafyanta.lpu.fragment.FragmentPr

class HomePresenter(private val listener: HomeListener): FragmentPr {
    override lateinit var fragment: Fragment

    fun loginUser(un: String, ps: String){
        Firebase.loginUser(object: FBRListener{
            override fun onReadSuccess(){
                listener.onPrDataResponse("data response")
            }
            override fun onReadError(){
                listener.onPrDataError("data error")
            }
        })
    }
}