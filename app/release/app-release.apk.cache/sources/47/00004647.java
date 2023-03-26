package com.p7700g.p99005;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.p7700g.p99005.we;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomSupport.java */
/* loaded from: classes.dex */
public class hd {
    private static final String a = "CustomSupport";

    /* compiled from: CustomSupport.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            we.b.values();
            int[] iArr = new int[8];
            a = iArr;
            try {
                iArr[we.b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[we.b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[we.b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[we.b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[we.b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[we.b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[we.b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int c) {
        int i = (c & (~(c >> 31))) - 255;
        return (i & (i >> 31)) + 255;
    }

    public static void b(we att, View view, float[] value) {
        Class<?> cls = view.getClass();
        StringBuilder G = wo1.G(la1.a);
        G.append(att.h());
        String sb = G.toString();
        try {
            boolean z = true;
            switch (att.j().ordinal()) {
                case 0:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((int) value[0]));
                    return;
                case 1:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                case 2:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (value[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(sb, Drawable.class);
                    int a2 = a((int) (((float) Math.pow(value[0], 0.45454545454545453d)) * 255.0f));
                    int a3 = a((int) (((float) Math.pow(value[1], 0.45454545454545453d)) * 255.0f));
                    int a4 = a((int) (((float) Math.pow(value[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a((int) (value[3] * 255.0f)) << 24) | (a2 << 16) | (a3 << 8) | a4);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + att.h());
                case 5:
                    Method method2 = cls.getMethod(sb, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (value[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 6:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(value[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            qd.k(view);
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            qd.k(view);
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }
}