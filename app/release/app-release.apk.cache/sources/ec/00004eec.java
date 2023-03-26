package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;

/* compiled from: NetworkSourceApi21.java */
@TargetApi(21)
/* loaded from: classes2.dex */
public class lo1 implements ko1 {
    @x1
    private final Context a;
    private final b b = new b();

    /* compiled from: NetworkSourceApi21.java */
    @TargetApi(21)
    /* loaded from: classes2.dex */
    public static class b extends ConnectivityManager.NetworkCallback {
        @z1
        private Network a;

        private b() {
        }

        @z1
        public Network a() {
            return this.a;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@z1 Network network) {
            this.a = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@z1 Network network) {
            this.a = null;
        }
    }

    public lo1(@x1 Context context) {
        this.a = context;
    }

    @Override // com.p7700g.p99005.ko1
    @z1
    public Network m0() {
        return this.b.a();
    }

    @Override // com.p7700g.p99005.ko1
    public void release() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.b);
        }
    }

    @Override // com.p7700g.p99005.ko1
    public void start() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(3).addCapability(12).build(), this.b);
        }
    }
}