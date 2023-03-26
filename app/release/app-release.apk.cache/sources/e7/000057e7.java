package com.p7700g.p99005;

import android.content.Context;
import android.util.Patterns;
import com.anchorfree.pingtool.PingResult;
import com.anchorfree.pingtool.PingService;
import com.anchorfree.pingtool.VpnRouter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PingProbe.java */
/* loaded from: classes2.dex */
public class qd1 implements ld1 {
    @x1
    private static final String a = "server_ip";
    @x1
    private static final String b = "packets_transmitted";
    @x1
    private static final String c = "packets_received";
    @x1
    private static final String d = "pct_packet_loss";
    @x1
    private static final String e = "packets_failed";
    @x1
    private static final String f = "min";
    @x1
    private static final String g = "avg";
    @x1
    private static final String h = "max";
    @x1
    private static final String i = "stdev";
    @x1
    private static final String j = "ping";
    private static final long k = TimeUnit.SECONDS.toMillis(5);
    @x1
    private final Context n;
    @x1
    private final td1 o;
    @x1
    private final PingService p;
    @z1
    private yp0 q;
    @z1
    private rd1 s;
    @x1
    private final ScheduledExecutorService l = Executors.newSingleThreadScheduledExecutor();
    @x1
    private final kj1 m = kj1.b("PingProbe");
    @z1
    private PingResult r = null;
    private long t = 0;

    public qd1(@x1 Context context, @x1 final td1 td1Var) {
        this.n = context;
        this.o = td1Var;
        Objects.requireNonNull(td1Var);
        this.p = new PingService(context, new VpnRouter() { // from class: com.p7700g.p99005.gd1
            @Override // com.anchorfree.pingtool.VpnRouter
            public final void protect(int i2) {
                td1.this.l(i2);
            }
        });
        this.s = rd1.e(context, td1Var);
    }

    private void b() {
        yp0 yp0Var = this.q;
        if (yp0Var != null) {
            yp0Var.d();
        }
        this.q = null;
    }

    private void c(@x1 InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            this.t = this.p.startPing(inetAddress.getHostAddress());
        }
    }

    @x1
    private static String d(@x1 PingResult pingResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        jSONObject2.put("server_ip", pingResult.getIsAddess());
        jSONObject2.put(b, String.valueOf(pingResult.getTransmitted()));
        jSONObject2.put(c, String.valueOf(pingResult.getReceived()));
        jSONObject2.put(e, String.valueOf(pingResult.getTransmitted() - pingResult.getReceived()));
        jSONObject2.put(d, decimalFormat.format(((pingResult.getTransmitted() - pingResult.getReceived()) * 100.0d) / pingResult.getTransmitted()));
        jSONObject2.put(f, decimalFormat.format(pingResult.getMinRtt()));
        jSONObject2.put(g, decimalFormat.format(pingResult.getAvgRtt()));
        jSONObject2.put(h, decimalFormat.format(pingResult.getMaxRtt()));
        jSONObject2.put(i, decimalFormat.format(pingResult.getMdevRtt()));
        jSONObject.put(j, jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: f */
    public /* synthetic */ nd1 g() throws Exception {
        synchronized (this) {
            long j2 = this.t;
            if (j2 == 0 && this.r == null) {
                return new nd1(nd1.d, "invalid", "", false, false);
            } else if (j2 != 0) {
                PingResult stopPing = this.p.stopPing(j2);
                if (stopPing == null) {
                    stopPing = PingResult.EMPTY_RESULT;
                }
                this.t = 0L;
                return new nd1(nd1.d, d(stopPing), stopPing.getIsAddess(), true, false);
            } else {
                PingResult pingResult = (PingResult) r81.f(this.r);
                nd1 nd1Var = new nd1(nd1.d, d(pingResult), pingResult.getIsAddess(), true, false);
                this.r = null;
                return nd1Var;
            }
        }
    }

    /* renamed from: h */
    public /* synthetic */ InetAddress i(wp0 wp0Var, String str) throws Exception {
        if (wp0Var.a()) {
            return null;
        }
        if (Patterns.IP_ADDRESS.matcher(str).matches()) {
            return InetAddress.getByName(str);
        }
        try {
            rd1 e2 = e();
            if (e2 == null) {
                return null;
            }
            List<InetAddress> a2 = e2.a(str);
            if (a2.isEmpty()) {
                return null;
            }
            return a2.get(0);
        } catch (UnknownHostException e3) {
            this.m.i(wo1.u("Unable to resolve: ", str, " to IP address"), e3);
            return null;
        }
    }

    public static /* synthetic */ dq0 j(dq0 dq0Var, dq0 dq0Var2) throws Exception {
        return dq0Var;
    }

    public static /* synthetic */ dq0 k(long j2, wp0 wp0Var, final dq0 dq0Var) throws Exception {
        return dq0.A(Math.max(0L, j2 - System.currentTimeMillis()), wp0Var).P(new aq0() { // from class: com.p7700g.p99005.ad1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                dq0 dq0Var3 = dq0.this;
                qd1.j(dq0Var3, dq0Var2);
                return dq0Var3;
            }
        });
    }

    private /* synthetic */ Void l(wp0 wp0Var, String str, dq0 dq0Var) throws Exception {
        synchronized (this) {
            if (!wp0Var.a()) {
                InetAddress inetAddress = (InetAddress) dq0Var.F();
                if (inetAddress != null) {
                    c(inetAddress);
                } else {
                    kj1 kj1Var = this.m;
                    kj1Var.e("Error by resolving domain: " + str + ". Ping command was skipped.", new Object[0]);
                }
            }
        }
        return null;
    }

    private /* synthetic */ Void n(dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            this.m.e("Error by starting ping command", dq0Var.E());
            return null;
        }
        return null;
    }

    private dq0<InetAddress> p(@x1 final String str, @x1 final wp0 wp0Var) {
        return dq0.f(new Callable() { // from class: com.p7700g.p99005.zc1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qd1.this.i(wp0Var, str);
            }
        }, this.l, wp0Var);
    }

    @Override // com.p7700g.p99005.ld1
    @x1
    public dq0<nd1> a() {
        return dq0.c(new Callable() { // from class: com.p7700g.p99005.cd1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qd1.this.g();
            }
        });
    }

    @z1
    public rd1 e() {
        return this.s;
    }

    public /* synthetic */ Void m(wp0 wp0Var, String str, dq0 dq0Var) {
        l(wp0Var, str, dq0Var);
        return null;
    }

    public /* synthetic */ Void o(dq0 dq0Var) {
        n(dq0Var);
        return null;
    }

    public void q(@x1 final String str) {
        r();
        final long currentTimeMillis = System.currentTimeMillis() + k;
        b();
        yp0 yp0Var = new yp0();
        this.q = yp0Var;
        final wp0 j2 = yp0Var.j();
        p(str, j2).P(new aq0() { // from class: com.p7700g.p99005.xc1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return qd1.k(currentTimeMillis, j2, dq0Var);
            }
        }).O(new aq0() { // from class: com.p7700g.p99005.bd1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                qd1.this.m(j2, str, dq0Var);
                return null;
            }
        }, this.l, j2).s(new aq0() { // from class: com.p7700g.p99005.yc1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                qd1.this.o(dq0Var);
                return null;
            }
        }, this.l);
    }

    public void r() {
        b();
        synchronized (this) {
            long j2 = this.t;
            if (j2 != 0) {
                this.r = this.p.stopPing(j2);
            }
        }
    }
}