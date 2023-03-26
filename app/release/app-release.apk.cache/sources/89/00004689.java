package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class hi0 extends Drawable implements Drawable.Callback, Animatable {
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = -1;
    private d A;
    private final ArrayList<c> B;
    private final ValueAnimator.AnimatorUpdateListener C;
    @z1
    private nk0 D;
    @z1
    private String E;
    @z1
    private bi0 F;
    @z1
    private mk0 G;
    @z1
    public ai0 H;
    @z1
    public ui0 I;
    private boolean J;
    private boolean K;
    private boolean L;
    @z1
    private jm0 M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private si0 R;
    private boolean S;
    private final Matrix T;
    private Bitmap U;
    private Canvas V;
    private Rect W;
    private RectF X;
    private Paint Y;
    private Rect Z;
    private Rect u0;
    private ei0 v;
    private RectF v0;
    private final zo0 w;
    private RectF w0;
    private boolean x;
    private Matrix x0;
    private boolean y;
    private Matrix y0;
    private boolean z;
    private boolean z0;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (hi0.this.M != null) {
                hi0.this.M.L(hi0.this.w.h());
            }
        }
    }

    /* compiled from: LottieDrawable.java */
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

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(ei0 ei0Var);
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public enum d {
        NONE,
        PLAY,
        RESUME
    }

    /* compiled from: LottieDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public hi0() {
        zo0 zo0Var = new zo0();
        this.w = zo0Var;
        this.x = true;
        this.y = false;
        this.z = false;
        this.A = d.NONE;
        this.B = new ArrayList<>();
        a aVar = new a();
        this.C = aVar;
        this.K = false;
        this.L = true;
        this.N = 255;
        this.R = si0.AUTOMATIC;
        this.S = false;
        this.T = new Matrix();
        this.z0 = false;
        zo0Var.addUpdateListener(aVar);
    }

    private /* synthetic */ void A0(String str, ei0 ei0Var) {
        k1(str);
    }

    @z1
    private Context C() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private /* synthetic */ void C0(float f, ei0 ei0Var) {
        l1(f);
    }

    private mk0 D() {
        if (getCallback() == null) {
            return null;
        }
        if (this.G == null) {
            this.G = new mk0(getCallback(), this.H);
        }
        return this.G;
    }

    private /* synthetic */ void E0(float f, ei0 ei0Var) {
        o1(f);
    }

    private nk0 G() {
        if (getCallback() == null) {
            return null;
        }
        nk0 nk0Var = this.D;
        if (nk0Var != null && !nk0Var.c(C())) {
            this.D = null;
        }
        if (this.D == null) {
            this.D = new nk0(getCallback(), this.E, this.F, this.v.j());
        }
        return this.D;
    }

    private void O0(Canvas canvas, jm0 jm0Var) {
        if (this.v == null || jm0Var == null) {
            return;
        }
        y();
        canvas.getMatrix(this.x0);
        canvas.getClipBounds(this.W);
        p(this.W, this.X);
        this.x0.mapRect(this.X);
        q(this.X, this.W);
        if (this.L) {
            this.w0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            jm0Var.e(this.w0, null, false);
        }
        this.x0.mapRect(this.w0);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        S0(this.w0, width, height);
        if (!W()) {
            RectF rectF = this.w0;
            Rect rect = this.W;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.w0.width());
        int ceil2 = (int) Math.ceil(this.w0.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        x(ceil, ceil2);
        if (this.z0) {
            this.T.set(this.x0);
            this.T.preScale(width, height);
            Matrix matrix = this.T;
            RectF rectF2 = this.w0;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.U.eraseColor(0);
            jm0Var.g(this.V, this.T, this.N);
            this.x0.invert(this.y0);
            this.y0.mapRect(this.v0, this.w0);
            q(this.v0, this.u0);
        }
        this.Z.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.U, this.Z, this.u0, this.Y);
    }

    private void S0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean W() {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                return !((ViewGroup) parent).getClipChildren();
            }
            return false;
        }
        return false;
    }

    private /* synthetic */ void c0(tk0 tk0Var, Object obj, np0 np0Var, ei0 ei0Var) {
        i(tk0Var, obj, np0Var);
    }

    private /* synthetic */ void e0(ei0 ei0Var) {
        I0();
    }

    private /* synthetic */ void g0(ei0 ei0Var) {
        Q0();
    }

    private /* synthetic */ void i0(int i, ei0 ei0Var) {
        X0(i);
    }

    private boolean k() {
        return this.x || this.y;
    }

    private /* synthetic */ void k0(int i, ei0 ei0Var) {
        c1(i);
    }

    private void l() {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            return;
        }
        jm0 jm0Var = new jm0(this, un0.a(ei0Var), ei0Var.k(), ei0Var);
        this.M = jm0Var;
        if (this.P) {
            jm0Var.J(true);
        }
        this.M.Q(this.L);
    }

    private /* synthetic */ void m0(String str, ei0 ei0Var) {
        d1(str);
    }

    private void o() {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            return;
        }
        this.S = this.R.a(Build.VERSION.SDK_INT, ei0Var.t(), ei0Var.n());
    }

    private /* synthetic */ void o0(float f, ei0 ei0Var) {
        e1(f);
    }

    private void p(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void q(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private /* synthetic */ void q0(int i, int i2, ei0 ei0Var) {
        f1(i, i2);
    }

    private /* synthetic */ void s0(String str, ei0 ei0Var) {
        g1(str);
    }

    private void t(Canvas canvas) {
        jm0 jm0Var = this.M;
        ei0 ei0Var = this.v;
        if (jm0Var == null || ei0Var == null) {
            return;
        }
        this.T.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float height = bounds.height() / ei0Var.b().height();
            this.T.preScale(bounds.width() / ei0Var.b().width(), height);
        }
        jm0Var.g(canvas, this.T, this.N);
    }

    private /* synthetic */ void u0(String str, String str2, boolean z, ei0 ei0Var) {
        h1(str, str2, z);
    }

    private /* synthetic */ void w0(float f, float f2, ei0 ei0Var) {
        i1(f, f2);
    }

    private void x(int i, int i2) {
        Bitmap bitmap = this.U;
        if (bitmap != null && bitmap.getWidth() >= i && this.U.getHeight() >= i2) {
            if (this.U.getWidth() > i || this.U.getHeight() > i2) {
                Bitmap createBitmap = Bitmap.createBitmap(this.U, 0, 0, i, i2);
                this.U = createBitmap;
                this.V.setBitmap(createBitmap);
                this.z0 = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.U = createBitmap2;
        this.V.setBitmap(createBitmap2);
        this.z0 = true;
    }

    private void y() {
        if (this.V != null) {
            return;
        }
        this.V = new Canvas();
        this.w0 = new RectF();
        this.x0 = new Matrix();
        this.y0 = new Matrix();
        this.W = new Rect();
        this.X = new RectF();
        this.Y = new vi0();
        this.Z = new Rect();
        this.u0 = new Rect();
        this.v0 = new RectF();
    }

    private /* synthetic */ void y0(int i, ei0 ei0Var) {
        j1(i);
    }

    public boolean A() {
        return this.L;
    }

    public ei0 B() {
        return this.v;
    }

    public /* synthetic */ void B0(String str, ei0 ei0Var) {
        k1(str);
    }

    public /* synthetic */ void D0(float f, ei0 ei0Var) {
        l1(f);
    }

    public int E() {
        return (int) this.w.i();
    }

    @z1
    @Deprecated
    public Bitmap F(String str) {
        nk0 G = G();
        if (G != null) {
            return G.a(str);
        }
        ei0 ei0Var = this.v;
        ii0 ii0Var = ei0Var == null ? null : ei0Var.j().get(str);
        if (ii0Var != null) {
            return ii0Var.a();
        }
        return null;
    }

    public /* synthetic */ void F0(float f, ei0 ei0Var) {
        o1(f);
    }

    @Deprecated
    public void G0(boolean z) {
        this.w.setRepeatCount(z ? -1 : 0);
    }

    @z1
    public String H() {
        return this.E;
    }

    public void H0() {
        this.B.clear();
        this.w.x();
        if (isVisible()) {
            return;
        }
        this.A = d.NONE;
    }

    @z1
    public ii0 I(String str) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            return null;
        }
        return ei0Var.j().get(str);
    }

    @u1
    public void I0() {
        if (this.M == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.jh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.I0();
                }
            });
            return;
        }
        o();
        if (k() || P() == 0) {
            if (isVisible()) {
                this.w.y();
                this.A = d.NONE;
            } else {
                this.A = d.PLAY;
            }
        }
        if (k()) {
            return;
        }
        X0((int) (R() < 0.0f ? L() : K()));
        this.w.g();
        if (isVisible()) {
            return;
        }
        this.A = d.NONE;
    }

    public boolean J() {
        return this.K;
    }

    public void J0() {
        this.w.removeAllListeners();
    }

    public float K() {
        return this.w.o();
    }

    public void K0() {
        this.w.removeAllUpdateListeners();
        this.w.addUpdateListener(this.C);
    }

    public float L() {
        return this.w.p();
    }

    public void L0(Animator.AnimatorListener animatorListener) {
        this.w.removeListener(animatorListener);
    }

    @z1
    public qi0 M() {
        ei0 ei0Var = this.v;
        if (ei0Var != null) {
            return ei0Var.o();
        }
        return null;
    }

    @e2(api = 19)
    public void M0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.w.removePauseListener(animatorPauseListener);
    }

    @g1(from = zg2.s, to = 1.0d)
    public float N() {
        return this.w.h();
    }

    public void N0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.w.removeUpdateListener(animatorUpdateListener);
    }

    public si0 O() {
        return this.S ? si0.SOFTWARE : si0.HARDWARE;
    }

    public int P() {
        return this.w.getRepeatCount();
    }

    public List<tk0> P0(tk0 tk0Var) {
        if (this.M == null) {
            yo0.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.M.c(tk0Var, 0, arrayList, new tk0(new String[0]));
        return arrayList;
    }

    @SuppressLint({"WrongConstant"})
    public int Q() {
        return this.w.getRepeatMode();
    }

    @u1
    public void Q0() {
        if (this.M == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.hh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.Q0();
                }
            });
            return;
        }
        o();
        if (k() || P() == 0) {
            if (isVisible()) {
                this.w.D();
                this.A = d.NONE;
            } else {
                this.A = d.RESUME;
            }
        }
        if (k()) {
            return;
        }
        X0((int) (R() < 0.0f ? L() : K()));
        this.w.g();
        if (isVisible()) {
            return;
        }
        this.A = d.NONE;
    }

    public float R() {
        return this.w.t();
    }

    public void R0() {
        this.w.E();
    }

    @z1
    public ui0 S() {
        return this.I;
    }

    @z1
    public Typeface T(String str, String str2) {
        mk0 D = D();
        if (D != null) {
            return D.b(str, str2);
        }
        return null;
    }

    public void T0(boolean z) {
        this.Q = z;
    }

    public boolean U() {
        jm0 jm0Var = this.M;
        return jm0Var != null && jm0Var.O();
    }

    public void U0(boolean z) {
        if (z != this.L) {
            this.L = z;
            jm0 jm0Var = this.M;
            if (jm0Var != null) {
                jm0Var.Q(z);
            }
            invalidateSelf();
        }
    }

    public boolean V() {
        jm0 jm0Var = this.M;
        return jm0Var != null && jm0Var.P();
    }

    public boolean V0(ei0 ei0Var) {
        if (this.v == ei0Var) {
            return false;
        }
        this.z0 = true;
        n();
        this.v = ei0Var;
        l();
        this.w.G(ei0Var);
        o1(this.w.getAnimatedFraction());
        Iterator it = new ArrayList(this.B).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.a(ei0Var);
            }
            it.remove();
        }
        this.B.clear();
        ei0Var.z(this.O);
        o();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void W0(ai0 ai0Var) {
        this.H = ai0Var;
        mk0 mk0Var = this.G;
        if (mk0Var != null) {
            mk0Var.d(ai0Var);
        }
    }

    public boolean X() {
        zo0 zo0Var = this.w;
        if (zo0Var == null) {
            return false;
        }
        return zo0Var.isRunning();
    }

    public void X0(final int i) {
        if (this.v == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.th0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.X0(i);
                }
            });
        } else {
            this.w.H(i);
        }
    }

    public boolean Y() {
        if (isVisible()) {
            return this.w.isRunning();
        }
        d dVar = this.A;
        return dVar == d.PLAY || dVar == d.RESUME;
    }

    public void Y0(boolean z) {
        this.y = z;
    }

    public boolean Z() {
        return this.Q;
    }

    public void Z0(bi0 bi0Var) {
        this.F = bi0Var;
        nk0 nk0Var = this.D;
        if (nk0Var != null) {
            nk0Var.e(bi0Var);
        }
    }

    public boolean a0() {
        return this.w.getRepeatCount() == -1;
    }

    public void a1(@z1 String str) {
        this.E = str;
    }

    public boolean b0() {
        return this.J;
    }

    public void b1(boolean z) {
        this.K = z;
    }

    public void c1(final int i) {
        if (this.v == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.uh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.c1(i);
                }
            });
        } else {
            this.w.I(i + 0.99f);
        }
    }

    public /* synthetic */ void d0(tk0 tk0Var, Object obj, np0 np0Var, ei0 ei0Var) {
        i(tk0Var, obj, np0Var);
    }

    public void d1(final String str) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.rh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.d1(str);
                }
            });
            return;
        }
        wk0 l = ei0Var.l(str);
        if (l != null) {
            c1((int) (l.c + l.d));
            return;
        }
        throw new IllegalArgumentException(wo1.u("Cannot find marker with name ", str, CryptoConstants.ALIAS_SEPARATOR));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        ci0.a("Drawable#draw");
        if (this.z) {
            try {
                if (this.S) {
                    O0(canvas, this.M);
                } else {
                    t(canvas);
                }
            } catch (Throwable th) {
                yo0.c("Lottie crashed in draw!", th);
            }
        } else if (this.S) {
            O0(canvas, this.M);
        } else {
            t(canvas);
        }
        this.z0 = false;
        ci0.b("Drawable#draw");
    }

    public void e1(@g1(from = 0.0d, to = 1.0d) final float f) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.ih0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.e1(f);
                }
            });
        } else {
            this.w.I(bp0.k(ei0Var.r(), this.v.f(), f));
        }
    }

    public void f(Animator.AnimatorListener animatorListener) {
        this.w.addListener(animatorListener);
    }

    public /* synthetic */ void f0(ei0 ei0Var) {
        I0();
    }

    public void f1(final int i, final int i2) {
        if (this.v == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.oh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.f1(i, i2);
                }
            });
        } else {
            this.w.J(i, i2 + 0.99f);
        }
    }

    @e2(api = 19)
    public void g(Animator.AnimatorPauseListener animatorPauseListener) {
        this.w.addPauseListener(animatorPauseListener);
    }

    public void g1(final String str) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.vh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.g1(str);
                }
            });
            return;
        }
        wk0 l = ei0Var.l(str);
        if (l != null) {
            int i = (int) l.c;
            f1(i, ((int) l.d) + i);
            return;
        }
        throw new IllegalArgumentException(wo1.u("Cannot find marker with name ", str, CryptoConstants.ALIAS_SEPARATOR));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            return -1;
        }
        return ei0Var.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            return -1;
        }
        return ei0Var.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.w.addUpdateListener(animatorUpdateListener);
    }

    public /* synthetic */ void h0(ei0 ei0Var) {
        Q0();
    }

    public void h1(final String str, final String str2, final boolean z) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.ph0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.h1(str, str2, z);
                }
            });
            return;
        }
        wk0 l = ei0Var.l(str);
        if (l != null) {
            int i = (int) l.c;
            wk0 l2 = this.v.l(str2);
            if (l2 != null) {
                f1(i, (int) (l2.c + (z ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException(wo1.u("Cannot find marker with name ", str2, CryptoConstants.ALIAS_SEPARATOR));
        }
        throw new IllegalArgumentException(wo1.u("Cannot find marker with name ", str, CryptoConstants.ALIAS_SEPARATOR));
    }

    public <T> void i(final tk0 tk0Var, final T t2, @z1 final np0<T> np0Var) {
        jm0 jm0Var = this.M;
        if (jm0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.sh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.i(tk0Var, t2, np0Var);
                }
            });
            return;
        }
        boolean z = true;
        if (tk0Var == tk0.a) {
            jm0Var.h(t2, np0Var);
        } else if (tk0Var.d() != null) {
            tk0Var.d().h(t2, np0Var);
        } else {
            List<tk0> P0 = P0(tk0Var);
            for (int i = 0; i < P0.size(); i++) {
                P0.get(i).d().h(t2, np0Var);
            }
            z = true ^ P0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t2 == mi0.E) {
                o1(N());
            }
        }
    }

    public void i1(@g1(from = 0.0d, to = 1.0d) final float f, @g1(from = 0.0d, to = 1.0d) final float f2) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.nh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.i1(f, f2);
                }
            });
        } else {
            f1((int) bp0.k(ei0Var.r(), this.v.f(), f), (int) bp0.k(this.v.r(), this.v.f(), f2));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@x1 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.z0) {
            return;
        }
        this.z0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return X();
    }

    public <T> void j(tk0 tk0Var, T t2, pp0<T> pp0Var) {
        i(tk0Var, t2, new b(pp0Var));
    }

    public /* synthetic */ void j0(int i, ei0 ei0Var) {
        X0(i);
    }

    public void j1(final int i) {
        if (this.v == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.qh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.j1(i);
                }
            });
        } else {
            this.w.L(i);
        }
    }

    public void k1(final String str) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.mh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.k1(str);
                }
            });
            return;
        }
        wk0 l = ei0Var.l(str);
        if (l != null) {
            j1((int) l.c);
            return;
        }
        throw new IllegalArgumentException(wo1.u("Cannot find marker with name ", str, CryptoConstants.ALIAS_SEPARATOR));
    }

    public /* synthetic */ void l0(int i, ei0 ei0Var) {
        c1(i);
    }

    public void l1(final float f) {
        ei0 ei0Var = this.v;
        if (ei0Var == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.kh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var2) {
                    hi0.this.l1(f);
                }
            });
        } else {
            j1((int) bp0.k(ei0Var.r(), this.v.f(), f));
        }
    }

    public void m() {
        this.B.clear();
        this.w.cancel();
        if (isVisible()) {
            return;
        }
        this.A = d.NONE;
    }

    public void m1(boolean z) {
        if (this.P == z) {
            return;
        }
        this.P = z;
        jm0 jm0Var = this.M;
        if (jm0Var != null) {
            jm0Var.J(z);
        }
    }

    public void n() {
        if (this.w.isRunning()) {
            this.w.cancel();
            if (!isVisible()) {
                this.A = d.NONE;
            }
        }
        this.v = null;
        this.M = null;
        this.D = null;
        this.w.f();
        invalidateSelf();
    }

    public /* synthetic */ void n0(String str, ei0 ei0Var) {
        d1(str);
    }

    public void n1(boolean z) {
        this.O = z;
        ei0 ei0Var = this.v;
        if (ei0Var != null) {
            ei0Var.z(z);
        }
    }

    public void o1(@g1(from = 0.0d, to = 1.0d) final float f) {
        if (this.v == null) {
            this.B.add(new c() { // from class: com.p7700g.p99005.lh0
                @Override // com.p7700g.p99005.hi0.c
                public final void a(ei0 ei0Var) {
                    hi0.this.o1(f);
                }
            });
            return;
        }
        ci0.a("Drawable#setProgress");
        this.w.H(this.v.h(f));
        ci0.b("Drawable#setProgress");
    }

    public /* synthetic */ void p0(float f, ei0 ei0Var) {
        e1(f);
    }

    public void p1(si0 si0Var) {
        this.R = si0Var;
        o();
    }

    public void q1(int i) {
        this.w.setRepeatCount(i);
    }

    @Deprecated
    public void r() {
    }

    public /* synthetic */ void r0(int i, int i2, ei0 ei0Var) {
        f1(i, i2);
    }

    public void r1(int i) {
        this.w.setRepeatMode(i);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void s(Canvas canvas, Matrix matrix) {
        jm0 jm0Var = this.M;
        ei0 ei0Var = this.v;
        if (jm0Var == null || ei0Var == null) {
            return;
        }
        if (this.S) {
            canvas.save();
            canvas.concat(matrix);
            O0(canvas, jm0Var);
            canvas.restore();
        } else {
            jm0Var.g(canvas, matrix, this.N);
        }
        this.z0 = false;
    }

    public void s1(boolean z) {
        this.z = z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@p1(from = 0, to = 255) int i) {
        this.N = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        yo0.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            d dVar = this.A;
            if (dVar == d.PLAY) {
                I0();
            } else if (dVar == d.RESUME) {
                Q0();
            }
        } else if (this.w.isRunning()) {
            H0();
            this.A = d.RESUME;
        } else if (!z3) {
            this.A = d.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @u1
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        I0();
    }

    @Override // android.graphics.drawable.Animatable
    @u1
    public void stop() {
        w();
    }

    public /* synthetic */ void t0(String str, ei0 ei0Var) {
        g1(str);
    }

    public void t1(float f) {
        this.w.M(f);
    }

    public void u(boolean z) {
        if (this.J == z) {
            return;
        }
        this.J = z;
        if (this.v != null) {
            l();
        }
    }

    public void u1(Boolean bool) {
        this.x = bool.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean v() {
        return this.J;
    }

    public /* synthetic */ void v0(String str, String str2, boolean z, ei0 ei0Var) {
        h1(str, str2, z);
    }

    public void v1(ui0 ui0Var) {
        this.I = ui0Var;
    }

    @u1
    public void w() {
        this.B.clear();
        this.w.g();
        if (isVisible()) {
            return;
        }
        this.A = d.NONE;
    }

    @z1
    public Bitmap w1(String str, @z1 Bitmap bitmap) {
        nk0 G = G();
        if (G == null) {
            yo0.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap f = G.f(str, bitmap);
        invalidateSelf();
        return f;
    }

    public /* synthetic */ void x0(float f, float f2, ei0 ei0Var) {
        i1(f, f2);
    }

    public boolean x1() {
        return this.I == null && this.v.c().I() > 0;
    }

    @z1
    public Bitmap z(String str) {
        nk0 G = G();
        if (G != null) {
            return G.a(str);
        }
        return null;
    }

    public /* synthetic */ void z0(int i, ei0 ei0Var) {
        j1(i);
    }
}