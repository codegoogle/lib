package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public class q70 extends s80 {
    private static final String I0 = "android:changeBounds:bounds";
    private static final String J0 = "android:changeBounds:clip";
    private static final String K0 = "android:changeBounds:parent";
    private static final String L0 = "android:changeBounds:windowX";
    private static final String M0 = "android:changeBounds:windowY";
    private static final String[] N0 = {I0, J0, K0, L0, M0};
    private static final Property<Drawable, PointF> O0 = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> P0 = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q0 = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R0 = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S0 = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T0 = new g(PointF.class, "position");
    private static n80 U0 = new n80();
    private int[] V0;
    private boolean W0;
    private boolean X0;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup s;
        public final /* synthetic */ BitmapDrawable t;
        public final /* synthetic */ View u;
        public final /* synthetic */ float v;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.s = viewGroup;
            this.t = bitmapDrawable;
            this.u = view;
            this.v = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k90.b(this.s).b(this.t);
            k90.h(this.u, this.v);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class b extends Property<Drawable, PointF> {
        private Rect a;

        public b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            k90.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            k90.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            k90.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        private k mViewBounds;
        public final /* synthetic */ k s;

        public h(k kVar) {
            this.s = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {
        private boolean s;
        public final /* synthetic */ View t;
        public final /* synthetic */ Rect u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.t = view;
            this.u = rect;
            this.v = i;
            this.w = i2;
            this.x = i3;
            this.y = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.s) {
                return;
            }
            sr.L1(this.t, this.u);
            k90.g(this.t, this.v, this.w, this.x, this.y);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class j extends u80 {
        public boolean s = false;
        public final /* synthetic */ ViewGroup t;

        public j(ViewGroup viewGroup) {
            this.t = viewGroup;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void b(@x1 s80 s80Var) {
            f90.d(this.t, false);
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            if (!this.s) {
                f90.d(this.t, false);
            }
            s80Var.v0(this);
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void d(@x1 s80 s80Var) {
            f90.d(this.t, false);
            this.s = true;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void e(@x1 s80 s80Var) {
            f90.d(this.t, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class k {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        public k(View view) {
            this.e = view;
        }

        private void b() {
            k90.g(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    public q70() {
        this.V0 = new int[2];
        this.W0 = false;
        this.X0 = false;
    }

    private void Q0(z80 z80Var) {
        View view = z80Var.b;
        if (!sr.T0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        z80Var.a.put(I0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        z80Var.a.put(K0, z80Var.b.getParent());
        if (this.X0) {
            z80Var.b.getLocationInWindow(this.V0);
            z80Var.a.put(L0, Integer.valueOf(this.V0[0]));
            z80Var.a.put(M0, Integer.valueOf(this.V0[1]));
        }
        if (this.W0) {
            z80Var.a.put(J0, sr.O(view));
        }
    }

    private boolean S0(View view, View view2) {
        if (this.X0) {
            z80 V = V(view, true);
            if (V == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == V.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public Animator A(@x1 ViewGroup viewGroup, @z1 z80 z80Var, @z1 z80 z80Var2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (z80Var == null || z80Var2 == null) {
            return null;
        }
        Map<String, Object> map = z80Var.a;
        Map<String, Object> map2 = z80Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(K0);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(K0);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = z80Var2.b;
        if (S0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) z80Var.a.get(I0);
            Rect rect3 = (Rect) z80Var2.a.get(I0);
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Rect rect4 = (Rect) z80Var.a.get(J0);
            Rect rect5 = (Rect) z80Var2.a.get(J0);
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (i8 != i9 || i10 != i11) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 > 0) {
                if (!this.W0) {
                    view = view2;
                    k90.g(view, i4, i6, i8, i10);
                    if (i2 == 2) {
                        if (i12 == i14 && i13 == i15) {
                            c2 = h80.a(view, T0, Z().a(i4, i6, i5, i7));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a2 = h80.a(kVar, P0, Z().a(i4, i6, i5, i7));
                            ObjectAnimator a3 = h80.a(kVar, Q0, Z().a(i8, i10, i9, i11));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a2, a3);
                            animatorSet.addListener(new h(kVar));
                            c2 = animatorSet;
                        }
                    } else if (i4 == i5 && i6 == i7) {
                        c2 = h80.a(view, R0, Z().a(i8, i10, i9, i11));
                    } else {
                        c2 = h80.a(view, S0, Z().a(i4, i6, i5, i7));
                    }
                } else {
                    view = view2;
                    k90.g(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                    ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : h80.a(view, T0, Z().a(i4, i6, i5, i7));
                    if (rect4 == null) {
                        i3 = 0;
                        rect = new Rect(0, 0, i12, i13);
                    } else {
                        i3 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        sr.L1(view, rect);
                        n80 n80Var = U0;
                        Object[] objArr = new Object[2];
                        objArr[i3] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", n80Var, objArr);
                        ofObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                        objectAnimator = ofObject;
                    }
                    c2 = y80.c(a4, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    f90.d(viewGroup4, true);
                    a(new j(viewGroup4));
                }
                return c2;
            }
            return null;
        }
        int intValue = ((Integer) z80Var.a.get(L0)).intValue();
        int intValue2 = ((Integer) z80Var.a.get(M0)).intValue();
        int intValue3 = ((Integer) z80Var2.a.get(L0)).intValue();
        int intValue4 = ((Integer) z80Var2.a.get(M0)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.V0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c3 = k90.c(view2);
        k90.h(view2, 0.0f);
        k90.b(viewGroup).a(bitmapDrawable);
        i80 Z = Z();
        int[] iArr = this.V0;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, l80.a(O0, Z.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c3));
        return ofPropertyValuesHolder;
    }

    public boolean R0() {
        return this.W0;
    }

    public void T0(boolean z) {
        this.W0 = z;
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public String[] h0() {
        return N0;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @SuppressLint({"RestrictedApi"})
    public q70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V0 = new int[2];
        this.W0 = false;
        this.X0 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.d);
        boolean e2 = ri.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        T0(e2);
    }
}