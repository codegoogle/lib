package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class m90 extends l90 {
    private static boolean i = true;
    private static boolean j = true;
    private static boolean k = true;

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public void e(@x1 View view, @z1 Matrix matrix) {
        if (i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public void i(@x1 View view, @x1 Matrix matrix) {
        if (j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public void j(@x1 View view, @x1 Matrix matrix) {
        if (k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}