package com.mato.syai.core.animation.model

import androidx.annotation.RawRes

data class RiveAnimationConfig(
    @RawRes val resId: Int,
    val autoplay: Boolean = true
)
