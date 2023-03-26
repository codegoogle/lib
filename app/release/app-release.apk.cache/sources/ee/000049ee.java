package com.p7700g.p99005;

import com.google.gson.Gson;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

/* compiled from: ClassInflator.java */
/* loaded from: classes2.dex */
public class j81 {
    private static final j81 a = new j81();
    @x1
    private final Gson b = new Gson();

    private j81() {
    }

    @x1
    public static j81 a() {
        return a;
    }

    @z1
    private Object c(@x1 Class<?> cls, @x1 uv2 uv2Var) throws i81 {
        if (uv2Var.D() && g(cls, uv2Var.p())) {
            return this.b.i(uv2Var, cls);
        }
        if (uv2Var.A() && cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            rv2 m = uv2Var.m();
            Object newInstance = Array.newInstance(cls.getComponentType(), m.size());
            for (int i = 0; i < m.size(); i++) {
                Array.set(newInstance, i, c((Class) r81.f(componentType), m.O(i)));
            }
            return newInstance;
        } else if (uv2Var.C()) {
            if (e(uv2Var)) {
                try {
                    return b(((k81) this.b.i(uv2Var, k81.class)).c(cls));
                } catch (Exception e) {
                    throw new i81(e);
                }
            }
            try {
                return this.b.n(uv2Var.toString(), cls);
            } catch (Exception e2) {
                throw new i81(e2);
            }
        } else if (uv2Var.B()) {
            return null;
        } else {
            throw new i81(cls.toString() + " doesn't match " + uv2Var.toString());
        }
    }

    private boolean d(Class cls) {
        return cls.equals(Boolean.class) || cls.equals(Boolean.TYPE);
    }

    private boolean e(@x1 uv2 uv2Var) {
        return uv2Var.C() && uv2Var.o().R("type");
    }

    private boolean f(Class cls) {
        return Number.class.isAssignableFrom(cls) || cls.equals(Integer.TYPE) || cls.equals(Long.TYPE) || cls.equals(Double.TYPE) || cls.equals(Float.TYPE) || cls.equals(Byte.TYPE) || cls.equals(Short.TYPE);
    }

    private boolean g(Class cls, aw2 aw2Var) {
        return (aw2Var.G() && d(cls)) || (aw2Var.I() && f(cls)) || (aw2Var.J() && h(cls));
    }

    private boolean h(Class cls) {
        return cls.equals(String.class);
    }

    @z1
    private Object[] i(Constructor<?> constructor, @z1 rv2 rv2Var) throws i81 {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int size = rv2Var != null ? rv2Var.size() : 0;
        if (size != constructor.getParameterTypes().length) {
            return null;
        }
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = c(parameterTypes[i], ((rv2) r81.f(rv2Var)).O(i));
        }
        return objArr;
    }

    @x1
    public <T> T b(@x1 k81<T> k81Var) throws i81 {
        Constructor<?>[] constructors;
        Object[] i;
        try {
            for (Constructor<?> constructor : Class.forName(k81Var.g()).getConstructors()) {
                try {
                    i = i(constructor, k81Var.e());
                } catch (i81 unused) {
                }
                if (i != null) {
                    return (T) constructor.newInstance(i);
                }
            }
            throw new i81("Now matching constructor found. " + k81Var);
        } catch (Exception e) {
            throw new i81(e);
        }
    }
}