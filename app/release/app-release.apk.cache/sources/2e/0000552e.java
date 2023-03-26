package com.p7700g.p99005;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes2.dex */
public final class ow1 extends mw1<Drawable> {
    private ow1(Drawable drawable) {
        super(drawable);
    }

    @z1
    public static cs1<Drawable> e(@z1 Drawable drawable) {
        if (drawable != null) {
            return new ow1(drawable);
        }
        return null;
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return Math.max(1, this.s.getIntrinsicHeight() * this.s.getIntrinsicWidth() * 4);
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<Drawable> d() {
        return this.s.getClass();
    }
}