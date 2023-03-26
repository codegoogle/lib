package com.p7700g.p99005;

import android.app.ActivityManager;

/* compiled from: ActivityManagerCompat.java */
/* loaded from: classes.dex */
public final class tf {
    private tf() {
    }

    public static boolean a(@x1 ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}