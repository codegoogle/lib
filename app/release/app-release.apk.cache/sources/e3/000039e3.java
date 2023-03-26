package com.p7700g.p99005;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mz;

/* compiled from: ReportFragment.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b00 extends Fragment {
    private static final String s = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private a t;

    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
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
        public void onActivityPostCreated(@x1 Activity activity, @z1 Bundle bundle) {
            b00.a(activity, mz.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@x1 Activity activity) {
            b00.a(activity, mz.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@x1 Activity activity) {
            b00.a(activity, mz.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@x1 Activity activity) {
            b00.a(activity, mz.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@x1 Activity activity) {
            b00.a(activity, mz.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@x1 Activity activity) {
            b00.a(activity, mz.b.ON_STOP);
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

    public static void a(@x1 Activity activity, @x1 mz.b bVar) {
        if (activity instanceof tz) {
            ((tz) activity).getLifecycle().j(bVar);
        } else if (activity instanceof qz) {
            mz lifecycle = ((qz) activity).getLifecycle();
            if (lifecycle instanceof rz) {
                ((rz) lifecycle).j(bVar);
            }
        }
    }

    private void b(@x1 mz.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static b00 f(Activity activity) {
        return (b00) activity.getFragmentManager().findFragmentByTag(s);
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(s) == null) {
            fragmentManager.beginTransaction().add(new b00(), s).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void h(a aVar) {
        this.t = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.t);
        b(mz.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(mz.b.ON_DESTROY);
        this.t = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(mz.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.t);
        b(mz.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.t);
        b(mz.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(mz.b.ON_STOP);
    }
}