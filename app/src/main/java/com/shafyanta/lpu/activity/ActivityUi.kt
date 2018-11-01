package com.shafyanta.lpu.activity

import android.support.v7.app.AppCompatActivity

interface ActivityUi {

    var activity: AppCompatActivity

    fun initFor(activity: AppCompatActivity)
    fun initToolbar()
    fun initListener()
    fun showLoading()
    fun hideLoading()
}