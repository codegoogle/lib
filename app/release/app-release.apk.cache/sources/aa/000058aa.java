package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: LayoutInflaterCompat.java */
/* loaded from: classes.dex */
public final class qq {
    private static final String a = "LayoutInflaterCompatHC";
    private static Field b;
    private static boolean c;

    /* compiled from: LayoutInflaterCompat.java */
    /* loaded from: classes.dex */
    public static class a implements LayoutInflater.Factory2 {
        public final rq s;

        public a(rq rqVar) {
            this.s = rqVar;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.s.onCreateView(null, str, context, attributeSet);
        }

        @x1
        public String toString() {
            return getClass().getName() + "{" + this.s + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.s.onCreateView(view, str, context, attributeSet);
        }
    }

    private qq() {
    }

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                String str = "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.";
            }
        }
    }

    @Deprecated
    public static rq b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).s;
        }
        return null;
    }

    @Deprecated
    public static void c(@x1 LayoutInflater layoutInflater, @x1 rq rqVar) {
        layoutInflater.setFactory2(new a(rqVar));
    }

    public static void d(@x1 LayoutInflater layoutInflater, @x1 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}