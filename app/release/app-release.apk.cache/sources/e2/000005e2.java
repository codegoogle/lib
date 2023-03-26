package com.anythink.core.common.b;

import android.app.Activity;
import android.os.Looper;
import com.anythink.core.common.e.af;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class d {
    public boolean isRefresh;
    public WeakReference<Activity> mActivityRef;
    private com.anythink.core.common.e.e mTrackingInfo;
    private af mUnitGroupInfo;

    public final com.anythink.core.common.e.e getTrackingInfo() {
        return this.mTrackingInfo;
    }

    public final af getUnitGroupInfo() {
        return this.mUnitGroupInfo;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final void postOnMainThread(Runnable runnable) {
        m.a().a(runnable);
    }

    public final void postOnMainThreadDelayed(Runnable runnable, long j) {
        m.a().a(runnable, j);
    }

    public final void refreshActivityContext(Activity activity) {
        this.mActivityRef = new WeakReference<>(activity);
    }

    public final void runOnNetworkRequestThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.anythink.core.common.j.b.a.a().b(runnable);
        } else {
            runnable.run();
        }
    }

    public final void setRefresh(boolean z) {
        this.isRefresh = z;
    }

    public final void setTrackingInfo(com.anythink.core.common.e.e eVar) {
        this.mTrackingInfo = eVar;
    }

    public final void setUnitGroupInfo(af afVar) {
        this.mUnitGroupInfo = afVar;
    }
}