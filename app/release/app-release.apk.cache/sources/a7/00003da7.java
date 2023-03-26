package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.p7700g.p99005.mx1;
import com.p7700g.p99005.s02;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes2.dex */
public final class cy1 {
    private static volatile cy1 a = null;
    private static final String b = "ConnectivityMonitor";
    private final c c;
    @k1("this")
    public final Set<mx1.a> d = new HashSet();
    @k1("this")
    private boolean e;

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes2.dex */
    public class a implements s02.b<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.p7700g.p99005.s02.b
        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes2.dex */
    public class b implements mx1.a {
        public b() {
        }

        @Override // com.p7700g.p99005.mx1.a
        public void a(boolean z) {
            ArrayList arrayList;
            synchronized (cy1.this) {
                arrayList = new ArrayList(cy1.this.d);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((mx1.a) it.next()).a(z);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a();

        boolean b();
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    @e2(24)
    /* loaded from: classes2.dex */
    public static final class d implements c {
        public boolean a;
        public final mx1.a b;
        private final s02.b<ConnectivityManager> c;
        private final ConnectivityManager.NetworkCallback d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes2.dex */
        public class a extends ConnectivityManager.NetworkCallback {

            /* compiled from: SingletonConnectivityReceiver.java */
            /* renamed from: com.p7700g.p99005.cy1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0157a implements Runnable {
                public final /* synthetic */ boolean s;

                public RunnableC0157a(boolean z) {
                    this.s = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.s);
                }
            }

            public a() {
            }

            private void b(boolean z) {
                z02.x(new RunnableC0157a(z));
            }

            public void a(boolean z) {
                z02.b();
                d dVar = d.this;
                boolean z2 = dVar.a;
                dVar.a = z;
                if (z2 != z) {
                    dVar.b.a(z);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@x1 Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@x1 Network network) {
                b(false);
            }
        }

        public d(s02.b<ConnectivityManager> bVar, mx1.a aVar) {
            this.c = bVar;
            this.b = aVar;
        }

        @Override // com.p7700g.p99005.cy1.c
        public void a() {
            this.c.get().unregisterNetworkCallback(this.d);
        }

        @Override // com.p7700g.p99005.cy1.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.a = this.c.get().getActiveNetwork() != null;
            try {
                this.c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable(cy1.b, 5);
                return false;
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes2.dex */
    public static final class e implements c {
        private final Context a;
        public final mx1.a b;
        private final s02.b<ConnectivityManager> c;
        public boolean d;
        private final BroadcastReceiver e = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes2.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@x1 Context context, Intent intent) {
                e eVar = e.this;
                boolean z = eVar.d;
                eVar.d = eVar.c();
                if (z != e.this.d) {
                    if (Log.isLoggable(cy1.b, 3)) {
                        boolean z2 = e.this.d;
                    }
                    e eVar2 = e.this;
                    eVar2.b.a(eVar2.d);
                }
            }
        }

        public e(Context context, s02.b<ConnectivityManager> bVar, mx1.a aVar) {
            this.a = context.getApplicationContext();
            this.c = bVar;
            this.b = aVar;
        }

        @Override // com.p7700g.p99005.cy1.c
        public void a() {
            this.a.unregisterReceiver(this.e);
        }

        @Override // com.p7700g.p99005.cy1.c
        public boolean b() {
            this.d = c();
            try {
                this.a.registerReceiver(this.e, new IntentFilter(b91.a));
                return true;
            } catch (SecurityException unused) {
                Log.isLoggable(cy1.b, 5);
                return false;
            }
        }

        @SuppressLint({"MissingPermission"})
        public boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException unused) {
                Log.isLoggable(cy1.b, 5);
                return true;
            }
        }
    }

    private cy1(@x1 Context context) {
        c eVar;
        s02.b a2 = s02.a(new a(context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new d(a2, bVar);
        } else {
            eVar = new e(context, a2, bVar);
        }
        this.c = eVar;
    }

    public static cy1 a(@x1 Context context) {
        if (a == null) {
            synchronized (cy1.class) {
                if (a == null) {
                    a = new cy1(context.getApplicationContext());
                }
            }
        }
        return a;
    }

    @k1("this")
    private void b() {
        if (this.e || this.d.isEmpty()) {
            return;
        }
        this.e = this.c.b();
    }

    @k1("this")
    private void c() {
        if (this.e && this.d.isEmpty()) {
            this.c.a();
            this.e = false;
        }
    }

    @r2
    public static void e() {
        a = null;
    }

    public synchronized void d(mx1.a aVar) {
        this.d.add(aVar);
        b();
    }

    public synchronized void f(mx1.a aVar) {
        this.d.remove(aVar);
        c();
    }
}