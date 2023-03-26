package com.p7700g.p99005;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.p7700g.p99005.i2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class vf {
    private static final String a = "ActivityRecreator";
    public static final Class<?> b;
    public static final Field c;
    public static final Field d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    private static final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ d s;
        public final /* synthetic */ Object t;

        public a(d dVar, Object obj) {
            this.s = dVar;
            this.t = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.s = this.t;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Application s;
        public final /* synthetic */ d t;

        public b(Application application, d dVar) {
            this.s = application;
            this.t = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.unregisterActivityLifecycleCallbacks(this.t);
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ Object t;

        public c(Object obj, Object obj2) {
            this.s = obj;
            this.t = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = vf.e;
                if (method != null) {
                    method.invoke(this.s, this.t, Boolean.FALSE, "AppCompat recreation");
                } else {
                    vf.f.invoke(this.s, this.t, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object s;
        private Activity t;
        private final int u;
        private boolean v = false;
        private boolean w = false;
        private boolean x = false;

        public d(@x1 Activity activity) {
            this.t = activity;
            this.u = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.t == activity) {
                this.t = null;
                this.w = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.w || this.x || this.v || !vf.h(this.s, this.u, activity)) {
                return;
            }
            this.x = true;
            this.s = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.t == activity) {
                this.v = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a2 = a();
        b = a2;
        c = b();
        d = f();
        e = d(a2);
        f = c(a2);
        g = e(a2);
    }

    private vf() {
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = d.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                h.postAtFrontOfQueue(new c(c.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean i(@x1 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && g == null) {
            return false;
        } else {
            if (f == null && e == null) {
                return false;
            }
            try {
                Object obj2 = d.get(activity);
                if (obj2 == null || (obj = c.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = h;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}