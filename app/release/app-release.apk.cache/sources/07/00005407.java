package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
@e2(23)
/* loaded from: classes.dex */
public class o90 extends n90 {
    private static boolean m = true;

    @Override // com.p7700g.p99005.q90
    @SuppressLint({"NewApi"})
    public void h(@x1 View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i);
        } else if (m) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}