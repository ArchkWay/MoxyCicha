package com.example.myapplicationwithmoxyandcicerone

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class DummyPresenter : MvpPresenter<DummyView>() {
    fun onShowDialogClick() {
        viewState.stupid()
    }

    fun onHideDialog() {
        viewState.retarding()
    }
}
