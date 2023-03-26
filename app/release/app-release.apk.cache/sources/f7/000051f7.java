package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
@e2(22)
/* loaded from: classes.dex */
public class n90 extends m90 {
    private static boolean l = true;

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public void f(@x1 View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}