package com.p7700g.p99005;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.js2;
import com.p7700g.p99005.ls2;
import com.p7700g.p99005.qr2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes3.dex */
public class or2 implements pr2 {
    private static final String b = "generatefid.lock";
    private static final String c = "CHIME_ANDROID_SDK";
    private static final int d = 0;
    private static final int e = 1;
    private static final long f = 30;
    private static final String h = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String i = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String j = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String k = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private final pn2 l;
    private final is2 m;
    private final es2 n;
    private final xr2 o;
    private final ds2 p;
    private final vr2 q;
    private final Object r;
    private final ExecutorService s;
    private final ExecutorService t;
    @k1("this")
    private String u;
    @k1("FirebaseInstallations.this")
    private Set<yr2> v;
    @k1("lock")
    private final List<wr2> w;
    private static final Object a = new Object();
    private static final ThreadFactory g = new a();

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    public class b implements zr2 {
        public final /* synthetic */ yr2 a;

        public b(yr2 yr2Var) {
            or2.this = r1;
            this.a = yr2Var;
        }

        @Override // com.p7700g.p99005.zr2
        public void a() {
            synchronized (or2.this) {
                or2.this.v.remove(this.a);
            }
        }
    }

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            ls2.b.values();
            int[] iArr = new int[3];
            b = iArr;
            try {
                iArr[ls2.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ls2.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ls2.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            js2.b.values();
            int[] iArr2 = new int[2];
            a = iArr2;
            try {
                iArr2[js2.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[js2.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public or2(pn2 pn2Var, @x1 er2<kv2> er2Var, @x1 er2<xq2> er2Var2) {
        this(new ThreadPoolExecutor(0, 1, (long) f, TimeUnit.SECONDS, new LinkedBlockingQueue(), g), pn2Var, new is2(pn2Var.l(), er2Var, er2Var2), new es2(pn2Var), xr2.c(), new ds2(pn2Var), new vr2());
    }

    public static /* synthetic */ Void B(or2 or2Var) {
        return or2Var.h();
    }

    private void C() {
        Preconditions.checkNotEmpty(m(), i);
        Preconditions.checkNotEmpty(t(), j);
        Preconditions.checkNotEmpty(l(), h);
        Preconditions.checkArgument(xr2.h(m()), i);
        Preconditions.checkArgument(xr2.g(l()), h);
    }

    private String D(fs2 fs2Var) {
        if ((!this.l.p().equals(c) && !this.l.z()) || !fs2Var.m()) {
            return this.q.a();
        }
        String f2 = this.p.f();
        return TextUtils.isEmpty(f2) ? this.q.a() : f2;
    }

    private fs2 E(fs2 fs2Var) throws qr2 {
        js2 d2 = this.m.d(l(), fs2Var.d(), t(), m(), (fs2Var.d() == null || fs2Var.d().length() != 11) ? null : this.p.i());
        int ordinal = d2.e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return fs2Var.q("BAD CONFIG");
            }
            throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
        }
        return fs2Var.s(d2.c(), d2.d(), this.o.b(), d2.b().c(), d2.b().d());
    }

    private void F(Exception exc) {
        synchronized (this.r) {
            Iterator<wr2> it = this.w.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void G(fs2 fs2Var) {
        synchronized (this.r) {
            Iterator<wr2> it = this.w.iterator();
            while (it.hasNext()) {
                if (it.next().b(fs2Var)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void H(String str) {
        this.u = str;
    }

    private synchronized void I(fs2 fs2Var, fs2 fs2Var2) {
        if (this.v.size() != 0 && !fs2Var.d().equals(fs2Var2.d())) {
            for (yr2 yr2Var : this.v) {
                yr2Var.a(fs2Var2.d());
            }
        }
    }

    private Task<tr2> e() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(new rr2(this.o, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(new sr2(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void g(wr2 wr2Var) {
        synchronized (this.r) {
            this.w.add(wr2Var);
        }
    }

    public Void h() throws qr2 {
        H(null);
        fs2 q = q();
        if (q.k()) {
            this.m.e(l(), q.d(), t(), q.f());
        }
        u(q.r());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(boolean z) {
        fs2 E;
        fs2 q = q();
        try {
            if (!q.i() && !q.l()) {
                if (!z && !this.o.f(q)) {
                    return;
                }
                E = k(q);
                u(E);
                I(q, E);
                if (E.k()) {
                    H(E.d());
                }
                if (!E.i()) {
                    F(new qr2(qr2.a.BAD_CONFIG));
                    return;
                } else if (E.j()) {
                    F(new IOException(k));
                    return;
                } else {
                    G(E);
                    return;
                }
            }
            E = E(q);
            u(E);
            I(q, E);
            if (E.k()) {
            }
            if (!E.i()) {
            }
        } catch (qr2 e2) {
            F(e2);
        }
    }

    /* renamed from: j */
    public final void A(final boolean z) {
        fs2 s = s();
        if (z) {
            s = s.p();
        }
        G(s);
        this.t.execute(new Runnable() { // from class: com.p7700g.p99005.fr2
            @Override // java.lang.Runnable
            public final void run() {
                or2.this.w(z);
            }
        });
    }

    private fs2 k(@x1 fs2 fs2Var) throws qr2 {
        ls2 f2 = this.m.f(l(), fs2Var.d(), t(), fs2Var.f());
        int ordinal = f2.b().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    H(null);
                    return fs2Var.r();
                }
                throw new qr2("Firebase Installations Service is unavailable. Please try again later.", qr2.a.UNAVAILABLE);
            }
            return fs2Var.q("BAD CONFIG");
        }
        return fs2Var.o(f2.c(), f2.d(), this.o.b());
    }

    private synchronized String n() {
        return this.u;
    }

    @x1
    public static or2 o() {
        return p(pn2.n());
    }

    @x1
    public static or2 p(@x1 pn2 pn2Var) {
        Preconditions.checkArgument(pn2Var != null, "Null is not a valid value of FirebaseApp.");
        return (or2) pn2Var.j(pr2.class);
    }

    private fs2 q() {
        fs2 d2;
        synchronized (a) {
            nr2 a2 = nr2.a(this.l.l(), b);
            d2 = this.n.d();
            if (a2 != null) {
                a2.b();
            }
        }
        return d2;
    }

    private fs2 s() {
        fs2 d2;
        synchronized (a) {
            nr2 a2 = nr2.a(this.l.l(), b);
            d2 = this.n.d();
            if (d2.j()) {
                d2 = this.n.b(d2.t(D(d2)));
            }
            if (a2 != null) {
                a2.b();
            }
        }
        return d2;
    }

    private void u(fs2 fs2Var) {
        synchronized (a) {
            nr2 a2 = nr2.a(this.l.l(), b);
            this.n.b(fs2Var);
            if (a2 != null) {
                a2.b();
            }
        }
    }

    private /* synthetic */ void x() {
        A(false);
    }

    @Override // com.p7700g.p99005.pr2
    @x1
    public synchronized zr2 a(@x1 yr2 yr2Var) {
        this.v.add(yr2Var);
        return new b(yr2Var);
    }

    @Override // com.p7700g.p99005.pr2
    @x1
    public Task<tr2> b(final boolean z) {
        C();
        Task<tr2> e2 = e();
        this.s.execute(new Runnable() { // from class: com.p7700g.p99005.hr2
            @Override // java.lang.Runnable
            public final void run() {
                or2.this.A(z);
            }
        });
        return e2;
    }

    @Override // com.p7700g.p99005.pr2
    @x1
    public Task<Void> c() {
        return Tasks.call(this.s, new Callable() { // from class: com.p7700g.p99005.ir2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return or2.B(or2.this);
            }
        });
    }

    @Override // com.p7700g.p99005.pr2
    @x1
    public Task<String> getId() {
        C();
        String n = n();
        if (n != null) {
            return Tasks.forResult(n);
        }
        Task<String> f2 = f();
        this.s.execute(new Runnable() { // from class: com.p7700g.p99005.gr2
            @Override // java.lang.Runnable
            public final void run() {
                or2.this.y();
            }
        });
        return f2;
    }

    @z1
    public String l() {
        return this.l.q().i();
    }

    @r2
    public String m() {
        return this.l.q().j();
    }

    @r2
    public String r() {
        return this.l.p();
    }

    @z1
    public String t() {
        return this.l.q().n();
    }

    public /* synthetic */ void y() {
        A(false);
    }

    public or2(ExecutorService executorService, pn2 pn2Var, is2 is2Var, es2 es2Var, xr2 xr2Var, ds2 ds2Var, vr2 vr2Var) {
        this.r = new Object();
        this.v = new HashSet();
        this.w = new ArrayList();
        this.l = pn2Var;
        this.m = is2Var;
        this.n = es2Var;
        this.o = xr2Var;
        this.p = ds2Var;
        this.q = vr2Var;
        this.s = executorService;
        this.t = new ThreadPoolExecutor(0, 1, (long) f, TimeUnit.SECONDS, new LinkedBlockingQueue(), g);
    }
}