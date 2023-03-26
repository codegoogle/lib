package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialThemeOverlay.java */
/* loaded from: classes3.dex */
public class yi2 {
    private static final int[] a = {16842752, ga2.c.Ig};
    private static final int[] b = {ga2.c.kb};

    private yi2() {
    }

    @m2
    private static int a(@x1 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @m2
    private static int b(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @x1
    public static Context c(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        int b2 = b(context, attributeSet, i, i2);
        boolean z = (context instanceof d4) && ((d4) context).c() == b2;
        if (b2 == 0 || z) {
            return context;
        }
        d4 d4Var = new d4(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            d4Var.getTheme().applyStyle(a2, true);
        }
        return d4Var;
    }
}