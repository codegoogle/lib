package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.p7700g.p99005.ov1;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes2.dex */
public class dw1 implements lq1<InputStream, Bitmap> {
    private final ov1 a;
    private final is1 b;

    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: classes2.dex */
    public static class a implements ov1.b {
        private final zv1 a;
        private final p02 b;

        public a(zv1 zv1Var, p02 p02Var) {
            this.a = zv1Var;
            this.b = p02Var;
        }

        @Override // com.p7700g.p99005.ov1.b
        public void a(ls1 ls1Var, Bitmap bitmap) throws IOException {
            IOException b = this.b.b();
            if (b != null) {
                if (bitmap != null) {
                    ls1Var.a(bitmap);
                }
                throw b;
            }
        }

        @Override // com.p7700g.p99005.ov1.b
        public void b() {
            this.a.b();
        }
    }

    public dw1(ov1 ov1Var, is1 is1Var) {
        this.a = ov1Var;
        this.b = is1Var;
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 InputStream inputStream, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        zv1 zv1Var;
        boolean z;
        if (inputStream instanceof zv1) {
            zv1Var = (zv1) inputStream;
            z = false;
        } else {
            zv1Var = new zv1(inputStream, this.b);
            z = true;
        }
        p02 d = p02.d(zv1Var);
        try {
            return this.a.g(new v02(d), i, i2, jq1Var, new a(zv1Var, d));
        } finally {
            d.release();
            if (z) {
                zv1Var.release();
            }
        }
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 InputStream inputStream, @x1 jq1 jq1Var) {
        return this.a.s(inputStream);
    }
}