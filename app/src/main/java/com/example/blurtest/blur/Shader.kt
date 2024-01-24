package com.example.blurtest.blur

import android.graphics.RuntimeShader
import android.os.Build
import androidx.annotation.RequiresApi
import org.intellij.lang.annotations.Language

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
val GET_BEHIND_CANVAS = RuntimeShader(
    """
uniform shader background;
layout(color) uniform half4 returnColor;

 vec4 main(float2 fragCoord) {
 
    return mix( background.eval(fragCoord), returnColor,  1);
 }
"""
)

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
val SET_COLOR_FILTER = RuntimeShader(
    """
uniform shader background;
layout(color) uniform half4 filterColor;
uniform float alpha;
 vec4 main(float2 fragCoord) {
    return mix( background.eval(fragCoord), filterColor,  alpha);
 }
"""
)
