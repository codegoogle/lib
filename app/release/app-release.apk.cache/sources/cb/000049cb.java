package com.p7700g.p99005;

import com.google.auto.value.AutoValue;

/* compiled from: BackendResponse.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class j52 {

    /* compiled from: BackendResponse.java */
    /* loaded from: classes2.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static j52 a() {
        return new d52(a.FATAL_ERROR, -1L);
    }

    public static j52 d(long j) {
        return new d52(a.OK, j);
    }

    public static j52 e() {
        return new d52(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}