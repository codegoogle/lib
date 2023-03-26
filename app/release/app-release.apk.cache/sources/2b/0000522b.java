package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ConnectionObserverImpl.java */
/* loaded from: classes2.dex */
public class ne1 implements me1 {
    @x1
    private static final kj1 b = kj1.b("ConnectionObserver");
    @x1
    private final Context c;
    @x1
    private final ScheduledExecutorService d;
    @x1
    private final ConnectivityManager e;
    @x1
    private volatile qc1 f;
    @z1
    private ScheduledFuture<?> g;
    @x1
    private final List<c> h = new CopyOnWriteArrayList();
    @z1
    private ConnectivityManager.NetworkCallback i;
    @z1
    private BroadcastReceiver j;
    private boolean k;

    /* compiled from: ConnectionObserverImpl.java */
    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
            ne1.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@z1 Context context, @z1 Intent intent) {
            ne1.this.q();
        }
    }

    /* compiled from: ConnectionObserverImpl.java */
    /* loaded from: classes2.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
            ne1.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@x1 Network network) {
            super.onAvailable(network);
            ne1.b.c("onAvailable %s", network);
            ne1.this.q();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@x1 Network network, @x1 NetworkCapabilities networkCapabilities) {
            try {
                super.onCapabilitiesChanged(network, networkCapabilities);
                ne1.b.c("onCapabilitiesChanged %s", networkCapabilities.toString());
                ne1.this.q();
            } catch (Throwable th) {
                ne1.b.f(th);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@x1 Network network) {
            super.onLost(network);
            ne1.b.c("onLost %s", network);
            ne1.this.q();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            ne1.b.c("onUnavailable", new Object[0]);
            ne1.this.q();
        }
    }

    /* compiled from: ConnectionObserverImpl.java */
    /* loaded from: classes2.dex */
    public class c implements pc1 {
        private boolean a;
        @x1
        private final String b;
        @x1
        private final nc1 c;

        public /* synthetic */ c(ne1 ne1Var, String str, nc1 nc1Var, a aVar) {
            this(str, nc1Var);
        }

        public void a(@x1 qc1 qc1Var) {
            ne1.b.c("Notify client with tag: %s about network change", this.b);
            this.c.a(qc1Var);
        }

        @Override // com.p7700g.p99005.pc1
        public void cancel() {
            ne1.this.h.remove(this);
            if (ne1.this.h.size() == 0 && !this.a) {
                ne1.this.s();
            }
            this.a = false;
        }

        private c(@x1 String str, @x1 nc1 nc1Var) {
            ne1.this = r1;
            this.a = false;
            this.b = str;
            this.c = nc1Var;
        }
    }

    public ne1(@x1 Context context, @x1 ScheduledExecutorService scheduledExecutorService) {
        this.c = context;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
        this.f = j(context);
        this.d = scheduledExecutorService;
        t();
    }

    @z1
    @TargetApi(21)
    private static synchronized Network h(@x1 final ConnectivityManager connectivityManager) {
        synchronized (ne1.class) {
            kj1 kj1Var = b;
            kj1Var.c("getActiveNetwork start", new Object[0]);
            LinkedList linkedList = new LinkedList();
            Network[] allNetworks = connectivityManager.getAllNetworks();
            kj1Var.c("Got all Networks %s", Arrays.toString(linkedList.toArray()));
            for (Network network : allNetworks) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                b.c("check network: %s info: %s cap: %s", network, networkInfo, networkCapabilities);
                if (networkInfo != null && networkInfo.isConnected() && (networkCapabilities == null || !networkCapabilities.hasTransport(4))) {
                    linkedList.add(network);
                }
            }
            if (linkedList.size() > 0) {
                Collections.sort(linkedList, new Comparator() { // from class: com.p7700g.p99005.ce1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ne1.l(connectivityManager, (Network) obj, (Network) obj2);
                    }
                });
                b.c("Got networks %s", Arrays.toString(linkedList.toArray()));
                return (Network) linkedList.get(0);
            }
            return null;
        }
    }

    @x1
    private static qc1 j(@x1 Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                b.c("Got active network info %s", activeNetworkInfo);
                Network h = h(connectivityManager);
                return new rc1(activeNetworkInfo, h, connectivityManager.getNetworkInfo(h), connectivityManager.getNetworkCapabilities(h));
            } catch (Throwable th) {
                b.f(th);
            }
        } else {
            b.c("ConnectivityManager is null", new Object[0]);
        }
        return new qc1(null);
    }

    @SuppressLint({"MissingPermission"})
    public static boolean k(@x1 Context context) {
        return j(context).c();
    }

    public static /* synthetic */ int l(ConnectivityManager connectivityManager, Network network, Network network2) {
        return p(connectivityManager, network) - p(connectivityManager, network2);
    }

    /* renamed from: m */
    public /* synthetic */ void n() {
        qc1 j = j(this.c);
        if (o(j)) {
            b.c("Notify network changed from: %s to: %s", this.f, j);
            synchronized (this) {
                this.f = j;
            }
            for (c cVar : this.h) {
                try {
                    cVar.a(this.f);
                } catch (Throwable th) {
                    b.o(th);
                }
            }
        }
    }

    private boolean o(@z1 qc1 qc1Var) {
        return !this.f.equals(qc1Var);
    }

    @TargetApi(21)
    private static int p(@x1 ConnectivityManager connectivityManager, @x1 Network network) {
        return connectivityManager.getNetworkInfo(network).getType() == 1 ? 0 : 1;
    }

    public void q() {
        ScheduledFuture<?> scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.g = this.d.schedule(new Runnable() { // from class: com.p7700g.p99005.be1
            @Override // java.lang.Runnable
            public final void run() {
                ne1.this.n();
            }
        }, me1.a, TimeUnit.MILLISECONDS);
    }

    @e2(api = 21)
    private void r() {
        this.i = new b();
        try {
            this.e.registerNetworkCallback(new NetworkRequest.Builder().addCapability(15).build(), this.i);
        } catch (Throwable th) {
            b.f(th);
        }
    }

    public void s() {
        if (this.k) {
            try {
                this.c.unregisterReceiver(this.j);
            } catch (Throwable th) {
                b.f(th);
            }
            this.e.unregisterNetworkCallback(this.i);
        }
        this.k = false;
    }

    private void t() {
        if (!this.k) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(b91.a);
            a aVar = new a();
            this.j = aVar;
            this.c.registerReceiver(aVar, intentFilter);
            r();
        }
        this.k = true;
    }

    @Override // com.p7700g.p99005.me1
    @x1
    public synchronized qc1 a() {
        return j(this.c);
    }

    @Override // com.p7700g.p99005.me1
    @SuppressLint({"MissingPermission"})
    public boolean b() {
        return j(this.c).c();
    }

    @Override // com.p7700g.p99005.me1
    @x1
    public synchronized pc1 c(@x1 String str, @x1 nc1 nc1Var) {
        c cVar;
        b.c("Start receiver", new Object[0]);
        cVar = new c(this, str, nc1Var, null);
        this.h.add(cVar);
        if (this.h.size() == 1) {
            t();
        }
        return cVar;
    }

    @x1
    public qc1 i() {
        return this.f;
    }
}