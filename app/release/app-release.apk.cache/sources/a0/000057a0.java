package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Slide.java */
/* loaded from: classes.dex */
public class q80 extends r90 {
    private static final String R0 = "android:slide:screenPosition";
    private g Y0;
    private int Z0;
    private static final TimeInterpolator P0 = new DecelerateInterpolator();
    private static final TimeInterpolator Q0 = new AccelerateInterpolator();
    private static final g S0 = new a();
    private static final g T0 = new b();
    private static final g U0 = new c();
    private static final g V0 = new d();
    private static final g W0 = new e();
    private static final g X0 = new f();

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class a extends h {
        public a() {
            super(null);
        }

        @Override // com.p7700g.p99005.q80.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class b extends h {
        public b() {
            super(null);
        }

        @Override // com.p7700g.p99005.q80.g
        public float b(ViewGroup viewGroup, View view) {
            if (sr.Y(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class c extends i {
        public c() {
            super(null);
        }

        @Override // com.p7700g.p99005.q80.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class d extends h {
        public d() {
            super(null);
        }

        @Override // com.p7700g.p99005.q80.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class e extends h {
        public e() {
            super(null);
        }

        @Override // com.p7700g.p99005.q80.g
        public float b(ViewGroup viewGroup, View view) {
            if (sr.Y(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class f extends i {
        public f() {
            super(null);
        }

        @Override // com.p7700g.p99005.q80.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static abstract class h implements g {
        private h() {
        }

        @Override // com.p7700g.p99005.q80.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static abstract class i implements g {
        private i() {
        }

        @Override // com.p7700g.p99005.q80.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* compiled from: Slide.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    public q80() {
        this.Y0 = X0;
        this.Z0 = 80;
        b1(80);
    }

    private void Q0(z80 z80Var) {
        int[] iArr = new int[2];
        z80Var.b.getLocationOnScreen(iArr);
        z80Var.a.put(R0, iArr);
    }

    @Override // com.p7700g.p99005.r90
    public Animator U0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        if (z80Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) z80Var2.a.get(R0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return b90.a(view, z80Var2, iArr[0], iArr[1], this.Y0.b(viewGroup, view), this.Y0.a(viewGroup, view), translationX, translationY, P0, this);
    }

    @Override // com.p7700g.p99005.r90
    public Animator W0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        if (z80Var == null) {
            return null;
        }
        int[] iArr = (int[]) z80Var.a.get(R0);
        return b90.a(view, z80Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.Y0.b(viewGroup, view), this.Y0.a(viewGroup, view), Q0, this);
    }

    public int a1() {
        return this.Z0;
    }

    public void b1(int i2) {
        if (i2 == 3) {
            this.Y0 = S0;
        } else if (i2 == 5) {
            this.Y0 = V0;
        } else if (i2 == 48) {
            this.Y0 = U0;
        } else if (i2 == 80) {
            this.Y0 = X0;
        } else if (i2 == 8388611) {
            this.Y0 = T0;
        } else if (i2 == 8388613) {
            this.Y0 = W0;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.Z0 = i2;
        p80 p80Var = new p80();
        p80Var.k(i2);
        L0(p80Var);
    }

    @Override // com.p7700g.p99005.r90, com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        super.n(z80Var);
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.r90, com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        super.t(z80Var);
        Q0(z80Var);
    }

    public q80(int i2) {
        this.Y0 = X0;
        this.Z0 = 80;
        b1(i2);
    }

    @SuppressLint({"RestrictedApi"})
    public q80(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = X0;
        this.Z0 = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.h);
        int k = ri.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        b1(k);
    }
}