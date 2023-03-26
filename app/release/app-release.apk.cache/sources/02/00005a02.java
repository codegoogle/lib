package com.p7700g.p99005;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: MaterialAttributes.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class rg2 {
    @z1
    public static TypedValue a(@x1 Context context, @q0 int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@x1 Context context, @q0 int i, boolean z) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    public static boolean c(@x1 Context context, @q0 int i, @x1 String str) {
        return g(context, i, str) != 0;
    }

    @c2
    public static int d(@x1 Context context, @q0 int i, @a1 int i2) {
        float dimension;
        TypedValue a = a(context, i);
        if (a != null && a.type == 5) {
            dimension = a.getDimension(context.getResources().getDisplayMetrics());
        } else {
            dimension = context.getResources().getDimension(i2);
        }
        return (int) dimension;
    }

    public static int e(@x1 Context context, @q0 int i, int i2) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    @c2
    public static int f(@x1 Context context) {
        return d(context, ga2.c.Db, ga2.f.n8);
    }

    public static int g(@x1 Context context, @q0 int i, @x1 String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int h(@x1 View view, @q0 int i) {
        return g(view.getContext(), i, view.getClass().getCanonicalName());
    }
}