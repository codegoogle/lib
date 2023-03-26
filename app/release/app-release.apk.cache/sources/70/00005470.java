package com.p7700g.p99005;

import android.os.Build;

/* compiled from: BundleCompat.java */
/* loaded from: classes3.dex */
public class oi3 {
    public static mi3 a() {
        if (Build.VERSION.SDK_INT >= 22) {
            return new pi3();
        }
        return new ni3();
    }
}