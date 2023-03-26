package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.util.Base64;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.NotificationConfig;
import com.anchorfree.sdk.SessionConfig;
import com.anchorfree.sdk.UnifiedSDKConfig;
import com.google.gson.Gson;
import com.p7700g.p99005.mg1;
import com.p7700g.p99005.tq0;
import com.p7700g.p99005.x31;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: UnifiedSDKConfigSource.java */
/* loaded from: classes.dex */
public class o51 {
    @x1
    private static final String a = "sdk:config:extra:captive-portal";
    @x1
    private static final String b = "sdk:config:extra:reconnect";
    @x1
    private static final String c = "sdk:config:extra:analytics";
    @x1
    private static final String d = "sdk:config:extra:test";
    @x1
    public static final String e = "sdk:config:extra:client";
    @x1
    private static final String f = "sdk:config:extra:config-patcher";
    @x1
    private static final String g = "sdk:config:extra:middle-config-patcher";
    @x1
    private static final String h = "sdk:config:last-start";
    @x1
    private static final String i = "sdk:config:last-start:client";
    @x1
    private static final String j = "sdk:config:manual:connected-ts";
    @x1
    private static final String k = "sdk:config:extra:internal:config";
    public static final String l = "sdk:config:extra:internal:config:tracker:delegate";
    @x1
    public static final String m = "sdk:config:extra:transports";
    @x1
    private static final String n = "sdk:config:extra:notification";
    @x1
    private static final String o = "sdk:config:extra:tracking";
    @x1
    private static final String p = "sdk:config:extra:sdk";
    @x1
    public static final String q = ":";
    private static final String r = "com.anchorfree.sdk.transports";
    @x1
    private final Executor t;
    @x1
    private final c81 u;
    @x1
    private x31 v = (x31) i61.a().d(x31.class);
    @z1
    private final h31 s = (h31) i61.a().d(h31.class);
    @x1
    private final Gson w = (Gson) i61.a().d(Gson.class);

    /* compiled from: UnifiedSDKConfigSource.java */
    /* loaded from: classes.dex */
    public class a extends lx2<List<j51>> {
        public a() {
        }
    }

