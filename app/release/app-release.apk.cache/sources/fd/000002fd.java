package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.p7700g.p99005.ai0;
import com.p7700g.p99005.bi0;
import com.p7700g.p99005.ci0;
import com.p7700g.p99005.cp0;
import com.p7700g.p99005.d2;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ei0;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fi0;
import com.p7700g.p99005.fp0;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.hi0;
import com.p7700g.p99005.ji0;
import com.p7700g.p99005.li0;
import com.p7700g.p99005.mi0;
import com.p7700g.p99005.ni0;
import com.p7700g.p99005.np0;
import com.p7700g.p99005.oi0;
import com.p7700g.p99005.pp0;
import com.p7700g.p99005.q0;
import com.p7700g.p99005.qi0;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.ri0;
import com.p7700g.p99005.si0;
import com.p7700g.p99005.tg0;
import com.p7700g.p99005.ti0;
import com.p7700g.p99005.tk0;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.ui0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yo0;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final String s = LottieAnimationView.class.getSimpleName();
    private static final ji0<Throwable> t = tg0.a;
    @d2
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final Set<d> E;
    private final Set<li0> F;
    @z1
    private oi0<ei0> G;
    @z1
    private ei0 H;
    private final ji0<ei0> u;
    private final ji0<Throwable> v;
    @z1
    private ji0<Throwable> w;
    @f1
    private int x;
    private final hi0 y;
    private String z;

    /* loaded from: classes.dex */
    public class a implements ji0<Throwable> {
        public a() {
        }

        @Override // com.p7700g.p99005.ji0
        /* renamed from: a */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.x != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.x);
            }
            (LottieAnimationView.this.w == null ? LottieAnimationView.t : LottieAnimationView.this.w).onResult(th);
        }
    }

    /* loaded from: classes.dex */
    public class b extends np0<T> {
        public final /* synthetic */ pp0 d;

        public b(pp0 pp0Var) {
            this.d = pp0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.p7700g.p99005.np0
        public T a(fp0<T> fp0Var) {
            return this.d.a(fp0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public String s;
        public int t;
        public float u;
        public boolean v;
        public String w;
        public int x;
        public int y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public /* synthetic */ c(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.s);
            parcel.writeFloat(this.u);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeString(this.w);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private c(Parcel parcel) {
            super(parcel);
            this.s = parcel.readString();
            this.u = parcel.readFloat();
            this.v = parcel.readInt() == 1;
            this.w = parcel.readString();
            this.x = parcel.readInt();
            this.y = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.u = new ji0() { // from class: com.p7700g.p99005.xh0
            @Override // com.p7700g.p99005.ji0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((ei0) obj);
            }
        };
        this.v = new a();
        this.x = 0;
        this.y = new hi0();
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = new HashSet();
        this.F = new HashSet();
        s(null, ri0.c.q2);
    }

    private void Q() {
        boolean t2 = t();
        setImageDrawable(null);
        setImageDrawable(this.y);
        if (t2) {
            this.y.Q0();
        }
    }

    private void k() {
        oi0<ei0> oi0Var = this.G;
        if (oi0Var != null) {
            oi0Var.j(this.u);
            this.G.i(this.v);
        }
    }

    private void l() {
        this.H = null;
        this.y.n();
    }

    private oi0<ei0> o(final String str) {
        if (isInEditMode()) {
            return new oi0<>(new Callable() { // from class: com.p7700g.p99005.ug0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.this.w(str);
                }
            }, true);
        }
        return this.D ? fi0.d(getContext(), str) : fi0.e(getContext(), str, null);
    }

    private oi0<ei0> p(@d2 final int i) {
        if (isInEditMode()) {
            return new oi0<>(new Callable() { // from class: com.p7700g.p99005.vg0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.this.y(i);
                }
            }, true);
        }
        return this.D ? fi0.r(getContext(), i) : fi0.s(getContext(), i, null);
    }

    private void s(@z1 AttributeSet attributeSet, @q0 int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ri0.n.i5, i, 0);
        this.D = obtainStyledAttributes.getBoolean(ri0.n.k5, true);
        int i2 = ri0.n.u5;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = ri0.n.p5;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = ri0.n.z5;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(ri0.n.o5, 0));
        if (obtainStyledAttributes.getBoolean(ri0.n.j5, false)) {
            this.C = true;
        }
        if (obtainStyledAttributes.getBoolean(ri0.n.s5, false)) {
            this.y.q1(-1);
        }
        int i5 = ri0.n.x5;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = ri0.n.w5;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = ri0.n.y5;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = ri0.n.l5;
        if (obtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(ri0.n.r5));
        setProgress(obtainStyledAttributes.getFloat(ri0.n.t5, 0.0f));
        n(obtainStyledAttributes.getBoolean(ri0.n.n5, false));
        int i9 = ri0.n.m5;
        if (obtainStyledAttributes.hasValue(i9)) {
            h(new tk0("**"), mi0.K, new np0(new ti0(r3.a(getContext(), obtainStyledAttributes.getResourceId(i9, -1)).getDefaultColor())));
        }
        int i10 = ri0.n.v5;
        if (obtainStyledAttributes.hasValue(i10)) {
            si0 si0Var = si0.AUTOMATIC;
            int i11 = obtainStyledAttributes.getInt(i10, si0Var.ordinal());
            si0.values();
            if (i11 >= 3) {
                i11 = si0Var.ordinal();
            }
            setRenderMode(si0.values()[i11]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(ri0.n.q5, false));
        obtainStyledAttributes.recycle();
        this.y.u1(Boolean.valueOf(cp0.f(getContext()) != 0.0f));
    }

    private void setCompositionTask(oi0<ei0> oi0Var) {
        this.E.add(d.SET_ANIMATION);
        l();
        k();
        this.G = oi0Var.c(this.u).b(this.v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ ni0 w(String str) throws Exception {
        return this.D ? fi0.f(getContext(), str) : fi0.g(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ ni0 y(int i) throws Exception {
        return this.D ? fi0.t(getContext(), i) : fi0.u(getContext(), i, null);
    }

    public static /* synthetic */ void z(Throwable th) {
        if (cp0.k(th)) {
            yo0.f("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    @Deprecated
    public void A(boolean z) {
        this.y.q1(z ? -1 : 0);
    }

    @u1
    public void B() {
        this.C = false;
        this.y.H0();
    }

    @u1
    public void C() {
        this.E.add(d.PLAY_OPTION);
        this.y.I0();
    }

    public void D() {
        this.y.J0();
    }

    public void E() {
        this.F.clear();
    }

    public void F() {
        this.y.K0();
    }

    public void G(Animator.AnimatorListener animatorListener) {
        this.y.L0(animatorListener);
    }

    @e2(api = 19)
    public void H(Animator.AnimatorPauseListener animatorPauseListener) {
        this.y.M0(animatorPauseListener);
    }

    public boolean I(@x1 li0 li0Var) {
        return this.F.remove(li0Var);
    }

    public void J(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.y.N0(animatorUpdateListener);
    }

    public List<tk0> K(tk0 tk0Var) {
        return this.y.P0(tk0Var);
    }

    @u1
    public void L() {
        this.E.add(d.PLAY_OPTION);
        this.y.Q0();
    }

    public void M() {
        this.y.R0();
    }

    public void N(InputStream inputStream, @z1 String str) {
        setCompositionTask(fi0.i(inputStream, str));
    }

    public void O(String str, @z1 String str2) {
        N(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void P(String str, @z1 String str2) {
        setCompositionTask(fi0.w(getContext(), str, str2));
    }

    public void R(int i, int i2) {
        this.y.f1(i, i2);
    }

    public void S(String str, String str2, boolean z) {
        this.y.h1(str, str2, z);
    }

    public void T(@g1(from = 0.0d, to = 1.0d) float f, @g1(from = 0.0d, to = 1.0d) float f2) {
        this.y.i1(f, f2);
    }

    @z1
    public Bitmap U(String str, @z1 Bitmap bitmap) {
        return this.y.w1(str, bitmap);
    }

    public void d(Animator.AnimatorListener animatorListener) {
        this.y.f(animatorListener);
    }

    @e2(api = 19)
    public void e(Animator.AnimatorPauseListener animatorPauseListener) {
        this.y.g(animatorPauseListener);
    }

    public void f(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.y.h(animatorUpdateListener);
    }

    public boolean g(@x1 li0 li0Var) {
        ei0 ei0Var = this.H;
        if (ei0Var != null) {
            li0Var.a(ei0Var);
        }
        return this.F.add(li0Var);
    }

    public boolean getClipToCompositionBounds() {
        return this.y.A();
    }

    @z1
    public ei0 getComposition() {
        return this.H;
    }

    public long getDuration() {
        ei0 ei0Var = this.H;
        if (ei0Var != null) {
            return ei0Var.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.y.E();
    }

    @z1
    public String getImageAssetsFolder() {
        return this.y.H();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.y.J();
    }

    public float getMaxFrame() {
        return this.y.K();
    }

    public float getMinFrame() {
        return this.y.L();
    }

    @z1
    public qi0 getPerformanceTracker() {
        return this.y.M();
    }

    @g1(from = zg2.s, to = 1.0d)
    public float getProgress() {
        return this.y.N();
    }

    public si0 getRenderMode() {
        return this.y.O();
    }

    public int getRepeatCount() {
        return this.y.P();
    }

    public int getRepeatMode() {
        return this.y.Q();
    }

    public float getSpeed() {
        return this.y.R();
    }

    public <T> void h(tk0 tk0Var, T t2, np0<T> np0Var) {
        this.y.i(tk0Var, t2, np0Var);
    }

    public <T> void i(tk0 tk0Var, T t2, pp0<T> pp0Var) {
        this.y.i(tk0Var, t2, new b(pp0Var));
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof hi0) && ((hi0) drawable).O() == si0.SOFTWARE) {
            this.y.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@x1 Drawable drawable) {
        Drawable drawable2 = getDrawable();
        hi0 hi0Var = this.y;
        if (drawable2 == hi0Var) {
            super.invalidateDrawable(hi0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @u1
    public void j() {
        this.E.add(d.PLAY_OPTION);
        this.y.m();
    }

    @Deprecated
    public void m() {
        this.y.r();
    }

    public void n(boolean z) {
        this.y.u(z);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.C) {
            return;
        }
        this.y.I0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.z = cVar.s;
        Set<d> set = this.E;
        d dVar = d.SET_ANIMATION;
        if (!set.contains(dVar) && !TextUtils.isEmpty(this.z)) {
            setAnimation(this.z);
        }
        this.A = cVar.t;
        if (!this.E.contains(dVar) && (i = this.A) != 0) {
            setAnimation(i);
        }
        if (!this.E.contains(d.SET_PROGRESS)) {
            setProgress(cVar.u);
        }
        if (!this.E.contains(d.PLAY_OPTION) && cVar.v) {
            C();
        }
        if (!this.E.contains(d.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(cVar.w);
        }
        if (!this.E.contains(d.SET_REPEAT_MODE)) {
            setRepeatMode(cVar.x);
        }
        if (this.E.contains(d.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(cVar.y);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.s = this.z;
        cVar.t = this.A;
        cVar.u = this.y.N();
        cVar.v = this.y.Y();
        cVar.w = this.y.H();
        cVar.x = this.y.Q();
        cVar.y = this.y.P();
        return cVar;
    }

    public boolean q() {
        return this.y.U();
    }

    public boolean r() {
        return this.y.V();
    }

    public void setAnimation(@d2 int i) {
        this.A = i;
        this.z = null;
        setCompositionTask(p(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        O(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.D ? fi0.v(getContext(), str) : fi0.w(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.y.T0(z);
    }

    public void setCacheComposition(boolean z) {
        this.D = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.y.U0(z);
    }

    public void setComposition(@x1 ei0 ei0Var) {
        if (ci0.a) {
            String str = "Set Composition \n" + ei0Var;
        }
        this.y.setCallback(this);
        this.H = ei0Var;
        this.B = true;
        boolean V0 = this.y.V0(ei0Var);
        this.B = false;
        if (getDrawable() != this.y || V0) {
            if (!V0) {
                Q();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (li0 li0Var : this.F) {
                li0Var.a(ei0Var);
            }
        }
    }

    public void setFailureListener(@z1 ji0<Throwable> ji0Var) {
        this.w = ji0Var;
    }

    public void setFallbackResource(@f1 int i) {
        this.x = i;
    }

    public void setFontAssetDelegate(ai0 ai0Var) {
        this.y.W0(ai0Var);
    }

    public void setFrame(int i) {
        this.y.X0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.y.Y0(z);
    }

    public void setImageAssetDelegate(bi0 bi0Var) {
        this.y.Z0(bi0Var);
    }

    public void setImageAssetsFolder(String str) {
        this.y.a1(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        k();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        k();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        k();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.y.b1(z);
    }

    public void setMaxFrame(int i) {
        this.y.c1(i);
    }

    public void setMaxProgress(@g1(from = 0.0d, to = 1.0d) float f) {
        this.y.e1(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.y.g1(str);
    }

    public void setMinFrame(int i) {
        this.y.j1(i);
    }

    public void setMinProgress(float f) {
        this.y.l1(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.y.m1(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.y.n1(z);
    }

    public void setProgress(@g1(from = 0.0d, to = 1.0d) float f) {
        this.E.add(d.SET_PROGRESS);
        this.y.o1(f);
    }

    public void setRenderMode(si0 si0Var) {
        this.y.p1(si0Var);
    }

    public void setRepeatCount(int i) {
        this.E.add(d.SET_REPEAT_COUNT);
        this.y.q1(i);
    }

    public void setRepeatMode(int i) {
        this.E.add(d.SET_REPEAT_MODE);
        this.y.r1(i);
    }

    public void setSafeMode(boolean z) {
        this.y.s1(z);
    }

    public void setSpeed(float f) {
        this.y.t1(f);
    }

    public void setTextDelegate(ui0 ui0Var) {
        this.y.v1(ui0Var);
    }

    public boolean t() {
        return this.y.X();
    }

    public boolean u() {
        return this.y.b0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        hi0 hi0Var;
        if (!this.B && drawable == (hi0Var = this.y) && hi0Var.X()) {
            B();
        } else if (!this.B && (drawable instanceof hi0)) {
            hi0 hi0Var2 = (hi0) drawable;
            if (hi0Var2.X()) {
                hi0Var2.H0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.y.d1(str);
    }

    public void setMinFrame(String str) {
        this.y.k1(str);
    }

    public void setAnimation(String str) {
        this.z = str;
        this.A = 0;
        setCompositionTask(o(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new ji0() { // from class: com.p7700g.p99005.xh0
            @Override // com.p7700g.p99005.ji0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((ei0) obj);
            }
        };
        this.v = new a();
        this.x = 0;
        this.y = new hi0();
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = new HashSet();
        this.F = new HashSet();
        s(attributeSet, ri0.c.q2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new ji0() { // from class: com.p7700g.p99005.xh0
            @Override // com.p7700g.p99005.ji0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((ei0) obj);
            }
        };
        this.v = new a();
        this.x = 0;
        this.y = new hi0();
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = new HashSet();
        this.F = new HashSet();
        s(attributeSet, i);
    }
}