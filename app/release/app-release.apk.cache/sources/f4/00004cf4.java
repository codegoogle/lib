package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rs2;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TrackFirebaseAnalytics.java */
/* loaded from: classes3.dex */
public class kn3 {
    private static Class<?> a = null;
    private static AtomicLong b = null;
    private static AtomicLong c = null;
    private static vk3 d = null;
    private static final String e = "os_notification_opened";
    private static final String f = "os_notification_influence_open";
    private static final String g = "os_notification_received";
    private Object h;
    private Context i;

    public kn3(Context context) {
        this.i = context;
    }

    public static boolean a() {
        try {
            a = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private String b(vk3 vk3Var) {
        if (vk3Var.B().isEmpty() || vk3Var.A().isEmpty()) {
            return vk3Var.C() != null ? vk3Var.C().substring(0, Math.min(10, vk3Var.C().length())) : "";
        }
        return vk3Var.B() + " - " + vk3Var.A();
    }

    private Object c(Context context) {
        if (this.h == null) {
            try {
                this.h = d(a).invoke(null, context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.h;
    }

    private static Method d(Class cls) {
        try {
            return cls.getMethod("getInstance", Context.class);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Method e(Class cls) {
        try {
            return cls.getMethod("logEvent", String.class, Bundle.class);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void f() {
        if (b == null || d == null) {
            return;
        }
        long b2 = jm3.X0().b();
        if (b2 - b.get() > 120000) {
            return;
        }
        AtomicLong atomicLong = c;
        if (atomicLong == null || b2 - atomicLong.get() >= 30000) {
            try {
                Object c2 = c(this.i);
                Method e2 = e(a);
                Bundle bundle = new Bundle();
                bundle.putString(rs2.f.b, "OneSignal");
                bundle.putString(rs2.f.c, qm3.b.a);
                bundle.putString("notification_id", d.t());
                bundle.putString(rs2.f.f, b(d));
                e2.invoke(c2, f, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void g(el3 el3Var) {
        if (c == null) {
            c = new AtomicLong();
        }
        c.set(jm3.X0().b());
        try {
            Object c2 = c(this.i);
            Method e2 = e(a);
            Bundle bundle = new Bundle();
            bundle.putString(rs2.f.b, "OneSignal");
            bundle.putString(rs2.f.c, qm3.b.a);
            bundle.putString("notification_id", el3Var.e().t());
            bundle.putString(rs2.f.f, b(el3Var.e()));
            e2.invoke(c2, e, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void h(el3 el3Var) {
        try {
            Object c2 = c(this.i);
            Method e2 = e(a);
            Bundle bundle = new Bundle();
            bundle.putString(rs2.f.b, "OneSignal");
            bundle.putString(rs2.f.c, qm3.b.a);
            bundle.putString("notification_id", el3Var.e().t());
            bundle.putString(rs2.f.f, b(el3Var.e()));
            e2.invoke(c2, g, bundle);
            if (b == null) {
                b = new AtomicLong();
            }
            b.set(jm3.X0().b());
            d = el3Var.e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}