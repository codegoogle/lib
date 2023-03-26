package com.p7700g.p99005;

import com.p7700g.p99005.ga2;

/* compiled from: HarmonizedColorAttributes.java */
/* loaded from: classes3.dex */
public final class gc2 {
    private static final int[] a = {ga2.c.O2, ga2.c.S2, ga2.c.P2, ga2.c.T2};
    private final int[] b;
    @m2
    private final int c;

    private gc2(@x1 @q0 int[] iArr, @m2 int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.b = iArr;
        this.c = i;
    }

    @x1
    public static gc2 a(@x1 @q0 int[] iArr) {
        return new gc2(iArr, 0);
    }

    @x1
    public static gc2 b(@x1 @q0 int[] iArr, @m2 int i) {
        return new gc2(iArr, i);
    }

    @x1
    public static gc2 c() {
        return b(a, ga2.n.y9);
    }

    @x1
    public int[] d() {
        return this.b;
    }

    @m2
    public int e() {
        return this.c;
    }
}