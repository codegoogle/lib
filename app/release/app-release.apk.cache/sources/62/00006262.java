package com.p7700g.p99005;

/* compiled from: GrammarUtil.java */
/* loaded from: classes3.dex */
public final class vs3 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final char[] f = {'\t', '\r', '\n', gl4.R};
    public static final char[] g = {'(', ')', h95.e, h95.f, '@', e14.f0, ';', ':', '\\', h95.b, j14.P, f14.u, f14.v, '?', '=', '{', '}', gl4.R, '\t'};
    public static final int[] h = b();
    public static final boolean[] i = d();
    public static final boolean[] j = c();

    public static boolean a(String str) {
        for (char c2 : str.toCharArray()) {
            if (i(c2)) {
                return true;
            }
        }
        return false;
    }

    private static int[] b() {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 < 127; i2++) {
            iArr[i2] = 0;
        }
        for (char c2 : g) {
            iArr[c2] = 3;
        }
        iArr[40] = 2;
        iArr[34] = 1;
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = 4;
        }
        iArr[127] = 4;
        for (char c3 : f) {
            iArr[c3] = -1;
        }
        return iArr;
    }

    private static boolean[] c() {
        boolean[] zArr = new boolean[128];
        for (int i2 = 0; i2 < 128; i2++) {
            zArr[i2] = h[i2] == 0;
        }
        return zArr;
    }

    private static boolean[] d() {
        boolean[] zArr = new boolean[128];
        for (char c2 : f) {
            zArr[c2] = true;
        }
        return zArr;
    }

    public static String e(String str, int i2, int i3) {
        return f(str, i2, i3, false);
    }

    public static String f(String str, int i2, int i3, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\n' || !z2) {
                if (z3) {
                    sb.append(charAt);
                    z2 = false;
                    z3 = false;
                } else if (!z && charAt == '\\') {
                    z2 = false;
                    z3 = true;
                } else if (charAt == '\r') {
                    z2 = true;
                } else {
                    sb.append(charAt);
                }
                i2++;
            }
            z2 = false;
            i2++;
        }
        return sb.toString();
    }

    public static boolean g(char c2) {
        return c2 < 128 && j[c2];
    }

    public static boolean h(String str) {
        for (char c2 : str.toCharArray()) {
            if (!g(c2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(char c2) {
        return c2 < 128 && i[c2];
    }
}