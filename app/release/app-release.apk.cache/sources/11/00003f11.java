package com.p7700g.p99005;

/* compiled from: MemoryCategory.java */
/* loaded from: classes2.dex */
public enum dp1 {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float w;

    dp1(float f) {
        this.w = f;
    }

    public float f() {
        return this.w;
    }
}