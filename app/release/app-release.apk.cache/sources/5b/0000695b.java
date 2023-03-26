package com.p7700g.p99005;

import android.graphics.Typeface;
import com.p7700g.p99005.i2;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
@e2(28)
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class zj extends yj {
    private static final String B = "createFromFamiliesWithDefault";
    private static final int C = -1;
    private static final String D = "sans-serif";

    @Override // com.p7700g.p99005.yj
    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.u, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A.invoke(null, newInstance, D, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.p7700g.p99005.yj
    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(B, Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}