package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.anythink.basead.b.a;
import com.anythink.expressad.foundation.d.c;
import com.squareup.moshi.JsonClass;
import org.jetbrains.annotations.NotNull;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum NativeAdViewTypes {
    ICON("icon"),
    IMAGE("image"),
    CTA(a.C0020a.k),
    TITLE("title"),
    DESCRIPTION("description"),
    MEDIA_VIEW("mediaview"),
    ADVERTISER("advertiser"),
    PRICE("price"),
    RATING(c.X),
    STORE("store"),
    ADCHOICES("ad_choice");
    
    @NotNull
    private final String value;

    NativeAdViewTypes(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}