package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes3.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    private ConnectivityManager a;
    private j b;
    private boolean c = false;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NetworkStateReceiver.this.b != null) {
                NetworkStateReceiver.this.b.a(NetworkStateReceiver.this.c);
            }
        }
    }

    public NetworkStateReceiver(Context context, j jVar) {
        this.b = jVar;
        if (context != null) {
            this.a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b() {
        boolean z = this.c;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (Exception unused) {
            }
            return z == this.c;
        }
        this.c = false;
        if (z == this.c) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !b()) {
            return;
        }
        com.ironsource.environment.e.c.a.c(new a());
    }
}