package com.shafyanta.lpu.activity.main

interface MainListener {
    fun onPrDataResponse(result: String)
    fun onPrDataError(message: String)
    fun onUiBtnClicked()
}