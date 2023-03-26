package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.tn;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
@e2(24)
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class xj extends bk {
    private static final String d = "TypefaceCompatApi24Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static final Class<?> h;
    private static final Constructor<?> i;
    private static final Method j;
    private static final Method k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(e);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod(f, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.getClass().getName();
            cls = null;
            method = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        return j != null;
    }

    private static Object n() {
        try {
            return i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.bk
    @z1
    public Typeface b(Context context, li.d dVar, Resources resources, int i2) {
        li.e[] a;
        Object n = n();
        if (n == null) {
            return null;
        }
        for (li.e eVar : dVar.a()) {
            ByteBuffer b = ck.b(context, resources, eVar.b());
            if (b == null || !k(n, b, eVar.c(), eVar.e(), eVar.f())) {
                return null;
            }
        }
        return l(n);
    }

    @Override // com.p7700g.p99005.bk
    @z1
    public Typeface c(Context context, @z1 CancellationSignal cancellationSignal, @x1 tn.c[] cVarArr, int i2) {
        Object n = n();
        if (n == null) {
            return null;
        }
        y7 y7Var = new y7();
        for (tn.c cVar : cVarArr) {
            Uri d2 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) y7Var.get(d2);
            if (byteBuffer == null) {
                byteBuffer = ck.f(context, cancellationSignal, d2);
                y7Var.put(d2, byteBuffer);
            }
            if (byteBuffer == null || !k(n, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface l = l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i2);
    }
}