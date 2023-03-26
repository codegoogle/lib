package com.anythink.core.common.j.b;

/* loaded from: classes2.dex */
public abstract class b implements Runnable {
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public c h;
    public boolean g = true;
    public int i = 1;
    private long a = 0;
    private String b = "topon-default-thread";

    private String c() {
        return this.b;
    }

    public abstract void a();

    public final void a(long j) {
        this.a = j;
    }

    public final long b() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.b);
        a();
    }

    private void a(c cVar) {
        this.h = cVar;
    }

    public final void a(String str) {
        this.b = str;
    }
}