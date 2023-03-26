package com.p7700g.p99005;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty.java */
/* loaded from: classes2.dex */
public class ma2 extends Property<ImageView, Matrix> {
    private final Matrix a;

    public ma2() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    @x1
    /* renamed from: a */
    public Matrix get(@x1 ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@x1 ImageView imageView, @x1 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}