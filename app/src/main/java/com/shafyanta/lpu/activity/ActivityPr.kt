package com.shafyanta.lpu.activity

import android.support.v7.app.AppCompatActivity

interface ActivityPr {
    var activity: AppCompatActivity

    fun initFor(activity: AppCompatActivity){
        this.activity = activity
    }
}