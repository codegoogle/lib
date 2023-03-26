package com.p7700g.p99005;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.java */
/* loaded from: classes.dex */
public class nz {
    private static AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    @r2
    /* loaded from: classes.dex */
    public static class a extends gz {
        @Override // com.p7700g.p99005.gz, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            b00.g(activity);
        }

        @Override // com.p7700g.p99005.gz, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // com.p7700g.p99005.gz, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private nz() {
    }

    public static void a(Context context) {
        if (a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}