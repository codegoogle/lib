package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p7700g.p99005.vb2;

/* compiled from: CircularRevealCoordinatorLayout.java */
/* loaded from: classes.dex */
public class xb2 extends CoordinatorLayout implements vb2 {
    @x1
    private final sb2 u0;

    public xb2(@x1 Context context) {
        this(context, null);
    }

    @Override // com.p7700g.p99005.vb2
    public void a() {
        this.u0.a();
    }

    @Override // com.p7700g.p99005.vb2
    public void b() {
        this.u0.b();
    }

    @Override // com.p7700g.p99005.sb2.a
    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.p7700g.p99005.sb2.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, com.p7700g.p99005.vb2
    public void draw(Canvas canvas) {
        sb2 sb2Var = this.u0;
        if (sb2Var != null) {
            sb2Var.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.p7700g.p99005.vb2
    @z1
    public Drawable getCircularRevealOverlayDrawable() {
        return this.u0.g();
    }

    @Override // com.p7700g.p99005.vb2
    public int getCircularRevealScrimColor() {
        return this.u0.h();
    }

    @Override // com.p7700g.p99005.vb2
    @z1
    public vb2.e getRevealInfo() {
        return this.u0.j();
    }

    @Override // android.view.View, com.p7700g.p99005.vb2
    public boolean isOpaque() {
        sb2 sb2Var = this.u0;
        if (sb2Var != null) {
            return sb2Var.l();
        }
        return super.isOpaque();
    }

    @Override // com.p7700g.p99005.vb2
    public void setCircularRevealOverlayDrawable(@z1 Drawable drawable) {
        this.u0.m(drawable);
    }

    @Override // com.p7700g.p99005.vb2
    public void setCircularRevealScrimColor(@w0 int i) {
        this.u0.n(i);
    }

    @Override // com.p7700g.p99005.vb2
    public void setRevealInfo(@z1 vb2.e eVar) {
        this.u0.o(eVar);
    }

    public xb2(@x1 Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u0 = new sb2(this);
    }
}