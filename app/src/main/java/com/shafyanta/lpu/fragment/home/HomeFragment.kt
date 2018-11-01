package com.shafyanta.lpu.fragment.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shafyanta.lpu.R
import com.shafyanta.lpu.firebase.FBRListener
import org.jetbrains.anko.support.v4.toast

class HomeFragment: Fragment(), HomeListener {

    override fun onUiBtnFragmentClicked() {
        ui.hideLoading()
        toast("You are clicked a button in fragment")
    }

    private val ui = HomeUi()
    private val pr = HomePresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        ui.initFrom(view, this)
        ui.showLoading()
        ui.initListener()
        return view
    }

    override fun onResume() {
        super.onResume()
        pr.loginUser(object: FBRListener{
            override fun onReadSuccess() {}
            override fun onReadError() {}
        })
    }
}