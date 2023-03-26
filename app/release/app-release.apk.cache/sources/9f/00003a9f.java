package com.p7700g.p99005;

import android.os.Parcelable;

/* compiled from: TypedVpnCallback.java */
/* loaded from: classes2.dex */
public abstract class bb1<T extends Parcelable> implements cb1<T> {
    @x1
    private final Class<T> a;

    public bb1(@x1 Class<T> cls) {
        this.a = cls;
    }

    @x1
    public Class<T> a() {
        return this.a;
    }
}