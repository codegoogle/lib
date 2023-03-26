package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: NetworkSourceApi23.java */
@TargetApi(23)
/* loaded from: classes2.dex */
public class mo1 implements ko1 {
    @x1
    private final ConnectivityManager a;

    public mo1(@x1 Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // com.p7700g.p99005.ko1
    @z1
    public Network m0() {
        return this.a.getActiveNetwork();
    }

    @Override // com.p7700g.p99005.ko1
    public void release() {
    }

    @Override // com.p7700g.p99005.ko1
    public void start() {
    }
}