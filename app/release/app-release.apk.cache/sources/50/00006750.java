package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.wh2;
import com.p7700g.p99005.xh2;
import com.p7700g.p99005.yh2;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseSlider.java */
/* loaded from: classes3.dex */
public abstract class yh2<S extends yh2<S, L, T>, L extends wh2<S>, T extends xh2<S>> extends View {
    private static final String A = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String B = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static final int C = 200;
    private static final int D = 63;
    private static final double E = 1.0E-4d;
    public static final int G = 1;
    public static final int H = 0;
    private static final long I = 83;
    private static final long J = 117;
    private static final String t = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String u = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String v = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String w = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final String x = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String y = "minSeparation(%s) must be greater or equal to 0";
    private static final String z = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private int G0;
    private int H0;
    private float I0;
    private MotionEvent J0;
    @x1
    private final Paint K;
    private ai2 K0;
    @x1
    private final Paint L;
    private boolean L0;
    @x1
    private final Paint M;
    private float M0;
    @x1
    private final Paint N;
    private float N0;
    @x1
    private final Paint O;
    private ArrayList<Float> O0;
    @x1
    private final Paint P;
    private int P0;
    @x1
    private final e Q;
    private int Q0;
    private final AccessibilityManager R;
    private float R0;
    private yh2<S, L, T>.d S;
    private float[] S0;
    @x1
    private final g T;
    private boolean T0;
    @x1
    private final List<kj2> U;
    private int U0;
    @x1
    private final List<L> V;
    private boolean V0;
    @x1
    private final List<T> W;
    private boolean W0;
    private boolean X0;
    @x1
    private ColorStateList Y0;
    @x1
    private ColorStateList Z0;
    @x1
    private ColorStateList a1;
    @x1
    private ColorStateList b1;
    @x1
    private ColorStateList c1;
    @x1
    private final lh2 d1;
    @z1
    private Drawable e1;
    @x1
    private List<Drawable> f1;
    private float g1;
    private int h1;
    private boolean u0;
    private ValueAnimator v0;
    private ValueAnimator w0;
    private final int x0;
    private int y0;
    private int z0;
    private static final String s = yh2.class.getSimpleName();
    public static final int F = ga2.n.Di;

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public class a implements g {
        public final /* synthetic */ AttributeSet a;
        public final /* synthetic */ int b;

        public a(AttributeSet attributeSet, int i) {
            this.a = attributeSet;
            this.b = i;
        }

        @Override // com.p7700g.p99005.yh2.g
        public kj2 a() {
            TypedArray j = cf2.j(yh2.this.getContext(), this.a, ga2.o.vr, this.b, yh2.F, new int[0]);
            kj2 b0 = yh2.b0(yh2.this.getContext(), j);
            j.recycle();
            return b0;
        }
    }

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (kj2 kj2Var : yh2.this.U) {
                kj2Var.l1(floatValue);
            }
            sr.m1(yh2.this);
        }
    }

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (kj2 kj2Var : yh2.this.U) {
                kf2.h(yh2.this).b(kj2Var);
            }
        }
    }

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public static class e extends bu {
        private final yh2<?, ?, ?> t;
        public final Rect u;

        public e(yh2<?, ?, ?> yh2Var) {
            super(yh2Var);
            this.u = new Rect();
            this.t = yh2Var;
        }

        @x1
        private String a0(int i) {
            if (i == this.t.getValues().size() - 1) {
                return this.t.getContext().getString(ga2.m.r0);
            }
            return i == 0 ? this.t.getContext().getString(ga2.m.s0) : "";
        }

        @Override // com.p7700g.p99005.bu
        public int C(float f, float f2) {
            for (int i = 0; i < this.t.getValues().size(); i++) {
                this.t.p0(i, this.u);
                if (this.u.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // com.p7700g.p99005.bu
        public void D(List<Integer> list) {
            for (int i = 0; i < this.t.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // com.p7700g.p99005.bu
        public boolean N(int i, int i2, Bundle bundle) {
            if (this.t.isEnabled()) {
                if (i2 == 4096 || i2 == 8192) {
                    float n = this.t.n(20);
                    if (i2 == 8192) {
                        n = -n;
                    }
                    if (this.t.O()) {
                        n = -n;
                    }
                    if (this.t.n0(i, bm.d(this.t.getValues().get(i).floatValue() + n, this.t.getValueFrom(), this.t.getValueTo()))) {
                        this.t.q0();
                        this.t.postInvalidate();
                        G(i);
                        return true;
                    }
                    return false;
                }
                if (i2 == 16908349 && bundle != null && bundle.containsKey(ls.T)) {
                    if (this.t.n0(i, bundle.getFloat(ls.T))) {
                        this.t.q0();
                        this.t.postInvalidate();
                        G(i);
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // com.p7700g.p99005.bu
        public void R(int i, ls lsVar) {
            lsVar.b(ls.a.I);
            List<Float> values = this.t.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.t.getValueFrom();
            float valueTo = this.t.getValueTo();
            if (this.t.isEnabled()) {
                if (floatValue > valueFrom) {
                    lsVar.a(8192);
                }
                if (floatValue < valueTo) {
                    lsVar.a(4096);
                }
            }
            lsVar.C1(ls.d.e(1, valueFrom, valueTo, floatValue));
            lsVar.W0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.t.getContentDescription() != null) {
                sb.append(this.t.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(a0(i));
                sb.append(this.t.F(floatValue));
            }
            lsVar.a1(sb.toString());
            this.t.p0(i, this.u);
            lsVar.R0(this.u);
        }
    }

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public float s;
        public float t;
        public ArrayList<Float> u;
        public float v;
        public boolean w;

        /* compiled from: BaseSlider.java */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public f createFromParcel(@x1 Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: b */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public /* synthetic */ f(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.s);
            parcel.writeFloat(this.t);
            parcel.writeList(this.u);
            parcel.writeFloat(this.v);
            parcel.writeBooleanArray(new boolean[]{this.w});
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        private f(@x1 Parcel parcel) {
            super(parcel);
            this.s = parcel.readFloat();
            this.t = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.u = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.v = parcel.readFloat();
            this.w = parcel.createBooleanArray()[0];
        }
    }

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public interface g {
        kj2 a();
    }

    public yh2(@x1 Context context) {
        this(context, null);
    }

    private void A(@x1 Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.O0.size(); i3++) {
            float floatValue = this.O0.get(i3).floatValue();
            Drawable drawable = this.e1;
            if (drawable != null) {
                z(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.f1.size()) {
                z(canvas, i, i2, floatValue, this.f1.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((X(floatValue) * i) + this.D0, i2, this.F0, this.M);
                }
                z(canvas, i, i2, floatValue, this.d1);
            }
        }
    }

    private void A0() {
        float f2 = this.R0;
        if (f2 == 0.0f) {
            return;
        }
        if (((int) f2) != f2) {
            String.format(B, "stepSize", Float.valueOf(f2));
        }
        float f3 = this.M0;
        if (((int) f3) != f3) {
            String.format(B, "valueFrom", Float.valueOf(f3));
        }
        float f4 = this.N0;
        if (((int) f4) != f4) {
            String.format(B, "valueTo", Float.valueOf(f4));
        }
    }

    private void B() {
        if (this.B0 == 2) {
            return;
        }
        if (!this.u0) {
            this.u0 = true;
            ValueAnimator r = r(true);
            this.v0 = r;
            this.w0 = null;
            r.start();
        }
        Iterator<kj2> it = this.U.iterator();
        for (int i = 0; i < this.O0.size() && it.hasNext(); i++) {
            if (i != this.Q0) {
                i0(it.next(), this.O0.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            i0(it.next(), this.O0.get(this.Q0).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.U.size()), Integer.valueOf(this.O0.size())));
    }

    private void C() {
        if (this.u0) {
            this.u0 = false;
            ValueAnimator r = r(false);
            this.w0 = r;
            this.v0 = null;
            r.addListener(new c());
            this.w0.start();
        }
    }

    private void D(int i) {
        if (i == 1) {
            V(Integer.MAX_VALUE);
        } else if (i == 2) {
            V(Integer.MIN_VALUE);
        } else if (i == 17) {
            W(Integer.MAX_VALUE);
        } else if (i != 66) {
        } else {
            W(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F(float f2) {
        if (J()) {
            return this.K0.a(f2);
        }
        return String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", Float.valueOf(f2));
    }

    private static float G(ValueAnimator valueAnimator, float f2) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f2;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    private float H(int i, float f2) {
        float minSeparation = getMinSeparation();
        if (this.h1 == 0) {
            minSeparation = u(minSeparation);
        }
        if (O()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return bm.d(f2, i3 < 0 ? this.M0 : this.O0.get(i3).floatValue() + minSeparation, i2 >= this.O0.size() ? this.N0 : this.O0.get(i2).floatValue() - minSeparation);
    }

    @w0
    private int I(@x1 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private Drawable K(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        j(newDrawable);
        return newDrawable;
    }

    private void L() {
        this.K.setStrokeWidth(this.C0);
        this.L.setStrokeWidth(this.C0);
        this.O.setStrokeWidth(this.C0 / 2.0f);
        this.P.setStrokeWidth(this.C0 / 2.0f);
    }

    private boolean M() {
        ViewParent parent = getParent();
        while (true) {
            boolean z2 = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) ? true : true) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    private boolean N(float f2) {
        double doubleValue = new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(this.R0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < E;
    }

    private void Q(@x1 Resources resources) {
        this.A0 = resources.getDimensionPixelSize(ga2.f.f9);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ga2.f.d9);
        this.y0 = dimensionPixelOffset;
        this.D0 = dimensionPixelOffset;
        this.z0 = resources.getDimensionPixelSize(ga2.f.b9);
        this.E0 = resources.getDimensionPixelOffset(ga2.f.e9);
        this.H0 = resources.getDimensionPixelSize(ga2.f.X8);
    }

    private void R() {
        if (this.R0 <= 0.0f) {
            return;
        }
        s0();
        int min = Math.min((int) (((this.N0 - this.M0) / this.R0) + 1.0f), (this.U0 / (this.C0 * 2)) + 1);
        float[] fArr = this.S0;
        if (fArr == null || fArr.length != min * 2) {
            this.S0 = new float[min * 2];
        }
        float f2 = this.U0 / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.S0;
            fArr2[i] = ((i / 2) * f2) + this.D0;
            fArr2[i + 1] = o();
        }
    }

    private void S(@x1 Canvas canvas, int i, int i2) {
        if (k0()) {
            int X = (int) ((X(this.O0.get(this.Q0).floatValue()) * i) + this.D0);
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.G0;
                canvas.clipRect(X - i3, i2 - i3, X + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(X, i2, this.G0, this.N);
        }
    }

    private void T(@x1 Canvas canvas) {
        if (!this.T0 || this.R0 <= 0.0f) {
            return;
        }
        float[] activeRange = getActiveRange();
        int d0 = d0(this.S0, activeRange[0]);
        int d02 = d0(this.S0, activeRange[1]);
        int i = d0 * 2;
        canvas.drawPoints(this.S0, 0, i, this.O);
        int i2 = d02 * 2;
        canvas.drawPoints(this.S0, i, i2 - i, this.P);
        float[] fArr = this.S0;
        canvas.drawPoints(fArr, i2, fArr.length - i2, this.O);
    }

    private void U() {
        this.D0 = this.y0 + Math.max(this.F0 - this.z0, 0);
        if (sr.T0(this)) {
            r0(getWidth());
        }
    }

    private boolean V(int i) {
        int i2 = this.Q0;
        int f2 = (int) bm.f(i2 + i, 0L, this.O0.size() - 1);
        this.Q0 = f2;
        if (f2 == i2) {
            return false;
        }
        if (this.P0 != -1) {
            this.P0 = f2;
        }
        q0();
        postInvalidate();
        return true;
    }

    private boolean W(int i) {
        if (O()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return V(i);
    }

    private float X(float f2) {
        float f3 = this.M0;
        float f4 = (f2 - f3) / (this.N0 - f3);
        return O() ? 1.0f - f4 : f4;
    }

    private Boolean Y(int i, @x1 KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        V(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                W(-1);
                                return Boolean.TRUE;
                            case 22:
                                W(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                V(1);
                return Boolean.TRUE;
            }
            this.P0 = this.Q0;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(V(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(V(-1));
            }
            return Boolean.FALSE;
        }
    }

    private void Z() {
        for (T t2 : this.W) {
            t2.a(this);
        }
    }

    private void a0() {
        for (T t2 : this.W) {
            t2.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public static kj2 b0(@x1 Context context, @x1 TypedArray typedArray) {
        return kj2.V0(context, null, 0, typedArray.getResourceId(ga2.o.Er, ga2.n.lj));
    }

    private static int d0(float[] fArr, float f2) {
        return Math.round(f2 * ((fArr.length / 2) - 1));
    }

    private void e0(Context context, AttributeSet attributeSet, int i) {
        TypedArray j = cf2.j(context, attributeSet, ga2.o.vr, i, F, new int[0]);
        this.M0 = j.getFloat(ga2.o.zr, 0.0f);
        this.N0 = j.getFloat(ga2.o.Ar, 1.0f);
        setValues(Float.valueOf(this.M0));
        this.R0 = j.getFloat(ga2.o.yr, 0.0f);
        int i2 = ga2.o.Or;
        boolean hasValue = j.hasValue(i2);
        int i3 = hasValue ? i2 : ga2.o.Qr;
        if (!hasValue) {
            i2 = ga2.o.Pr;
        }
        ColorStateList a2 = sg2.a(context, j, i3);
        if (a2 == null) {
            a2 = r3.a(context, ga2.e.P8);
        }
        setTrackInactiveTintList(a2);
        ColorStateList a3 = sg2.a(context, j, i2);
        if (a3 == null) {
            a3 = r3.a(context, ga2.e.M8);
        }
        setTrackActiveTintList(a3);
        this.d1.o0(sg2.a(context, j, ga2.o.Fr));
        int i4 = ga2.o.Ir;
        if (j.hasValue(i4)) {
            setThumbStrokeColor(sg2.a(context, j, i4));
        }
        setThumbStrokeWidth(j.getDimension(ga2.o.Jr, 0.0f));
        ColorStateList a4 = sg2.a(context, j, ga2.o.Br);
        if (a4 == null) {
            a4 = r3.a(context, ga2.e.N8);
        }
        setHaloTintList(a4);
        this.T0 = j.getBoolean(ga2.o.Nr, true);
        int i5 = ga2.o.Kr;
        boolean hasValue2 = j.hasValue(i5);
        int i6 = hasValue2 ? i5 : ga2.o.Mr;
        if (!hasValue2) {
            i5 = ga2.o.Lr;
        }
        ColorStateList a5 = sg2.a(context, j, i6);
        if (a5 == null) {
            a5 = r3.a(context, ga2.e.O8);
        }
        setTickInactiveTintList(a5);
        ColorStateList a6 = sg2.a(context, j, i5);
        if (a6 == null) {
            a6 = r3.a(context, ga2.e.L8);
        }
        setTickActiveTintList(a6);
        setThumbRadius(j.getDimensionPixelSize(ga2.o.Hr, 0));
        setHaloRadius(j.getDimensionPixelSize(ga2.o.Cr, 0));
        setThumbElevation(j.getDimension(ga2.o.Gr, 0.0f));
        setTrackHeight(j.getDimensionPixelSize(ga2.o.Rr, 0));
        setLabelBehavior(j.getInt(ga2.o.Dr, 0));
        if (!j.getBoolean(ga2.o.wr, true)) {
            setEnabled(false);
        }
        j.recycle();
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.O0.size() == 1) {
            floatValue2 = this.M0;
        }
        float X = X(floatValue2);
        float X2 = X(floatValue);
        return O() ? new float[]{X2, X} : new float[]{X, X2};
    }

    private float getValueOfTouchPosition() {
        double m0 = m0(this.g1);
        if (O()) {
            m0 = 1.0d - m0;
        }
        float f2 = this.N0;
        float f3 = this.M0;
        return (float) ((m0 * (f2 - f3)) + f3);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.g1;
        if (O()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.N0;
        float f4 = this.M0;
        return wo1.a(f3, f4, f2, f4);
    }

    private void h0(int i) {
        yh2<S, L, T>.d dVar = this.S;
        if (dVar == null) {
            this.S = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.S.a(i);
        postDelayed(this.S, 200L);
    }

    private void i0(kj2 kj2Var, float f2) {
        kj2Var.m1(F(f2));
        int X = (this.D0 + ((int) (X(f2) * this.U0))) - (kj2Var.getIntrinsicWidth() / 2);
        int o = o() - (this.H0 + this.F0);
        kj2Var.setBounds(X, o - kj2Var.getIntrinsicHeight(), kj2Var.getIntrinsicWidth() + X, o);
        Rect rect = new Rect(kj2Var.getBounds());
        je2.c(kf2.g(this), this, rect);
        kj2Var.setBounds(rect);
        kf2.h(this).a(kj2Var);
    }

    private void j(Drawable drawable) {
        int i = this.F0 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = i / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    private boolean j0() {
        return this.B0 == 3;
    }

    private void k(kj2 kj2Var) {
        kj2Var.k1(kf2.g(this));
    }

    private boolean k0() {
        return this.V0 || !(getBackground() instanceof RippleDrawable);
    }

    private Float l(int i) {
        float n = this.W0 ? n(20) : m();
        if (i == 21) {
            if (!O()) {
                n = -n;
            }
            return Float.valueOf(n);
        } else if (i == 22) {
            if (O()) {
                n = -n;
            }
            return Float.valueOf(n);
        } else if (i != 69) {
            if (i == 70 || i == 81) {
                return Float.valueOf(n);
            }
            return null;
        } else {
            return Float.valueOf(-n);
        }
    }

    private boolean l0(float f2) {
        return n0(this.P0, f2);
    }

    private float m() {
        float f2 = this.R0;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return f2;
    }

    private double m0(float f2) {
        float f3 = this.R0;
        if (f3 > 0.0f) {
            int i = (int) ((this.N0 - this.M0) / f3);
            return Math.round(f2 * i) / i;
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n(int i) {
        float f2;
        float f3;
        float m = m();
        return (this.N0 - this.M0) / m <= i ? m : Math.round(f2 / f3) * m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n0(int i, float f2) {
        this.Q0 = i;
        if (Math.abs(f2 - this.O0.get(i).floatValue()) < E) {
            return false;
        }
        this.O0.set(i, Float.valueOf(H(i, f2)));
        v(i);
        return true;
    }

    private int o() {
        int i = this.E0;
        int i2 = 0;
        if (this.B0 == 1 || j0()) {
            i2 = this.U.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    private boolean o0() {
        return l0(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        if (k0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int X = (int) ((X(this.O0.get(this.Q0).floatValue()) * this.U0) + this.D0);
            int o = o();
            int i = this.G0;
            fk.l(background, X - i, o - i, X + i, o + i);
        }
    }

    private ValueAnimator r(boolean z2) {
        TimeInterpolator timeInterpolator;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(G(z2 ? this.w0 : this.v0, z2 ? 0.0f : 1.0f), z2 ? 1.0f : 0.0f);
        ofFloat.setDuration(z2 ? I : J);
        if (z2) {
            timeInterpolator = ha2.e;
        } else {
            timeInterpolator = ha2.c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private void r0(int i) {
        this.U0 = Math.max(i - (this.D0 * 2), 0);
        R();
    }

    private void s() {
        if (this.U.size() > this.O0.size()) {
            List<kj2> subList = this.U.subList(this.O0.size(), this.U.size());
            for (kj2 kj2Var : subList) {
                if (sr.N0(this)) {
                    t(kj2Var);
                }
            }
            subList.clear();
        }
        while (this.U.size() < this.O0.size()) {
            kj2 a2 = this.T.a();
            this.U.add(a2);
            if (sr.N0(this)) {
                k(a2);
            }
        }
        int i = this.U.size() == 1 ? 0 : 1;
        for (kj2 kj2Var2 : this.U) {
            kj2Var2.I0(i);
        }
    }

    private void s0() {
        if (this.X0) {
            v0();
            w0();
            u0();
            x0();
            t0();
            A0();
            this.X0 = false;
        }
    }

    private void setValuesInternal(@x1 ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.O0.size() == arrayList.size() && this.O0.equals(arrayList)) {
                return;
            }
            this.O0 = arrayList;
            this.X0 = true;
            this.Q0 = 0;
            q0();
            s();
            w();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private void t(kj2 kj2Var) {
        jf2 h = kf2.h(this);
        if (h != null) {
            h.b(kj2Var);
            kj2Var.X0(kf2.g(this));
        }
    }

    private void t0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f2 = this.R0;
            if (f2 <= 0.0f || minSeparation <= 0.0f) {
                return;
            }
            if (this.h1 == 1) {
                if (minSeparation < f2 || !N(minSeparation)) {
                    throw new IllegalStateException(String.format(A, Float.valueOf(minSeparation), Float.valueOf(this.R0), Float.valueOf(this.R0)));
                }
                return;
            }
            throw new IllegalStateException(String.format(z, Float.valueOf(minSeparation), Float.valueOf(this.R0)));
        }
        throw new IllegalStateException(String.format(y, Float.valueOf(minSeparation)));
    }

    private float u(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f3 = (f2 - this.D0) / this.U0;
        float f4 = this.M0;
        return wo1.a(f4, this.N0, f3, f4);
    }

    private void u0() {
        if (this.R0 > 0.0f && !y0(this.N0)) {
            throw new IllegalStateException(String.format(x, Float.valueOf(this.R0), Float.valueOf(this.M0), Float.valueOf(this.N0)));
        }
    }

    private void v(int i) {
        for (L l : this.V) {
            l.a(this, this.O0.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.R;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        h0(i);
    }

    private void v0() {
        if (this.M0 >= this.N0) {
            throw new IllegalStateException(String.format(v, Float.valueOf(this.M0), Float.valueOf(this.N0)));
        }
    }

    private void w() {
        for (L l : this.V) {
            Iterator<Float> it = this.O0.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void w0() {
        if (this.N0 <= this.M0) {
            throw new IllegalStateException(String.format(w, Float.valueOf(this.N0), Float.valueOf(this.M0)));
        }
    }

    private void x(@x1 Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.D0;
        float f2 = i;
        float f3 = i2;
        canvas.drawLine((activeRange[0] * f2) + i3, f3, (activeRange[1] * f2) + i3, f3, this.L);
    }

    private void x0() {
        Iterator<Float> it = this.O0.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() >= this.M0 && next.floatValue() <= this.N0) {
                if (this.R0 > 0.0f && !y0(next.floatValue())) {
                    throw new IllegalStateException(String.format(u, next, Float.valueOf(this.M0), Float.valueOf(this.R0), Float.valueOf(this.R0)));
                }
            } else {
                throw new IllegalStateException(String.format(t, next, Float.valueOf(this.M0), Float.valueOf(this.N0)));
            }
        }
    }

    private void y(@x1 Canvas canvas, int i, int i2) {
        int i3;
        float[] activeRange = getActiveRange();
        float f2 = i;
        float f3 = (activeRange[1] * f2) + this.D0;
        if (f3 < i3 + i) {
            float f4 = i2;
            canvas.drawLine(f3, f4, i3 + i, f4, this.K);
        }
        int i4 = this.D0;
        float f5 = (activeRange[0] * f2) + i4;
        if (f5 > i4) {
            float f6 = i2;
            canvas.drawLine(i4, f6, f5, f6, this.K);
        }
    }

    private boolean y0(float f2) {
        return N(f2 - this.M0);
    }

    private void z(@x1 Canvas canvas, int i, int i2, float f2, @x1 Drawable drawable) {
        canvas.save();
        canvas.translate((this.D0 + ((int) (X(f2) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private float z0(float f2) {
        return (X(f2) * this.U0) + this.D0;
    }

    @r2
    public void E(boolean z2) {
        this.V0 = z2;
    }

    public boolean J() {
        return this.K0 != null;
    }

    public final boolean O() {
        return sr.Y(this) == 1;
    }

    public boolean P() {
        return this.T0;
    }

    public boolean c0() {
        if (this.P0 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float z0 = z0(valueOfTouchPositionAbsolute);
        this.P0 = 0;
        float abs = Math.abs(this.O0.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.O0.size(); i++) {
            float abs2 = Math.abs(this.O0.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float z02 = z0(this.O0.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z2 = !O() ? z02 - z0 >= 0.0f : z02 - z0 <= 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.P0 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(z02 - z0) < this.x0) {
                    this.P0 = -1;
                    return false;
                } else if (z2) {
                    this.P0 = i;
                }
            }
            abs = abs2;
        }
        return this.P0 != -1;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@x1 MotionEvent motionEvent) {
        return this.Q.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@x1 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.K.setColor(I(this.c1));
        this.L.setColor(I(this.b1));
        this.O.setColor(I(this.a1));
        this.P.setColor(I(this.Z0));
        for (kj2 kj2Var : this.U) {
            if (kj2Var.isStateful()) {
                kj2Var.setState(getDrawableState());
            }
        }
        if (this.d1.isStateful()) {
            this.d1.setState(getDrawableState());
        }
        this.N.setColor(I(this.Y0));
        this.N.setAlpha(63);
    }

    public void f0(@x1 L l) {
        this.V.remove(l);
    }

    public void g0(@x1 T t2) {
        this.W.remove(t2);
    }

    @Override // android.view.View
    @x1
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @r2
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.Q.x();
    }

    public int getActiveThumbIndex() {
        return this.P0;
    }

    public int getFocusedThumbIndex() {
        return this.Q0;
    }

    @b1
    public int getHaloRadius() {
        return this.G0;
    }

    @x1
    public ColorStateList getHaloTintList() {
        return this.Y0;
    }

    public int getLabelBehavior() {
        return this.B0;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.R0;
    }

    public float getThumbElevation() {
        return this.d1.x();
    }

    @b1
    public int getThumbRadius() {
        return this.F0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.d1.N();
    }

    public float getThumbStrokeWidth() {
        return this.d1.Q();
    }

    @x1
    public ColorStateList getThumbTintList() {
        return this.d1.y();
    }

    @x1
    public ColorStateList getTickActiveTintList() {
        return this.Z0;
    }

    @x1
    public ColorStateList getTickInactiveTintList() {
        return this.a1;
    }

    @x1
    public ColorStateList getTickTintList() {
        if (this.a1.equals(this.Z0)) {
            return this.Z0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @x1
    public ColorStateList getTrackActiveTintList() {
        return this.b1;
    }

    @b1
    public int getTrackHeight() {
        return this.C0;
    }

    @x1
    public ColorStateList getTrackInactiveTintList() {
        return this.c1;
    }

    @b1
    public int getTrackSidePadding() {
        return this.D0;
    }

    @x1
    public ColorStateList getTrackTintList() {
        if (this.c1.equals(this.b1)) {
            return this.b1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @b1
    public int getTrackWidth() {
        return this.U0;
    }

    public float getValueFrom() {
        return this.M0;
    }

    public float getValueTo() {
        return this.N0;
    }

    @x1
    public List<Float> getValues() {
        return new ArrayList(this.O0);
    }

    public void h(@x1 L l) {
        this.V.add(l);
    }

    public void i(@x1 T t2) {
        this.W.add(t2);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (kj2 kj2Var : this.U) {
            k(kj2Var);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        yh2<S, L, T>.d dVar = this.S;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.u0 = false;
        for (kj2 kj2Var : this.U) {
            t(kj2Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@x1 Canvas canvas) {
        if (this.X0) {
            s0();
            R();
        }
        super.onDraw(canvas);
        int o = o();
        y(canvas, this.U0, o);
        if (((Float) Collections.max(getValues())).floatValue() > this.M0) {
            x(canvas, this.U0, o);
        }
        T(canvas);
        if ((this.L0 || isFocused() || j0()) && isEnabled()) {
            S(canvas, this.U0, o);
            if (this.P0 == -1 && !j0()) {
                C();
            } else {
                B();
            }
        } else {
            C();
        }
        A(canvas, this.U0, o);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z2, int i, @z1 Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (!z2) {
            this.P0 = -1;
            this.Q.o(this.Q0);
            return;
        }
        D(i);
        this.Q.X(this.Q0);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @x1 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.O0.size() == 1) {
            this.P0 = 0;
        }
        if (this.P0 == -1) {
            Boolean Y = Y(i, keyEvent);
            return Y != null ? Y.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.W0 |= keyEvent.isLongPress();
        Float l = l(i);
        if (l != null) {
            if (l0(l.floatValue() + this.O0.get(this.P0).floatValue())) {
                q0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return V(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return V(-1);
                }
                return false;
            } else if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.P0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @x1 KeyEvent keyEvent) {
        this.W0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.A0;
        int i4 = 0;
        if (this.B0 == 1 || j0()) {
            i4 = this.U.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.M0 = fVar.s;
        this.N0 = fVar.t;
        setValuesInternal(fVar.u);
        this.R0 = fVar.v;
        if (fVar.w) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.s = this.M0;
        fVar.t = this.N0;
        fVar.u = new ArrayList<>(this.O0);
        fVar.v = this.R0;
        fVar.w = hasFocus();
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        r0(i);
        q0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@x1 MotionEvent motionEvent) {
        if (isEnabled()) {
            float x2 = motionEvent.getX();
            float f2 = (x2 - this.D0) / this.U0;
            this.g1 = f2;
            float max = Math.max(0.0f, f2);
            this.g1 = max;
            this.g1 = Math.min(1.0f, max);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.I0 = x2;
                if (!M()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (c0()) {
                        requestFocus();
                        this.L0 = true;
                        o0();
                        q0();
                        invalidate();
                        Z();
                    }
                }
            } else if (actionMasked == 1) {
                this.L0 = false;
                MotionEvent motionEvent2 = this.J0;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.J0.getX() - motionEvent.getX()) <= this.x0 && Math.abs(this.J0.getY() - motionEvent.getY()) <= this.x0 && c0()) {
                    Z();
                }
                if (this.P0 != -1) {
                    o0();
                    this.P0 = -1;
                    a0();
                }
                invalidate();
            } else if (actionMasked == 2) {
                if (!this.L0) {
                    if (M() && Math.abs(x2 - this.I0) < this.x0) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Z();
                }
                if (c0()) {
                    this.L0 = true;
                    o0();
                    q0();
                    invalidate();
                }
            }
            setPressed(this.L0);
            this.J0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    public void p() {
        this.V.clear();
    }

    public void p0(int i, Rect rect) {
        int X = this.D0 + ((int) (X(getValues().get(i).floatValue()) * this.U0));
        int o = o();
        int i2 = this.F0;
        rect.set(X - i2, o - i2, X + i2, o + i2);
    }

    public void q() {
        this.W.clear();
    }

    public void setActiveThumbIndex(int i) {
        this.P0 = i;
    }

    public void setCustomThumbDrawable(@f1 int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@x1 @f1 int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        setLayerType(z2 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.O0.size()) {
            this.Q0 = i;
            this.Q.X(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(@p1(from = 0) @b1 int i) {
        if (i == this.G0) {
            return;
        }
        this.G0 = i;
        Drawable background = getBackground();
        if (!k0() && (background instanceof RippleDrawable)) {
            td2.b((RippleDrawable) background, this.G0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@a1 int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@x1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.Y0)) {
            return;
        }
        this.Y0 = colorStateList;
        Drawable background = getBackground();
        if (!k0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.N.setColor(I(colorStateList));
        this.N.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@z1 ai2 ai2Var) {
        this.K0 = ai2Var;
    }

    public void setSeparationUnit(int i) {
        this.h1 = i;
        this.X0 = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 >= 0.0f) {
            if (this.R0 != f2) {
                this.R0 = f2;
                this.X0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format(x, Float.valueOf(f2), Float.valueOf(this.M0), Float.valueOf(this.N0)));
    }

    public void setThumbElevation(float f2) {
        this.d1.n0(f2);
    }

    public void setThumbElevationResource(@a1 int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@p1(from = 0) @b1 int i) {
        if (i == this.F0) {
            return;
        }
        this.F0 = i;
        U();
        this.d1.setShapeAppearanceModel(qh2.a().q(0, this.F0).m());
        lh2 lh2Var = this.d1;
        int i2 = this.F0;
        lh2Var.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.e1;
        if (drawable != null) {
            j(drawable);
        }
        for (Drawable drawable2 : this.f1) {
            j(drawable2);
        }
        postInvalidate();
    }

    public void setThumbRadiusResource(@a1 int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@z1 ColorStateList colorStateList) {
        this.d1.F0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@y0 int i) {
        if (i != 0) {
            setThumbStrokeColor(r3.a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        this.d1.I0(f2);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@a1 int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@x1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.d1.y())) {
            return;
        }
        this.d1.o0(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(@x1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.Z0)) {
            return;
        }
        this.Z0 = colorStateList;
        this.P.setColor(I(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@x1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.a1)) {
            return;
        }
        this.a1 = colorStateList;
        this.O.setColor(I(colorStateList));
        invalidate();
    }

    public void setTickTintList(@x1 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z2) {
        if (this.T0 != z2) {
            this.T0 = z2;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@x1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.b1)) {
            return;
        }
        this.b1 = colorStateList;
        this.L.setColor(I(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@p1(from = 0) @b1 int i) {
        if (this.C0 != i) {
            this.C0 = i;
            L();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@x1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.c1)) {
            return;
        }
        this.c1 = colorStateList;
        this.K.setColor(I(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@x1 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.M0 = f2;
        this.X0 = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.N0 = f2;
        this.X0 = true;
        postInvalidate();
    }

    public void setValues(@x1 Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* compiled from: BaseSlider.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public int s;

        private d() {
            this.s = -1;
        }

        public void a(int i) {
            this.s = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            yh2.this.Q.Y(this.s, 4);
        }

        public /* synthetic */ d(yh2 yh2Var, a aVar) {
            this();
        }
    }

    public yh2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.ie);
    }

    public void setCustomThumbDrawable(@x1 Drawable drawable) {
        this.e1 = K(drawable);
        this.f1.clear();
        postInvalidate();
    }

    public yh2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, F), attributeSet, i);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.u0 = false;
        this.L0 = false;
        this.O0 = new ArrayList<>();
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = 0.0f;
        this.T0 = true;
        this.W0 = false;
        lh2 lh2Var = new lh2();
        this.d1 = lh2Var;
        this.f1 = Collections.emptyList();
        this.h1 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.K = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.L = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.M = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.N = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.O = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.P = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Q(context2.getResources());
        this.T = new a(attributeSet, i);
        e0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        lh2Var.x0(2);
        this.x0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.Q = eVar;
        sr.A1(this, eVar);
        this.R = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@x1 List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@x1 Drawable... drawableArr) {
        this.e1 = null;
        this.f1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f1.add(K(drawable));
        }
        postInvalidate();
    }
}