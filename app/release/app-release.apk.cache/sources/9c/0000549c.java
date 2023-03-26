package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;

/* compiled from: CalleeHandler.java */
/* loaded from: classes.dex */
public class on {
    private on() {
    }

    @x1
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}