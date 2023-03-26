package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes3.dex */
public class qh2 {
    public static final fh2 a = new oh2(0.5f);
    public gh2 b;
    public gh2 c;
    public gh2 d;
    public gh2 e;
    public fh2 f;
    public fh2 g;
    public fh2 h;
    public fh2 i;
    public ih2 j;
    public ih2 k;
    public ih2 l;
    public ih2 m;

    /* compiled from: ShapeAppearanceModel.java */
    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public interface c {
        @x1
        fh2 a(@x1 fh2 fh2Var);
    }

    @x1
    public static b a() {
        return new b();
    }

    @x1
    public static b b(Context context, @m2 int i, @m2 int i2) {
        return c(context, i, i2, 0);
    }

    @x1
    private static b c(Context context, @m2 int i, @m2 int i2, int i3) {
        return d(context, i, i2, new ch2(i3));
    }

    @x1
    private static b d(Context context, @m2 int i, @m2 int i2, @x1 fh2 fh2Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ga2.o.Yq);
        try {
            int i3 = obtainStyledAttributes.getInt(ga2.o.Zq, 0);
            int i4 = obtainStyledAttributes.getInt(ga2.o.cr, i3);
            int i5 = obtainStyledAttributes.getInt(ga2.o.dr, i3);
            int i6 = obtainStyledAttributes.getInt(ga2.o.br, i3);
            int i7 = obtainStyledAttributes.getInt(ga2.o.ar, i3);
            fh2 m = m(obtainStyledAttributes, ga2.o.er, fh2Var);
            fh2 m2 = m(obtainStyledAttributes, ga2.o.hr, m);
            fh2 m3 = m(obtainStyledAttributes, ga2.o.ir, m);
            fh2 m4 = m(obtainStyledAttributes, ga2.o.gr, m);
            return new b().I(i4, m2).N(i5, m3).A(i6, m4).v(i7, m(obtainStyledAttributes, ga2.o.fr, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @x1
    public static b e(@x1 Context context, AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    @x1
    public static b f(@x1 Context context, AttributeSet attributeSet, @q0 int i, @m2 int i2, int i3) {
        return g(context, attributeSet, i, i2, new ch2(i3));
    }

    @x1
    public static b g(@x1 Context context, AttributeSet attributeSet, @q0 int i, @m2 int i2, @x1 fh2 fh2Var) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.vm, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(ga2.o.wm, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(ga2.o.xm, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, fh2Var);
    }

    @x1
    private static fh2 m(TypedArray typedArray, int i, @x1 fh2 fh2Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return fh2Var;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new ch2(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new oh2(peekValue.getFraction(1.0f, 1.0f)) : fh2Var;
    }

    @x1
    public ih2 h() {
        return this.l;
    }

    @x1
    public gh2 i() {
        return this.e;
    }

    @x1
    public fh2 j() {
        return this.i;
    }

    @x1
    public gh2 k() {
        return this.d;
    }

    @x1
    public fh2 l() {
        return this.h;
    }

    @x1
    public ih2 n() {
        return this.m;
    }

    @x1
    public ih2 o() {
        return this.k;
    }

    @x1
    public ih2 p() {
        return this.j;
    }

    @x1
    public gh2 q() {
        return this.b;
    }

    @x1
    public fh2 r() {
        return this.f;
    }

    @x1
    public gh2 s() {
        return this.c;
    }

    @x1
    public fh2 t() {
        return this.g;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean u(@x1 RectF rectF) {
        boolean z = this.m.getClass().equals(ih2.class) && this.k.getClass().equals(ih2.class) && this.j.getClass().equals(ih2.class) && this.l.getClass().equals(ih2.class);
        float a2 = this.f.a(rectF);
        return z && ((this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0 && (this.i.a(rectF) > a2 ? 1 : (this.i.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.c instanceof ph2) && (this.b instanceof ph2) && (this.d instanceof ph2) && (this.e instanceof ph2));
    }

    @x1
    public b v() {
        return new b(this);
    }

    @x1
    public qh2 w(float f) {
        return v().o(f).m();
    }

    @x1
    public qh2 x(@x1 fh2 fh2Var) {
        return v().p(fh2Var).m();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public qh2 y(@x1 c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    private qh2(@x1 b bVar) {
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.e = bVar.d;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes3.dex */
    public static final class b {
        @x1
        private gh2 a;
        @x1
        private gh2 b;
        @x1
        private gh2 c;
        @x1
        private gh2 d;
        @x1
        private fh2 e;
        @x1
        private fh2 f;
        @x1
        private fh2 g;
        @x1
        private fh2 h;
        @x1
        private ih2 i;
        @x1
        private ih2 j;
        @x1
        private ih2 k;
        @x1
        private ih2 l;

        public b() {
            this.a = mh2.b();
            this.b = mh2.b();
            this.c = mh2.b();
            this.d = mh2.b();
            this.e = new ch2(0.0f);
            this.f = new ch2(0.0f);
            this.g = new ch2(0.0f);
            this.h = new ch2(0.0f);
            this.i = mh2.c();
            this.j = mh2.c();
            this.k = mh2.c();
            this.l = mh2.c();
        }

        private static float n(gh2 gh2Var) {
            if (gh2Var instanceof ph2) {
                return ((ph2) gh2Var).a;
            }
            if (gh2Var instanceof hh2) {
                return ((hh2) gh2Var).a;
            }
            return -1.0f;
        }

        @x1
        public b A(int i, @x1 fh2 fh2Var) {
            return B(mh2.a(i)).D(fh2Var);
        }

        @x1
        public b B(@x1 gh2 gh2Var) {
            this.c = gh2Var;
            float n = n(gh2Var);
            if (n != -1.0f) {
                C(n);
            }
            return this;
        }

        @x1
        public b C(@b1 float f) {
            this.g = new ch2(f);
            return this;
        }

        @x1
        public b D(@x1 fh2 fh2Var) {
            this.g = fh2Var;
            return this;
        }

        @x1
        public b E(@x1 ih2 ih2Var) {
            this.l = ih2Var;
            return this;
        }

        @x1
        public b F(@x1 ih2 ih2Var) {
            this.j = ih2Var;
            return this;
        }

        @x1
        public b G(@x1 ih2 ih2Var) {
            this.i = ih2Var;
            return this;
        }

        @x1
        public b H(int i, @b1 float f) {
            return J(mh2.a(i)).K(f);
        }

        @x1
        public b I(int i, @x1 fh2 fh2Var) {
            return J(mh2.a(i)).L(fh2Var);
        }

        @x1
        public b J(@x1 gh2 gh2Var) {
            this.a = gh2Var;
            float n = n(gh2Var);
            if (n != -1.0f) {
                K(n);
            }
            return this;
        }

        @x1
        public b K(@b1 float f) {
            this.e = new ch2(f);
            return this;
        }

        @x1
        public b L(@x1 fh2 fh2Var) {
            this.e = fh2Var;
            return this;
        }

        @x1
        public b M(int i, @b1 float f) {
            return O(mh2.a(i)).P(f);
        }

        @x1
        public b N(int i, @x1 fh2 fh2Var) {
            return O(mh2.a(i)).Q(fh2Var);
        }

        @x1
        public b O(@x1 gh2 gh2Var) {
            this.b = gh2Var;
            float n = n(gh2Var);
            if (n != -1.0f) {
                P(n);
            }
            return this;
        }

        @x1
        public b P(@b1 float f) {
            this.f = new ch2(f);
            return this;
        }

        @x1
        public b Q(@x1 fh2 fh2Var) {
            this.f = fh2Var;
            return this;
        }

        @x1
        public qh2 m() {
            return new qh2(this);
        }

        @x1
        public b o(@b1 float f) {
            return K(f).P(f).C(f).x(f);
        }

        @x1
        public b p(@x1 fh2 fh2Var) {
            return L(fh2Var).Q(fh2Var).D(fh2Var).y(fh2Var);
        }

        @x1
        public b q(int i, @b1 float f) {
            return r(mh2.a(i)).o(f);
        }

        @x1
        public b r(@x1 gh2 gh2Var) {
            return J(gh2Var).O(gh2Var).B(gh2Var).w(gh2Var);
        }

        @x1
        public b s(@x1 ih2 ih2Var) {
            return E(ih2Var).G(ih2Var).F(ih2Var).t(ih2Var);
        }

        @x1
        public b t(@x1 ih2 ih2Var) {
            this.k = ih2Var;
            return this;
        }

        @x1
        public b u(int i, @b1 float f) {
            return w(mh2.a(i)).x(f);
        }

        @x1
        public b v(int i, @x1 fh2 fh2Var) {
            return w(mh2.a(i)).y(fh2Var);
        }

        @x1
        public b w(@x1 gh2 gh2Var) {
            this.d = gh2Var;
            float n = n(gh2Var);
            if (n != -1.0f) {
                x(n);
            }
            return this;
        }

        @x1
        public b x(@b1 float f) {
            this.h = new ch2(f);
            return this;
        }

        @x1
        public b y(@x1 fh2 fh2Var) {
            this.h = fh2Var;
            return this;
        }

        @x1
        public b z(int i, @b1 float f) {
            return B(mh2.a(i)).C(f);
        }

        public b(@x1 qh2 qh2Var) {
            this.a = mh2.b();
            this.b = mh2.b();
            this.c = mh2.b();
            this.d = mh2.b();
            this.e = new ch2(0.0f);
            this.f = new ch2(0.0f);
            this.g = new ch2(0.0f);
            this.h = new ch2(0.0f);
            this.i = mh2.c();
            this.j = mh2.c();
            this.k = mh2.c();
            this.l = mh2.c();
            this.a = qh2Var.b;
            this.b = qh2Var.c;
            this.c = qh2Var.d;
            this.d = qh2Var.e;
            this.e = qh2Var.f;
            this.f = qh2Var.g;
            this.g = qh2Var.h;
            this.h = qh2Var.i;
            this.i = qh2Var.j;
            this.j = qh2Var.k;
            this.k = qh2Var.l;
            this.l = qh2Var.m;
        }
    }

    public qh2() {
        this.b = mh2.b();
        this.c = mh2.b();
        this.d = mh2.b();
        this.e = mh2.b();
        this.f = new ch2(0.0f);
        this.g = new ch2(0.0f);
        this.h = new ch2(0.0f);
        this.i = new ch2(0.0f);
        this.j = mh2.c();
        this.k = mh2.c();
        this.l = mh2.c();
        this.m = mh2.c();
    }
}