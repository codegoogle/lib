package com.p7700g.p99005;

/* compiled from: FadeModeResult.java */
@e2(21)
/* loaded from: classes3.dex */
public class lk2 {
    public final int a;
    public final int b;
    public final boolean c;

    private lk2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static lk2 a(int i, int i2) {
        return new lk2(i, i2, true);
    }

    public static lk2 b(int i, int i2) {
        return new lk2(i, i2, false);
    }
}