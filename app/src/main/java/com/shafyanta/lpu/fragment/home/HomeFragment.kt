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

    private val ui = HomeUi(this)
    private val pr = HomePresenter(this)

    override fun onUiBtnClicked() {
        ui.showLoading()
        pr.loginUser("username", "password")
    }

    override fun onPrDataResponse(result: String) {
        toast(result)
        ui.hideLoading()
    }

    override fun onPrDataError(message: String) {
        toast(message)
        ui.hideLoading()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        ui.initFrom(view, this)
        pr.initFrom(this)
        ui.initListener()
        return view
    }
}