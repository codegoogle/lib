package com.p7700g.p99005;

import com.anchorfree.sdk.UnifiedSDKConfig;

/* compiled from: UnifiedSDKConfigBuilder.java */
/* loaded from: classes.dex */
public class n51 {
    @x1
    public UnifiedSDKConfig.CallbackMode a = UnifiedSDKConfig.CallbackMode.UI;

    @x1
    public UnifiedSDKConfig a() {
        return new UnifiedSDKConfig(this);
    }

    @x1
    @Deprecated
    public n51 b(boolean z) {
        return this;
    }

    @x1
    public n51 c(@x1 UnifiedSDKConfig.CallbackMode callbackMode) {
        this.a = callbackMode;
        return this;
    }
}