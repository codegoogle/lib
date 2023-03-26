package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.anchorfree.vpnsdk.vpnservice.AFVpnService;
import com.p7700g.p99005.tm1;
import com.p7700g.p99005.xu0;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: IVpnControlServiceImpl.java */
/* loaded from: classes2.dex */
public class um1 extends tm1.b {
    @x1
    private final AFVpnService V;
    @x1
    private final ExecutorService W;
    @x1
    private final kj1 X;

    /* compiled from: IVpnControlServiceImpl.java */
    /* loaded from: classes2.dex */
    public class a implements va1 {
        public final /* synthetic */ om1 b;

        public a(om1 om1Var) {
            this.b = om1Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            try {
                this.b.r1(new nm1(gc1Var));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            try {
                this.b.onComplete();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: IVpnControlServiceImpl.java */
    /* loaded from: classes2.dex */
    public class b implements va1 {
        public final /* synthetic */ om1 b;

        public b(om1 om1Var) {
            this.b = om1Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            try {
                this.b.r1(new nm1(gc1Var));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            try {
                this.b.onComplete();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public um1(@x1 AFVpnService aFVpnService, @x1 ExecutorService executorService, @x1 kj1 kj1Var) {
        this.V = aFVpnService;
        this.W = executorService;
        this.X = kj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void B2(String str, String str2, co1 co1Var, Bundle bundle, va1 va1Var, om1 om1Var) {
        RuntimeException runtimeException;
        try {
            this.V.T(str, str2, false, co1Var, bundle, va1Var);
        } finally {
            try {
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void D2(String str, va1 va1Var, om1 om1Var) {
        RuntimeException runtimeException;
        try {
            this.V.W(str, va1Var, gc1.fromReason(str));
        } finally {
            try {
            } catch (RemoteException unused) {
            }
        }
    }

    private /* synthetic */ void E2(oe1 oe1Var) {
        this.V.X(oe1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void H2(String str, String str2, Bundle bundle, om1 om1Var) {
        RuntimeException runtimeException;
        try {
            this.V.Y(str, str2, bundle, om1Var);
        } finally {
            try {
            } catch (RemoteException unused) {
            }
        }
    }

    @x1
    private <T> T I2(@x1 Future<T> future) throws RemoteException {
        return (T) r81.f(J2(future));
    }

    @z1
    private <T> T J2(@x1 Future<T> future) throws RemoteException {
        try {
            return future.get();
        } catch (InterruptedException unused) {
            throw new RemoteException("Execution was interrupted on the server side");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            this.X.f(cause);
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RemoteException(e.getClass().getName() + "[" + e.getMessage() + "]\nStackTrace:\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ Boolean R1(ParcelFileDescriptor parcelFileDescriptor) throws Exception {
        boolean protect = this.V.protect(parcelFileDescriptor.getFd());
        parcelFileDescriptor.close();
        return Boolean.valueOf(protect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ lm1 T1() throws Exception {
        return this.V.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ fo1 V1() throws Exception {
        return this.V.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ String X1() throws Exception {
        return this.V.r();
    }

    private /* synthetic */ Integer Y1(String str) throws Exception {
        return Integer.valueOf(this.V.s(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ Integer b2() throws Exception {
        return Integer.valueOf(this.V.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ Long d2() throws Exception {
        return Long.valueOf(this.V.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ en1 f2() throws Exception {
        return this.V.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ bn1 h2() throws Exception {
        return this.V.w();
    }

    private /* synthetic */ void i2(pm1 pm1Var) {
        this.V.G(pm1Var);
    }

    private /* synthetic */ void k2(qm1 qm1Var) {
        this.V.H(qm1Var);
    }

    private /* synthetic */ void m2(rm1 rm1Var) {
        this.V.I(rm1Var);
    }

    private /* synthetic */ void o2(sm1 sm1Var) {
        this.V.J(sm1Var);
    }

    private /* synthetic */ void q2(pm1 pm1Var) {
        this.V.N(pm1Var);
    }

    private /* synthetic */ void s2(qm1 qm1Var) {
        this.V.O(qm1Var);
    }

    private /* synthetic */ void u2(rm1 rm1Var) {
        this.V.P(rm1Var);
    }

    private /* synthetic */ void w2(sm1 sm1Var) {
        this.V.Q(sm1Var);
    }

    private /* synthetic */ void y2(om1 om1Var) {
        this.V.R(om1Var);
    }

    @Override // com.p7700g.p99005.tm1
    public void B0(@x1 final String str, @x1 final String str2, @x1 final Bundle bundle, @x1 final om1 om1Var) {
        this.W.execute(new Runnable() { // from class: com.p7700g.p99005.gk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.H2(str, str2, bundle, om1Var);
            }
        });
    }

    @Override // com.p7700g.p99005.tm1
    public void B1(@x1 final sm1 sm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.ck1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.x2(sm1Var);
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void C0(@x1 final String str, @x1 final String str2, @x1 final co1 co1Var, @x1 final Bundle bundle, @x1 final om1 om1Var) {
        final a aVar = new a(om1Var);
        this.W.execute(new Runnable() { // from class: com.p7700g.p99005.nk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.B2(str, str2, co1Var, bundle, aVar, om1Var);
            }
        });
    }

    public /* synthetic */ void F2(oe1 oe1Var) {
        this.V.X(oe1Var);
    }

    @Override // com.p7700g.p99005.tm1
    @z1
    public String G0() throws RemoteException {
        return (String) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.bk1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.X1();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void H(@x1 final rm1 rm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.mk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.n2(rm1Var);
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void L() throws RemoteException {
        ExecutorService executorService = this.W;
        final AFVpnService aFVpnService = this.V;
        Objects.requireNonNull(aFVpnService);
        J2(executorService.submit(new Runnable() { // from class: com.p7700g.p99005.vj1
            @Override // java.lang.Runnable
            public final void run() {
                AFVpnService.this.n();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void M(@x1 final pm1 pm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.dk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.r2(pm1Var);
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void P0(@x1 String str, @x1 String str2) throws RemoteException {
        this.V.V(str, str2);
    }

    @Override // com.p7700g.p99005.tm1
    @z1
    public fo1 S() throws RemoteException {
        return (fo1) J2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.xj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.V1();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void T0(int i, @x1 Bundle bundle) throws RemoteException {
        this.V.m(i, bundle);
    }

    public /* synthetic */ Integer Z1(String str) {
        return Integer.valueOf(this.V.s(str));
    }

    @Override // com.p7700g.p99005.tm1
    public void b1(@x1 final om1 om1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.rk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.z2(om1Var);
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void d1(@x1 final qm1 qm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.lk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.l2(qm1Var);
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void e0() throws RemoteException {
        this.V.k();
    }

    @Override // com.p7700g.p99005.tm1
    public void e1(@x1 @xu0.d final String str, @z1 final om1 om1Var) {
        final va1 va1Var;
        if (om1Var != null) {
            va1Var = new b(om1Var);
        } else {
            va1Var = va1.a;
        }
        this.W.execute(new Runnable() { // from class: com.p7700g.p99005.ok1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.D2(str, va1Var, om1Var);
            }
        });
    }

    @Override // com.p7700g.p99005.tm1
    @x1
    public en1 getState() throws RemoteException {
        return (en1) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.zj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.f2();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void i1(@x1 final rm1 rm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.fk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.v2(rm1Var);
            }
        }));
    }

    public /* synthetic */ void j2(pm1 pm1Var) {
        this.V.G(pm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    public boolean k(@x1 final ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        return ((Boolean) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.ik1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.R1(parcelFileDescriptor);
            }
        }))).booleanValue();
    }

    @Override // com.p7700g.p99005.tm1
    public void l1(@x1 final qm1 qm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.qk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.t2(qm1Var);
            }
        }));
    }

    public /* synthetic */ void l2(qm1 qm1Var) {
        this.V.H(qm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    public void n0(@x1 final sm1 sm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.kk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.p2(sm1Var);
            }
        }));
    }

    public /* synthetic */ void n2(rm1 rm1Var) {
        this.V.I(rm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    @x1
    public lm1 o() throws RemoteException {
        return (lm1) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.ek1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.T1();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public void o1() throws RemoteException {
        ExecutorService executorService = this.W;
        final AFVpnService aFVpnService = this.V;
        Objects.requireNonNull(aFVpnService);
        J2(executorService.submit(new Runnable() { // from class: com.p7700g.p99005.jm1
            @Override // java.lang.Runnable
            public final void run() {
                AFVpnService.this.S();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1.b, android.os.Binder
    public boolean onTransact(int i, @z1 Parcel parcel, @z1 Parcel parcel2, int i2) throws RemoteException {
        if (i == 16777215) {
            this.V.onRevoke();
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    @Override // com.p7700g.p99005.tm1
    public int p0() throws RemoteException {
        return ((Integer) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.wj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.b2();
            }
        }))).intValue();
    }

    public /* synthetic */ void p2(sm1 sm1Var) {
        this.V.J(sm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    public void r0(@x1 final pm1 pm1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.hk1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.j2(pm1Var);
            }
        }));
    }

    public /* synthetic */ void r2(pm1 pm1Var) {
        this.V.N(pm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    public void s0() throws RemoteException {
        ExecutorService executorService = this.W;
        final AFVpnService aFVpnService = this.V;
        Objects.requireNonNull(aFVpnService);
        J2(executorService.submit(new Runnable() { // from class: com.p7700g.p99005.gm1
            @Override // java.lang.Runnable
            public final void run() {
                AFVpnService.this.L();
            }
        }));
    }

    @Override // com.p7700g.p99005.tm1
    public int s1(@x1 final String str) throws RemoteException {
        return ((Integer) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.jk1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.Z1(str);
            }
        }))).intValue();
    }

    @Override // com.p7700g.p99005.tm1
    public void t1(@x1 final oe1 oe1Var) throws RemoteException {
        J2(this.W.submit(new Runnable() { // from class: com.p7700g.p99005.ak1
            @Override // java.lang.Runnable
            public final void run() {
                um1.this.F2(oe1Var);
            }
        }));
    }

    public /* synthetic */ void t2(qm1 qm1Var) {
        this.V.O(qm1Var);
    }

    public /* synthetic */ void v2(rm1 rm1Var) {
        this.V.P(rm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    public long w0() throws RemoteException {
        return ((Long) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.yj1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.d2();
            }
        }))).longValue();
    }

    public /* synthetic */ void x2(sm1 sm1Var) {
        this.V.Q(sm1Var);
    }

    @Override // com.p7700g.p99005.tm1
    @x1
    public bn1 z() throws RemoteException {
        return (bn1) I2(this.W.submit(new Callable() { // from class: com.p7700g.p99005.pk1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return um1.this.h2();
            }
        }));
    }

    public /* synthetic */ void z2(om1 om1Var) {
        this.V.R(om1Var);
    }
}