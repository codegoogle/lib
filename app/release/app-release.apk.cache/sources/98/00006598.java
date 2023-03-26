package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.i2;

/* compiled from: RippleDrawableCompat.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class xg2 extends Drawable implements uh2, lk {
    private b s;

    @Override // android.graphics.drawable.Drawable
    @x1
    /* renamed from: a */
    public xg2 mutate() {
        this.s = new b(this.s);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.s;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @z1
    public Drawable.ConstantState getConstantState() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.s.a.getOpacity();
    }

    @Override // com.p7700g.p99005.uh2
    @x1
    public qh2 getShapeAppearanceModel() {
        return this.s.a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@x1 Rect rect) {
        super.onBoundsChange(rect);
        this.s.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@x1 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.s.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = yg2.e(iArr);
        b bVar = this.s;
        if (bVar.b != e) {
            bVar.b = e;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.s.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        this.s.a.setColorFilter(colorFilter);
    }

    @Override // com.p7700g.p99005.uh2
    public void setShapeAppearanceModel(@x1 qh2 qh2Var) {
        this.s.a.setShapeAppearanceModel(qh2Var);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(@w0 int i) {
        this.s.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(@z1 ColorStateList colorStateList) {
        this.s.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(@z1 PorterDuff.Mode mode) {
        this.s.a.setTintMode(mode);
    }

    public xg2(qh2 qh2Var) {
        this(new b(new lh2(qh2Var)));
    }

    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {
        @x1
        public lh2 a;
        public boolean b;

        public b(lh2 lh2Var) {
            this.a = lh2Var;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        /* renamed from: a */
        public xg2 newDrawable() {
            return new xg2(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@x1 b bVar) {
            this.a = (lh2) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    private xg2(b bVar) {
        this.s = bVar;
    }
}