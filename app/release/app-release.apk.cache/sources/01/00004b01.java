package com.p7700g.p99005;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.p7700g.p99005.mx1;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes2.dex */
public class jp1 implements ComponentCallbacks2, wx1, ep1<ip1<Drawable>> {
    private static final zy1 s = zy1.p1(Bitmap.class).A0();
    private static final zy1 t = zy1.p1(vw1.class).A0();
    private static final zy1 u = zy1.q1(qr1.c).O0(fp1.LOW).W0(true);
    @k1("this")
    private final ey1 A;
    private final Runnable B;
    private final mx1 C;
    private final CopyOnWriteArrayList<yy1<Object>> D;
    @k1("this")
    private zy1 E;
    private boolean F;
    public final yo1 v;
    public final Context w;
    public final vx1 x;
    @k1("this")
    private final by1 y;
    @k1("this")
    private final ay1 z;

    /* compiled from: RequestManager.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jp1 jp1Var = jp1.this;
            jp1Var.x.a(jp1Var);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes2.dex */
    public static class b extends iz1<View, Object> {
        public b(@x1 View view) {
            super(view);
        }

        @Override // com.p7700g.p99005.sz1
        public void c(@x1 Object obj, @z1 a02<? super Object> a02Var) {
        }

        @Override // com.p7700g.p99005.iz1
        public void h(@z1 Drawable drawable) {
        }

