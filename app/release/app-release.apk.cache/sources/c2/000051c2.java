package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
@rl4
/* loaded from: classes2.dex */
public class n52 implements g52 {
    private static final String a = "BackendRegistry";
    private static final String b = "backend:";
    private final a c;
    private final l52 d;
    private final Map<String, p52> e;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes2.dex */
    public static class a {
        private final Context a;
        private Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d = d(context);
            if (d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith(n52.b)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.b == null) {
                this.b = a(this.a);
            }
            return this.b;
        }

        private static Bundle d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @z1
        public f52 b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (f52) Class.forName(str2).asSubclass(f52.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    @ml4
    public n52(Context context, l52 l52Var) {
        this(new a(context), l52Var);
    }

    @Override // com.p7700g.p99005.g52
    @z1
    public synchronized p52 get(String str) {
        if (this.e.containsKey(str)) {
            return this.e.get(str);
        }
        f52 b2 = this.c.b(str);
        if (b2 == null) {
            return null;
        }
        p52 create = b2.create(this.d.a(str));
        this.e.put(str, create);
        return create;
    }

    public n52(a aVar, l52 l52Var) {
        this.e = new HashMap();
        this.c = aVar;
        this.d = l52Var;
    }
}