package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p7700g.p99005.vb2;

/* compiled from: CircularRevealCardView.java */
/* loaded from: classes.dex */
public class wb2 extends lb2 implements vb2 {
    @x1
    private final sb2 Q;

    public wb2(Context context) {
        this(context, null);
    }

    @Override // com.p7700g.p99005.vb2
    public void a() {
        this.Q.a();
    }

    @Override // com.p7700g.p99005.vb2
    public void b() {
        this.Q.b();
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
        sb2 sb2Var = this.Q;
        if (sb2Var != null) {
            sb2Var.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.p7700g.p99005.vb2
    @z1
    public Drawable getCircularRevealOverlayDrawable() {
        return this.Q.g();
    }

    @Override // com.p7700g.p99005.vb2
    public int getCircularRevealScrimColor() {
        return this.Q.h();
    }

    @Override // com.p7700g.p99005.vb2
    @z1
    public vb2.e getRevealInfo() {
        return this.Q.j();
    }

    @Override // android.view.View, com.p7700g.p99005.vb2
    public boolean isOpaque() {
        sb2 sb2Var = this.Q;
        if (sb2Var != null) {
            return sb2Var.l();
        }
        return super.isOpaque();
    }

    @Override // com.p7700g.p99005.vb2
    public void setCircularRevealOverlayDrawable(@z1 Drawable drawable) {
        this.Q.m(drawable);
    }

    @Override // com.p7700g.p99005.vb2
    public void setCircularRevealScrimColor(@w0 int i) {
        this.Q.n(i);
    }

    @Override // com.p7700g.p99005.vb2
    public void setRevealInfo(@z1 vb2.e eVar) {
        this.Q.o(eVar);
    }

    public wb2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = new sb2(this);
    }
}