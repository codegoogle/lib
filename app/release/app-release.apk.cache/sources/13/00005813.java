package com.p7700g.p99005;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.p7700g.p99005.nr0;
import com.p7700g.p99005.wy3;
import com.p7700g.p99005.zy3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: CaketubeTransport.java */
/* loaded from: classes3.dex */
public class qh3 extends hn1 implements wy3.a {
    private static final String A = "EXITING";
    public static final String B = "CaketubeTransport";
    @x1
    private static long[] C = {0, 0, 0, 0};
    @x1
    private static zy3.b D = zy3.b.LEVEL_NOTCONNECTED;
    @x1
    public static final String t = "transport:extra:mode";
    public static final String u = "CONNECTED";
    public static final String v = "openvpn_tcp";
    public static final String w = "openvpn_udp";
    @x1
    public static final String x = "v2";
    public static final String y = "NOPROCESS";
    private static final String z = "STARTERROR";
    @x1
    private xh3 L;
    @z1
    private String M;
    @x1
    private final kj1 E = kj1.b(B);
    @x1
    private en1 F = en1.IDLE;
    @x1
    private List<km1> G = new ArrayList();
    @x1
    private List<km1> H = new ArrayList();
    @x1
    private String I = "";
    private String J = "";
    @x1
    private String K = "";
    @x1
    private String N = "";

    public qh3(@x1 xh3 xh3Var) {
        this.L = xh3Var;
    }

