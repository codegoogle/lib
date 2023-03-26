package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.io.PrintWriter;

/* compiled from: TimeUtils.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class up {
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static final int a = 19;
    private static final int b = 60;
    private static final int c = 3600;
    private static final int d = 86400;
    private static final Object e = new Object();
    private static char[] f = new char[24];

    private up() {
    }

    private static int a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            d(j - j2, printWriter, 0);
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j, PrintWriter printWriter) {
        d(j, printWriter, 0);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j, PrintWriter printWriter, int i) {
        synchronized (e) {
            printWriter.print(new String(f, 0, f(j, i)));
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j, StringBuilder sb) {
        synchronized (e) {
            sb.append(f, 0, f(j, 0));
        }
    }

    private static int f(long j, int i) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f.length < i) {
            f = new char[i];
        }
        char[] cArr = f;
        int i7 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i7 == 0) {
            int i8 = i - 1;
            while (i8 > 0) {
                cArr[0] = gl4.R;
            }
            cArr[0] = '0';
            return 1;
        }
        if (i7 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i4 = floor - (i10 * 60);
            i5 = i10;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int a2 = a(i2, 1, false, 0);
            int a3 = a2 + a(i3, 1, a2 > 0, 2);
            int a4 = a3 + a(i5, 1, a3 > 0, 2);
            int a5 = a4 + a(i4, 1, a4 > 0, 2);
            i6 = 0;
            for (int a6 = a(i9, 2, true, a5 > 0 ? 3 : 0) + 1 + a5; a6 < i; a6++) {
                cArr[i6] = gl4.R;
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c2;
        int i11 = i6 + 1;
        boolean z = i != 0;
        int g = g(cArr, i2, 'd', i11, false, 0);
        int g2 = g(cArr, i3, 'h', g, g != i11, z ? 2 : 0);
        int g3 = g(cArr, i5, 'm', g2, g2 != i11, z ? 2 : 0);
        int g4 = g(cArr, i4, ni4.Z, g3, g3 != i11, z ? 2 : 0);
        int g5 = g(cArr, i9, 'm', g4, true, (!z || g4 == i11) ? 0 : 3);
        cArr[g5] = ni4.Z;
        return g5 + 1;
    }

    private static int g(char[] cArr, int i, char c2, int i2, boolean z, int i3) {
        int i4;
        if (z || i > 0) {
            if ((!z || i3 < 3) && i <= 99) {
                i4 = i2;
            } else {
                int i5 = i / 100;
                cArr[i2] = (char) (i5 + 48);
                i4 = i2 + 1;
                i -= i5 * 100;
            }
            if ((z && i3 >= 2) || i > 9 || i2 != i4) {
                int i6 = i / 10;
                cArr[i4] = (char) (i6 + 48);
                i4++;
                i -= i6 * 10;
            }
            cArr[i4] = (char) (i + 48);
            int i7 = i4 + 1;
            cArr[i7] = c2;
            return i7 + 1;
        }
        return i2;
    }
}