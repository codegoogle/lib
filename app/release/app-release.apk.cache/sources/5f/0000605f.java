package com.p7700g.p99005;

import com.google.gson.Gson;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

/* compiled from: ClassInflator.java */
/* loaded from: classes2.dex */
public class un1 {
    private static final un1 a = new un1();
    @x1
    private final kj1 b = kj1.b("ClassInflator");
    @x1
    private final Gson c = new Gson();

    private un1() {
    }

    @x1
    public static un1 a() {
        return a;
    }

    @z1
    private Object c(@x1 Class<?> cls, @x1 uv2 uv2Var) throws tn1 {
        if (uv2Var.D() && g(cls, uv2Var.p())) {
            return this.c.i(uv2Var, cls);
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
                    return b(((vn1) this.c.i(uv2Var, vn1.class)).c(cls));
                } catch (Exception e) {
                    throw new tn1(e);
                }
            }
            try {
                return this.c.n(uv2Var.toString(), cls);
            } catch (Exception e2) {
                throw new tn1(e2);
            }
        } else if (uv2Var.B()) {
            return null;
        } else {
            throw new tn1(cls.toString() + " doesn't match " + uv2Var.toString());
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
    private Object[] i(Constructor<?> constructor, @z1 rv2 rv2Var) throws tn1 {
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
    public <T> T b(@x1 vn1<T> vn1Var) throws tn1 {
        Constructor<?>[] constructors;
        Object[] i;
        try {
            for (Constructor<?> constructor : Class.forName(vn1Var.g()).getConstructors()) {
                try {
                    i = i(constructor, vn1Var.e());
                } catch (tn1 e) {
                    this.b.f(e);
                }
                if (i != null) {
                    return (T) constructor.newInstance(i);
                }
            }
            throw new tn1("Now matching constructor found. " + vn1Var);
        } catch (Exception e2) {
            throw new tn1(e2);
        }
    }
}