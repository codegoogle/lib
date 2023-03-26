package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum ScaleType {
    CENTER("center"),
    CENTER_CROP("center-crop"),
    CENTER_INSIDE("center-inside"),
    FIT_CENTER("fit-center"),
    FIT_END("fit-end"),
    FIT_START("fit-start"),
    FIT_XY("fit-xy"),
    MATRIX("matrix");
    
    @NotNull
    private final String value;

    ScaleType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}