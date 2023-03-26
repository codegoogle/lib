package com.p7700g.p99005;

import android.util.Property;

/* compiled from: IntProperty.java */
/* loaded from: classes2.dex */
public abstract class k12<T> extends Property<T, Integer> {
    public k12(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a */
    public final void set(T t, Integer num) {
        b(t, num.intValue());
    }

    public abstract void b(T t, int i);
}