package com.anchorfree.sdk;

import androidx.annotation.Keep;
import com.p7700g.p99005.n51;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class UnifiedSDKConfig {
    @x1
    private final CallbackMode mode;

    @Keep
    /* loaded from: classes.dex */
    public enum CallbackMode {
        UI,
        BINDER,
        BACKGROUND
    }

    public UnifiedSDKConfig(@x1 n51 n51Var) {
        this.mode = n51Var.a;
    }

    @x1
    public static n51 newBuilder() {
        return new n51();
    }

    @x1
    public CallbackMode getMode() {
        return this.mode;
    }
}