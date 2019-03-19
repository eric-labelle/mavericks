package com.airbnb.mvrx

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout

open class TestActivity : BaseMvRxActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AppCompat_NoActionBar)
        setContentView(
            FrameLayout(this).apply {
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT)
                id = CONTAINER_ID
            }
        )
    }
}

const val CONTAINER_ID = 111