    public o51(@x1 Executor executor, @x1 c81 c81Var) {
        this.u = c81Var;
        this.t = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ ClientInfo B() throws Exception {
        return (ClientInfo) this.w.n(this.v.e(i, ""), ClientInfo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ List D() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (String str : this.v.b(g)) {
            k81 k81Var = (k81) this.w.n(this.v.e(str, ""), k81.class);
            if (k81Var != null) {
                arrayList.add(k81Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ NotificationConfig F() throws Exception {
        return u0(Base64.decode(this.v.e(n, ""), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ List H() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (String str : this.v.b(e)) {
            ClientInfo clientInfo = (ClientInfo) this.w.n(this.v.e(str, ""), ClientInfo.class);
            if (clientInfo != null) {
                arrayList.add(clientInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ List J() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (String str : this.v.b(f)) {
            k81 k81Var = (k81) this.w.n(this.v.e(str, ""), k81.class);
            if (k81Var != null) {
                arrayList.add(k81Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ List L() throws Exception {
        Type g2 = new a().g();
        return (List) this.w.o(this.v.e(m, this.u.c(r)), g2);
    }

    private /* synthetic */ Void M(String str, ClientInfo clientInfo, UnifiedSDKConfig unifiedSDKConfig) throws Exception {
        this.v.c().b(wo1.t("sdk:config:extra:client:", str), this.w.z(clientInfo)).b(wo1.t("sdk:config:extra:sdk:", str), this.w.z(unifiedSDKConfig)).a();
        t0();
        return null;
    }

    private /* synthetic */ Void O(String str, k81 k81Var) throws Exception {
        this.v.c().b(wo1.t("sdk:config:extra:middle-config-patcher:", str), this.w.z(k81Var)).a();
        t0();
        return null;
    }

    private /* synthetic */ Void Q(String str, k81 k81Var) throws Exception {
        this.v.c().b(wo1.t("sdk:config:extra:config-patcher:", str), this.w.z(k81Var)).a();
        t0();
        return null;
    }

    private /* synthetic */ Void S(String str) throws Exception {
        x31.a c2 = this.v.c();
        x31.a remove = c2.remove("sdk:config:extra:client:" + str);
        remove.remove("sdk:config:extra:sdk:" + str).a();
        t0();
        return null;
    }

    private /* synthetic */ Void U(SessionConfig sessionConfig, ClientInfo clientInfo) throws Exception {
        this.v.c().b(h, this.w.z(sessionConfig)).b(i, this.w.z(clientInfo)).a();
        return null;
    }

    private /* synthetic */ Void W(boolean z) throws Exception {
        this.v.c().c(c, z ? 1L : 0L).a();
        return null;
    }

    private /* synthetic */ Void Y(String str) throws Exception {
        this.v.c().b(o, str).a();
        return null;
    }

    private /* synthetic */ Void a0(boolean z) throws Exception {
        this.v.c().c(a, z ? 1L : 0L).a();
        return null;
    }

    private /* synthetic */ Void c0(boolean z) throws Exception {
        this.v.c().c(b, z ? 1L : 0L).a();
        return null;
    }

    private /* synthetic */ Void e0(boolean z) throws Exception {
        this.v.c().c(d, z ? 1L : 0L).a();
        return null;
    }

    private /* synthetic */ Void g0(NotificationConfig notificationConfig) throws Exception {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(notificationConfig, 0);
        byte[] marshall = obtain.marshall();
        x31.a c2 = this.v.c();
        c2.b(n, new String(Base64.encode(marshall, 0)));
        c2.a();
        obtain.recycle();
        t0();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String j() throws Exception {
        return this.v.e(o, "");
    }

    private /* synthetic */ Void i0(List list) throws Exception {
        this.v.c().b(m, this.w.z(list)).a();
        t0();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Long l() throws Exception {
        return Long.valueOf(this.v.a(j, 0L));
    }

    private /* synthetic */ Void k0(long j2) throws Exception {
        this.v.c().c(j, j2).a();
        return null;
    }

    private /* synthetic */ Void m(k81 k81Var) throws Exception {
        this.v.c().b(l, this.w.z(k81Var)).a();
        t0();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ k81 p() throws Exception {
        return (k81) this.w.n(this.v.e(l, ""), k81.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Boolean r() throws Exception {
        return Boolean.valueOf(this.v.a(c, 1L) == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Boolean t() throws Exception {
        return Boolean.valueOf(this.v.a(a, 0L) == 1);
    }

    private void t0() {
        h31 h31Var = this.s;
        if (h31Var != null) {
            h31Var.e(new s21());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Boolean v() throws Exception {
        return Boolean.valueOf(this.v.a(b, 1L) == 1);
    }

    @x1
    private static NotificationConfig u0(byte[] bArr) {
        try {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            NotificationConfig notificationConfig = (NotificationConfig) obtain.readParcelable(NotificationConfig.class.getClassLoader());
            obtain.recycle();
            if (notificationConfig != null) {
                return notificationConfig;
            }
        } catch (Throwable unused) {
            tq0 v0 = v0(bArr);
            if (v0 != null) {
                NotificationConfig.Builder channelId = NotificationConfig.newBuilder().channelId(v0.c());
                if (v0.o()) {
                    channelId.disabled();
                }
                Bitmap j2 = v0.j();
                if (j2 != null) {
                    channelId.icon(j2);
                }
                String d2 = v0.d();
                if (d2 != null) {
                    channelId.clickAction(d2);
                }
                tq0.b k2 = v0.k();
                if (k2 != null) {
                    channelId.inIdle(k2.d(), k2.c());
                }
                tq0.b l2 = v0.l();
                if (l2 != null) {
                    channelId.inPause(l2.d(), l2.c());
                }
                tq0.b e2 = v0.e();
                if (e2 != null) {
                    channelId.inCnl(e2.d(), e2.c());
                }
                tq0.b i2 = v0.i();
                if (i2 != null) {
                    channelId.inConnecting(i2.d(), i2.c());
                }
                tq0.b g2 = v0.g();
                if (g2 != null) {
                    channelId.inConnected(g2.d(), g2.c());
                }
                channelId.smallIconId(v0.m());
                return channelId.build();
            }
        }
        return NotificationConfig.newBuilder().build();
    }

    @z1
    private static tq0 v0(byte[] bArr) {
        try {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            tq0 tq0Var = (tq0) obtain.readParcelable(tq0.class.getClassLoader());
            obtain.recycle();
            return tq0Var;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Boolean x() throws Exception {
        return Boolean.valueOf(this.v.a(d, 0L) == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ SessionConfig z() throws Exception {
        return (SessionConfig) this.w.n(this.v.e(h, ""), SessionConfig.class);
    }

    @x1
    public dq0<Void> A0(@x1 final SessionConfig sessionConfig, @x1 final ClientInfo clientInfo) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.b11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.V(sessionConfig, clientInfo);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> B0(final boolean z) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.y01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.X(z);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> C0(@x1 final String str) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.p01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.Z(str);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> D0(final boolean z) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.r01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.b0(z);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> E0(final boolean z) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.w01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.d0(z);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> F0(final boolean z) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.x01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.f0(z);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> G0(@x1 final NotificationConfig notificationConfig) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.o01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.h0(notificationConfig);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> H0(@x1 final List<j51> list) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.d11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.j0(list);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> I0(final long j2) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.k01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.l0(j2);
                return null;
            }
        }, this.t);
    }

    public /* synthetic */ Void N(String str, ClientInfo clientInfo, UnifiedSDKConfig unifiedSDKConfig) {
        M(str, clientInfo, unifiedSDKConfig);
        return null;
    }

    public /* synthetic */ Void P(String str, k81 k81Var) {
        O(str, k81Var);
        return null;
    }

    public /* synthetic */ Void R(String str, k81 k81Var) {
        Q(str, k81Var);
        return null;
    }

    public /* synthetic */ Void T(String str) {
        S(str);
        return null;
    }

    public /* synthetic */ Void V(SessionConfig sessionConfig, ClientInfo clientInfo) {
        U(sessionConfig, clientInfo);
        return null;
    }

    public /* synthetic */ Void X(boolean z) {
        W(z);
        return null;
    }

    public /* synthetic */ Void Z(String str) {
        Y(str);
        return null;
    }

    @x1
    public dq0<String> a() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.h01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.j();
            }
        }, this.t);
    }

    @x1
    public dq0<Long> b() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.u01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.l();
            }
        }, this.t);
    }

    public /* synthetic */ Void b0(boolean z) {
        a0(z);
        return null;
    }

    @x1
    public dq0<Void> c(@x1 final k81<? extends mg1.a> k81Var) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.g01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.n(k81Var);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<k81<? extends mg1.a>> d() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.e11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.p();
            }
        }, this.t);
    }

    public /* synthetic */ Void d0(boolean z) {
        c0(z);
        return null;
    }

    @x1
    public dq0<Boolean> e() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.s01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.r();
            }
        }, this.t);
    }

    @x1
    public dq0<Boolean> f() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.q01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.t();
            }
        }, this.t);
    }

    public /* synthetic */ Void f0(boolean z) {
        e0(z);
        return null;
    }

    @x1
    public dq0<Boolean> g() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.n01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.v();
            }
        }, this.t);
    }

