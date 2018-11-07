package com.shafyanta.lpu.activity.main

import android.support.v7.app.AppCompatActivity
import com.shafyanta.lpu.activity.ActivityPr
import com.shafyanta.lpu.firebase.FBRListener
import com.shafyanta.lpu.firebase.Firebase

class MainPresenter: ActivityPr {
    override lateinit var activity: AppCompatActivity
    lateinit var listener: MainListener

    override fun initFor(activity: AppCompatActivity) {
        this.activity = activity
        this.listener = activity as MainListener
    }

    fun loginUser(fbrListener: FBRListener){
        Firebase.loginUser(fbrListener)
    }

    fun requestAnyData(){
        listener.onPrDataResponse("data from request")
    }
}