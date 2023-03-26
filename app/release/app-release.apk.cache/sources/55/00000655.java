package com.anythink.core.common.e;

/* loaded from: classes2.dex */
public final class w extends x {
    public static final int L = 2;
    public static final int b = 1;
    public int M;
    public long N;
    public long O;
    public int a;

    public final void a(long j) {
        this.N = j;
    }

    public final void b(long j) {
        this.O = j;
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.O > this.N;
    }

    @Override // com.anythink.core.common.e.i
    public final int d() {
        return 3;
    }

    public final void f(int i) {
        this.M = i;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.M;
    }

    public final void a(int i) {
        this.a = i;
    }
}