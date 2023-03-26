package com.lib.adssdk.Utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.lib.adssdk.Activity.QurekaActivity;
import com.p7700g.p99005.a00;
import com.p7700g.p99005.bh3;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.ng3;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.wg3;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yg3;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zz;

/* loaded from: classes3.dex */
public class AppObserve implements pz, Application.ActivityLifecycleCallbacks {
    public static boolean s = true;
    private static boolean t = true;
    public AppObserve u = this;
    private Activity v;

    /* loaded from: classes3.dex */
    public class a implements wg3 {
        public a() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            AppObserve.s = true;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements wg3 {
        public b() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            AppObserve.s = true;
        }
    }

    /* loaded from: classes3.dex */
    public class c implements wg3 {
        public c() {
        }

        @Override // com.p7700g.p99005.wg3
        public void H1() {
            AppObserve.s = true;
        }
    }

    public AppObserve(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        a00.i().getLifecycle().a(this);
    }

    public void e() {
        if (t) {
            t = false;
        } else if (s) {
            s = false;
            if (yg3.e(bh3.a).equals("2")) {
                ng3.b(this.v, new a());
            } else if (yg3.e(bh3.a).equals("3")) {
                QurekaActivity.X = Boolean.FALSE;
                ng3.a(this.v, new b());
            } else if (yg3.e(bh3.a).equals("4")) {
                ng3.c(this.v, new c());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@x1 Activity activity, @z1 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@x1 Activity activity) {
        this.v = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@x1 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@x1 Activity activity) {
        this.v = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@x1 Activity activity, @x1 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@x1 Activity activity) {
        this.v = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@x1 Activity activity) {
    }

    @zz(mz.b.ON_START)
    public void onStart() {
        e();
    }
}