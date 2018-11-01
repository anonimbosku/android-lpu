package com.shafyanta.lpu.fragment

import android.support.v4.app.Fragment
import android.view.View

interface FragmentUi {

    var view: View
    var fragment: Fragment

    fun initFrom(view: View, fragment: Fragment)
    fun initListener()
    fun showLoading()
    fun hideLoading()
}