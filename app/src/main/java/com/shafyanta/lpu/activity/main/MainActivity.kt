package com.shafyanta.lpu.activity.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.shafyanta.lpu.R
import com.shafyanta.lpu.firebase.FBRListener
import org.jetbrains.anko.toast

class MainActivity: AppCompatActivity(), MainListener {

    override fun onUiLoginBtnClicked() {
        ui.hideLoading()
        toast("Your are clicked a button in activity")
    }

    private val ui = MainUi()
    private val pr = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui.initFor(this)
        ui.initToolbar()
        ui.initListener()

        ui.initFragment()
    }

    override fun onResume() {
        super.onResume()
        ui.showLoading()
        pr.loginUser(object: FBRListener{
            override fun onReadSuccess(){}
            override fun onReadError(){}
        })
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}
