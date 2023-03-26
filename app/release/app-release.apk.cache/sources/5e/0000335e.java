package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.anythink.expressad.foundation.d.c;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum ViewSize {
    WRAP("wrap"),
    MATCH_PARENT(c.bl);
    
    @NotNull
    private final String value;

    ViewSize(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}