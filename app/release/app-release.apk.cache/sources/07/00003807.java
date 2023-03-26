package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.p7700g.p99005.cp1;
import java.util.Arrays;

/* compiled from: ViewPreloadSizeProvider.java */
/* loaded from: classes2.dex */
public class a12<T> implements cp1.b<T>, rz1 {
    private int[] a;
    private a b;

    /* compiled from: ViewPreloadSizeProvider.java */
    /* loaded from: classes2.dex */
    public static final class a extends iz1<View, Object> {
        public a(@x1 View view) {
            super(view);
        }

        @Override // com.p7700g.p99005.sz1
        public void c(@x1 Object obj, @z1 a02<? super Object> a02Var) {
        }

        @Override // com.p7700g.p99005.iz1
        public void h(@z1 Drawable drawable) {
        }

        @Override // com.p7700g.p99005.sz1
        public void k(@z1 Drawable drawable) {
        }
    }

    public a12() {
    }

    @Override // com.p7700g.p99005.cp1.b
    @z1
    public int[] a(@x1 T t, int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@x1 View view) {
        if (this.a == null && this.b == null) {
            a aVar = new a(view);
            this.b = aVar;
            aVar.q(this);
        }
    }

    @Override // com.p7700g.p99005.rz1
    public void e(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = null;
    }

    public a12(@x1 View view) {
        a aVar = new a(view);
        this.b = aVar;
        aVar.q(this);
    }
}