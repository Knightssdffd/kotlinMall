package com.kotlin.user.presenter

import com.kotlin.base.ext.excute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.server.UserServer
import javax.inject.Inject

class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {
    @Inject
    lateinit var userService: UserServer

    fun register(mobile: String, verifyCode: String, pwd: String) {
        userService.register(mobile, verifyCode, pwd)
            .excute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    if (t)
                        mView.onRegisterResult("注册成功")
                }
            }, lifecycleProvider)
    }
}