package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.p7700g.p99005.fc2;
import com.p7700g.p99005.ga2;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DynamicColors.java */
/* loaded from: classes3.dex */
public class ec2 {
    private static final int[] a = {ga2.c.l5};
    private static final c b;
    @SuppressLint({"PrivateApi"})
    private static final c c;
    private static final Map<String, c> d;
    private static final Map<String, c> e;
    private static final int f = 0;

    /* compiled from: DynamicColors.java */
    /* loaded from: classes3.dex */
    public class a implements c {
        @Override // com.p7700g.p99005.ec2.c
        public boolean a() {
            return true;
        }
    }

    /* compiled from: DynamicColors.java */
    /* loaded from: classes3.dex */
    public class b implements c {
        private Long a;

        @Override // com.p7700g.p99005.ec2.c
        public boolean a() {
            if (this.a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.a = -1L;
                }
            }
            return this.a.longValue() >= 40100;
        }
    }

    /* compiled from: DynamicColors.java */
    /* loaded from: classes3.dex */
    public interface c {
        boolean a();
    }

    /* compiled from: DynamicColors.java */
    /* loaded from: classes3.dex */
    public static class d implements Application.ActivityLifecycleCallbacks {
        private final fc2 s;

        public d(@x1 fc2 fc2Var) {
            this.s = fc2Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@x1 Activity activity, @z1 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@x1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@x1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@x1 Activity activity, @z1 Bundle bundle) {
            ec2.k(activity, this.s.e(), this.s.d(), this.s.c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@x1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@x1 Activity activity, @x1 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@x1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@x1 Activity activity) {
        }
    }

    /* compiled from: DynamicColors.java */
    /* loaded from: classes3.dex */
    public interface e {
        void a(@x1 Activity activity);
    }

    /* compiled from: DynamicColors.java */
    /* loaded from: classes3.dex */
    public interface f {
        boolean a(@x1 Activity activity, @m2 int i);
    }

    static {
        a aVar = new a();
        b = aVar;
        b bVar = new b();
        c = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put("lge", aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put("samsung", bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("xiaomi", aVar);
        d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        e = Collections.unmodifiableMap(hashMap2);
    }

    private ec2() {
    }

    @Deprecated
    public static void b(@x1 Activity activity) {
        j(activity);
    }

    @Deprecated
    public static void c(@x1 Activity activity, @m2 int i) {
        l(activity, new fc2.c().g(i).d());
    }

    @Deprecated
    public static void d(@x1 Activity activity, @x1 f fVar) {
        l(activity, new fc2.c().f(fVar).d());
    }

    public static void e(@x1 Application application) {
        i(application, new fc2.c().d());
    }

    @Deprecated
    public static void f(@x1 Application application, @m2 int i) {
        i(application, new fc2.c().g(i).d());
    }

    @Deprecated
    public static void g(@x1 Application application, @m2 int i, @x1 f fVar) {
        i(application, new fc2.c().g(i).f(fVar).d());
    }

    @Deprecated
    public static void h(@x1 Application application, @x1 f fVar) {
        i(application, new fc2.c().f(fVar).d());
    }

    public static void i(@x1 Application application, @x1 fc2 fc2Var) {
        application.registerActivityLifecycleCallbacks(new d(fc2Var));
    }

    public static void j(@x1 Activity activity) {
        l(activity, new fc2.c().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(@x1 Activity activity, @m2 int i, @x1 f fVar, @x1 e eVar) {
        if (n()) {
            if (i == 0) {
                i = m(activity);
            }
            if (i == 0 || !fVar.a(activity, i)) {
                return;
            }
            mc2.a(activity, i);
            eVar.a(activity);
        }
    }

    public static void l(@x1 Activity activity, @x1 fc2 fc2Var) {
        k(activity, fc2Var.e(), fc2Var.d(), fc2Var.c());
    }

    private static int m(@x1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @SuppressLint({"DefaultLocale"})
    @v0(api = 31)
    public static boolean n() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        c cVar = d.get(Build.MANUFACTURER.toLowerCase());
        if (cVar == null) {
            cVar = e.get(Build.BRAND.toLowerCase());
        }
        return cVar != null && cVar.a();
    }

    @x1
    public static Context o(@x1 Context context) {
        return p(context, 0);
    }

    @x1
    public static Context p(@x1 Context context, @m2 int i) {
        if (n()) {
            if (i == 0) {
                i = m(context);
            }
            return i == 0 ? context : new ContextThemeWrapper(context, i);
        }
        return context;
    }
}