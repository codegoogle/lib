package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.p7700g.p99005.z90;
import com.p7700g.p99005.zw1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifDrawable.java */
/* loaded from: classes2.dex */
public class vw1 extends Drawable implements zw1.b, Animatable, z90 {
    public static final int s = -1;
    public static final int t = 0;
    private static final int u = 119;
    private int A;
    private int B;
    private boolean C;
    private Paint D;
    private Rect E;
    private List<z90.a> F;
    private final a v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes2.dex */
    public static final class a extends Drawable.ConstantState {
        @r2
        public final zw1 a;

        public a(zw1 zw1Var) {
            this.a = zw1Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            return new vw1(this);
        }
    }

    @Deprecated
    public vw1(Context context, up1 up1Var, ls1 ls1Var, nq1<Bitmap> nq1Var, int i, int i2, Bitmap bitmap) {
        this(context, up1Var, nq1Var, i, i2, bitmap);
    }

    private Drawable.Callback e() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect g() {
        if (this.E == null) {
            this.E = new Rect();
        }
        return this.E;
    }

    private Paint l() {
        if (this.D == null) {
            this.D = new Paint(2);
        }
        return this.D;
    }

    private void o() {
        List<z90.a> list = this.F;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.F.get(i).b(this);
            }
        }
    }

    private void q() {
        this.A = 0;
    }

    private void v() {
        x02.a(!this.y, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.v.a.f() == 1) {
            invalidateSelf();
        } else if (this.w) {
        } else {
            this.w = true;
            this.v.a.v(this);
            invalidateSelf();
        }
    }

    private void w() {
        this.w = false;
        this.v.a.w(this);
    }

    @Override // com.p7700g.p99005.zw1.b
    public void a() {
        if (e() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (j() == i() - 1) {
            this.A++;
        }
        int i = this.B;
        if (i == -1 || this.A < i) {
            return;
        }
        o();
        stop();
    }

    @Override // com.p7700g.p99005.z90
    public void b(@x1 z90.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(aVar);
    }

    @Override // com.p7700g.p99005.z90
    public void c() {
        List<z90.a> list = this.F;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.p7700g.p99005.z90
    public boolean d(@x1 z90.a aVar) {
        List<z90.a> list = this.F;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        if (this.y) {
            return;
        }
        if (this.C) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), g());
            this.C = false;
        }
        canvas.drawBitmap(this.v.a.c(), (Rect) null, g(), l());
    }

    public ByteBuffer f() {
        return this.v.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.v.a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.v.a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap h() {
        return this.v.a.e();
    }

    public int i() {
        return this.v.a.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.w;
    }

    public int j() {
        return this.v.a.d();
    }

    public nq1<Bitmap> k() {
        return this.v.a.h();
    }

    public int m() {
        return this.v.a.l();
    }

    public boolean n() {
        return this.y;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.C = true;
    }

    public void p() {
        this.y = true;
        this.v.a.a();
    }

    public void r(nq1<Bitmap> nq1Var, Bitmap bitmap) {
        this.v.a.q(nq1Var, bitmap);
    }

    public void s(boolean z) {
        this.w = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        l().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        l().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        x02.a(!this.y, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.z = z;
        if (!z) {
            w();
        } else if (this.x) {
            v();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.x = true;
        q();
        if (this.z) {
            v();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.x = false;
        w();
    }

    public void t(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int j = this.v.a.j();
            this.B = j != 0 ? j : -1;
            return;
        }
        this.B = i;
    }

    public void u() {
        x02.a(!this.w, "You cannot restart a currently running animation.");
        this.v.a.r();
        start();
    }

    public vw1(Context context, up1 up1Var, nq1<Bitmap> nq1Var, int i, int i2, Bitmap bitmap) {
        this(new a(new zw1(yo1.e(context), up1Var, i, i2, nq1Var, bitmap)));
    }

    public vw1(a aVar) {
        this.z = true;
        this.B = -1;
        this.v = (a) x02.d(aVar);
    }

    @r2
    public vw1(zw1 zw1Var, Paint paint) {
        this(new a(zw1Var));
        this.D = paint;
    }
}