package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import com.onesignal.OSFocusHandler;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes3.dex */
public class gi3 implements Application.ActivityLifecycleCallbacks {
    @z1
    private static gi3 s;
    @z1
    @SuppressLint({"StaticFieldLeak"})
    private static fi3 t;
    @z1
    private static ComponentCallbacks u;

    /* compiled from: ActivityLifecycleListener.java */
    /* loaded from: classes3.dex */
    public class a implements ComponentCallbacks {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            gi3.t.o(configuration, gi3.t.d());
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    @z1
    public static fi3 b() {
        return t;
    }

    public static void c(@x1 Application application) {
        if (s == null) {
            gi3 gi3Var = new gi3();
            s = gi3Var;
            application.registerActivityLifecycleCallbacks(gi3Var);
        }
        if (t == null) {
            t = new fi3(new OSFocusHandler());
        }
        if (u == null) {
            ComponentCallbacks aVar = new a();
            u = aVar;
            application.registerComponentCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        fi3 fi3Var = t;
        if (fi3Var != null) {
            fi3Var.i(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        fi3 fi3Var = t;
        if (fi3Var != null) {
            fi3Var.j(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        fi3 fi3Var = t;
        if (fi3Var != null) {
            fi3Var.k(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        fi3 fi3Var = t;
        if (fi3Var != null) {
            fi3Var.l(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        fi3 fi3Var = t;
        if (fi3Var != null) {
            fi3Var.m(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        fi3 fi3Var = t;
        if (fi3Var != null) {
            fi3Var.n(activity);
        }
    }
}