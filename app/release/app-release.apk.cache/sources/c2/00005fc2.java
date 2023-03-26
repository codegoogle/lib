package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.p7700g.p99005.vb2;

/* compiled from: CircularRevealRelativeLayout.java */
/* loaded from: classes.dex */
public class ub2 extends RelativeLayout implements vb2 {
    @x1
    private final sb2 s;

    public ub2(Context context) {
        this(context, null);
    }

    @Override // com.p7700g.p99005.vb2
    public void a() {
        this.s.a();
    }

    @Override // com.p7700g.p99005.vb2
    public void b() {
        this.s.b();
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
    public void draw(@x1 Canvas canvas) {
        sb2 sb2Var = this.s;
        if (sb2Var != null) {
            sb2Var.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.p7700g.p99005.vb2
    @z1
    public Drawable getCircularRevealOverlayDrawable() {
        return this.s.g();
    }

    @Override // com.p7700g.p99005.vb2
    public int getCircularRevealScrimColor() {
        return this.s.h();
    }

    @Override // com.p7700g.p99005.vb2
    @z1
    public vb2.e getRevealInfo() {
        return this.s.j();
    }

    @Override // android.view.View, com.p7700g.p99005.vb2
    public boolean isOpaque() {
        sb2 sb2Var = this.s;
        if (sb2Var != null) {
            return sb2Var.l();
        }
        return super.isOpaque();
    }

    @Override // com.p7700g.p99005.vb2
    public void setCircularRevealOverlayDrawable(@z1 Drawable drawable) {
        this.s.m(drawable);
    }

    @Override // com.p7700g.p99005.vb2
    public void setCircularRevealScrimColor(@w0 int i) {
        this.s.n(i);
    }

    @Override // com.p7700g.p99005.vb2
    public void setRevealInfo(@z1 vb2.e eVar) {
        this.s.o(eVar);
    }

    public ub2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new sb2(this);
    }
}