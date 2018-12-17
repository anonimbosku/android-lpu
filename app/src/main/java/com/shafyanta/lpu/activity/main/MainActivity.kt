package com.shafyanta.lpu.activity.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.shafyanta.lpu.R
import org.jetbrains.anko.toast

class MainActivity: AppCompatActivity(), MainListener {

    private val ui = MainUi(this)
    private val pr = MainPresenter(this)

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui.initFor(this)
        pr.initFor(this)

        ui.initToolbar()
        ui.initListener()
        ui.initFragment()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}
