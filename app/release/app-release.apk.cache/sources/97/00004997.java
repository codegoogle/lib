package com.p7700g.p99005;

import android.util.Property;

/* compiled from: FloatProperty.java */
/* loaded from: classes2.dex */
public abstract class j12<T> extends Property<T, Float> {
    public j12(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public final void set(T t, Float f) {
        b(t, f.floatValue());
    }

    public abstract void b(T t, float f);
}