package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum p13 {
    ADMOB("admob"),
    ADMOB_BANNER("admob_banner"),
    ADMOB_INTERSTITIAL("admob_interstitial"),
    ADMOB_REWARDED("admob_rewarded"),
    ADMOB_REWARDED_INTERSTITIAL("admob_rewarded_interstitial"),
    ADMOB_APP_OPEN("admob_app_open"),
    MOPUB("mopub"),
    FACEBOOK("fan"),
    FACEBOOK_BANNER("fan_banner"),
    FACEBOOK_INTERSTITIAL("fan_interstitial"),
    FACEBOOK_REWARDED("fan_rewarded"),
    S2S_INTERSTITIAL("s2s_interstitial"),
    S2S_BANNER("s2s_banner"),
    S2S_VIDEO("s2s_video"),
    INVALID("");
    
    @NotNull
    private final String I;

    p13(String str) {
        this.I = str;
    }

    @NotNull
    public final String f() {
        return this.I;
    }
}