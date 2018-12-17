package com.shafyanta.lpu.fragment

import android.support.v4.app.Fragment

interface FragmentPr {
    var fragment: Fragment

    fun initFrom(fragment: Fragment){
        this.fragment = fragment
    }
}