    @x1
    public dq0<Boolean> h() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.l01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.x();
            }
        }, this.t);
    }

    public /* synthetic */ Void h0(NotificationConfig notificationConfig) {
        g0(notificationConfig);
        return null;
    }

    public /* synthetic */ Void j0(List list) {
        i0(list);
        return null;
    }

    public /* synthetic */ Void l0(long j2) {
        k0(j2);
        return null;
    }

    @x1
    public dq0<SessionConfig> m0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.v01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.z();
            }
        }, this.t);
    }

    public /* synthetic */ Void n(k81 k81Var) {
        m(k81Var);
        return null;
    }

    @x1
    public dq0<ClientInfo> n0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.e01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.B();
            }
        }, this.t);
    }

    @x1
    public dq0<List<k81<r31>>> o0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.m01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.D();
            }
        }, this.t);
    }

    @x1
    public dq0<NotificationConfig> p0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.i01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.F();
            }
        }, this.t);
    }

    @x1
    public dq0<List<ClientInfo>> q0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.c11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.H();
            }
        }, this.t);
    }

    @x1
    public dq0<List<k81<? extends s31>>> r0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.f11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.J();
            }
        }, this.t);
    }

    @x1
    public dq0<List<j51>> s0() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.f01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o51.this.L();
            }
        }, this.t);
    }

    @x1
    public dq0<Void> w0(@x1 final String str, @x1 final ClientInfo clientInfo, @x1 final UnifiedSDKConfig unifiedSDKConfig) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.t01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.N(str, clientInfo, unifiedSDKConfig);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> x0(@x1 final String str, @x1 final k81<? extends r31> k81Var) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.z01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.P(str, k81Var);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> y0(@x1 final String str, @x1 final k81<? extends s31> k81Var) {
        kj1.b("ConfigSource").c("registerStartConfigPatchers", new Object[0]);
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.j01
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.R(str, k81Var);
                return null;
            }
        }, this.t);
    }

    @x1
    public dq0<Void> z0(@x1 final String str) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.a11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o51.this.T(str);
                return null;
            }
        }, this.t);
    }
}