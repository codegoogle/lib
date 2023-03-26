package com.p7700g.p99005;

/* compiled from: FadeModeResult.java */
/* loaded from: classes3.dex */
public class pj2 {
    public final int a;
    public final int b;
    public final boolean c;

    private pj2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static pj2 a(int i, int i2) {
        return new pj2(i, i2, true);
    }

    public static pj2 b(int i, int i2) {
        return new pj2(i, i2, false);
    }
}