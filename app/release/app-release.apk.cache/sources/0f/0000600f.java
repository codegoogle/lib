package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.VpnService;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.anchorfree.vpnsdk.vpnservice.config.VpnConfigProvider;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.p7700g.p99005.om1;
import com.p7700g.p99005.pm1;
import com.p7700g.p99005.qm1;
import com.p7700g.p99005.rm1;
import com.p7700g.p99005.sm1;
import com.p7700g.p99005.ui1;
import com.p7700g.p99005.xu0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: RemoteVpn.java */
/* loaded from: classes2.dex */
public class ui1 {
    @x1
    private final Context b;
    @x1
    private final Executor o;
    @x1
    private final Executor p;
    @x1
    private final kj1 a = kj1.b("RemoteVpn");
    @x1
    private final Handler c = new Handler(Looper.getMainLooper());
    @x1
    private final qm1 d = new k(this, null);
    @x1
    private final sm1 e = new m(this, null);
    @x1
    private final pm1 f = new j(this, null);
    @x1
    private final List<db1> g = new CopyOnWriteArrayList();
    @x1
    private final List<ab1> h = new CopyOnWriteArrayList();
    @x1
    private final List<yd1> i = new CopyOnWriteArrayList();
    @x1
    private final List<bb1<? extends Parcelable>> j = new CopyOnWriteArrayList();
    @x1
    private final l k = new l(this, null);
    @x1
    private final td1 l = new a();
    private volatile boolean n = false;
    @x1
    private vi1 m = vi1.i().c(new xa1() { // from class: com.p7700g.p99005.li1
        @Override // com.p7700g.p99005.xa1
        public final void accept(Object obj) {
            ui1.H0(ui1.this, (tm1) obj);
        }
    }).d(new xa1() { // from class: com.p7700g.p99005.ih1
        @Override // com.p7700g.p99005.xa1
        public final void accept(Object obj) {
            ui1.T(ui1.this, (tm1) obj);
        }
    }).e();

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class a implements td1 {
        public a() {
            ui1.this = r1;
        }

        @Override // com.p7700g.p99005.td1
        public boolean k(@x1 ParcelFileDescriptor parcelFileDescriptor) {
            try {
                return ui1.this.t(parcelFileDescriptor);
            } catch (RemoteException e) {
                ui1.this.a.f(e);
                return false;
            }
        }

        @Override // com.p7700g.p99005.td1
        public boolean l(int i) {
            try {
                return k(ParcelFileDescriptor.fromFd(i));
            } catch (IOException e) {
                ui1.this.a.f(e);
                return false;
            }
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class b implements va1 {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ co1 d;
        public final /* synthetic */ Bundle e;
        public final /* synthetic */ va1 f;

        public b(String str, String str2, co1 co1Var, Bundle bundle, va1 va1Var) {
            ui1.this = r1;
            this.b = str;
            this.c = str2;
            this.d = co1Var;
            this.e = bundle;
            this.f = va1Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            this.f.a(gc1Var);
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            ui1.this.o1(this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class c extends om1.b {
        public final /* synthetic */ IBinder v;
        public final /* synthetic */ IBinder.DeathRecipient w;
        public final /* synthetic */ eq0 x;

        public c(IBinder iBinder, IBinder.DeathRecipient deathRecipient, eq0 eq0Var) {
            ui1.this = r1;
            this.v = iBinder;
            this.w = deathRecipient;
            this.x = eq0Var;
        }

        @Override // com.p7700g.p99005.om1
        public void onComplete() {
            ui1.this.j1(this.v, this.w);
            this.x.d(null);
        }

        @Override // com.p7700g.p99005.om1
        public void r1(@x1 nm1 nm1Var) {
            ui1.this.j1(this.v, this.w);
            this.x.c(nm1Var.c());
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class d extends om1.b {
        public final /* synthetic */ IBinder v;
        public final /* synthetic */ IBinder.DeathRecipient w;
        public final /* synthetic */ eq0 x;

        public d(IBinder iBinder, IBinder.DeathRecipient deathRecipient, eq0 eq0Var) {
            ui1.this = r1;
            this.v = iBinder;
            this.w = deathRecipient;
            this.x = eq0Var;
        }

        @Override // com.p7700g.p99005.om1
        public void onComplete() {
            ui1.this.a.c("controlService.notifyStopped complete", new Object[0]);
            ui1.this.j1(this.v, this.w);
            this.x.d(null);
        }

        @Override // com.p7700g.p99005.om1
        public void r1(nm1 nm1Var) {
            ui1.this.a.c("controlService.notifyStopped error", new Object[0]);
            ui1.this.j1(this.v, this.w);
            this.x.c(nm1Var.c());
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class e implements ua1<en1> {
        public final /* synthetic */ va1 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Bundle e;

        public e(va1 va1Var, String str, String str2, Bundle bundle) {
            ui1.this = r1;
            this.b = va1Var;
            this.c = str;
            this.d = str2;
            this.e = bundle;
        }

        private /* synthetic */ dq0 c(String str, String str2, Bundle bundle, dq0 dq0Var) throws Exception {
            return ui1.this.x(str, str2, bundle, dq0Var);
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 gc1Var) {
            this.b.a(gc1Var);
        }

        public /* synthetic */ dq0 d(String str, String str2, Bundle bundle, dq0 dq0Var) {
            return ui1.this.x(str, str2, bundle, dq0Var);
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: e */
        public void b(@x1 en1 en1Var) {
            if (en1Var == en1.CONNECTED) {
                dq0 s = ui1.this.s();
                final String str = this.c;
                final String str2 = this.d;
                final Bundle bundle = this.e;
                s.P(new aq0() { // from class: com.p7700g.p99005.jh1
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        return ui1.e.this.d(str, str2, bundle, dq0Var);
                    }
                }).s(dj1.b(this.b), ui1.this.o);
                return;
            }
            this.b.a(new lc1("Wrong state to call update"));
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class f extends om1.b {
        public final /* synthetic */ eq0 v;

        public f(eq0 eq0Var) {
            ui1.this = r1;
            this.v = eq0Var;
        }

        @Override // com.p7700g.p99005.om1
        public void onComplete() {
            this.v.d(null);
        }

        @Override // com.p7700g.p99005.om1
        public void r1(@x1 nm1 nm1Var) {
            this.v.c(nm1Var.c());
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            h.a.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[h.a.UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.a.BINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public static class h {
        @x1
        private Context a;
        @x1
        private Executor b = dq0.a;
        @x1
        private Executor c = dq0.c;
        private boolean d = true;

        /* compiled from: RemoteVpn.java */
        /* loaded from: classes2.dex */
        public enum a {
            UI,
            BINDER,
            BACKGROUND
        }

        public h(@x1 Context context) {
            this.a = context;
        }

        @x1
        public h a(boolean z) {
            this.d = z;
            return this;
        }

        @x1
        public ui1 b() {
            return new ui1(this.a, this.b, this.c, this.d);
        }

        @x1
        public h c(@x1 a aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                this.c = dq0.c;
            } else if (ordinal == 1) {
                this.c = new fj1();
            } else if (ordinal == 2) {
                this.c = Executors.newSingleThreadExecutor();
            }
            return this;
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public static class i extends om1.b {
        @x1
        private final va1 v;

        public i(@x1 va1 va1Var) {
            this.v = va1Var;
        }

        @Override // com.p7700g.p99005.om1
        public void onComplete() {
            this.v.complete();
        }

        @Override // com.p7700g.p99005.om1
        public void r1(@x1 nm1 nm1Var) {
            this.v.a(nm1Var.c());
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class j extends pm1.b {
        private j() {
            ui1.this = r1;
        }

        @Override // com.p7700g.p99005.pm1
        public void f(@x1 String str) {
            ui1.this.S0(str);
        }

        public /* synthetic */ j(ui1 ui1Var, a aVar) {
            this();
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class k extends qm1.b {
        private k() {
            ui1.this = r1;
        }

        @Override // com.p7700g.p99005.qm1
        public void a(long j, long j2) {
            ui1.this.V0(j, j2);
        }

        public /* synthetic */ k(ui1 ui1Var, a aVar) {
            this();
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class l extends rm1.b {
        private l() {
            ui1.this = r1;
        }

        @Override // com.p7700g.p99005.rm1
        public void J1(@x1 Bundle bundle) {
            bundle.setClassLoader(ui1.this.b.getClassLoader());
            ui1.this.W0((Parcelable) r81.g(bundle.getParcelable("arg"), "arg is null"));
        }

        public /* synthetic */ l(ui1 ui1Var, a aVar) {
            this();
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class m extends sm1.b {
        private m() {
            ui1.this = r1;
        }

        @Override // com.p7700g.p99005.sm1
        public void X(@x1 nm1 nm1Var) {
            ui1.this.U0(nm1Var.c());
        }

        @Override // com.p7700g.p99005.sm1
        public void m(@x1 en1 en1Var) {
            ui1.this.T0(en1Var);
        }

        public /* synthetic */ m(ui1 ui1Var, a aVar) {
            this();
        }
    }

    /* compiled from: RemoteVpn.java */
    /* loaded from: classes2.dex */
    public class n extends BroadcastReceiver {
        private n() {
            ui1.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ui1.this.a.c("Received always on intent. Starting", new Object[0]);
            try {
                ui1.this.r();
            } catch (Throwable th) {
                ui1.this.a.f(th);
            }
        }

        public /* synthetic */ n(ui1 ui1Var, a aVar) {
            this();
        }
    }

    public ui1(@x1 Context context, @x1 Executor executor, @x1 Executor executor2, boolean z) {
        this.b = context;
        this.o = executor2;
        this.p = executor;
        n nVar = new n(this, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AFVpnService.Z(context));
        context.registerReceiver(nVar, intentFilter);
        if (z) {
            s();
        }
    }

    private /* synthetic */ void B0(tm1 tm1Var) throws Exception {
        tm1Var.i1(this.k);
    }

    public static /* synthetic */ dq0 D0(va1 va1Var, dq0 dq0Var) throws Exception {
        ((tm1) u1(dq0Var)).b1(new i(va1Var));
        return null;
    }

    private /* synthetic */ Object F0(va1 va1Var, String str, String str2, co1 co1Var, Bundle bundle, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            va1Var.a(gc1.cast(dq0Var.E()));
            return null;
        }
        T0(en1.CONNECTING_VPN);
        this.n = true;
        w(str, new b(str2, str, co1Var, bundle, va1Var));
        return null;
    }

    public static /* synthetic */ void H0(ui1 ui1Var, tm1 tm1Var) {
        ui1Var.X0(tm1Var);
    }

    /* renamed from: I0 */
    public /* synthetic */ void J0(gc1 gc1Var) {
        for (db1 db1Var : this.g) {
            db1Var.n(gc1Var);
        }
    }

    public static /* synthetic */ Object K0(String str, String str2, dq0 dq0Var) throws Exception {
        ((tm1) r81.f((tm1) dq0Var.F())).P0(str, str2);
        return null;
    }

    /* renamed from: O */
    public void q0(@x1 gc1 gc1Var) {
        this.n = false;
        k1(gc1Var);
    }

    /* renamed from: P0 */
    public /* synthetic */ void Q0(eq0 eq0Var) {
        this.a.c("Connection with VpnControlService was lost.", new Object[0]);
        eq0Var.c(new pb1("Connection with VpnControlService was lost."));
    }

    public static boolean R(@x1 Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, AFVpnService.class)) != 2;
    }

    public static /* synthetic */ Object R0(int i2, Bundle bundle, dq0 dq0Var) throws Exception {
        ((tm1) r81.f((tm1) dq0Var.F())).T0(i2, bundle);
        return null;
    }

    public void S0(@x1 final String str) {
        this.o.execute(new Runnable() { // from class: com.p7700g.p99005.mi1
            @Override // java.lang.Runnable
            public final void run() {
                ui1.this.m0(str);
            }
        });
    }

    public static /* synthetic */ void T(ui1 ui1Var, tm1 tm1Var) {
        ui1Var.Y0(tm1Var);
    }

    public void T0(@x1 final en1 en1Var) {
        this.a.c("Change state to %s", en1Var.name());
        if (en1Var == en1.CONNECTED) {
            this.n = false;
        }
        if (this.n) {
            return;
        }
        this.o.execute(new Runnable() { // from class: com.p7700g.p99005.yh1
            @Override // java.lang.Runnable
            public final void run() {
                ui1.this.o0(en1Var);
            }
        });
    }

    public void U0(@x1 final Exception exc) {
        this.o.execute(new Runnable() { // from class: com.p7700g.p99005.mh1
            @Override // java.lang.Runnable
            public final void run() {
                ui1.this.q0(exc);
            }
        });
    }

    public void V0(final long j2, final long j3) {
        this.o.execute(new Runnable() { // from class: com.p7700g.p99005.pi1
            @Override // java.lang.Runnable
            public final void run() {
                ui1.this.s0(j2, j3);
            }
        });
    }

    /* renamed from: W */
    public /* synthetic */ void X(eq0 eq0Var) {
        this.a.c("Connection with VpnControlService was lost.", new Object[0]);
        eq0Var.c(new pb1("Connection with VpnControlService was lost."));
    }

    public <T extends Parcelable> void W0(@x1 final T t) {
        this.c.post(new Runnable() { // from class: com.p7700g.p99005.vh1
            @Override // java.lang.Runnable
            public final void run() {
                ui1.this.u0(t);
            }
        });
    }

    public void X0(@x1 tm1 tm1Var) throws RemoteException {
        tm1Var.n0(this.e);
        tm1Var.r0(this.f);
        tm1Var.d1(this.d);
        tm1Var.H(this.k);
        T0(tm1Var.getState());
    }

    public void Y0(@x1 final tm1 tm1Var) {
        this.n = false;
        u(new ta1() { // from class: com.p7700g.p99005.ci1
            @Override // com.p7700g.p99005.ta1
            public final void run() {
                ui1.this.w0(tm1Var);
            }
        });
        u(new ta1() { // from class: com.p7700g.p99005.xh1
            @Override // com.p7700g.p99005.ta1
            public final void run() {
                ui1.this.y0(tm1Var);
            }
        });
        u(new ta1() { // from class: com.p7700g.p99005.fi1
            @Override // com.p7700g.p99005.ta1
            public final void run() {
                ui1.this.A0(tm1Var);
            }
        });
        u(new ta1() { // from class: com.p7700g.p99005.ph1
            @Override // com.p7700g.p99005.ta1
            public final void run() {
                ui1.this.C0(tm1Var);
            }
        });
        T0(en1.IDLE);
    }

    @z1
    /* renamed from: a1 */
    public Void O0(@x1 dq0<Void> dq0Var, @z1 va1 va1Var) {
        if (dq0Var.J()) {
            if (va1Var != null) {
                va1Var.a(gc1.cast(dq0Var.E()));
                return null;
            }
            return null;
        } else if (dq0Var.H()) {
            if (va1Var != null) {
                va1Var.a(gc1.vpnConnectCanceled());
                return null;
            }
            return null;
        } else if (va1Var != null) {
            va1Var.complete();
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ lm1 c0(tm1 tm1Var) throws Exception {
        return (lm1) r81.g(tm1Var.o(), "Connection status is null");
    }

    public void j1(@x1 IBinder iBinder, @x1 IBinder.DeathRecipient deathRecipient) {
        try {
            iBinder.unlinkToDeath(deathRecipient, 0);
        } catch (Throwable th) {
            this.a.f(th);
        }
    }

    private void k1(@x1 final gc1 gc1Var) {
        this.o.execute(new Runnable() { // from class: com.p7700g.p99005.bi1
            @Override // java.lang.Runnable
            public final void run() {
                ui1.this.J0(gc1Var);
            }
        });
    }

    /* renamed from: l0 */
    public /* synthetic */ void m0(String str) {
        for (yd1 yd1Var : this.i) {
            yd1Var.f(str);
        }
    }

    public static void l1(@x1 Context context, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, AFVpnService.class), !z ? 2 : 1, 1);
    }

    /* renamed from: n0 */
    public /* synthetic */ void o0(en1 en1Var) {
        for (db1 db1Var : this.g) {
            db1Var.m(en1Var);
        }
    }

    @x1
    /* renamed from: q1 */
    public dq0<Void> Z(@x1 @xu0.d String str, @x1 dq0<tm1> dq0Var) {
        this.a.c("remoteVpn stopVpn", new Object[0]);
        final eq0 eq0Var = new eq0();
        IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.p7700g.p99005.kh1
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                ui1.this.Q0(eq0Var);
            }
        };
        tm1 tm1Var = (tm1) u1(dq0Var);
        IBinder asBinder = tm1Var.asBinder();
        try {
            tm1Var.e1(str, new d(asBinder, deathRecipient, eq0Var));
        } catch (RemoteException e2) {
            j1(asBinder, deathRecipient);
            eq0Var.c(e2);
        }
        return eq0Var.a();
    }

    public void r() {
        s().N(hi1.a, this.p);
    }

    /* renamed from: r0 */
    public /* synthetic */ void s0(long j2, long j3) {
        for (ab1 ab1Var : this.h) {
            ab1Var.a(j2, j3);
        }
    }

    @x1
    public dq0<tm1> s() {
        return this.m.f(this.b);
    }

    /* renamed from: t0 */
    public /* synthetic */ void u0(Parcelable parcelable) {
        for (bb1<? extends Parcelable> bb1Var : this.j) {
            if (bb1Var.a().isInstance(parcelable)) {
                bb1Var.b(parcelable);
            }
        }
    }

    private void u(@x1 ta1 ta1Var) {
        try {
            ta1Var.run();
        } catch (Exception e2) {
            this.a.f(e2);
        }
    }

    @x1
    private static <T> T u1(dq0<T> dq0Var) {
        return (T) r81.g(dq0Var.F(), "task must have not null result");
    }

    @x1
    /* renamed from: v */
    public dq0<Void> M0(@x1 dq0<tm1> dq0Var, @x1 String str, @x1 @xu0.d String str2, @x1 co1 co1Var, @x1 Bundle bundle) {
        tm1 tm1Var = (tm1) u1(dq0Var);
        final eq0 eq0Var = new eq0();
        try {
            if (((tm1) u1(dq0Var)).getState() == en1.CONNECTED) {
                eq0Var.c(new lc1("Wrong state to call start"));
                return eq0Var.a();
            }
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.p7700g.p99005.uh1
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    ui1.this.X(eq0Var);
                }
            };
            IBinder asBinder = tm1Var.asBinder();
            try {
                this.a.c("Call remote service to start", new Object[0]);
                asBinder.linkToDeath(deathRecipient, 0);
                tm1Var.C0(str, str2, co1Var, bundle, new c(asBinder, deathRecipient, eq0Var));
            } catch (RemoteException e2) {
                j1(asBinder, deathRecipient);
                eq0Var.c(e2);
            }
            return eq0Var.a();
        } catch (RemoteException e3) {
            eq0Var.c(e3);
            return eq0Var.a();
        }
    }

    private /* synthetic */ void v0(tm1 tm1Var) throws Exception {
        tm1Var.l1(this.d);
    }

    private void w(@x1 @xu0.d final String str, @x1 va1 va1Var) {
        s().R(new aq0() { // from class: com.p7700g.p99005.oh1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return ui1.this.Z(str, dq0Var);
            }
        }, this.p).s(dj1.b(va1Var), this.o);
    }

    @x1
    public dq0<Void> x(@x1 String str, @x1 @xu0.d String str2, @x1 Bundle bundle, @x1 dq0<tm1> dq0Var) throws RemoteException {
        eq0 eq0Var = new eq0();
        ((tm1) u1(dq0Var)).B0(str, str2, bundle, new f(eq0Var));
        return eq0Var.a();
    }

    private /* synthetic */ void x0(tm1 tm1Var) throws Exception {
        tm1Var.B1(this.e);
    }

    private /* synthetic */ void z0(tm1 tm1Var) throws Exception {
        tm1Var.M(this.f);
    }

    public void A(@x1 ua1<ti1> ua1Var) {
        s().N(oi1.a, this.p).s(dj1.a(ua1Var), this.o);
    }

    public /* synthetic */ void A0(tm1 tm1Var) {
        tm1Var.M(this.f);
    }

    @x1
    @Deprecated
    public lm1 B() {
        return (lm1) this.m.h(lm1.g(), ri1.a);
    }

    public void C(@x1 ua1<lm1> ua1Var) {
        s().N(ei1.a, this.p).s(dj1.a(ua1Var), this.o);
    }

    public /* synthetic */ void C0(tm1 tm1Var) {
        tm1Var.i1(this.k);
    }

    public void D(@x1 ua1<fo1> ua1Var) {
        s().N(ki1.a, this.p).s(dj1.c(ua1Var), this.o);
    }

    public void E(@x1 ua1<String> ua1Var) {
        s().L(lh1.a).s(dj1.a(ua1Var), this.o);
    }

    public int F(@x1 final String str) {
        return ((Integer) this.m.h(0, new za1() { // from class: com.p7700g.p99005.ji1
            @Override // com.p7700g.p99005.za1
            public final Object apply(Object obj) {
                return Integer.valueOf(((tm1) obj).s1(str));
            }
        })).intValue();
    }

    public int G() {
        return ((Integer) this.m.h(0, rh1.a)).intValue();
    }

    public /* synthetic */ Object G0(va1 va1Var, String str, String str2, co1 co1Var, Bundle bundle, dq0 dq0Var) {
        F0(va1Var, str, str2, co1Var, bundle, dq0Var);
        return null;
    }

    @Deprecated
    public long H() {
        return ((Long) this.m.h(0L, si1.a)).longValue();
    }

    public void I(@x1 ua1<Long> ua1Var) {
        s().N(th1.a, this.p).s(dj1.a(ua1Var), this.o);
    }

    @x1
    @Deprecated
    public en1 J() {
        return (en1) this.m.h(en1.UNKNOWN, fh1.a);
    }

    public void K(@x1 ua1<en1> ua1Var) {
        if (this.n) {
            ua1Var.b(en1.CONNECTING_VPN);
        } else {
            s().N(gi1.a, this.p).s(dj1.a(ua1Var), this.o);
        }
    }

    @x1
    @Deprecated
    public bn1 L() {
        return (bn1) this.m.h(new bn1(0L, 0L), qi1.a);
    }

    public void M(@x1 ua1<bn1> ua1Var) {
        s().N(ai1.a, this.p).s(dj1.a(ua1Var), this.o);
    }

    @x1
    public td1 N() {
        return this.l;
    }

    public boolean P() {
        return VpnService.prepare(this.b) == null;
    }

    @Deprecated
    public boolean Q() {
        return J() == en1.IDLE;
    }

    @Deprecated
    public boolean S() {
        return J() == en1.CONNECTED;
    }

    public void Z0(@x1 String str, @x1 Bundle bundle) {
        CredentialsContentProvider.f().preloadCredentials(str, bundle);
    }

    public void a(@x1 va1 va1Var) {
        s().N(hh1.a, this.p).s(dj1.b(va1Var), this.o);
    }

    public void b1(@x1 yd1 yd1Var) {
        this.i.remove(yd1Var);
    }

    public void c1(@x1 ab1 ab1Var) {
        this.h.remove(ab1Var);
    }

    public void d1(@x1 cb1<? extends Parcelable> cb1Var) {
        this.j.remove(cb1Var);
    }

    public void e1(@x1 db1 db1Var) {
        this.g.remove(db1Var);
    }

    public void f1(@x1 final va1 va1Var) {
        s().P(new aq0() { // from class: com.p7700g.p99005.ni1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                ui1.D0(va1.this, dq0Var);
                return null;
            }
        });
    }

    public void g1() {
        this.g.clear();
        this.h.clear();
    }

    public void h1() {
        this.m.g(zh1.a);
    }

    public void i1(@x1 final String str, @x1 @xu0.d final String str2, @x1 final co1 co1Var, @x1 final Bundle bundle, @x1 final va1 va1Var) {
        s().s(new aq0() { // from class: com.p7700g.p99005.wh1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                ui1.this.G0(va1Var, str2, str, co1Var, bundle, dq0Var);
                return null;
            }
        }, this.o);
    }

    public void m1(@x1 final String str, @x1 final String str2, @x1 va1 va1Var) {
        s().N(new aq0() { // from class: com.p7700g.p99005.ii1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                ui1.K0(str, str2, dq0Var);
                return null;
            }
        }, this.p).s(dj1.b(va1Var), this.o);
    }

    public void n(@x1 yd1 yd1Var) {
        this.i.add(yd1Var);
    }

    public void n1(@x1 String str, @x1 @xu0.d String str2, @x1 Bundle bundle, @x1 va1 va1Var) {
        o1(str, str2, co1.c(), bundle, va1Var);
    }

    public void o(@x1 ab1 ab1Var) {
        this.h.add(ab1Var);
    }

    public void o1(@x1 final String str, @x1 @xu0.d final String str2, @x1 final co1 co1Var, @x1 final Bundle bundle, @x1 final va1 va1Var) {
        this.a.c("Start vpn and check bound", new Object[0]);
        s().R(new aq0() { // from class: com.p7700g.p99005.nh1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return ui1.this.M0(str, str2, co1Var, bundle, dq0Var);
            }
        }, this.p).s(new aq0() { // from class: com.p7700g.p99005.qh1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return ui1.this.O0(va1Var, dq0Var);
            }
        }, this.o);
    }

    public void p(@x1 bb1<? extends Parcelable> bb1Var) {
        this.j.add(bb1Var);
    }

    public void p1(@x1 @xu0.d String str, @x1 va1 va1Var) {
        this.n = false;
        w(str, va1Var);
    }

    public void q(@x1 db1 db1Var) {
        this.g.add(db1Var);
    }

    public void r1(final int i2, @x1 final Bundle bundle, @x1 va1 va1Var) {
        s().N(new aq0() { // from class: com.p7700g.p99005.sh1
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                ui1.R0(i2, bundle, dq0Var);
                return null;
            }
        }, this.p).s(dj1.b(va1Var), this.o);
    }

    public void s1(@x1 String str, @x1 @xu0.d String str2, @x1 Bundle bundle, @x1 va1 va1Var) {
        K(new e(va1Var, str, str2, bundle));
    }

    public boolean t(@x1 ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        dq0<tm1> s = s();
        try {
            s.Y();
            return ((tm1) u1(s)).k(parcelFileDescriptor);
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void t1(@x1 zn1 zn1Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(VpnConfigProvider.u, zn1Var);
        this.b.getContentResolver().call(VpnConfigProvider.c(this.b), VpnConfigProvider.x, (String) null, bundle);
    }

    public /* synthetic */ void w0(tm1 tm1Var) {
        tm1Var.l1(this.d);
    }

    public void y(@x1 va1 va1Var) {
        s().N(gh1.a, this.p).s(dj1.b(va1Var), this.o);
    }

    public /* synthetic */ void y0(tm1 tm1Var) {
        tm1Var.B1(this.e);
    }

    @x1
    @Deprecated
    public ti1 z() {
        return ((lm1) this.m.h(lm1.g(), di1.a)).j();
    }
}