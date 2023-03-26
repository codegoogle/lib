package com.p7700g.p99005;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.tn;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
@e2(26)
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class yj extends wj {
    private static final String m = "TypefaceCompatApi26Impl";
    private static final String n = "android.graphics.FontFamily";
    private static final String o = "addFontFromAssetManager";
    private static final String p = "addFontFromBuffer";
    private static final String q = "createFromFamiliesWithDefault";
    private static final String r = "freeze";
    private static final String s = "abortCreation";
    private static final int t = -1;
    public final Method A;
    public final Class<?> u;
    public final Constructor<?> v;
    public final Method w;
    public final Method x;
    public final Method y;
    public final Method z;

    public yj() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method2 = v(y);
            method3 = w(y);
            method4 = A(y);
            method5 = u(y);
            method = x(y);
            cls = y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.u = cls;
        this.v = constructor;
        this.w = method2;
        this.x = method3;
        this.y = method4;
        this.z = method5;
        this.A = method;
    }

    @z1
    private Object o() {
        try {
            return this.v.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.z.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i, int i2, int i3, @z1 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.w.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.x.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.y.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        Method method = this.w;
        return this.w != null;
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(r, new Class[0]);
    }

    @Override // com.p7700g.p99005.wj, com.p7700g.p99005.bk
    @z1
    public Typeface b(Context context, li.d dVar, Resources resources, int i) {
        li.e[] a;
        if (!t()) {
            return super.b(context, dVar, resources, i);
        }
        Object o2 = o();
        if (o2 == null) {
            return null;
        }
        for (li.e eVar : dVar.a()) {
            if (!q(context, o2, eVar.a(), eVar.c(), eVar.e(), eVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(eVar.d()))) {
                p(o2);
                return null;
            }
        }
        if (s(o2)) {
            return l(o2);
        }
        return null;
    }

    @Override // com.p7700g.p99005.wj, com.p7700g.p99005.bk
    @z1
    public Typeface c(Context context, @z1 CancellationSignal cancellationSignal, @x1 tn.c[] cVarArr, int i) {
        Typeface l;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            tn.c h = h(cVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.e()).setItalic(h.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h2 = ck.h(context, cVarArr, cancellationSignal);
        Object o2 = o();
        if (o2 == null) {
            return null;
        }
        boolean z = false;
        for (tn.c cVar : cVarArr) {
            ByteBuffer byteBuffer = h2.get(cVar.d());
            if (byteBuffer != null) {
                if (!r(o2, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                    p(o2);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            p(o2);
            return null;
        } else if (s(o2) && (l = l(o2)) != null) {
            return Typeface.create(l, i);
        } else {
            return null;
        }
    }

    @Override // com.p7700g.p99005.bk
    @z1
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        if (!t()) {
            return super.e(context, resources, i, str, i2);
        }
        Object o2 = o();
        if (o2 == null) {
            return null;
        }
        if (!q(context, o2, str, 0, -1, -1, null)) {
            p(o2);
            return null;
        } else if (s(o2)) {
            return l(o2);
        } else {
            return null;
        }
    }

    @z1
    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.u, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(s, new Class[0]);
    }

    public Method v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(o, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(p, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(q, Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> y() throws ClassNotFoundException {
        return Class.forName(n);
    }

    public Constructor<?> z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}