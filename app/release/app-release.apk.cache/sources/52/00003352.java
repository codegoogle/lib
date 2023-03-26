package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum FacebookAdViewTypes {
    MEDIA_VIEW("fb_media_view");
    
    @NotNull
    private final String string;

    FacebookAdViewTypes(String str) {
        this.string = str;
    }

    @NotNull
    public final String getString() {
        return this.string;
    }
}