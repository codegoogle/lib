package com.p7700g.p99005;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: GhostViewPlatform.java */
@e2(21)
/* loaded from: classes.dex */
public class c80 implements a80 {
    private static final String s = "GhostViewApi21";
    private static Class<?> t;
    private static boolean u;
    private static Method v;
    private static boolean w;
    private static Method x;
    private static boolean y;
    private final View z;

    private c80(@x1 View view) {
        this.z = view;
    }

    public static a80 b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = v;
        if (method != null) {
            try {
                return new c80((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (w) {
            return;
        }
        try {
            d();
            Method declaredMethod = t.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            v = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        w = true;
    }

    private static void d() {
        if (u) {
            return;
        }
        try {
            t = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        u = true;
    }

    private static void e() {
        if (y) {
            return;
        }
        try {
            d();
            Method declaredMethod = t.getDeclaredMethod("removeGhost", View.class);
            x = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        y = true;
    }

    public static void f(View view) {
        e();
        Method method = x;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // com.p7700g.p99005.a80
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // com.p7700g.p99005.a80
    public void setVisibility(int i) {
        this.z.setVisibility(i);
    }
}