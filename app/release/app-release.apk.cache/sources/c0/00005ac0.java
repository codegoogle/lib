package com.p7700g.p99005;

import android.util.FloatProperty;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class ru<T> {
    public final String a;

    /* compiled from: FloatPropertyCompat.java */
    /* loaded from: classes.dex */
    public static class a extends ru<T> {
        public final /* synthetic */ FloatProperty b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.b = floatProperty;
        }

        @Override // com.p7700g.p99005.ru
        public float b(T t) {
            return ((Float) this.b.get(t)).floatValue();
        }

        @Override // com.p7700g.p99005.ru
        public void c(T t, float f) {
            this.b.setValue(t, f);
        }
    }

    public ru(String str) {
        this.a = str;
    }

    @e2(24)
    public static <T> ru<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t);

    public abstract void c(T t, float f);
}