        @Override // com.p7700g.p99005.sz1
        public void k(@z1 Drawable drawable) {
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes2.dex */
    public class c implements mx1.a {
        @k1("RequestManager.this")
        private final by1 a;

        public c(@x1 by1 by1Var) {
            this.a = by1Var;
        }

        @Override // com.p7700g.p99005.mx1.a
        public void a(boolean z) {
            if (z) {
                synchronized (jp1.this) {
                    this.a.g();
                }
            }
        }
    }

    public jp1(@x1 yo1 yo1Var, @x1 vx1 vx1Var, @x1 ay1 ay1Var, @x1 Context context) {
        this(yo1Var, vx1Var, ay1Var, new by1(), yo1Var.i(), context);
    }

    private void a0(@x1 sz1<?> sz1Var) {
        boolean Z = Z(sz1Var);
        vy1 m = sz1Var.m();
        if (Z || this.v.w(sz1Var) || m == null) {
            return;
        }
        sz1Var.j(null);
        m.clear();
    }

    private synchronized void b0(@x1 zy1 zy1Var) {
        this.E = this.E.b(zy1Var);
    }

    @x1
    @u0
    public ip1<File> A(@z1 Object obj) {
        return B().n(obj);
    }

    @x1
    @u0
    public ip1<File> B() {
        return t(File.class).b(u);
    }

    public List<yy1<Object>> C() {
        return this.D;
    }

    public synchronized zy1 D() {
        return this.E;
    }

    @x1
    public <T> kp1<?, T> E(Class<T> cls) {
        return this.v.k().e(cls);
    }

    public synchronized boolean F() {
        return this.y.d();
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: G */
    public ip1<Drawable> i(@z1 Bitmap bitmap) {
        return v().i(bitmap);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: H */
    public ip1<Drawable> h(@z1 Drawable drawable) {
        return v().h(drawable);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: I */
    public ip1<Drawable> e(@z1 Uri uri) {
        return v().e(uri);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: J */
    public ip1<Drawable> g(@z1 File file) {
        return v().g(file);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: K */
    public ip1<Drawable> o(@f1 @z1 @d2 Integer num) {
        return v().o(num);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: L */
    public ip1<Drawable> n(@z1 Object obj) {
        return v().n(obj);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: M */
    public ip1<Drawable> a(@z1 String str) {
        return v().a(str);
    }

    @Override // com.p7700g.p99005.ep1
    @u0
    @Deprecated
    /* renamed from: N */
    public ip1<Drawable> d(@z1 URL url) {
        return v().d(url);
    }

    @Override // com.p7700g.p99005.ep1
    @x1
    @u0
    /* renamed from: O */
    public ip1<Drawable> f(@z1 byte[] bArr) {
        return v().f(bArr);
    }

    public synchronized void P() {
        this.y.e();
    }

    public synchronized void Q() {
        P();
        for (jp1 jp1Var : this.z.a()) {
            jp1Var.P();
        }
    }

    public synchronized void R() {
        this.y.f();
    }

    public synchronized void S() {
        R();
        for (jp1 jp1Var : this.z.a()) {
            jp1Var.R();
        }
    }

    public synchronized void T() {
        this.y.h();
    }

    public synchronized void U() {
        z02.b();
        T();
        for (jp1 jp1Var : this.z.a()) {
            jp1Var.T();
        }
    }

    @x1
    public synchronized jp1 V(@x1 zy1 zy1Var) {
        X(zy1Var);
        return this;
    }

    public void W(boolean z) {
        this.F = z;
    }

    public synchronized void X(@x1 zy1 zy1Var) {
        this.E = zy1Var.clone().c();
    }

    public synchronized void Y(@x1 sz1<?> sz1Var, @x1 vy1 vy1Var) {
        this.A.e(sz1Var);
        this.y.i(vy1Var);
    }

    public synchronized boolean Z(@x1 sz1<?> sz1Var) {
        vy1 m = sz1Var.m();
        if (m == null) {
            return true;
        }
        if (this.y.b(m)) {
            this.A.f(sz1Var);
            sz1Var.j(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.p7700g.p99005.wx1
    public synchronized void onDestroy() {
        this.A.onDestroy();
        for (sz1<?> sz1Var : this.A.d()) {
            z(sz1Var);
        }
        this.A.a();
        this.y.c();
        this.x.b(this);
        this.x.b(this.C);
        z02.y(this.B);
        this.v.B(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.p7700g.p99005.wx1
    public synchronized void onStart() {
        T();
        this.A.onStart();
    }

    @Override // com.p7700g.p99005.wx1
    public synchronized void onStop() {
        R();
        this.A.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.F) {
            Q();
        }
    }

    public jp1 r(yy1<Object> yy1Var) {
        this.D.add(yy1Var);
        return this;
    }

    @x1
    public synchronized jp1 s(@x1 zy1 zy1Var) {
        b0(zy1Var);
        return this;
    }

    @x1
    @u0
    public <ResourceType> ip1<ResourceType> t(@x1 Class<ResourceType> cls) {
        return new ip1<>(this.v, this, cls, this.w);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.y + ", treeNode=" + this.z + "}";
    }

    @x1
    @u0
    public ip1<Bitmap> u() {
        return t(Bitmap.class).b(s);
    }

    @x1
    @u0
    public ip1<Drawable> v() {
        return t(Drawable.class);
    }

    @x1
    @u0
    public ip1<File> w() {
        return t(File.class).b(zy1.M1(true));
    }

    @x1
    @u0
    public ip1<vw1> x() {
        return t(vw1.class).b(t);
    }

    public void y(@x1 View view) {
        z(new b(view));
    }

    public void z(@z1 sz1<?> sz1Var) {
        if (sz1Var == null) {
            return;
        }
        a0(sz1Var);
    }

    public jp1(yo1 yo1Var, vx1 vx1Var, ay1 ay1Var, by1 by1Var, nx1 nx1Var, Context context) {
        this.A = new ey1();
        a aVar = new a();
        this.B = aVar;
        this.v = yo1Var;
        this.x = vx1Var;
        this.z = ay1Var;
        this.y = by1Var;
        this.w = context;
        mx1 a2 = nx1Var.a(context.getApplicationContext(), new c(by1Var));
        this.C = a2;
        if (z02.t()) {
            z02.x(aVar);
        } else {
            vx1Var.a(this);
        }
        vx1Var.a(a2);
        this.D = new CopyOnWriteArrayList<>(yo1Var.k().c());
        X(yo1Var.k().d());
        yo1Var.v(this);
    }
}