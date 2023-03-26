package com.anythink.expressad.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.h.w;
import com.p7700g.p99005.b91;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a {
    public static String a = "mtg_retry_report=1";
    public static int b = 10000;
    public static final int c = 1;
    public static final int d = 2;
    public static int e = 3;
    public static int f = 50;
    public static int g = 600000;
    public static int h = 0;
    public static int i = 1;
    public static int j = 2;
    public static int k = 3;
    public static int l = 4;
    public static int m = 5;
    private static String n = "RetryReportControl";
    private static int q;
    private static int r;
    private ConcurrentHashMap<String, com.anythink.expressad.a.a.b> o;
    private c p;
    private BroadcastReceiver s;
    private final Handler t;

    /* renamed from: com.anythink.expressad.a.a.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (b91.a.equals(intent.getAction())) {
                a.this.t.sendEmptyMessage(2);
            }
        }
    }

    /* renamed from: com.anythink.expressad.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0053a {
        private static a a = new a((byte) 0);

        private C0053a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@x1 Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                a.a(a.a());
                return;
            }
            Object obj = message.obj;
            if (obj instanceof String) {
                a.a().a((String) obj, com.anythink.expressad.a.a.b.a);
            }
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    private void c() {
        try {
            if (this.s == null) {
                this.s = new AnonymousClass1();
                Context e2 = m.a().e();
                if (e2 != null) {
                    e2.registerReceiver(this.s, new IntentFilter(b91.a));
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private void d() {
        Context e2;
        if (this.s == null || (e2 = m.a().e()) == null) {
            return;
        }
        e2.unregisterReceiver(this.s);
    }

    private a() {
        this.o = new ConcurrentHashMap<>();
        this.p = new c(f);
        this.t = new b(Looper.getMainLooper());
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
        e = b2.W();
        b = b2.Y() * 1000;
        g = b2.X() * 1000;
        q = b2.V();
        r = b2.U();
        try {
            if (this.s == null) {
                this.s = new AnonymousClass1();
                Context e2 = m.a().e();
                if (e2 != null) {
                    e2.registerReceiver(this.s, new IntentFilter(b91.a));
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static a a() {
        return C0053a.a;
    }

    private void b() {
        c cVar = this.p;
        if (cVar != null) {
            for (String str : cVar.a()) {
                a(str, com.anythink.expressad.a.a.b.b);
            }
        }
    }

    private void a(String str, com.anythink.expressad.a.a.b bVar) {
        if (this.p == null) {
            this.p = new c(f);
        }
        this.p.a(str, bVar);
    }

    private static boolean b(int i2) {
        return i2 == i || i2 == j;
    }

    private void a(String str) {
        Message obtainMessage = this.t.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.t.sendMessageDelayed(obtainMessage, b);
    }

    private static boolean c(int i2) {
        return a(i2) || b(i2) || i2 == m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
        String sb;
        c cVar = this.p;
        if (cVar != null) {
            com.anythink.expressad.a.a.b b2 = cVar.b(str);
            this.p.a(str);
            if (b2 != null) {
                if (System.currentTimeMillis() <= b2.h() + g) {
                    b2.a(i2);
                    this.o.put(str, b2);
                    if (w.b(str) == 0) {
                        StringBuilder L = wo1.L(str, "?");
                        L.append(a);
                        sb = L.toString();
                    } else {
                        StringBuilder L2 = wo1.L(str, "&");
                        L2.append(a);
                        sb = L2.toString();
                    }
                    com.anythink.expressad.foundation.d.c f2 = b2.f();
                    com.anythink.expressad.a.a.a(m.a().e(), f2, b2.e(), sb, b2.a(), b2.b(), b2.d());
                    return;
                } else if (i2 != com.anythink.expressad.a.a.b.b) {
                    return;
                } else {
                    return;
                }
            }
            com.anythink.expressad.a.a.b bVar = this.o.get(str);
            if (bVar == null || System.currentTimeMillis() > bVar.h() + g || bVar.g() >= e || i2 == com.anythink.expressad.a.a.b.b) {
                return;
            }
            a(str);
        }
    }

    private static boolean a(int i2) {
        return i2 == l || i2 == k;
    }

    public final void a(String str, String str2, com.anythink.expressad.foundation.d.c cVar, String str3, boolean z, boolean z2, int i2) {
        if (!(a(i2) || b(i2) || i2 == m) || TextUtils.isEmpty(str)) {
            return;
        }
        String replace = str.replace("?" + a, "");
        String replace2 = replace.replace("&" + a, "");
        if (this.o == null) {
            this.o = new ConcurrentHashMap<>();
        }
        com.anythink.expressad.a.a.b remove = this.o.remove(replace2);
        if (remove == null) {
            remove = new com.anythink.expressad.a.a.b(str, str2);
            remove.b(i2);
            remove.a(z);
            remove.b(z2);
            remove.a(cVar);
            remove.a(str3);
        } else if (remove.c() != com.anythink.expressad.a.a.b.b) {
            remove.b(str2);
        }
        if ((a(i2) && q != 0) || (b(i2) && r != 0) || i2 == m) {
            if (System.currentTimeMillis() < remove.h() + g) {
                if (this.p == null) {
                    this.p = new c(f);
                }
                this.p.a(replace2, remove);
                if (remove.c() != com.anythink.expressad.a.a.b.a || remove.g() > e) {
                    return;
                }
                a(replace2);
                return;
            }
            int i3 = com.anythink.expressad.a.a.b.a;
        }
    }

    public static /* synthetic */ void a(a aVar) {
        c cVar = aVar.p;
        if (cVar != null) {
            for (String str : cVar.a()) {
                aVar.a(str, com.anythink.expressad.a.a.b.b);
            }
        }
    }
}