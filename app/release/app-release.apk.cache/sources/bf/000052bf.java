package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;

/* compiled from: NetworkSourceFactory.java */
/* loaded from: classes2.dex */
public class no1 {
    @x1
    public static ko1 a(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new mo1(context);
        }
        return new lo1(context);
    }
}