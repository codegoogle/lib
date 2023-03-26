package com.p7700g.p99005;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.p7700g.p99005.m80;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi14.java */
/* loaded from: classes.dex */
public class g90 {
    private static final String a = "ViewGroupUtilsApi14";
    private static final int b = 4;
    private static LayoutTransition c;
    private static Field d;
    private static boolean e;
    private static Method f;
    private static boolean g;

    /* compiled from: ViewGroupUtilsApi14.java */
    /* loaded from: classes.dex */
    public static class a extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private g90() {
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod(com.anythink.expressad.d.a.b.dO, new Class[0]);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            g = true;
        }
        Method method = f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    public static void b(@x1 ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (c == null) {
            a aVar = new a();
            c = aVar;
            aVar.setAnimator(2, null);
            c.setAnimator(0, null);
            c.setAnimator(1, null);
            c.setAnimator(3, null);
            c.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != c) {
                    viewGroup.setTag(m80.e.I, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(c);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!e) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        d.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        int i = m80.e.I;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}