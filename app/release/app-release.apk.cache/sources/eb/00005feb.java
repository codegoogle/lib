package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.x2;

/* compiled from: NavigationView.java */
/* loaded from: classes3.dex */
public class uf2 extends we2 {
    private static final int A = 1;
    private static final int[] x = {16842912};
    private static final int[] y = {-16842910};
    private static final int z = ga2.n.fe;
    @x1
    private final qe2 B;
    private final re2 C;
    public c D;
    private final int E;
    private final int[] F;
    private MenuInflater G;
    private ViewTreeObserver.OnGlobalLayoutListener H;
    private boolean I;
    private boolean J;
    private int K;
    @c2
    private int L;
    @z1
    private Path M;
    private final RectF N;

    /* compiled from: NavigationView.java */
    /* loaded from: classes3.dex */
    public class a implements p4.a {
        public a() {
        }

        @Override // com.p7700g.p99005.p4.a
        public boolean onMenuItemSelected(p4 p4Var, MenuItem menuItem) {
            c cVar = uf2.this.D;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // com.p7700g.p99005.p4.a
        public void onMenuModeChange(p4 p4Var) {
        }
    }

    /* compiled from: NavigationView.java */
    /* loaded from: classes3.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            uf2 uf2Var = uf2.this;
            uf2Var.getLocationOnScreen(uf2Var.F);
            boolean z = true;
            boolean z2 = uf2.this.F[1] == 0;
            uf2.this.C.u(z2);
            uf2 uf2Var2 = uf2.this;
            uf2Var2.setDrawTopInsetForeground(z2 && uf2Var2.m());
            Activity a = ie2.a(uf2.this.getContext());
            if (a != null) {
                boolean z3 = a.findViewById(16908290).getHeight() == uf2.this.getHeight();
                boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                uf2 uf2Var3 = uf2.this;
                uf2Var3.setDrawBottomInsetForeground((z3 && z4 && uf2Var3.l()) ? false : false);
            }
        }
    }

    /* compiled from: NavigationView.java */
    /* loaded from: classes3.dex */
    public interface c {
        boolean a(@x1 MenuItem menuItem);
    }

    public uf2(@x1 Context context) {
        this(context, null);
    }

