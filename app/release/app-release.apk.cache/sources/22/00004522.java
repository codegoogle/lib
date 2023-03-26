package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class gs {
    private static final String a = "WindowInsetsCompat";
    @x1
    public static final gs b;
    private final l c;

    /* compiled from: WindowInsetsCompat.java */
    @e2(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }

        private a() {
        }

        @z1
        public static gs a(@x1 View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            gs a2 = new b().f(hj.e(rect)).h(hj.e(rect2)).a();
                            a2.H(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class e extends d {
        public e() {
        }

        @Override // com.p7700g.p99005.gs.f
        public void d(int i, @x1 hj hjVar) {
            this.c.setInsets(n.a(i), hjVar.h());
        }

        @Override // com.p7700g.p99005.gs.f
        public void e(int i, @x1 hj hjVar) {
            this.c.setInsetsIgnoringVisibility(n.a(i), hjVar.h());
        }

        @Override // com.p7700g.p99005.gs.f
        public void k(int i, boolean z) {
            this.c.setVisible(n.a(i), z);
        }

        public e(@x1 gs gsVar) {
            super(gsVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        private final gs a;
        public hj[] b;

        public f() {
            this(new gs((gs) null));
        }

        public final void a() {
            hj[] hjVarArr = this.b;
            if (hjVarArr != null) {
                hj hjVar = hjVarArr[m.e(1)];
                hj hjVar2 = this.b[m.e(2)];
                if (hjVar2 == null) {
                    hjVar2 = this.a.f(2);
                }
                if (hjVar == null) {
                    hjVar = this.a.f(1);
                }
                i(hj.b(hjVar, hjVar2));
                hj hjVar3 = this.b[m.e(16)];
                if (hjVar3 != null) {
                    h(hjVar3);
                }
                hj hjVar4 = this.b[m.e(32)];
                if (hjVar4 != null) {
                    f(hjVar4);
                }
                hj hjVar5 = this.b[m.e(64)];
                if (hjVar5 != null) {
                    j(hjVar5);
                }
            }
        }

        @x1
        public gs b() {
            a();
            return this.a;
        }

        public void c(@z1 jq jqVar) {
        }

        public void d(int i, @x1 hj hjVar) {
            if (this.b == null) {
                this.b = new hj[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[m.e(i2)] = hjVar;
                }
            }
        }

        public void e(int i, @x1 hj hjVar) {
            if (i == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void f(@x1 hj hjVar) {
        }

        public void g(@x1 hj hjVar) {
        }

        public void h(@x1 hj hjVar) {
        }

        public void i(@x1 hj hjVar) {
        }

        public void j(@x1 hj hjVar) {
        }

        public void k(int i, boolean z) {
        }

        public f(@x1 gs gsVar) {
            this.a = gsVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class i extends h {
        public i(@x1 gs gsVar, @x1 WindowInsets windowInsets) {
            super(gsVar, windowInsets);
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public gs a() {
            return gs.K(this.h.consumeDisplayCutout());
        }

        @Override // com.p7700g.p99005.gs.g, com.p7700g.p99005.gs.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.h, iVar.h) && Objects.equals(this.l, iVar.l);
            }
            return false;
        }

        @Override // com.p7700g.p99005.gs.l
        @z1
        public jq f() {
            return jq.i(this.h.getDisplayCutout());
        }

        @Override // com.p7700g.p99005.gs.l
        public int hashCode() {
            return this.h.hashCode();
        }

        public i(@x1 gs gsVar, @x1 i iVar) {
            super(gsVar, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class k extends j {
        @x1
        public static final gs q = gs.K(WindowInsets.CONSUMED);

        public k(@x1 gs gsVar, @x1 WindowInsets windowInsets) {
            super(gsVar, windowInsets);
        }

        @Override // com.p7700g.p99005.gs.g, com.p7700g.p99005.gs.l
        public final void d(@x1 View view) {
        }

        @Override // com.p7700g.p99005.gs.g, com.p7700g.p99005.gs.l
        @x1
        public hj g(int i) {
            return hj.g(this.h.getInsets(n.a(i)));
        }

        @Override // com.p7700g.p99005.gs.g, com.p7700g.p99005.gs.l
        @x1
        public hj h(int i) {
            return hj.g(this.h.getInsetsIgnoringVisibility(n.a(i)));
        }

        @Override // com.p7700g.p99005.gs.g, com.p7700g.p99005.gs.l
        public boolean q(int i) {
            return this.h.isVisible(n.a(i));
        }

        public k(@x1 gs gsVar, @x1 k kVar) {
            super(gsVar, kVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        @x1
        public static final gs a = new b().a().a().b().c();
        public final gs b;

        public l(@x1 gs gsVar) {
            this.b = gsVar;
        }

        @x1
        public gs a() {
            return this.b;
        }

        @x1
        public gs b() {
            return this.b;
        }

        @x1
        public gs c() {
            return this.b;
        }

        public void d(@x1 View view) {
        }

        public void e(@x1 gs gsVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return p() == lVar.p() && o() == lVar.o() && ep.a(l(), lVar.l()) && ep.a(j(), lVar.j()) && ep.a(f(), lVar.f());
            }
            return false;
        }

        @z1
        public jq f() {
            return null;
        }

        @x1
        public hj g(int i) {
            return hj.a;
        }

        @x1
        public hj h(int i) {
            if ((i & 8) == 0) {
                return hj.a;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return ep.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @x1
        public hj i() {
            return l();
        }

        @x1
        public hj j() {
            return hj.a;
        }

        @x1
        public hj k() {
            return l();
        }

        @x1
        public hj l() {
            return hj.a;
        }

        @x1
        public hj m() {
            return l();
        }

        @x1
        public gs n(int i, int i2, int i3, int i4) {
            return a;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i) {
            return true;
        }

        public void r(hj[] hjVarArr) {
        }

        public void s(@x1 hj hjVar) {
        }

        public void t(@z1 gs gsVar) {
        }

        public void u(hj hjVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class m {
        public static final int a = 1;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 4;
        public static final int e = 8;
        public static final int f = 16;
        public static final int g = 32;
        public static final int h = 64;
        public static final int i = 128;
        public static final int j = 256;
        public static final int k = 9;
        public static final int l = 256;

        /* compiled from: WindowInsetsCompat.java */
        @i2({i2.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        private m() {
        }

        @i2({i2.a.LIBRARY_GROUP})
        @SuppressLint({"WrongConstant"})
        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i2) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            if (i2 != 16) {
                                if (i2 != 32) {
                                    if (i2 != 64) {
                                        if (i2 != 128) {
                                            if (i2 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException(wo1.l("type needs to be >= FIRST and <= LAST, type=", i2));
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static final class n {
        private n() {
        }

        public static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = k.q;
        } else {
            b = l.a;
        }
    }

    @e2(20)
    private gs(@x1 WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.c = new k(this, windowInsets);
        } else if (i2 >= 29) {
            this.c = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.c = new i(this, windowInsets);
        } else {
            this.c = new h(this, windowInsets);
        }
    }

    @e2(20)
    @x1
    public static gs K(@x1 WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @e2(20)
    @x1
    public static gs L(@x1 WindowInsets windowInsets, @z1 View view) {
        gs gsVar = new gs((WindowInsets) jp.l(windowInsets));
        if (view != null && sr.N0(view)) {
            gsVar.H(sr.n0(view));
            gsVar.d(view.getRootView());
        }
        return gsVar;
    }

    public static hj z(@x1 hj hjVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, hjVar.b - i2);
        int max2 = Math.max(0, hjVar.c - i3);
        int max3 = Math.max(0, hjVar.d - i4);
        int max4 = Math.max(0, hjVar.e - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? hjVar : hj.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.c.o();
    }

    public boolean B() {
        return this.c.p();
    }

    public boolean C(int i2) {
        return this.c.q(i2);
    }

    @x1
    @Deprecated
    public gs D(int i2, int i3, int i4, int i5) {
        return new b(this).h(hj.d(i2, i3, i4, i5)).a();
    }

    @x1
    @Deprecated
    public gs E(@x1 Rect rect) {
        return new b(this).h(hj.e(rect)).a();
    }

    public void F(hj[] hjVarArr) {
        this.c.r(hjVarArr);
    }

    public void G(@x1 hj hjVar) {
        this.c.s(hjVar);
    }

    public void H(@z1 gs gsVar) {
        this.c.t(gsVar);
    }

    public void I(@z1 hj hjVar) {
        this.c.u(hjVar);
    }

    @e2(20)
    @z1
    public WindowInsets J() {
        l lVar = this.c;
        if (lVar instanceof g) {
            return ((g) lVar).h;
        }
        return null;
    }

    @x1
    @Deprecated
    public gs a() {
        return this.c.a();
    }

    @x1
    @Deprecated
    public gs b() {
        return this.c.b();
    }

    @x1
    @Deprecated
    public gs c() {
        return this.c.c();
    }

    public void d(@x1 View view) {
        this.c.d(view);
    }

    @z1
    public jq e() {
        return this.c.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gs) {
            return ep.a(this.c, ((gs) obj).c);
        }
        return false;
    }

    @x1
    public hj f(int i2) {
        return this.c.g(i2);
    }

    @x1
    public hj g(int i2) {
        return this.c.h(i2);
    }

    @x1
    @Deprecated
    public hj h() {
        return this.c.i();
    }

    public int hashCode() {
        l lVar = this.c;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.c.j().e;
    }

    @Deprecated
    public int j() {
        return this.c.j().b;
    }

    @Deprecated
    public int k() {
        return this.c.j().d;
    }

    @Deprecated
    public int l() {
        return this.c.j().c;
    }

    @x1
    @Deprecated
    public hj m() {
        return this.c.j();
    }

    @x1
    @Deprecated
    public hj n() {
        return this.c.k();
    }

    @Deprecated
    public int o() {
        return this.c.l().e;
    }

    @Deprecated
    public int p() {
        return this.c.l().b;
    }

    @Deprecated
    public int q() {
        return this.c.l().d;
    }

    @Deprecated
    public int r() {
        return this.c.l().c;
    }

    @x1
    @Deprecated
    public hj s() {
        return this.c.l();
    }

    @x1
    @Deprecated
    public hj t() {
        return this.c.m();
    }

    public boolean u() {
        hj f2 = f(m.a());
        hj hjVar = hj.a;
        return (f2.equals(hjVar) && g(m.a() ^ m.d()).equals(hjVar) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.c.j().equals(hj.a);
    }

    @Deprecated
    public boolean w() {
        return !this.c.l().equals(hj.a);
    }

    @x1
    public gs x(@p1(from = 0) int i2, @p1(from = 0) int i3, @p1(from = 0) int i4, @p1(from = 0) int i5) {
        return this.c.n(i2, i3, i4, i5);
    }

    @x1
    public gs y(@x1 hj hjVar) {
        return x(hjVar.b, hjVar.c, hjVar.d, hjVar.e);
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(api = 20)
    /* loaded from: classes.dex */
    public static class c extends f {
        private static Field c = null;
        private static boolean d = false;
        private static Constructor<WindowInsets> e = null;
        private static boolean f = false;
        private WindowInsets g;
        private hj h;

        public c() {
            this.g = l();
        }

        @z1
        private static WindowInsets l() {
            if (!d) {
                try {
                    c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                d = true;
            }
            Field field = c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f) {
                try {
                    e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // com.p7700g.p99005.gs.f
        @x1
        public gs b() {
            a();
            gs K = gs.K(this.g);
            K.F(this.b);
            K.I(this.h);
            return K;
        }

        @Override // com.p7700g.p99005.gs.f
        public void g(@z1 hj hjVar) {
            this.h = hjVar;
        }

        @Override // com.p7700g.p99005.gs.f
        public void i(@x1 hj hjVar) {
            WindowInsets windowInsets = this.g;
            if (windowInsets != null) {
                this.g = windowInsets.replaceSystemWindowInsets(hjVar.b, hjVar.c, hjVar.d, hjVar.e);
            }
        }

        public c(@x1 gs gsVar) {
            super(gsVar);
            this.g = gsVar.J();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(api = 29)
    /* loaded from: classes.dex */
    public static class d extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = new WindowInsets.Builder();
        }

        @Override // com.p7700g.p99005.gs.f
        @x1
        public gs b() {
            a();
            gs K = gs.K(this.c.build());
            K.F(this.b);
            return K;
        }

        @Override // com.p7700g.p99005.gs.f
        public void c(@z1 jq jqVar) {
            this.c.setDisplayCutout(jqVar != null ? jqVar.h() : null);
        }

        @Override // com.p7700g.p99005.gs.f
        public void f(@x1 hj hjVar) {
            this.c.setMandatorySystemGestureInsets(hjVar.h());
        }

        @Override // com.p7700g.p99005.gs.f
        public void g(@x1 hj hjVar) {
            this.c.setStableInsets(hjVar.h());
        }

        @Override // com.p7700g.p99005.gs.f
        public void h(@x1 hj hjVar) {
            this.c.setSystemGestureInsets(hjVar.h());
        }

        @Override // com.p7700g.p99005.gs.f
        public void i(@x1 hj hjVar) {
            this.c.setSystemWindowInsets(hjVar.h());
        }

        @Override // com.p7700g.p99005.gs.f
        public void j(@x1 hj hjVar) {
            this.c.setTappableElementInsets(hjVar.h());
        }

        public d(@x1 gs gsVar) {
            super(gsVar);
            WindowInsets.Builder builder;
            WindowInsets J = gsVar.J();
            if (J != null) {
                builder = new WindowInsets.Builder(J);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class h extends g {
        private hj m;

        public h(@x1 gs gsVar, @x1 WindowInsets windowInsets) {
            super(gsVar, windowInsets);
            this.m = null;
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public gs b() {
            return gs.K(this.h.consumeStableInsets());
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public gs c() {
            return gs.K(this.h.consumeSystemWindowInsets());
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public final hj j() {
            if (this.m == null) {
                this.m = hj.d(this.h.getStableInsetLeft(), this.h.getStableInsetTop(), this.h.getStableInsetRight(), this.h.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // com.p7700g.p99005.gs.l
        public boolean o() {
            return this.h.isConsumed();
        }

        @Override // com.p7700g.p99005.gs.l
        public void u(@z1 hj hjVar) {
            this.m = hjVar;
        }

        public h(@x1 gs gsVar, @x1 h hVar) {
            super(gsVar, hVar);
            this.m = null;
            this.m = hVar.m;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(20)
    /* loaded from: classes.dex */
    public static class g extends l {
        private static boolean c = false;
        private static Method d;
        private static Class<?> e;
        private static Field f;
        private static Field g;
        @x1
        public final WindowInsets h;
        private hj[] i;
        private hj j;
        private gs k;
        public hj l;

        public g(@x1 gs gsVar, @x1 WindowInsets windowInsets) {
            super(gsVar);
            this.j = null;
            this.h = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                e = cls;
                f = cls.getDeclaredField("mVisibleInsets");
                g = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f.setAccessible(true);
                g.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                e2.getMessage();
            }
            c = true;
        }

        @x1
        @SuppressLint({"WrongConstant"})
        private hj v(int i, boolean z) {
            hj hjVar = hj.a;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    hjVar = hj.b(hjVar, w(i2, z));
                }
            }
            return hjVar;
        }

        private hj x() {
            gs gsVar = this.k;
            if (gsVar != null) {
                return gsVar.m();
            }
            return hj.a;
        }

        @z1
        private hj y(@x1 View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!c) {
                    A();
                }
                Method method = d;
                if (method != null && e != null && f != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f.get(g.get(invoke));
                        if (rect != null) {
                            return hj.e(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        e2.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // com.p7700g.p99005.gs.l
        public void d(@x1 View view) {
            hj y = y(view);
            if (y == null) {
                y = hj.a;
            }
            s(y);
        }

        @Override // com.p7700g.p99005.gs.l
        public void e(@x1 gs gsVar) {
            gsVar.H(this.k);
            gsVar.G(this.l);
        }

        @Override // com.p7700g.p99005.gs.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.l, ((g) obj).l);
            }
            return false;
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public hj g(int i) {
            return v(i, false);
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public hj h(int i) {
            return v(i, true);
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public final hj l() {
            if (this.j == null) {
                this.j = hj.d(this.h.getSystemWindowInsetLeft(), this.h.getSystemWindowInsetTop(), this.h.getSystemWindowInsetRight(), this.h.getSystemWindowInsetBottom());
            }
            return this.j;
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public gs n(int i, int i2, int i3, int i4) {
            b bVar = new b(gs.K(this.h));
            bVar.h(gs.z(l(), i, i2, i3, i4));
            bVar.f(gs.z(j(), i, i2, i3, i4));
            return bVar.a();
        }

        @Override // com.p7700g.p99005.gs.l
        public boolean p() {
            return this.h.isRound();
        }

        @Override // com.p7700g.p99005.gs.l
        @SuppressLint({"WrongConstant"})
        public boolean q(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !z(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.p7700g.p99005.gs.l
        public void r(hj[] hjVarArr) {
            this.i = hjVarArr;
        }

        @Override // com.p7700g.p99005.gs.l
        public void s(@x1 hj hjVar) {
            this.l = hjVar;
        }

        @Override // com.p7700g.p99005.gs.l
        public void t(@z1 gs gsVar) {
            this.k = gsVar;
        }

        @x1
        public hj w(int i, boolean z) {
            hj m;
            int i2;
            jq f2;
            if (i == 1) {
                if (z) {
                    return hj.d(0, Math.max(x().c, l().c), 0, 0);
                }
                return hj.d(0, l().c, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    hj x = x();
                    hj j = j();
                    return hj.d(Math.max(x.b, j.b), 0, Math.max(x.d, j.d), Math.max(x.e, j.e));
                }
                hj l = l();
                gs gsVar = this.k;
                m = gsVar != null ? gsVar.m() : null;
                int i3 = l.e;
                if (m != null) {
                    i3 = Math.min(i3, m.e);
                }
                return hj.d(l.b, 0, l.d, i3);
            } else if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                return hj.a;
                            }
                            gs gsVar2 = this.k;
                            if (gsVar2 != null) {
                                f2 = gsVar2.e();
                            } else {
                                f2 = f();
                            }
                            if (f2 != null) {
                                return hj.d(f2.d(), f2.f(), f2.e(), f2.c());
                            }
                            return hj.a;
                        }
                        return m();
                    }
                    return i();
                }
                return k();
            } else {
                hj[] hjVarArr = this.i;
                m = hjVarArr != null ? hjVarArr[m.e(8)] : null;
                if (m != null) {
                    return m;
                }
                hj l2 = l();
                hj x2 = x();
                int i4 = l2.e;
                if (i4 > x2.e) {
                    return hj.d(0, 0, 0, i4);
                }
                hj hjVar = this.l;
                if (hjVar != null && !hjVar.equals(hj.a) && (i2 = this.l.e) > x2.e) {
                    return hj.d(0, 0, 0, i2);
                }
                return hj.a;
            }
        }

        public boolean z(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !w(i, false).equals(hj.a);
        }

        public g(@x1 gs gsVar, @x1 g gVar) {
            this(gsVar, new WindowInsets(gVar.h));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class j extends i {
        private hj n;
        private hj o;
        private hj p;

        public j(@x1 gs gsVar, @x1 WindowInsets windowInsets) {
            super(gsVar, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public hj i() {
            if (this.o == null) {
                this.o = hj.g(this.h.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public hj k() {
            if (this.n == null) {
                this.n = hj.g(this.h.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // com.p7700g.p99005.gs.l
        @x1
        public hj m() {
            if (this.p == null) {
                this.p = hj.g(this.h.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // com.p7700g.p99005.gs.g, com.p7700g.p99005.gs.l
        @x1
        public gs n(int i, int i2, int i3, int i4) {
            return gs.K(this.h.inset(i, i2, i3, i4));
        }

        @Override // com.p7700g.p99005.gs.h, com.p7700g.p99005.gs.l
        public void u(@z1 hj hjVar) {
        }

        public j(@x1 gs gsVar, @x1 j jVar) {
            super(gsVar, jVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class b {
        private final f a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e();
            } else if (i >= 29) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        @x1
        public gs a() {
            return this.a.b();
        }

        @x1
        public b b(@z1 jq jqVar) {
            this.a.c(jqVar);
            return this;
        }

        @x1
        public b c(int i, @x1 hj hjVar) {
            this.a.d(i, hjVar);
            return this;
        }

        @x1
        public b d(int i, @x1 hj hjVar) {
            this.a.e(i, hjVar);
            return this;
        }

        @x1
        @Deprecated
        public b e(@x1 hj hjVar) {
            this.a.f(hjVar);
            return this;
        }

        @x1
        @Deprecated
        public b f(@x1 hj hjVar) {
            this.a.g(hjVar);
            return this;
        }

        @x1
        @Deprecated
        public b g(@x1 hj hjVar) {
            this.a.h(hjVar);
            return this;
        }

        @x1
        @Deprecated
        public b h(@x1 hj hjVar) {
            this.a.i(hjVar);
            return this;
        }

        @x1
        @Deprecated
        public b i(@x1 hj hjVar) {
            this.a.j(hjVar);
            return this;
        }

        @x1
        public b j(int i, boolean z) {
            this.a.k(i, z);
            return this;
        }

        public b(@x1 gs gsVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.a = new e(gsVar);
            } else if (i >= 29) {
                this.a = new d(gsVar);
            } else {
                this.a = new c(gsVar);
            }
        }
    }

    public gs(@z1 gs gsVar) {
        if (gsVar != null) {
            l lVar = gsVar.c;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.c = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.c = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.c = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.c = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.c = new g(this, (g) lVar);
            } else {
                this.c = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.c = new l(this);
    }
}