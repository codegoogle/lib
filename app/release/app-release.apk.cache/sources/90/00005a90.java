package com.p7700g.p99005;

import android.view.VelocityTracker;

/* compiled from: VelocityTrackerCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class rr {
    private rr() {
    }

    @Deprecated
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @Deprecated
    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}