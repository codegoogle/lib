package com.p7700g.p99005;

import android.view.View;

/* compiled from: VisibilityPropagation.java */
/* loaded from: classes.dex */
public abstract class s90 extends w80 {
    private static final String a = "android:visibilityPropagation:visibility";
    private static final String b = "android:visibilityPropagation:center";
    private static final String[] c = {a, b};

    private static int d(z80 z80Var, int i) {
        int[] iArr;
        if (z80Var == null || (iArr = (int[]) z80Var.a.get(b)) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // com.p7700g.p99005.w80
    public void a(z80 z80Var) {
        View view = z80Var.b;
        Integer num = (Integer) z80Var.a.get(r90.I0);
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        z80Var.a.put(a, num);
        view.getLocationOnScreen(r2);
        int[] iArr = {Math.round(view.getTranslationX()) + iArr[0]};
        iArr[0] = (view.getWidth() / 2) + iArr[0];
        iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = (view.getHeight() / 2) + iArr[1];
        z80Var.a.put(b, iArr);
    }

    @Override // com.p7700g.p99005.w80
    public String[] b() {
        return c;
    }

    public int e(z80 z80Var) {
        Integer num;
        if (z80Var == null || (num = (Integer) z80Var.a.get(a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(z80 z80Var) {
        return d(z80Var, 0);
    }

    public int g(z80 z80Var) {
        return d(z80Var, 1);
    }
}