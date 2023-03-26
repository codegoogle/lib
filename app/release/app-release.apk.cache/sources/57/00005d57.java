package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import com.p7700g.p99005.i2;

/* compiled from: DrawableContainer.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t3 extends Drawable implements Drawable.Callback {
    private static final boolean s = false;
    private static final String t = "DrawableContainer";
    private static final boolean u = true;
    private boolean A;
    private boolean C;
    private Runnable D;
    private long E;
    private long F;
    private c G;
    private d v;
    private Rect w;
    private Drawable x;
    private Drawable y;
    private int z = 255;
    private int B = -1;

    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t3.this.a(true);
            t3.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainer.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {
        private Drawable.Callback s;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.s;
            this.s = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.s = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@x1 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
            Drawable.Callback callback = this.s;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
            Drawable.Callback callback = this.s;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer.java */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final t3 a;
        public Resources b;
        public int c;
        public int d;
        public int e;
        public SparseArray<Drawable.ConstantState> f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public d(d dVar, t3 t3Var, Resources resources) {
            Resources resources2;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = t3Var;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.b : null;
            }
            this.b = resources2;
            int g = t3.g(resources, dVar != null ? dVar.c : 0);
            this.c = g;
            if (dVar != null) {
                this.d = dVar.d;
                this.e = dVar.e;
                this.v = true;
                this.w = true;
                this.i = dVar.i;
                this.l = dVar.l;
                this.x = dVar.x;
                this.y = dVar.y;
                this.z = dVar.z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.c == g) {
                    if (dVar.j) {
                        this.k = dVar.k != null ? new Rect(dVar.k) : null;
                        this.j = true;
                    }
                    if (dVar.m) {
                        this.n = dVar.n;
                        this.o = dVar.o;
                        this.p = dVar.p;
                        this.q = dVar.q;
                        this.m = true;
                    }
                }
                if (dVar.r) {
                    this.s = dVar.s;
                    this.r = true;
                }
                if (dVar.t) {
                    this.u = dVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = dVar.h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f;
                if (sparseArray != null) {
                    this.f = sparseArray.clone();
                } else {
                    this.f = new SparseArray<>(this.h);
                }
                int i = this.h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f.put(i2, constantState);
                        } else {
                            this.g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.g[this.f.keyAt(i)] = w(this.f.valueAt(i).newDrawable(this.b));
                }
                this.f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                fk.m(drawable, this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        public final boolean A(int i, int i2) {
            int i3 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean m = Build.VERSION.SDK_INT >= 23 ? fk.m(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.z = i;
            return z;
        }

        public final void B(boolean z) {
            this.i = z;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int g = t3.g(resources, this.c);
                int i = this.c;
                this.c = g;
                if (i != g) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i = this.h;
            if (i >= this.g.length) {
                r(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.g[i] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            s();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i;
        }

        @e2(21)
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i = this.h;
                Drawable[] drawableArr = this.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && fk.b(drawableArr[i2])) {
                        fk.a(drawableArr[i2], theme);
                        this.e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                C(b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            f();
            this.v = true;
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @e2(21)
        public boolean canApplyTheme() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (fk.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f.get(i2);
                    if (constantState != null && b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void d() {
            this.y = false;
        }

        public void e() {
            this.m = true;
            f();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final int g() {
            return this.g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Drawable h(int i) {
            int indexOfKey;
            Drawable drawable = this.g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable w = w(this.f.valueAt(indexOfKey).newDrawable(this.b));
            this.g[i] = w;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return w;
        }

        public final int i() {
            return this.h;
        }

        public final int j() {
            if (!this.m) {
                e();
            }
            return this.o;
        }

        public final int k() {
            if (!this.m) {
                e();
            }
            return this.q;
        }

        public final int l() {
            if (!this.m) {
                e();
            }
            return this.p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.i) {
                return null;
            }
            Rect rect2 = this.k;
            if (rect2 != null || this.j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.j = true;
            this.k = rect;
            return rect;
        }

        public final int n() {
            if (!this.m) {
                e();
            }
            return this.n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.r) {
                return this.s;
            }
            f();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void r(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.g = drawableArr;
        }

        public void s() {
            this.r = false;
            this.t = false;
        }

        public final boolean t() {
            return this.l;
        }

        public final boolean u() {
            if (this.t) {
                return this.u;
            }
            f();
            int i = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.u = z;
            this.t = true;
            return z;
        }

        public void v() {
            int i = this.h;
            Drawable[] drawableArr = this.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.y = true;
        }

        public final void x(boolean z) {
            this.l = z;
        }

        public final void y(int i) {
            this.A = i;
        }

        public final void z(int i) {
            this.B = i;
        }
    }

    private void e(Drawable drawable) {
        if (this.G == null) {
            this.G = new c();
        }
        drawable.setCallback(this.G.b(drawable.getCallback()));
        try {
            if (this.v.A <= 0 && this.A) {
                drawable.setAlpha(this.z);
            }
            d dVar = this.v;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    fk.o(drawable, dVar.F);
                }
                d dVar2 = this.v;
                if (dVar2.I) {
                    fk.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.v.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                fk.m(drawable, fk.f(this));
            }
            fk.j(drawable, this.v.C);
            Rect rect = this.w;
            if (rect != null) {
                fk.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.G.a());
        }
    }

    private boolean f() {
        return isAutoMirrored() && fk.f(this) == 1;
    }

    public static int g(@z1 Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.A = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            long j = this.E;
            if (j != 0) {
                if (j <= uptimeMillis) {
                    drawable2.setAlpha(this.z);
                    this.E = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.v.A)) * this.z) / 255);
                    z2 = true;
                    drawable = this.y;
                    if (drawable == null) {
                        long j2 = this.F;
                        if (j2 != 0) {
                            if (j2 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.y = null;
                                this.F = 0L;
                            } else {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.v.B) * this.z) / 255);
                                if (z && z3) {
                                    scheduleSelf(this.D, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.F = 0L;
                    }
                    z3 = z2;
                    if (z) {
                        return;
                    }
                    return;
                }
            }
        } else {
            this.E = 0L;
        }
        z2 = false;
        drawable = this.y;
        if (drawable == null) {
        }
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    @e2(21)
    public void applyTheme(@x1 Resources.Theme theme) {
        this.v.b(theme);
    }

    public void b() {
        this.v.d();
        this.C = false;
    }

    public d c() {
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable
    @e2(21)
    public boolean canApplyTheme() {
        return this.v.canApplyTheme();
    }

    public int d() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.v.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.v.c()) {
            this.v.d = getChangingConfigurations();
            return this.v;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Drawable getCurrent() {
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@x1 Rect rect) {
        Rect rect2 = this.w;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.v.t()) {
            return this.v.j();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.v.t()) {
            return this.v.n();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.v.t()) {
            return this.v.k();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.v.t()) {
            return this.v.l();
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.x;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.v.q();
    }

    @Override // android.graphics.drawable.Drawable
    @e2(21)
    public void getOutline(@x1 Outline outline) {
        Drawable drawable = this.x;
        if (drawable != null) {
            b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@x1 Rect rect) {
        boolean padding;
        Rect m = this.v.m();
        if (m != null) {
            rect.set(m);
            padding = (m.right | ((m.left | m.top) | m.bottom)) != 0;
        } else {
            Drawable drawable = this.x;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (f()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(int i) {
        Runnable runnable;
        if (i == this.B) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.v.B > 0) {
            Drawable drawable = this.y;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.x;
            if (drawable2 != null) {
                this.y = drawable2;
                this.F = this.v.B + uptimeMillis;
            } else {
                this.y = null;
                this.F = 0L;
            }
        } else {
            Drawable drawable3 = this.x;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            d dVar = this.v;
            if (i < dVar.h) {
                Drawable h = dVar.h(i);
                this.x = h;
                this.B = i;
                if (h != null) {
                    int i2 = this.v.A;
                    if (i2 > 0) {
                        this.E = uptimeMillis + i2;
                    }
                    e(h);
                }
                if (this.E == 0 || this.F != 0) {
                    runnable = this.D;
                    if (runnable != null) {
                        this.D = new a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.x = null;
        this.B = -1;
        if (this.E == 0) {
        }
        runnable = this.D;
        if (runnable != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public void i(d dVar) {
        this.v = dVar;
        int i = this.B;
        if (i >= 0) {
            Drawable h = dVar.h(i);
            this.x = h;
            if (h != null) {
                e(h);
            }
        }
        this.y = null;
    }

    public void invalidateDrawable(@x1 Drawable drawable) {
        d dVar = this.v;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.x || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.v.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.v.u();
    }

    public void j(int i) {
        h(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.y;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.y = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.A) {
                this.x.setAlpha(this.z);
            }
        }
        if (this.F != 0) {
            this.F = 0L;
            z = true;
        }
        if (this.E != 0) {
            this.E = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public void k(int i) {
        this.v.A = i;
    }

    public void l(int i) {
        this.v.B = i;
    }

    public final void m(Resources resources) {
        this.v.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.C && super.mutate() == this) {
            d c2 = c();
            c2.v();
            i(c2);
            this.C = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.v.A(i, d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@x1 int[] iArr) {
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
        if (drawable != this.x || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.A && this.z == i) {
            return;
        }
        this.A = true;
        this.z = i;
        Drawable drawable = this.x;
        if (drawable != null) {
            if (this.E == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        d dVar = this.v;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.x;
            if (drawable != null) {
                fk.j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.v;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        d dVar = this.v;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.x;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.x;
        if (drawable != null) {
            fk.k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.w;
        if (rect == null) {
            this.w = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            fk.l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(@w0 int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.v;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            fk.o(this.x, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(@x1 PorterDuff.Mode mode) {
        d dVar = this.v;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            fk.p(this.x, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
        if (drawable != this.x || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}