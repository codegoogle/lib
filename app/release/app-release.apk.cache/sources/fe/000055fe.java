package com.p7700g.p99005;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.p7700g.p99005.c3;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialAlertDialogBuilder.java */
/* loaded from: classes3.dex */
public class pd2 extends c3.a {
    @q0
    private static final int c = ga2.c.L;
    @m2
    private static final int d = ga2.n.w4;
    @q0
    private static final int e = ga2.c.Fa;
    @z1
    private Drawable f;
    @x1
    @b1
    private final Rect g;

    public pd2(@x1 Context context) {
        this(context, 0);
    }

    private static Context P(@x1 Context context) {
        int R = R(context);
        Context c2 = yi2.c(context, null, c, d);
        return R == 0 ? c2 : new d4(c2, R);
    }

    private static int R(@x1 Context context) {
        TypedValue a = rg2.a(context, e);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    private static int S(@x1 Context context, int i) {
        return i == 0 ? R(context) : i;
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: A0 */
    public pd2 G(@z1 Cursor cursor, int i, @x1 String str, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.G(cursor, i, str, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: B0 */
    public pd2 H(@z1 ListAdapter listAdapter, int i, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.H(listAdapter, i, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: C0 */
    public pd2 I(@z1 CharSequence[] charSequenceArr, int i, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.I(charSequenceArr, i, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: D0 */
    public pd2 J(@l2 int i) {
        return (pd2) super.J(i);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: E0 */
    public pd2 K(@z1 CharSequence charSequence) {
        return (pd2) super.K(charSequence);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: F0 */
    public pd2 L(int i) {
        return (pd2) super.L(i);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: G0 */
    public pd2 M(@z1 View view) {
        return (pd2) super.M(view);
    }

    @z1
    public Drawable Q() {
        return this.f;
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: T */
    public pd2 c(@z1 ListAdapter listAdapter, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.c(listAdapter, onClickListener);
    }

    @x1
    public pd2 U(@z1 Drawable drawable) {
        this.f = drawable;
        return this;
    }

    @x1
    public pd2 V(@c2 int i) {
        this.g.bottom = i;
        return this;
    }

    @x1
    public pd2 W(@c2 int i) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.g.left = i;
        } else {
            this.g.right = i;
        }
        return this;
    }

    @x1
    public pd2 X(@c2 int i) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.g.right = i;
        } else {
            this.g.left = i;
        }
        return this;
    }

    @x1
    public pd2 Y(@c2 int i) {
        this.g.top = i;
        return this;
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: Z */
    public pd2 d(boolean z) {
        return (pd2) super.d(z);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    public c3 a() {
        c3 a = super.a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f;
        if (drawable instanceof lh2) {
            ((lh2) drawable).n0(sr.Q(decorView));
        }
        window.setBackgroundDrawable(qd2.b(this.f, this.g));
        decorView.setOnTouchListener(new od2(a, this.g));
        return a;
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: a0 */
    public pd2 e(@z1 Cursor cursor, @z1 DialogInterface.OnClickListener onClickListener, @x1 String str) {
        return (pd2) super.e(cursor, onClickListener, str);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: b0 */
    public pd2 f(@z1 View view) {
        return (pd2) super.f(view);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: c0 */
    public pd2 g(@f1 int i) {
        return (pd2) super.g(i);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: d0 */
    public pd2 h(@z1 Drawable drawable) {
        return (pd2) super.h(drawable);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: e0 */
    public pd2 i(@q0 int i) {
        return (pd2) super.i(i);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: f0 */
    public pd2 k(@p0 int i, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.k(i, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: g0 */
    public pd2 l(@z1 CharSequence[] charSequenceArr, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.l(charSequenceArr, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: h0 */
    public pd2 m(@l2 int i) {
        return (pd2) super.m(i);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: i0 */
    public pd2 n(@z1 CharSequence charSequence) {
        return (pd2) super.n(charSequence);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: j0 */
    public pd2 o(@p0 int i, @z1 boolean[] zArr, @z1 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (pd2) super.o(i, zArr, onMultiChoiceClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: k0 */
    public pd2 p(@z1 Cursor cursor, @x1 String str, @x1 String str2, @z1 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (pd2) super.p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: l0 */
    public pd2 q(@z1 CharSequence[] charSequenceArr, @z1 boolean[] zArr, @z1 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (pd2) super.q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: m0 */
    public pd2 r(@l2 int i, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.r(i, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: n0 */
    public pd2 s(@z1 CharSequence charSequence, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.s(charSequence, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: o0 */
    public pd2 t(@z1 Drawable drawable) {
        return (pd2) super.t(drawable);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: p0 */
    public pd2 u(@l2 int i, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.u(i, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: q0 */
    public pd2 v(@z1 CharSequence charSequence, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.v(charSequence, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: r0 */
    public pd2 w(@z1 Drawable drawable) {
        return (pd2) super.w(drawable);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: s0 */
    public pd2 x(@z1 DialogInterface.OnCancelListener onCancelListener) {
        return (pd2) super.x(onCancelListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: t0 */
    public pd2 y(@z1 DialogInterface.OnDismissListener onDismissListener) {
        return (pd2) super.y(onDismissListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: u0 */
    public pd2 z(@z1 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (pd2) super.z(onItemSelectedListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: v0 */
    public pd2 A(@z1 DialogInterface.OnKeyListener onKeyListener) {
        return (pd2) super.A(onKeyListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: w0 */
    public pd2 B(@l2 int i, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.B(i, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: x0 */
    public pd2 C(@z1 CharSequence charSequence, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.C(charSequence, onClickListener);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: y0 */
    public pd2 D(@z1 Drawable drawable) {
        return (pd2) super.D(drawable);
    }

    @Override // com.p7700g.p99005.c3.a
    @x1
    /* renamed from: z0 */
    public pd2 F(@p0 int i, int i2, @z1 DialogInterface.OnClickListener onClickListener) {
        return (pd2) super.F(i, i2, onClickListener);
    }

    public pd2(@x1 Context context, int i) {
        super(P(context), S(context, i));
        Context b = b();
        Resources.Theme theme = b.getTheme();
        int i2 = c;
        int i3 = d;
        this.g = qd2.a(b, i2, i3);
        int c2 = kc2.c(b, ga2.c.o3, getClass().getCanonicalName());
        lh2 lh2Var = new lh2(b, null, i2, i3);
        lh2Var.Z(b);
        lh2Var.o0(ColorStateList.valueOf(c2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                lh2Var.k0(dimension);
            }
        }
        this.f = lh2Var;
    }
}