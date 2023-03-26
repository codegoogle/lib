package com.anythink.core.common.e;

/* loaded from: classes2.dex */
public final class g extends x {
    public static final int a = 1;
    public static final int b = 2;
    private String L;
    private String M;
    private int N = 1;
    private long O;

    public final String a() {
        return this.M;
    }

    public final String b() {
        return this.L;
    }

    public final int c() {
        return this.N;
    }

    @Override // com.anythink.core.common.e.i
    public final int d() {
        return this.N == 1 ? 2 : 4;
    }

    public final long e() {
        return this.O;
    }

    public final void a(String str) {
        this.M = str;
    }

    public final void b(String str) {
        this.L = str;
    }

    public final void a(int i) {
        this.N = i;
    }

    public final void a(long j) {
        this.O = j;
    }
}