package com.example.myapplicationwithmoxyandcicerone

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface DummyView :MvpView{
    fun stupid()
    fun retarding()
}
