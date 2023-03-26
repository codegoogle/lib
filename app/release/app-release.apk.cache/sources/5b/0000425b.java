package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.p7700g.p99005.ag2;
import com.p7700g.p99005.pu;
import com.p7700g.p99005.z90;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes3.dex */
public final class fg2<S extends ag2> extends gg2 {
    private static final int J = 10000;
    private static final float K = 50.0f;
    private static final ru<fg2> L = new a("indicatorLevel");
    private hg2<S> M;
    private final vu N;
    private final uu O;
    private float P;
    private boolean Q;

    /* compiled from: DeterminateDrawable.java */
    /* loaded from: classes3.dex */
    public class a extends ru<fg2> {
        public a(String str) {
            super(str);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(fg2 fg2Var) {
            return fg2Var.D() * 10000.0f;
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(fg2 fg2Var, float f) {
            fg2Var.G(f / 10000.0f);
        }
    }

    public fg2(@x1 Context context, @x1 ag2 ag2Var, @x1 hg2<S> hg2Var) {
        super(context, ag2Var);
        this.Q = false;
        F(hg2Var);
        vu vuVar = new vu();
        this.N = vuVar;
        vuVar.g(1.0f);
        vuVar.i(50.0f);
        uu uuVar = new uu(this, L);
        this.O = uuVar;
        uuVar.D(vuVar);
        p(1.0f);
    }

    @x1
    public static fg2<eg2> A(@x1 Context context, @x1 eg2 eg2Var) {
        return new fg2<>(context, eg2Var, new bg2(eg2Var));
    }

    @x1
    public static fg2<og2> B(@x1 Context context, @x1 og2 og2Var) {
        return new fg2<>(context, og2Var, new kg2(og2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float D() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f) {
        this.P = f;
        invalidateSelf();
    }

    @x1
    public hg2<S> C() {
        return this.M;
    }

    public void E(@x1 pu.q qVar) {
        this.O.l(qVar);
    }

    public void F(@x1 hg2<S> hg2Var) {
        this.M = hg2Var;
        hg2Var.f(this);
    }

    public void H(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // com.p7700g.p99005.gg2, com.p7700g.p99005.z90
    public /* bridge */ /* synthetic */ void b(@x1 z90.a aVar) {
        super.b(aVar);
    }

    @Override // com.p7700g.p99005.gg2, com.p7700g.p99005.z90
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.p7700g.p99005.gg2, com.p7700g.p99005.z90
    public /* bridge */ /* synthetic */ boolean d(@x1 z90.a aVar) {
        return super.d(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.M.g(canvas, j());
            this.M.c(canvas, this.H);
            this.M.b(canvas, this.H, 0.0f, D(), kc2.a(this.w.c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.M.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.M.e();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.O.E();
        G(getLevel() / 10000.0f);
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.Q) {
            this.O.E();
            G(i / 10000.0f);
            return true;
        }
        this.O.t(D() * 10000.0f);
        this.O.z(i);
        return true;
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@z1 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.p7700g.p99005.gg2, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.p7700g.p99005.gg2
    public /* bridge */ /* synthetic */ boolean v(boolean z, boolean z2, boolean z3) {
        return super.v(z, z2, z3);
    }

    @Override // com.p7700g.p99005.gg2
    public boolean w(boolean z, boolean z2, boolean z3) {
        boolean w = super.w(z, z2, z3);
        float a2 = this.x.a(this.v.getContentResolver());
        if (a2 == 0.0f) {
            this.Q = true;
        } else {
            this.Q = false;
            this.N.i(50.0f / a2);
        }
        return w;
    }

    public void z(@x1 pu.q qVar) {
        this.O.b(qVar);
    }
}