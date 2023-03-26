package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes2.dex */
public final class jy1 {
    private static final String a = "ManifestParser";
    private static final String b = "GlideModule";
    private final Context c;

    public jy1(Context context) {
        this.c = context;
    }

    private static hy1 b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                c(cls, e);
            } catch (InstantiationException e2) {
                c(cls, e2);
            } catch (NoSuchMethodException e3) {
                c(cls, e3);
            } catch (InvocationTargetException e4) {
                c(cls, e4);
            }
            if (obj instanceof hy1) {
                return (hy1) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<hy1> a() {
        Log.isLoggable(a, 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.c.getPackageManager().getApplicationInfo(this.c.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable(a, 3);
                return arrayList;
            }
            if (Log.isLoggable(a, 2)) {
                String str = "Got app info metadata: " + applicationInfo.metaData;
            }
            for (String str2 : applicationInfo.metaData.keySet()) {
                if (b.equals(applicationInfo.metaData.get(str2))) {
                    arrayList.add(b(str2));
                    Log.isLoggable(a, 3);
                }
            }
            Log.isLoggable(a, 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}