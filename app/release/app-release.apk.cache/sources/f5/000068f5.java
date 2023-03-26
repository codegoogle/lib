package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: NetworkStateTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class zd0 extends yd0<id0> {
    public static final String g = tb0.f("NetworkStateTracker");
    private final ConnectivityManager h;
    @e2(24)
    private b i;
    private a j;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals(b91.a)) {
                return;
            }
            tb0.c().a(zd0.g, "Network broadcast received", new Throwable[0]);
            zd0 zd0Var = zd0.this;
            zd0Var.d(zd0Var.g());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    @e2(24)
    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@x1 Network network, @x1 NetworkCapabilities capabilities) {
            tb0.c().a(zd0.g, String.format("Network capabilities changed: %s", capabilities), new Throwable[0]);
            zd0 zd0Var = zd0.this;
            zd0Var.d(zd0Var.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@x1 Network network) {
            tb0.c().a(zd0.g, "Network connection lost", new Throwable[0]);
            zd0 zd0Var = zd0.this;
            zd0Var.d(zd0Var.g());
        }
    }

    public zd0(@x1 Context context, @x1 cg0 taskExecutor) {
        super(context, taskExecutor);
        this.h = (ConnectivityManager) this.c.getSystemService("connectivity");
        if (j()) {
            this.i = new b();
        } else {
            this.j = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // com.p7700g.p99005.yd0
    public void e() {
        if (j()) {
            try {
                tb0.c().a(g, "Registering network callback", new Throwable[0]);
                this.h.registerDefaultNetworkCallback(this.i);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                tb0.c().b(g, "Received exception while registering network callback", e);
                return;
            }
        }
        tb0.c().a(g, "Registering broadcast receiver", new Throwable[0]);
        this.c.registerReceiver(this.j, new IntentFilter(b91.a));
    }

    @Override // com.p7700g.p99005.yd0
    public void f() {
        if (j()) {
            try {
                tb0.c().a(g, "Unregistering network callback", new Throwable[0]);
                this.h.unregisterNetworkCallback(this.i);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                tb0.c().b(g, "Received exception while unregistering network callback", e);
                return;
            }
        }
        tb0.c().a(g, "Unregistering broadcast receiver", new Throwable[0]);
        this.c.unregisterReceiver(this.j);
    }

    public id0 g() {
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean z = true;
        return new id0(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), cm.c(this.h), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : false);
    }

    @Override // com.p7700g.p99005.yd0
    /* renamed from: h */
    public id0 b() {
        return g();
    }

    @r2
    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e) {
            tb0.c().b(g, "Unable to validate active network", e);
            return false;
        }
    }
}