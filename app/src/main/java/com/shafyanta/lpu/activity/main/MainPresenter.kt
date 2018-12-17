package com.shafyanta.lpu.activity.main

import android.support.v7.app.AppCompatActivity
import com.shafyanta.lpu.activity.ActivityPr
import com.shafyanta.lpu.firebase.FBRListener
import com.shafyanta.lpu.firebase.Firebase

class MainPresenter(private val listener: MainListener): ActivityPr {
    override lateinit var activity: AppCompatActivity

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