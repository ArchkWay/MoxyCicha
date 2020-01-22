package com.example.myapplicationwithmoxyandcicerone

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.arellomobile.mvp.presenter.ProvidePresenterTag

class MainActivity : MvpAppCompatActivity() {

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var dialogPresenter: DummyPresenter

    @ProvidePresenterTag(presenterClass = DummyPresenter::class, type = PresenterType.GLOBAL)
    fun provideDialogPresenterTag(): String = "Hello"

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideDialogPresenter() = DummyPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
