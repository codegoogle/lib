package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils.java */
/* loaded from: classes.dex */
public class p70 {
    private static Method a;
    private static Method b;
    private static boolean c;

    private p70() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@x1 Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i != 28) {
            if (!c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                c = true;
            }
            if (z) {
                try {
                    Method method2 = a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            if (z || (method = b) == null) {
                return;
            }
            method.invoke(canvas, new Object[0]);
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}