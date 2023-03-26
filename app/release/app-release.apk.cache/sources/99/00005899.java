package com.p7700g.p99005;

/* compiled from: JsonScope.java */
/* loaded from: classes.dex */
public final class qo0 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;

    private qo0() {
    }

    public static String a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder F = wo1.F(h95.c);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                F.append(f14.u);
                F.append(iArr2[i2]);
                F.append(f14.v);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                F.append('.');
                if (strArr[i2] != null) {
                    F.append(strArr[i2]);
                }
            }
        }
        return F.toString();
    }
}