package com.google.ads;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.anchorfree.sdk.SessionConfig;
import com.microsoft.appcenter.utils.HandlerUtils;
import com.p7700g.p99005.a81;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.gr0;
import com.p7700g.p99005.ih3;
import com.p7700g.p99005.jt0;
import com.p7700g.p99005.k51;
import com.p7700g.p99005.qh3;
import com.p7700g.p99005.ua1;
import com.p7700g.p99005.va1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yg3;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class vServices extends Service {
    private static f s = null;
    public static Activity t = null;
    public static boolean u = false;
    public static String v = "SERVICES_START";
    public static String w = "SERVICES_END";
    public static Runnable x;
    private String y = "vServices";
    public Handler z = null;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: com.lib.adssdk.vServices$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0135a implements ua1<en1> {

            /* renamed from: com.lib.adssdk.vServices$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0136a implements yg3.c {
                public C0136a() {
                }

                @Override // com.p7700g.p99005.yg3.c
                public void a() {
                    vServices.this.f();
                }
            }

            public C0135a() {
            }

            @Override // com.p7700g.p99005.ua1
            public void a(@x1 gc1 e) {
                vServices.u = false;
                vServices.s.a(false);
                String str = "VpnException : " + e;
            }

            @Override // com.p7700g.p99005.ua1
            /* renamed from: c */
            public void b(@x1 en1 vpnState) {
                if (vpnState == en1.IDLE) {
                    yg3.c().g(new C0136a());
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k51.n(new C0135a());
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Thread {

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: com.lib.adssdk.vServices$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0137a implements ua1<en1> {

                /* renamed from: com.lib.adssdk.vServices$b$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0138a implements va1 {
                    public C0138a() {
                    }

                    @Override // com.p7700g.p99005.va1
                    public void a(@x1 gc1 e) {
                        String unused = vServices.this.y;
                        e.getMessage();
                        e.printStackTrace();
                    }

                    @Override // com.p7700g.p99005.va1
                    public void complete() {
                        vServices.u = false;
                    }
                }

                public C0137a() {
                }

                @Override // com.p7700g.p99005.ua1
                public void a(@x1 gc1 e) {
                    String unused = vServices.this.y;
                    String str = "SERVICES_END : " + e;
                }

                @Override // com.p7700g.p99005.ua1
                /* renamed from: c */
                public void b(@x1 en1 vpnState) {
                    if (vpnState == en1.CONNECTED) {
                        k51.g().e().f(xu0.e.a, new C0138a());
                    }
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k51.n(new C0137a());
            }
        }

        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                HandlerUtils.runOnUiThread(new a());
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ua1<jt0> {
        public c() {
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 e) {
            vServices.u = false;
            vServices.s.a(false);
            String unused = vServices.this.y;
            e.getMessage();
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: c */
        public void b(@x1 jt0 user) {
            String unused = vServices.this.y;
            user.a();
            vServices.this.d();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* loaded from: classes3.dex */
        public class a implements ua1<Boolean> {
            public a() {
            }

            @Override // com.p7700g.p99005.ua1
            public void a(@x1 gc1 e) {
                String unused = vServices.this.y;
                e.getMessage();
                vServices.u = false;
                vServices.s.a(false);
            }

            @Override // com.p7700g.p99005.ua1
            /* renamed from: c */
            public void b(@x1 Boolean aBoolean) {
                String unused = vServices.this.y;
                String str = "vServices connectToVpn success aBoolean --> " + aBoolean;
                if (!aBoolean.booleanValue()) {
                    String unused2 = vServices.this.y;
                    vServices.u = false;
                    vServices.s.a(false);
                    return;
                }
                vServices.this.c();
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vServices.this.e(new a());
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* loaded from: classes3.dex */
        public class a implements va1 {
            public a() {
            }

            @Override // com.p7700g.p99005.va1
            public void a(@x1 gc1 e) {
                String unused = vServices.this.y;
                e.getMessage();
                vServices.u = false;
                vServices.s.a(false);
            }

            @Override // com.p7700g.p99005.va1
            public void complete() {
                String unused = vServices.this.y;
                vServices.u = true;
                vServices.s.a(true);
            }
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("hydra");
            arrayList.add(qh3.v);
            arrayList.add(qh3.w);
            LinkedList linkedList = new LinkedList();
            linkedList.add("*facebook.com");
            linkedList.add("*wtfismyip.com");
            k51.g().e().b(new SessionConfig.b().E(xu0.e.a).H(arrayList).I(ih3.P()).G("hydra").p(a81.c.d().f(linkedList)).s(), new a());
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(boolean isconnect);
    }

    public static void g(Activity mactivity, f mconnectVpage) {
        t = mactivity;
        s = mconnectVpage;
    }

    public void c() {
        t.runOnUiThread(new e());
    }

    public void d() {
        t.runOnUiThread(new d());
    }

    public void e(ua1<Boolean> callback) {
        k51.g().c().r(callback);
    }

    public void f() {
        k51.g().c().l(gr0.a(), new c());
    }

    @Override // android.app.Service
    @z1
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (intent == null || intent.getAction().isEmpty()) {
            return 2;
        }
        if (intent.getAction().equals(v)) {
            t.runOnUiThread(new a());
            return 2;
        } else if (intent.getAction().equals(w)) {
            new b().start();
            return 2;
        } else {
            return 2;
        }
    }

    @Override // android.app.Service
    @e2(api = 26)
    public void onTaskRemoved(Intent rootIntent) {
        Intent intent = new Intent(getApplicationContext(), vServices.class);
        intent.setAction(w);
        startForegroundService(intent);
        super.onTaskRemoved(rootIntent);
    }
}