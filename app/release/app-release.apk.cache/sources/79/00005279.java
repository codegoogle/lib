package com.p7700g.p99005;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class ni0<V> {
    @z1
    private final V a;
    @z1
    private final Throwable b;

    public ni0(V v) {
        this.a = v;
        this.b = null;
    }

    @z1
    public Throwable a() {
        return this.b;
    }

    @z1
    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ni0) {
            ni0 ni0Var = (ni0) obj;
            if (b() == null || !b().equals(ni0Var.b())) {
                if (a() == null || ni0Var.a() == null) {
                    return false;
                }
                return a().toString().equals(a().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public ni0(Throwable th) {
        this.b = th;
        this.a = null;
    }
}