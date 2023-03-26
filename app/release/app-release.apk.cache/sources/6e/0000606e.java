package com.p7700g.p99005;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ComponentDiscovery.java */
/* loaded from: classes3.dex */
public final class uo2<T> {
    public static final String a = "ComponentDiscovery";
    private static final String b = "com.google.firebase.components.ComponentRegistrar";
    private static final String c = "com.google.firebase.components:";
    private final T d;
    private final c<T> e;

    /* compiled from: ComponentDiscovery.java */
    /* loaded from: classes3.dex */
    public static class b implements c<Context> {
        private final Class<? extends Service> a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo == null) {
                    String str = this.a + " has no service info.";
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.p7700g.p99005.uo2.c
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if (uo2.b.equals(b.get(str)) && str.startsWith(uo2.c)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    @r2
    /* loaded from: classes3.dex */
    public interface c<T> {
        List<String> a(T t);
    }

    @r2
    public uo2(T t, c<T> cVar) {
        this.d = t;
        this.e = cVar;
    }

    public static uo2<Context> c(Context context, Class<? extends Service> cls) {
        return new uo2<>(context, new b(cls));
    }

    @z1
    public static wo2 d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (wo2.class.isAssignableFrom(cls)) {
                return (wo2) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new dp2(String.format("Class %s is not an instance of %s", str, b));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e) {
            throw new dp2(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new dp2(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new dp2(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new dp2(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static /* synthetic */ wo2 e(String str) {
        return d(str);
    }

    @Deprecated
    public List<wo2> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.e.a(this.d)) {
            try {
                wo2 d = d(str);
                if (d != null) {
                    arrayList.add(d);
                }
            } catch (dp2 unused) {
            }
        }
        return arrayList;
    }

    public List<er2<wo2>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.e.a(this.d)) {
            arrayList.add(new er2() { // from class: com.p7700g.p99005.fo2
                @Override // com.p7700g.p99005.er2
                public final Object get() {
                    return uo2.e(str);
                }
            });
        }
        return arrayList;
    }
}