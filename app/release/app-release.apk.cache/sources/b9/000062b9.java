package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.a02;

/* compiled from: BitmapContainerTransitionFactory.java */
/* loaded from: classes2.dex */
public abstract class vz1<R> implements b02<R> {
    private final b02<Drawable> a;

    /* compiled from: BitmapContainerTransitionFactory.java */
    /* loaded from: classes2.dex */
    public final class a implements a02<R> {
        private final a02<Drawable> a;

        public a(a02<Drawable> a02Var) {
            this.a = a02Var;
        }

        @Override // com.p7700g.p99005.a02
        public boolean a(R r, a02.a aVar) {
            return this.a.a(new BitmapDrawable(aVar.getView().getResources(), vz1.this.b(r)), aVar);
        }
    }

    public vz1(b02<Drawable> b02Var) {
        this.a = b02Var;
    }

    @Override // com.p7700g.p99005.b02
    public a02<R> a(aq1 aq1Var, boolean z) {
        return new a(this.a.a(aq1Var, z));
    }

    public abstract Bitmap b(R r);
}