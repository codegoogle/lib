package com.p7700g.p99005;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableResource.java */
/* loaded from: classes2.dex */
public abstract class mw1<T extends Drawable> implements cs1<T>, yr1 {
    public final T s;

    public mw1(T t) {
        this.s = (T) x02.d(t);
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    /* renamed from: b */
    public final T get() {
        Drawable.ConstantState constantState = this.s.getConstantState();
        if (constantState == null) {
            return this.s;
        }
        return (T) constantState.newDrawable();
    }

    public void initialize() {
        T t = this.s;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof vw1) {
            ((vw1) t).h().prepareToDraw();
        }
    }
}