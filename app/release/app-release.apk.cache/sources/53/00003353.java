package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum LayerType {
    TEXT("text"),
    IMAGE("image"),
    MEDIAVIEW("mediaview"),
    ADCHOICE(c.aK),
    BUTTON("button"),
    BANNER(f.e);
    
    @NotNull
    private final String value;

    LayerType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}