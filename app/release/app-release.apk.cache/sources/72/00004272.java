package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import com.onesignal.OSFocusHandler;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.xl3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityLifecycleHandler.java */
/* loaded from: classes3.dex */
public class fi3 implements xl3.b {
    private static final Map<String, b> a = new ConcurrentHashMap();
    private static final Map<String, xl3.c> b = new ConcurrentHashMap();
    private static final Map<String, c> c = new ConcurrentHashMap();
    private static final String d = "FOCUS_LOST_WORKER_TAG";
    private static final int e = 2000;
    private final OSFocusHandler f;
    @SuppressLint({"StaticFieldLeak"})
    private Activity g = null;
    private boolean h = false;

    /* compiled from: ActivityLifecycleHandler.java */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public void a(@x1 Activity activity) {
        }

        public void b() {
        }

        public void c(@x1 Activity activity) {
        }
    }

    /* compiled from: ActivityLifecycleHandler.java */
    /* loaded from: classes3.dex */
    public static class c implements ViewTreeObserver.OnGlobalLayoutListener {
        private final xl3.c s;
        private final xl3.b t;
        private final String u;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (gm3.l(new WeakReference(jm3.f0()))) {
                return;
            }
            this.t.a(this.u, this);
            this.s.c();
        }

        private c(xl3.b bVar, xl3.c cVar, String str) {
            this.t = bVar;
            this.s = cVar;
            this.u = str;
        }
    }

    public fi3(OSFocusHandler oSFocusHandler) {
        this.f = oSFocusHandler;
    }

    private void e() {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: ");
        G.append(this.h);
        jm3.P1(u0Var, G.toString());
        if (!this.f.i() && !this.h) {
            jm3.P1(u0Var, "ActivityLifecycleHandler cancel background lost focus worker");
            this.f.h(d, jm3.g);
            return;
        }
        jm3.P1(u0Var, "ActivityLifecycleHandler reset background state, call app focus");
        this.h = false;
        this.f.m();
    }

    private void f() {
        jm3.P1(jm3.u0.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.f;
        if (oSFocusHandler != null) {
            if (!oSFocusHandler.i() || this.f.j()) {
                jm3.t0().c();
                this.f.n(d, 2000L, jm3.g);
            }
        }
    }

    private void g() {
        String str;
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("curActivity is NOW: ");
        if (this.g != null) {
            StringBuilder G2 = wo1.G("");
            G2.append(this.g.getClass().getName());
            G2.append(":");
            G2.append(this.g);
            str = G2.toString();
        } else {
            str = pg1.d;
        }
        G.append(str);
        jm3.a(u0Var, G.toString());
    }

    private void h(int i, Activity activity) {
        if (i == 2) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.P1(u0Var, "Configuration Orientation Change: LANDSCAPE (" + i + ") on activity: " + activity);
        } else if (i == 1) {
            jm3.u0 u0Var2 = jm3.u0.DEBUG;
            jm3.P1(u0Var2, "Configuration Orientation Change: PORTRAIT (" + i + ") on activity: " + activity);
        }
    }

    private void p(Activity activity) {
        f();
        for (Map.Entry<String, b> entry : a.entrySet()) {
            entry.getValue().c(activity);
        }
        for (Map.Entry<String, b> entry2 : a.entrySet()) {
            entry2.getValue().a(this.g);
        }
        ViewTreeObserver viewTreeObserver = this.g.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry<String, xl3.c> entry3 : b.entrySet()) {
            c cVar = new c(this, entry3.getValue(), entry3.getKey());
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            c.put(entry3.getKey(), cVar);
        }
        e();
    }

    @Override // com.p7700g.p99005.xl3.b
    public void a(@NotNull String str, @NotNull c cVar) {
        Activity activity = this.g;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(cVar);
        }
        c.remove(str);
        b.remove(str);
    }

    public void b(String str, b bVar) {
        a.put(str, bVar);
        Activity activity = this.g;
        if (activity != null) {
            bVar.a(activity);
        }
    }

    public void c(String str, xl3.c cVar) {
        Activity activity = this.g;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            c cVar2 = new c(this, cVar, str);
            viewTreeObserver.addOnGlobalLayoutListener(cVar2);
            c.put(str, cVar2);
        }
        b.put(str, cVar);
    }

    public Activity d() {
        return this.g;
    }

    public void i(Activity activity) {
    }

    public void j(Activity activity) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "onActivityDestroyed: " + activity);
        c.clear();
        if (activity == this.g) {
            this.g = null;
            f();
        }
        g();
    }

    public void k(Activity activity) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "onActivityPaused: " + activity);
        if (activity == this.g) {
            this.g = null;
            f();
        }
        g();
    }

    public void l(Activity activity) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "onActivityResumed: " + activity);
        r(activity);
        g();
        e();
    }

    public void m(Activity activity) {
        this.f.o();
    }

    public void n(Activity activity) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "onActivityStopped: " + activity);
        if (activity == this.g) {
            this.g = null;
            f();
        }
        for (Map.Entry<String, b> entry : a.entrySet()) {
            entry.getValue().c(activity);
        }
        g();
        if (this.g == null) {
            this.f.p();
        }
    }

    public void o(Configuration configuration, Activity activity) {
        Activity activity2 = this.g;
        if (activity2 == null || !OSUtils.r(activity2, 128)) {
            return;
        }
        h(configuration.orientation, activity);
        p(activity);
    }

    public void q(String str) {
        a.remove(str);
    }

    public void r(Activity activity) {
        this.g = activity;
        for (Map.Entry<String, b> entry : a.entrySet()) {
            entry.getValue().a(this.g);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.g.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry<String, xl3.c> entry2 : b.entrySet()) {
                c cVar = new c(this, entry2.getValue(), entry2.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                c.put(entry2.getKey(), cVar);
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }

    public void s(boolean z) {
        this.h = z;
    }
}