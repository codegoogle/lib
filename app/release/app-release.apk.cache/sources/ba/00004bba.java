package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Looper;
import com.p7700g.p99005.j10;
import com.p7700g.p99005.m00;
import com.p7700g.p99005.n10;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class k10 extends j10 {
    public static final String a = "LoaderManager";
    public static boolean b = false;
    @x1
    private final qz c;
    @x1
    private final c d;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends xz<D> implements n10.c<D> {
        private final int m;
        @z1
        private final Bundle n;
        @x1
        private final n10<D> o;
        private qz p;
        private b<D> q;
        private n10<D> r;

        public a(int i, @z1 Bundle bundle, @x1 n10<D> n10Var, @z1 n10<D> n10Var2) {
            this.m = i;
            this.n = bundle;
            this.o = n10Var;
            this.r = n10Var2;
            n10Var.u(i, this);
        }

        @Override // com.p7700g.p99005.n10.c
        public void a(@x1 n10<D> n10Var, @z1 D d) {
            if (k10.b) {
                String str = "onLoadComplete: " + this;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                q(d);
                return;
            }
            boolean z = k10.b;
            n(d);
        }

        @Override // androidx.lifecycle.LiveData
        public void l() {
            if (k10.b) {
                String str = "  Starting: " + this;
            }
            this.o.y();
        }

        @Override // androidx.lifecycle.LiveData
        public void m() {
            if (k10.b) {
                String str = "  Stopping: " + this;
            }
            this.o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void o(@x1 yz<? super D> yzVar) {
            super.o(yzVar);
            this.p = null;
            this.q = null;
        }

        @Override // com.p7700g.p99005.xz, androidx.lifecycle.LiveData
        public void q(D d) {
            super.q(d);
            n10<D> n10Var = this.r;
            if (n10Var != null) {
                n10Var.w();
                this.r = null;
            }
        }

        @u1
        public n10<D> r(boolean z) {
            if (k10.b) {
                String str = "  Destroying: " + this;
            }
            this.o.b();
            this.o.a();
            b<D> bVar = this.q;
            if (bVar != null) {
                o(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.o.B(this);
            if ((bVar != null && !bVar.c()) || z) {
                this.o.w();
                return this.r;
            }
            return this.o;
        }

        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.m);
            printWriter.print(" mArgs=");
            printWriter.println(this.n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.o);
            this.o.g(wo1.t(str, g54.A), fileDescriptor, printWriter, strArr);
            if (this.q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.q);
                b<D> bVar = this.q;
                bVar.b(str + g54.A, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(t().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        @x1
        public n10<D> t() {
            return this.o;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.m);
            sb.append(" : ");
            zo.a(this.o, sb);
            sb.append("}}");
            return sb.toString();
        }

        public boolean u() {
            b<D> bVar;
            return (!h() || (bVar = this.q) == null || bVar.c()) ? false : true;
        }

        public void v() {
            qz qzVar = this.p;
            b<D> bVar = this.q;
            if (qzVar == null || bVar == null) {
                return;
            }
            super.o(bVar);
            j(qzVar, bVar);
        }

        @x1
        @u1
        public n10<D> w(@x1 qz qzVar, @x1 j10.a<D> aVar) {
            b<D> bVar = new b<>(this.o, aVar);
            j(qzVar, bVar);
            b<D> bVar2 = this.q;
            if (bVar2 != null) {
                o(bVar2);
            }
            this.p = qzVar;
            this.q = bVar;
            return this.o;
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class b<D> implements yz<D> {
        @x1
        private final n10<D> a;
        @x1
        private final j10.a<D> b;
        private boolean c = false;

        public b(@x1 n10<D> n10Var, @x1 j10.a<D> aVar) {
            this.a = n10Var;
            this.b = aVar;
        }

        @Override // com.p7700g.p99005.yz
        public void a(@z1 D d) {
            if (k10.b) {
                StringBuilder G = wo1.G("  onLoadFinished in ");
                G.append(this.a);
                G.append(": ");
                G.append(this.a.d(d));
                G.toString();
            }
            this.b.a(this.a, d);
            this.c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        public boolean c() {
            return this.c;
        }

        @u1
        public void d() {
            if (this.c) {
                if (k10.b) {
                    StringBuilder G = wo1.G("  Resetting: ");
                    G.append(this.a);
                    G.toString();
                }
                this.b.c(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class c extends k00 {
        private static final m00.b d = new a();
        private z7<a> e = new z7<>();
        private boolean f = false;

        /* compiled from: LoaderManagerImpl.java */
        /* loaded from: classes.dex */
        public static class a implements m00.b {
            @Override // com.p7700g.p99005.m00.b
            @x1
            public <T extends k00> T a(@x1 Class<T> cls) {
                return new c();
            }

            @Override // com.p7700g.p99005.m00.b
            public /* synthetic */ k00 b(Class cls, z00 z00Var) {
                return n00.b(this, cls, z00Var);
            }
        }

        @x1
        public static c i(p00 p00Var) {
            return (c) new m00(p00Var, d).a(c.class);
        }

        @Override // com.p7700g.p99005.k00
        public void e() {
            super.e();
            int I = this.e.I();
            for (int i = 0; i < I; i++) {
                this.e.J(i).r(true);
            }
            this.e.b();
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.e.I() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.e.I(); i++) {
                    a J = this.e.J(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.e.t(i));
                    printWriter.print(": ");
                    printWriter.println(J.toString());
                    J.s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void h() {
            this.f = false;
        }

        public <D> a<D> j(int i) {
            return this.e.h(i);
        }

        public boolean k() {
            int I = this.e.I();
            for (int i = 0; i < I; i++) {
                if (this.e.J(i).u()) {
                    return true;
                }
            }
            return false;
        }

        public boolean l() {
            return this.f;
        }

        public void m() {
            int I = this.e.I();
            for (int i = 0; i < I; i++) {
                this.e.J(i).v();
            }
        }

        public void n(int i, @x1 a aVar) {
            this.e.u(i, aVar);
        }

        public void o(int i) {
            this.e.A(i);
        }

        public void p() {
            this.f = true;
        }
    }

    public k10(@x1 qz qzVar, @x1 p00 p00Var) {
        this.c = qzVar;
        this.d = c.i(p00Var);
    }

    @x1
    @u1
    private <D> n10<D> j(int i, @z1 Bundle bundle, @x1 j10.a<D> aVar, @z1 n10<D> n10Var) {
        try {
            this.d.p();
            n10<D> b2 = aVar.b(i, bundle);
            if (b2 != null) {
                if (b2.getClass().isMemberClass() && !Modifier.isStatic(b2.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2);
                }
                a aVar2 = new a(i, bundle, b2, n10Var);
                if (b) {
                    String str = "  Created new loader " + aVar2;
                }
                this.d.n(i, aVar2);
                this.d.h();
                return aVar2.w(this.c, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.d.h();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.j10
    @u1
    public void a(int i) {
        if (!this.d.l()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (b) {
                    String str = "destroyLoader in " + this + " of " + i;
                }
                a j = this.d.j(i);
                if (j != null) {
                    j.r(true);
                    this.d.o(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // com.p7700g.p99005.j10
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.d.g(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.p7700g.p99005.j10
    @z1
    public <D> n10<D> e(int i) {
        if (!this.d.l()) {
            a<D> j = this.d.j(i);
            if (j != null) {
                return j.t();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // com.p7700g.p99005.j10
    public boolean f() {
        return this.d.k();
    }

    @Override // com.p7700g.p99005.j10
    @x1
    @u1
    public <D> n10<D> g(int i, @z1 Bundle bundle, @x1 j10.a<D> aVar) {
        if (!this.d.l()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> j = this.d.j(i);
                if (b) {
                    String str = "initLoader in " + this + ": args=" + bundle;
                }
                if (j == null) {
                    return j(i, bundle, aVar, null);
                }
                if (b) {
                    String str2 = "  Re-using existing loader " + j;
                }
                return j.w(this.c, aVar);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // com.p7700g.p99005.j10
    public void h() {
        this.d.m();
    }

    @Override // com.p7700g.p99005.j10
    @x1
    @u1
    public <D> n10<D> i(int i, @z1 Bundle bundle, @x1 j10.a<D> aVar) {
        if (!this.d.l()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (b) {
                    String str = "restartLoader in " + this + ": args=" + bundle;
                }
                a<D> j = this.d.j(i);
                return j(i, bundle, aVar, j != null ? j.r(false) : null);
            }
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        zo.a(this.c, sb);
        sb.append("}}");
        return sb.toString();
    }
}