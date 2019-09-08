package com.yanzhikai.dialogqueue

import android.app.Dialog

class DialogWrapper<T>(
    private val dialog: Dialog,
    private var callBack: DQItemCallBack? = null,
    private var data: T
) {

    init {
        dialog.setOnCancelListener {  }
    }

    fun show() {
        dialog.show()
    }

    fun dismiss() {
        dialog.dismiss()
    }
}