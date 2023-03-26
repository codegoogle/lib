package com.p7700g.p99005;

import android.graphics.Bitmap;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes2.dex */
public final class fw1 implements lq1<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: classes2.dex */
    public static final class a implements cs1<Bitmap> {
        private final Bitmap s;

        public a(@x1 Bitmap bitmap) {
            this.s = bitmap;
        }

        @Override // com.p7700g.p99005.cs1
        public void a() {
        }

        @Override // com.p7700g.p99005.cs1
        @x1
        /* renamed from: b */
        public Bitmap get() {
            return this.s;
        }

        @Override // com.p7700g.p99005.cs1
        public int c() {
            return z02.h(this.s);
        }

        @Override // com.p7700g.p99005.cs1
        @x1
        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 Bitmap bitmap, int i, int i2, @x1 jq1 jq1Var) {
        return new a(bitmap);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 Bitmap bitmap, @x1 jq1 jq1Var) {
        return true;
    }
}