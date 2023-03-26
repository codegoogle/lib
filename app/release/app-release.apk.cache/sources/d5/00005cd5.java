package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.text.Editable;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
public final class sw extends Editable.Factory {
    private static final Object a = new Object();
    @k1("INSTANCE_LOCK")
    private static volatile Editable.Factory b;
    @z1
    private static Class<?> c;

    @SuppressLint({"PrivateApi"})
    private sw() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new sw();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@x1 CharSequence charSequence) {
        Class<?> cls = c;
        if (cls != null) {
            return nv.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}