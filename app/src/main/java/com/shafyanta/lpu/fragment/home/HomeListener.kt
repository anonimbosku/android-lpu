package com.shafyanta.lpu.fragment.home

interface HomeListener {
    fun onPrDataResponse(result: String)
    fun onPrDataError(message: String)
    fun onUiBtnClicked()
}