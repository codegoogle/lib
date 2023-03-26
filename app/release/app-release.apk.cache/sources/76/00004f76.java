package com.p7700g.p99005;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class lx {
    private static final y7<ClassLoader, y7<String, Class<?>>> a = new y7<>();

    public static boolean b(@x1 ClassLoader classLoader, @x1 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @x1
    private static Class<?> c(@x1 ClassLoader classLoader, @x1 String str) throws ClassNotFoundException {
        y7<ClassLoader, y7<String, Class<?>>> y7Var = a;
        y7<String, Class<?>> y7Var2 = y7Var.get(classLoader);
        if (y7Var2 == null) {
            y7Var2 = new y7<>();
            y7Var.put(classLoader, y7Var2);
        }
        Class<?> cls = y7Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            y7Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    @x1
    public static Class<? extends Fragment> d(@x1 ClassLoader classLoader, @x1 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.j(wo1.u("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.j(wo1.u("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    @x1
    public Fragment a(@x1 ClassLoader classLoader, @x1 String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.j(wo1.u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.j(wo1.u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.j(wo1.u("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.j(wo1.u("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}