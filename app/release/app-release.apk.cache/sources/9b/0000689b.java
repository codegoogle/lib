package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import com.p7700g.p99005.b70;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class z60 {
    private static final String a = "Startup";
    private static volatile z60 b;
    private static final Object c = new Object();
    @x1
    public final Context f;
    @x1
    public final Set<Class<? extends a70<?>>> e = new HashSet();
    @x1
    public final Map<Class<?>, Object> d = new HashMap();

    public z60(@x1 Context context) {
        this.f = context.getApplicationContext();
    }

    @x1
    private <T> T d(@x1 Class<? extends a70<?>> cls, @x1 Set<Class<?>> set) {
        T t;
        if (j70.h()) {
            try {
                j70.c(cls.getSimpleName());
            } finally {
                j70.f();
            }
        }
        if (!set.contains(cls)) {
            if (!this.d.containsKey(cls)) {
                set.add(cls);
                a70<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends a70<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends a70<?>> cls2 : dependencies) {
                        if (!this.d.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.a(this.f);
                set.remove(cls);
                this.d.put(cls, t);
            } else {
                t = (T) this.d.get(cls);
            }
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    @x1
    public static z60 e(@x1 Context context) {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = new z60(context);
                }
            }
        }
        return b;
    }

    public static void h(@x1 z60 z60Var) {
        synchronized (c) {
            b = z60Var;
        }
    }

    public void a() {
        try {
            try {
                j70.c(a);
                b(this.f.getPackageManager().getProviderInfo(new ComponentName(this.f.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new c70(e);
            }
        } finally {
            j70.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(@z1 Bundle bundle) {
        String string = this.f.getString(b70.a.a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (a70.class.isAssignableFrom(cls)) {
                            this.e.add(cls);
                        }
                    }
                }
                for (Class<? extends a70<?>> cls2 : this.e) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new c70(e);
            }
        }
    }

    @x1
    public <T> T c(@x1 Class<? extends a70<?>> cls) {
        T t;
        synchronized (c) {
            t = (T) this.d.get(cls);
            if (t == null) {
                t = (T) d(cls, new HashSet());
            }
        }
        return t;
    }

    @x1
    public <T> T f(@x1 Class<? extends a70<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@x1 Class<? extends a70<?>> cls) {
        return this.e.contains(cls);
    }
}