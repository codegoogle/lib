package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum l23 {
    APP_VERSION_CODE("appv"),
    APP_VERSION_NAME("appn"),
    AI5("ai5"),
    ANDROID_VERSION("android_v"),
    CAMPAIGN_ID("campaign_id"),
    GAME_ID("app_id"),
    PHONE_MODEL("model"),
    STACK_TRACE("stacktrace"),
    SDK_V("sdkv"),
    SDK_N("sdkn"),
    SESSION_ID("session_id"),
    CRASH_TIMESTAMP("crash_ts"),
    IS_NON_FATAL("non_fatal"),
    TAG("tag"),
    ADVID("advid"),
    PLATFORM("platform");
    
    @NotNull
    private final String J;

    l23(String str) {
        this.J = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.J;
    }
}