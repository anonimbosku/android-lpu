package com.shafyanta.lpu.fragment.home

import android.support.v4.app.Fragment
import com.shafyanta.lpu.firebase.FBRListener
import com.shafyanta.lpu.firebase.Firebase
import com.shafyanta.lpu.fragment.FragmentPr

class HomePresenter: FragmentPr {

    override lateinit var fragment: Fragment
    lateinit var listener: HomeListener

    override fun initFrom(fragment: Fragment) {
        this.fragment = fragment
        listener = fragment as HomeListener
    }

    fun loginUser(fbrListener: FBRListener){
        Firebase.loginUser(fbrListener)
    }

    fun requestAnyData(){
        listener.onPrDataResponse("fragment data from request")
    }
}