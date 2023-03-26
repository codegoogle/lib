package com.p7700g.p99005;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.p7700g.p99005.b00;
import com.p7700g.p99005.mz;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public class a00 implements qz {
    @r2
    public static final long s = 700;
    private static final a00 t = new a00();
    private Handler y;
    private int u = 0;
    private int v = 0;
    private boolean w = true;
    private boolean x = true;
    private final rz z = new rz(this);
    private Runnable A = new a();
    public b00.a B = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a00.this.g();
            a00.this.h();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class b implements b00.a {
        public b() {
        }

        @Override // com.p7700g.p99005.b00.a
        public void a() {
        }

        @Override // com.p7700g.p99005.b00.a
        public void onResume() {
            a00.this.b();
        }

        @Override // com.p7700g.p99005.b00.a
        public void onStart() {
            a00.this.d();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class c extends gz {

        /* compiled from: ProcessLifecycleOwner.java */
        /* loaded from: classes.dex */
        public class a extends gz {
            public a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@x1 Activity activity) {
                a00.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@x1 Activity activity) {
                a00.this.d();
            }
        }

        public c() {
        }

        @Override // com.p7700g.p99005.gz, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                b00.f(activity).h(a00.this.B);
            }
        }

        @Override // com.p7700g.p99005.gz, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            a00.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @e2(29)
        public void onActivityPreCreated(@x1 Activity activity, @z1 Bundle bundle) {
            d.a(activity, new a());
        }

        @Override // com.p7700g.p99005.gz, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a00.this.e();
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static void a(@x1 Activity activity, @x1 Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    private a00() {
    }

    @x1
    public static qz i() {
        return t;
    }

    public static void j(Context context) {
        t.f(context);
    }

    public void a() {
        int i = this.v - 1;
        this.v = i;
        if (i == 0) {
            this.y.postDelayed(this.A, 700L);
        }
    }

    public void b() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            if (this.w) {
                this.z.j(mz.b.ON_RESUME);
                this.w = false;
                return;
            }
            this.y.removeCallbacks(this.A);
        }
    }

    public void d() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1 && this.x) {
            this.z.j(mz.b.ON_START);
            this.x = false;
        }
    }

    public void e() {
        this.u--;
        h();
    }

    public void f(Context context) {
        this.y = new Handler();
        this.z.j(mz.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    public void g() {
        if (this.v == 0) {
            this.w = true;
            this.z.j(mz.b.ON_PAUSE);
        }
    }

    @Override // com.p7700g.p99005.qz
    @x1
    public mz getLifecycle() {
        return this.z;
    }

    public void h() {
        if (this.u == 0 && this.w) {
            this.z.j(mz.b.ON_STOP);
            this.x = true;
        }
    }
}