    @z1
    private ColorStateList e(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList a2 = r3.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(x2.b.J0, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a2.getDefaultColor();
                int[] iArr = y;
                return new ColorStateList(new int[][]{iArr, x, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    @x1
    private Drawable f(@x1 TintTypedArray tintTypedArray) {
        return g(tintTypedArray, sg2.b(getContext(), tintTypedArray, ga2.o.ip));
    }

    @x1
    private Drawable g(@x1 TintTypedArray tintTypedArray, @z1 ColorStateList colorStateList) {
        lh2 lh2Var = new lh2(qh2.b(getContext(), tintTypedArray.getResourceId(ga2.o.gp, 0), tintTypedArray.getResourceId(ga2.o.hp, 0)).m());
        lh2Var.o0(colorStateList);
        return new InsetDrawable((Drawable) lh2Var, tintTypedArray.getDimensionPixelSize(ga2.o.lp, 0), tintTypedArray.getDimensionPixelSize(ga2.o.mp, 0), tintTypedArray.getDimensionPixelSize(ga2.o.kp, 0), tintTypedArray.getDimensionPixelSize(ga2.o.jp, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.G == null) {
            this.G = new g4(getContext());
        }
        return this.G;
    }

    private boolean i(@x1 TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(ga2.o.gp) || tintTypedArray.hasValue(ga2.o.hp);
    }

    private void n(@c2 int i, @c2 int i2) {
        if ((getParent() instanceof mu) && this.L > 0 && (getBackground() instanceof lh2)) {
            lh2 lh2Var = (lh2) getBackground();
            qh2.b v = lh2Var.getShapeAppearanceModel().v();
            if (nq.d(this.K, sr.Y(this)) == 3) {
                v.P(this.L);
                v.C(this.L);
            } else {
                v.K(this.L);
                v.x(this.L);
            }
            lh2Var.setShapeAppearanceModel(v.m());
            if (this.M == null) {
                this.M = new Path();
            }
            this.M.reset();
            this.N.set(0.0f, 0.0f, i, i2);
            rh2.k().d(lh2Var.getShapeAppearanceModel(), lh2Var.z(), this.N, this.M);
            invalidate();
            return;
        }
        this.M = null;
        this.N.setEmpty();
    }

    private void p() {
        this.H = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.H);
    }

    @Override // com.p7700g.p99005.we2
    @i2({i2.a.LIBRARY_GROUP})
    public void a(@x1 gs gsVar) {
        this.C.c(gsVar);
    }

    public void d(@x1 View view) {
        this.C.b(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@x1 Canvas canvas) {
        if (this.M == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.M);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @z1
    public MenuItem getCheckedItem() {
        return this.C.d();
    }

    @c2
    public int getDividerInsetEnd() {
        return this.C.e();
    }

    @c2
    public int getDividerInsetStart() {
        return this.C.f();
    }

    public int getHeaderCount() {
        return this.C.g();
    }

    @z1
    public Drawable getItemBackground() {
        return this.C.i();
    }

    @b1
    public int getItemHorizontalPadding() {
        return this.C.j();
    }

    @b1
    public int getItemIconPadding() {
        return this.C.k();
    }

    @z1
    public ColorStateList getItemIconTintList() {
        return this.C.n();
    }

    public int getItemMaxLines() {
        return this.C.l();
    }

    @z1
    public ColorStateList getItemTextColor() {
        return this.C.m();
    }

    @c2
    public int getItemVerticalPadding() {
        return this.C.o();
    }

    @x1
    public Menu getMenu() {
        return this.B;
    }

    @c2
    public int getSubheaderInsetEnd() {
        return this.C.p();
    }

    @c2
    public int getSubheaderInsetStart() {
        return this.C.q();
    }

    public View h(int i) {
        return this.C.h(i);
    }

    public View j(@s1 int i) {
        return this.C.r(i);
    }

    public void k(int i) {
        this.C.O(true);
        getMenuInflater().inflate(i, this.B);
        this.C.O(false);
        this.C.updateMenuView(false);
    }

    public boolean l() {
        return this.J;
    }

    public boolean m() {
        return this.I;
    }

    public void o(@x1 View view) {
        this.C.t(view);
    }

    @Override // com.p7700g.p99005.we2, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.e(this);
    }

    @Override // com.p7700g.p99005.we2, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.H);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.E), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.E, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.B.U(dVar.s);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.s = bundle;
        this.B.W(bundle);
        return dVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        n(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.J = z2;
    }

    public void setCheckedItem(@m1 int i) {
        MenuItem findItem = this.B.findItem(i);
        if (findItem != null) {
            this.C.v((s4) findItem);
        }
    }

    public void setDividerInsetEnd(@c2 int i) {
        this.C.w(i);
    }

    public void setDividerInsetStart(@c2 int i) {
        this.C.x(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        mh2.d(this, f);
    }

    public void setItemBackground(@z1 Drawable drawable) {
        this.C.z(drawable);
    }

    public void setItemBackgroundResource(@f1 int i) {
        setItemBackground(gh.i(getContext(), i));
    }

    public void setItemHorizontalPadding(@b1 int i) {
        this.C.B(i);
    }

    public void setItemHorizontalPaddingResource(@a1 int i) {
        this.C.B(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@b1 int i) {
        this.C.C(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.C.C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@b1 int i) {
        this.C.D(i);
    }

    public void setItemIconTintList(@z1 ColorStateList colorStateList) {
        this.C.E(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.C.F(i);
    }

    public void setItemTextAppearance(@m2 int i) {
        this.C.G(i);
    }

    public void setItemTextColor(@z1 ColorStateList colorStateList) {
        this.C.H(colorStateList);
    }

    public void setItemVerticalPadding(@c2 int i) {
        this.C.I(i);
    }

    public void setItemVerticalPaddingResource(@a1 int i) {
        this.C.I(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@z1 c cVar) {
        this.D = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        re2 re2Var = this.C;
        if (re2Var != null) {
            re2Var.J(i);
        }
    }

    public void setSubheaderInsetEnd(@c2 int i) {
        this.C.M(i);
    }

    public void setSubheaderInsetStart(@c2 int i) {
        this.C.M(i);
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.I = z2;
    }

    /* compiled from: NavigationView.java */
    /* loaded from: classes3.dex */
    public static class d extends au {
        public static final Parcelable.Creator<d> CREATOR = new a();
        @z1
        public Bundle s;

        /* compiled from: NavigationView.java */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            @z1
            /* renamed from: a */
            public d createFromParcel(@x1 Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public d createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(@x1 Parcel parcel, @z1 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.s = parcel.readBundle(classLoader);
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.s);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public uf2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.mc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uf2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r9), attributeSet, i);
        ColorStateList e;
        int i2 = z;
        re2 re2Var = new re2();
        this.C = re2Var;
        this.F = new int[2];
        this.I = true;
        this.J = true;
        this.K = 0;
        this.L = 0;
        this.N = new RectF();
        Context context2 = getContext();
        qe2 qe2Var = new qe2(context2);
        this.B = qe2Var;
        TintTypedArray k = cf2.k(context2, attributeSet, ga2.o.Oo, i, i2, new int[0]);
        int i3 = ga2.o.Qo;
        if (k.hasValue(i3)) {
            sr.H1(this, k.getDrawable(i3));
        }
        this.L = k.getDimensionPixelSize(ga2.o.Wo, 0);
        this.K = k.getInt(ga2.o.Po, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            qh2 m = qh2.e(context2, attributeSet, i, i2).m();
            Drawable background = getBackground();
            lh2 lh2Var = new lh2(m);
            if (background instanceof ColorDrawable) {
                lh2Var.o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            lh2Var.Z(context2);
            sr.H1(this, lh2Var);
        }
        int i4 = ga2.o.Xo;
        if (k.hasValue(i4)) {
            setElevation(k.getDimensionPixelSize(i4, 0));
        }
        setFitsSystemWindows(k.getBoolean(ga2.o.Ro, false));
        this.E = k.getDimensionPixelSize(ga2.o.So, 0);
        int i5 = ga2.o.tp;
        ColorStateList colorStateList = k.hasValue(i5) ? k.getColorStateList(i5) : null;
        int i6 = ga2.o.wp;
        int resourceId = k.hasValue(i6) ? k.getResourceId(i6, 0) : 0;
        if (resourceId == 0 && colorStateList == null) {
            colorStateList = e(16842808);
        }
        int i7 = ga2.o.dp;
        if (k.hasValue(i7)) {
            e = k.getColorStateList(i7);
        } else {
            e = e(16842808);
        }
        int i8 = ga2.o.np;
        int resourceId2 = k.hasValue(i8) ? k.getResourceId(i8, 0) : 0;
        int i9 = ga2.o.cp;
        if (k.hasValue(i9)) {
            setItemIconSize(k.getDimensionPixelSize(i9, 0));
        }
        int i10 = ga2.o.op;
        ColorStateList colorStateList2 = k.hasValue(i10) ? k.getColorStateList(i10) : null;
        if (resourceId2 == 0 && colorStateList2 == null) {
            colorStateList2 = e(16842806);
        }
        Drawable drawable = k.getDrawable(ga2.o.Zo);
        if (drawable == null && i(k)) {
            drawable = f(k);
            ColorStateList b2 = sg2.b(context2, k, ga2.o.fp);
            if (b2 != null) {
                re2Var.A(new RippleDrawable(yg2.d(b2), null, g(k, null)));
            }
        }
        int i11 = ga2.o.ap;
        if (k.hasValue(i11)) {
            setItemHorizontalPadding(k.getDimensionPixelSize(i11, 0));
        }
        int i12 = ga2.o.pp;
        if (k.hasValue(i12)) {
            setItemVerticalPadding(k.getDimensionPixelSize(i12, 0));
        }
        setDividerInsetStart(k.getDimensionPixelSize(ga2.o.Vo, 0));
        setDividerInsetEnd(k.getDimensionPixelSize(ga2.o.Uo, 0));
        setSubheaderInsetStart(k.getDimensionPixelSize(ga2.o.vp, 0));
        setSubheaderInsetEnd(k.getDimensionPixelSize(ga2.o.up, 0));
        setTopInsetScrimEnabled(k.getBoolean(ga2.o.xp, this.I));
        setBottomInsetScrimEnabled(k.getBoolean(ga2.o.To, this.J));
        int dimensionPixelSize = k.getDimensionPixelSize(ga2.o.bp, 0);
        setItemMaxLines(k.getInt(ga2.o.ep, 1));
        qe2Var.X(new a());
        re2Var.y(1);
        re2Var.initForMenu(context2, qe2Var);
        if (resourceId != 0) {
            re2Var.N(resourceId);
        }
        re2Var.K(colorStateList);
        re2Var.E(e);
        re2Var.J(getOverScrollMode());
        if (resourceId2 != 0) {
            re2Var.G(resourceId2);
        }
        re2Var.H(colorStateList2);
        re2Var.z(drawable);
        re2Var.C(dimensionPixelSize);
        qe2Var.b(re2Var);
        addView((View) re2Var.getMenuView(this));
        int i13 = ga2.o.qp;
        if (k.hasValue(i13)) {
            k(k.getResourceId(i13, 0));
        }
        int i14 = ga2.o.Yo;
        if (k.hasValue(i14)) {
            j(k.getResourceId(i14, 0));
        }
        k.recycle();
        p();
    }

    public void setCheckedItem(@x1 MenuItem menuItem) {
        MenuItem findItem = this.B.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.C.v((s4) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}