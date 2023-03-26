package com.p7700g.p99005;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableResource.java */
/* loaded from: classes2.dex */
public class av1 extends mw1<BitmapDrawable> implements yr1 {
    private final ls1 t;

    public av1(BitmapDrawable bitmapDrawable, ls1 ls1Var) {
        super(bitmapDrawable);
        this.t = ls1Var;
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
        this.t.a(((BitmapDrawable) this.s).getBitmap());
    }

    @Override // com.p7700g.p99005.cs1
    public int c() {
        return z02.h(((BitmapDrawable) this.s).getBitmap());
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // com.p7700g.p99005.mw1, com.p7700g.p99005.yr1
    public void initialize() {
        ((BitmapDrawable) this.s).getBitmap().prepareToDraw();
    }
}