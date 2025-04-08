package com.mato.syai

import androidx.compose.material3
import androidx.annotation
import androidx.compose.runtime
import androidx.compose.ui.Modifier
import androidx.compose.ui
import app.rive.runtime.kotlin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ComposableRiveAnimationView(
    modifier: Modifier = Modifier,
    @RawRes animation: Int,
    stateMachineName: String? = null,
    alignment: app.rive.runtime.kotlin.core.Alignment = app.rive.runtime.kotlin.core.Alignment.CENTER,
    fit: Fit = Fit.CONTAIN,
    onInit: (RiveAnimationView) -> Unit = {}
) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            RiveAnimationView(context).also {
                it.setRiveResource(
                    resId = animation,
                    stateMachineName = stateMachineName,
                    alignment = alignment,
                    fit = fit,

                    )
            }
        },
        update = { view -> onInit(view) }
    )
}