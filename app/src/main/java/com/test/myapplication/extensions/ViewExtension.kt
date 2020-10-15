package com.test.myapplication.extensions

import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("android:onSingleClick")
fun View.setOnSingleClickListener(f: Runnable?) {
    val intervalMs: Long = 1000
    var isClickable = true

    setOnClickListener {
        if (isClickable) {
            isClickable = false
            postDelayed({
                isClickable = true
            }, intervalMs)
            f?.run()
            Log.d("onSingleClick", "Click!")
        }else {
            Log.d("onSingleClick", "Wait 1 second!")
        }
    }
}





