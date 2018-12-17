package com.shafyanta.lpu.fragment.home

import android.support.v4.app.Fragment
import android.view.View
import com.shafyanta.lpu.fragment.FragmentUi
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeUi(private val listener: HomeListener): FragmentUi {
    override lateinit var view: View
    override lateinit var fragment: Fragment

    override fun initListener() {
        view.btn_home.setOnClickListener { listener.onUiBtnClicked() }
    }

    override fun showLoading() {
        view.pb_home.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        view.pb_home.visibility = View.GONE
    }
}