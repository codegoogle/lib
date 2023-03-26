package com.p7700g.p99005;

import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: UserHandleCompat.java */
@e2(17)
/* loaded from: classes.dex */
public class kn {
    @z1
    private static Method a;
    @z1
    private static Constructor<UserHandle> b;

    /* compiled from: UserHandleCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @x1
        public static UserHandle a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    private kn() {
    }

    private static Method a() throws NoSuchMethodException {
        if (a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return a;
    }

    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return b;
    }

    @x1
    public static UserHandle c(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(i);
        }
        try {
            return b().newInstance((Integer) a().invoke(null, Integer.valueOf(i)));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (InstantiationException e2) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e2);
            throw instantiationError;
        } catch (NoSuchMethodException e3) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}