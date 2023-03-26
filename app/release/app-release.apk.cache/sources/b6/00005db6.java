package com.p7700g.p99005;

import android.os.IBinder;

/* compiled from: WindowIdApi14.java */
/* loaded from: classes.dex */
public class t90 implements v90 {
    private final IBinder a;

    public t90(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t90) && ((t90) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}