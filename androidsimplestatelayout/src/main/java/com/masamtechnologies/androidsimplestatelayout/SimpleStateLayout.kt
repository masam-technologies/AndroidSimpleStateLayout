package com.masamtechnologies.simplestatelayout

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.masamtechnologies.androidsimplestatelayout.R
import kotlinx.android.synthetic.main.simplestattelayout.view.*

class SimpleStateLayout(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {
    init {
        inflate(R.layout.simplestattelayout)
        loading_view.reset()
    }

    val isBusy:Boolean get() = loading_view.isBusy

    fun refreshing(state: Boolean) {
        if (state)
            loading_view.start()
        else
            loading_view.stop()
    }
    inline fun <R> loading(block: (SimpleStateLayout) -> R): R {
        refreshing(true)
        return block(this)
    }
}