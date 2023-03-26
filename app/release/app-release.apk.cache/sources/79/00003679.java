package com.ironsource.sdk.service.Connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e implements c {
    private String a = e.class.getSimpleName();
    private int b = 23;
    private final d c;
    private ConnectivityManager.NetworkCallback d;

    /* loaded from: classes3.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        private /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            if (network != null) {
                d dVar = e.this.c;
                String a = com.ironsource.d.a.a(network, this.a);
                com.ironsource.d.a.a(this.a, network);
                dVar.a(a);
                return;
            }
            d dVar2 = e.this.c;
            String a2 = com.ironsource.d.a.a(this.a);
            Context context = this.a;
            com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
            dVar2.a(a2);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                e.this.c.a(com.ironsource.d.a.a(network, this.a), com.ironsource.d.a.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                e.this.c.a(com.ironsource.d.a.a(network, this.a), com.ironsource.d.a.a(this.a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            if (com.ironsource.d.a.a(this.a).equals("none")) {
                e.this.c.a();
            }
        }
    }

    public e(d dVar) {
        this.c = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.d = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    @SuppressLint({"NewApi", "MissingPermission"})
    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            b(context);
            if (com.ironsource.d.a.a(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.d);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    @SuppressLint({"NewApi"})
    public final void b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception unused) {
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return com.ironsource.d.a.a(context, com.ironsource.d.a.b(context));
    }
}