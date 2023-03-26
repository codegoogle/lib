package com.facebook.shimmer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.b;
import com.facebook.shimmer.c;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {
    private final Paint s;
    private final d t;
    private boolean u;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.s = new Paint();
        this.t = new d();
        this.u = true;
        b(context, null);
    }

    private void b(Context context, @z1 AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.t.setCallback(this);
        if (attributeSet == null) {
            e(new c.a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a, 0, 0);
        try {
            int i = b.c.f;
            e(((obtainStyledAttributes.hasValue(i) && obtainStyledAttributes.getBoolean(i, false)) ? new c.C0101c() : new c.a()).d(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a() {
        if (this.u) {
            h();
            this.u = false;
            invalidate();
        }
    }

    public boolean c() {
        return this.t.a();
    }

    public boolean d() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.u) {
            this.t.draw(canvas);
        }
    }

    public ShimmerFrameLayout e(@z1 c cVar) {
        this.t.d(cVar);
        if (cVar != null && cVar.p) {
            setLayerType(2, this.s);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    public void f(boolean z) {
        if (this.u) {
            return;
        }
        this.u = true;
        if (z) {
            g();
        }
    }

    public void g() {
        this.t.e();
    }

    public void h() {
        this.t.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.t.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@x1 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new Paint();
        this.t = new d();
        this.u = true;
        b(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = new Paint();
        this.t = new d();
        this.u = true;
        b(context, attributeSet);
    }

    @TargetApi(21)
    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.s = new Paint();
        this.t = new d();
        this.u = true;
        b(context, attributeSet);
    }
}