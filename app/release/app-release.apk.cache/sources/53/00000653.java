package com.anythink.core.common.e;

/* loaded from: classes2.dex */
public final class u {
    private int a;
    private String b;
    private long c;
    private int d;
    private int e;

    public u() {
    }

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.a;
    }

    public u(int i, String str) {
        this.a = i;
        this.b = str;
        this.d = 0;
        this.e = 0;
        this.c = -1L;
    }

    private void a(String str) {
        this.b = str;
    }

    private void c(int i) {
        this.a = i;
    }

    public final void b(int i) {
        this.e = i;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final void a(int i) {
        this.d = i;
    }
}