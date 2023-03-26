package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.oi;

/* compiled from: TextAppearance.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class tg2 {
    private static final String a = "TextAppearance";
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    @z1
    public final ColorStateList e;
    @z1
    public final ColorStateList f;
    @z1
    public final ColorStateList g;
    @z1
    public final String h;
    public final int i;
    public final int j;
    public final boolean k;
    public final float l;
    public final float m;
    public final float n;
    public final boolean o;
    public final float p;
    @z1
    private ColorStateList q;
    private float r;
    @h1
    private final int s;
    private boolean t = false;
    private Typeface u;

    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    public class a extends oi.g {
        public final /* synthetic */ vg2 a;

        public a(vg2 vg2Var) {
            this.a = vg2Var;
        }

        @Override // com.p7700g.p99005.oi.g
        public void onFontRetrievalFailed(int i) {
            tg2.this.t = true;
            this.a.a(i);
        }

        @Override // com.p7700g.p99005.oi.g
        public void onFontRetrieved(@x1 Typeface typeface) {
            tg2 tg2Var = tg2.this;
            tg2Var.u = Typeface.create(typeface, tg2Var.i);
            tg2.this.t = true;
            this.a.b(tg2.this.u, false);
        }
    }

    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    public class b extends vg2 {
        public final /* synthetic */ Context a;
        public final /* synthetic */ TextPaint b;
        public final /* synthetic */ vg2 c;

        public b(Context context, TextPaint textPaint, vg2 vg2Var) {
            this.a = context;
            this.b = textPaint;
            this.c = vg2Var;
        }

        @Override // com.p7700g.p99005.vg2
        public void a(int i) {
            this.c.a(i);
        }

        @Override // com.p7700g.p99005.vg2
        public void b(@x1 Typeface typeface, boolean z) {
            tg2.this.p(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public tg2(@x1 Context context, @m2 int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ga2.o.vt);
        l(obtainStyledAttributes.getDimension(ga2.o.wt, 0.0f));
        k(sg2.a(context, obtainStyledAttributes, ga2.o.zt));
        this.e = sg2.a(context, obtainStyledAttributes, ga2.o.At);
        this.f = sg2.a(context, obtainStyledAttributes, ga2.o.Bt);
        this.i = obtainStyledAttributes.getInt(ga2.o.yt, 0);
        this.j = obtainStyledAttributes.getInt(ga2.o.xt, 1);
        int f = sg2.f(obtainStyledAttributes, ga2.o.It, ga2.o.Gt);
        this.s = obtainStyledAttributes.getResourceId(f, 0);
        this.h = obtainStyledAttributes.getString(f);
        this.k = obtainStyledAttributes.getBoolean(ga2.o.Kt, false);
        this.g = sg2.a(context, obtainStyledAttributes, ga2.o.Ct);
        this.l = obtainStyledAttributes.getFloat(ga2.o.Dt, 0.0f);
        this.m = obtainStyledAttributes.getFloat(ga2.o.Et, 0.0f);
        this.n = obtainStyledAttributes.getFloat(ga2.o.Ft, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, ga2.o.ym);
        int i2 = ga2.o.zm;
        this.o = obtainStyledAttributes2.hasValue(i2);
        this.p = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.u == null && (str = this.h) != null) {
            this.u = Typeface.create(str, this.i);
        }
        if (this.u == null) {
            int i = this.j;
            if (i == 1) {
                this.u = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.u = Typeface.SERIF;
            } else if (i != 3) {
                this.u = Typeface.DEFAULT;
            } else {
                this.u = Typeface.MONOSPACE;
            }
            this.u = Typeface.create(this.u, this.i);
        }
    }

    private boolean m(Context context) {
        if (ug2.b()) {
            return true;
        }
        int i = this.s;
        return (i != 0 ? oi.d(context, i) : null) != null;
    }

    public Typeface e() {
        d();
        return this.u;
    }

    @x1
    @r2
    public Typeface f(@x1 Context context) {
        if (this.t) {
            return this.u;
        }
        if (!context.isRestricted()) {
            try {
                Typeface j = oi.j(context, this.s);
                this.u = j;
                if (j != null) {
                    this.u = Typeface.create(j, this.i);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.t = true;
        return this.u;
    }

    public void g(@x1 Context context, @x1 TextPaint textPaint, @x1 vg2 vg2Var) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, vg2Var));
    }

    public void h(@x1 Context context, @x1 vg2 vg2Var) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.s;
        if (i == 0) {
            this.t = true;
        }
        if (this.t) {
            vg2Var.b(this.u, true);
            return;
        }
        try {
            oi.l(context, i, new a(vg2Var), null);
        } catch (Resources.NotFoundException unused) {
            this.t = true;
            vg2Var.a(1);
        } catch (Exception unused2) {
            this.t = true;
            vg2Var.a(-3);
        }
    }

    @z1
    public ColorStateList i() {
        return this.q;
    }

    public float j() {
        return this.r;
    }

    public void k(@z1 ColorStateList colorStateList) {
        this.q = colorStateList;
    }

    public void l(float f) {
        this.r = f;
    }

    public void n(@x1 Context context, @x1 TextPaint textPaint, @x1 vg2 vg2Var) {
        o(context, textPaint, vg2Var);
        ColorStateList colorStateList = this.q;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : sr.t);
        float f = this.n;
        float f2 = this.l;
        float f3 = this.m;
        ColorStateList colorStateList2 = this.g;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@x1 Context context, @x1 TextPaint textPaint, @x1 vg2 vg2Var) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, vg2Var);
        }
    }

    public void p(@x1 Context context, @x1 TextPaint textPaint, @x1 Typeface typeface) {
        Typeface a2 = wg2.a(context, typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i = this.i & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.r);
        if (this.o) {
            textPaint.setLetterSpacing(this.p);
        }
    }
}