    private synchronized void E(@x1 String str, @x1 String str2, @x1 String str3) {
        kj1 kj1Var = this.E;
        kj1Var.i("State: " + str + ", message: " + str2 + ", level: " + str3, new Object[0]);
        char c = 65535;
        switch (str.hashCode()) {
            case -2087582999:
                if (str.equals(u)) {
                    c = 3;
                    break;
                }
                break;
            case -1082562842:
                if (str.equals(z)) {
                    c = 0;
                    break;
                }
                break;
            case -597398044:
                if (str.equals(A)) {
                    c = 2;
                    break;
                }
                break;
            case 1403999598:
                if (str.equals(y)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            en1 en1Var = this.F;
            if (en1Var == en1.CONNECTED) {
                this.E.c("Send CONNECTION_BROKEN_ERROR from state: %s", en1Var);
                s(H("Connection broken", 1));
            } else if (en1Var != en1.IDLE) {
                this.E.c("Send CONNECTION_FAILED_ERROR from state: %s", en1Var);
                s(H(TextUtils.isEmpty(this.K) ? "Connection failed" : this.K, 2));
            }
            this.F = en1.IDLE;
        } else if (c == 1) {
            en1 en1Var2 = this.F;
            if (en1Var2 == en1.CONNECTING_VPN) {
                if (this.I.startsWith("auth-failure")) {
                    this.E.c("Send CONNECTION_AUTH_FAILURE from state: %s", this.F);
                    s(H("VPN Auth failure", 3));
                } else {
                    this.E.c("Send CONNECTION_FAILED_ERROR from state: %s", this.F);
                    s(H("Connection broken", 2));
                }
            } else if (en1Var2 == en1.CONNECTED) {
                this.E.c("Send CONNECTION_BROKEN_ERROR from state: %s", en1Var2);
                if (this.I.startsWith("remote-exit")) {
                    s(H("Server connection broken", 1));
                } else {
                    this.E.c("Send server CONNECTION_BROKEN_ERROR from state: %s", this.F);
                    s(H("Connection broken", 1));
                }
            }
            this.F = en1.IDLE;
        } else if (c == 2) {
            this.E.c(A, new Object[0]);
            this.I = str2;
        } else if (c == 3) {
            this.F = en1.CONNECTED;
            this.G.clear();
            String a = this.L.a(str, str2);
            if (a != null && a.length() > 0) {
                this.G.add(new km1(a, Collections.singletonList(a)));
            }
            r();
        }
    }

    private void F(long j, long j2, long j3, long j4) {
        this.E.i(String.format(Locale.US, "in: %d out: %d diffIn: %d diffOut: %d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)), new Object[0]);
        t(j2, j);
    }

    @x1
    private void G(@x1 fo1 fo1Var, @x1 ln1 ln1Var) {
        this.E.c("setUpVpnService", new Object[0]);
        mn1 c = ln1Var.c(fo1Var);
        c.i(null);
        this.F = en1.CONNECTING_VPN;
        if (this.L.b((th3) new Gson().n(fo1Var.v, th3.class), ln1Var, c, this)) {
            return;
        }
        s(H("Binary failed", 2));
    }

    @x1
    private vh3 H(@x1 String str, int i) {
        return new vh3(str, i);
    }

    private void I(@x1 String str, @x1 String str2, @x1 zy3.b bVar) {
        if (D == zy3.b.LEVEL_CONNECTED && ("WAIT".equals(str) || "AUTH".equals(str))) {
            this.E.c(String.format("Ignoring OpenVPN Status in CONNECTED state (%s->%s): %s", str, bVar.toString(), str2), new Object[0]);
            return;
        }
        D = bVar;
        E(str, str2, bVar.name());
    }

    @Override // com.p7700g.p99005.hn1
    public void A(@x1 fo1 fo1Var, @x1 ln1 ln1Var) {
        this.M = "";
        this.K = "";
        this.H = new ArrayList();
        this.G = new ArrayList();
        this.N = UUID.randomUUID().toString();
        G(fo1Var, ln1Var);
    }

    @Override // com.p7700g.p99005.hn1
    public void B() {
        this.E.c("stopVpn", new Object[0]);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.F != en1.IDLE) {
            this.F = en1.DISCONNECTING;
        }
        this.L.stop();
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
        this.F = en1.IDLE;
        this.E.c("stopVpn completed", new Object[0]);
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String D() {
        return qy3.e;
    }

    @Override // com.p7700g.p99005.wy3.a
    public void c(@x1 String str) {
        this.K = str;
    }

    @Override // com.p7700g.p99005.wy3.a
    public void d(long j, long j2) {
        long[] jArr = C;
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = j - j3;
        jArr[2] = j5;
        long j6 = j2 - j4;
        jArr[3] = j6;
        C = new long[]{j, j2, j5, j6};
        F(j, j2, j5, j6);
    }

    @Override // com.p7700g.p99005.wy3.a
    public void e(@x1 String str) {
        try {
            String[] split = str.split(" ");
            this.E.c("Log string: %s", str);
            if (str.contains("UDP link remote")) {
                this.M = split[split.length - 1].replace("[AF_INET]", "");
            } else if (str.contains("Inactivity timeout (--ping-restart)")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.M);
                this.H.add(new km1("", arrayList));
            } else if (str.contains(" TCP: connect to") && str.contains("failed: Connection timed out")) {
                String replace = split[5].replace("[AF_INET]", "");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(replace);
                this.H.add(new km1("", arrayList2));
            }
        } catch (Throwable th) {
            this.E.f(th);
        }
    }

    @Override // com.p7700g.p99005.wy3.a
    public void f(@x1 String str) {
    }

    @Override // com.p7700g.p99005.wy3.a
    public void g(@x1 String str, @x1 String str2) {
        I(str, str2, zy3.a(str));
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public lm1 l() {
        return new ph3(this.G, this.H, this.J, this.N, qy3.e);
    }

    @Override // com.p7700g.p99005.hn1
    public int m(@x1 String str) {
        return 0;
    }

    @Override // com.p7700g.p99005.hn1
    public int n() {
        return 0;
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String o() {
        return B;
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public List<ld1> p() {
        return Collections.emptyList();
    }

    @Override // com.p7700g.p99005.hn1
    public boolean q() {
        return false;
    }

    @Override // com.p7700g.p99005.hn1
    public void w(@x1 Bundle bundle) {
        this.N = UUID.randomUUID().toString();
        this.J = bundle.getString("transport:extra:mode", nr0.a.d);
    }

    @Override // com.p7700g.p99005.hn1
    public void y() {
    }
}