package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.tn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
@e2(21)
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class wj extends bk {
    private static final String d = "TypefaceCompatApi21Impl";
    private static final String e = "android.graphics.FontFamily";
    private static final String f = "addFontWeightStyle";
    private static final String g = "createFromFamiliesWithDefault";
    private static Class<?> h = null;
    private static Constructor<?> i = null;
    private static Method j = null;
    private static Method k = null;
    private static boolean l = false;

    private static boolean k(Object obj, String str, int i2, boolean z) {
        n();
        try {
            return ((Boolean) j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File m(@x1 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (l) {
            return;
        }
        l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(e);
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(f, String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    private static Object o() {
        n();
        try {
            return i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.p7700g.p99005.bk
    public Typeface b(Context context, li.d dVar, Resources resources, int i2) {
        li.e[] a;
        Object o = o();
        for (li.e eVar : dVar.a()) {
            File e2 = ck.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!ck.c(e2, resources, eVar.b())) {
                    return null;
                }
                if (!k(o, e2.getPath(), eVar.e(), eVar.f())) {
                    return null;
                }
                e2.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return l(o);
    }

    @Override // com.p7700g.p99005.bk
    public Typeface c(Context context, CancellationSignal cancellationSignal, @x1 tn.c[] cVarArr, int i2) {
        if (cVarArr.length < 1) {
            return null;
        }
        tn.c h2 = h(cVarArr, i2);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h2.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m = m(openFileDescriptor);
            if (m != null && m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d2 = super.d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d2;
        } catch (IOException unused) {
            return null;
        }
    }
}