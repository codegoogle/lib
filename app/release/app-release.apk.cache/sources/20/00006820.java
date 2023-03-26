package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
@e2(21)
/* loaded from: classes2.dex */
public final class yv1 implements lq1<ParcelFileDescriptor, Bitmap> {
    private static final int a = 536870912;
    private final ov1 b;

    public yv1(ov1 ov1Var) {
        this.b = ov1Var;
    }

    private boolean e(@x1 ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // com.p7700g.p99005.lq1
    @z1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        return this.b.d(parcelFileDescriptor, i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 ParcelFileDescriptor parcelFileDescriptor, @x1 jq1 jq1Var) {
        return e(parcelFileDescriptor) && this.b.r(parcelFileDescriptor);
    }
}