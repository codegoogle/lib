package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum DefaultValues {
    MAX_LINES(1);
    
    @NotNull
    private final Object value;

    DefaultValues(Object obj) {
        this.value = obj;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }
}