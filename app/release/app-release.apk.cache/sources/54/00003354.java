package com.greedygame.mystique2.models;

import androidx.annotation.Keep;
import com.squareup.moshi.JsonClass;

@Keep
@JsonClass(generateAdapter = false)
/* loaded from: classes3.dex */
public enum MediationType {
    ADMOB,
    MOPUB,
    FACEBOOK,
    S2S,
    ADMOB_BANNER,
    NO_MEDIATION
}