package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.c52;

/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class i52 {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract i52 a();

        public abstract a b(Iterable<p42> iterable);

        public abstract a c(@z1 byte[] bArr);
    }

    public static a a() {
        return new c52.b();
    }

    public static i52 b(Iterable<p42> iterable) {
        return a().b(iterable).a();
    }

    public abstract Iterable<p42> c();

    @z1
    public abstract byte[] d();
}