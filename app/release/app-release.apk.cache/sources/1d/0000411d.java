package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: UArraySorting.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class eu4 {
    @go4
    private static final int a(long[] jArr, int i, int i2) {
        long o = oq4.o(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (br4.g(oq4.o(jArr, i), o) < 0) {
                i++;
            }
            while (br4.g(oq4.o(jArr, i2), o) > 0) {
                i2--;
            }
            if (i <= i2) {
                long o2 = oq4.o(jArr, i);
                oq4.B(jArr, i, oq4.o(jArr, i2));
                oq4.B(jArr, i2, o2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @go4
    private static final int b(byte[] bArr, int i, int i2) {
        int i3;
        byte o = gq4.o(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = o & 255;
                if (c25.t(gq4.o(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (c25.t(gq4.o(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte o2 = gq4.o(bArr, i);
                gq4.B(bArr, i, gq4.o(bArr, i2));
                gq4.B(bArr, i2, o2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @go4
    private static final int c(short[] sArr, int i, int i2) {
        int i3;
        short o = uq4.o(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int o2 = uq4.o(sArr, i) & tq4.u;
                i3 = o & tq4.u;
                if (c25.t(o2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (c25.t(uq4.o(sArr, i2) & tq4.u, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short o3 = uq4.o(sArr, i);
                uq4.B(sArr, i, uq4.o(sArr, i2));
                uq4.B(sArr, i2, o3);
                i++;
                i2--;
            }
        }
        return i;
    }

    @go4
    private static final int d(int[] iArr, int i, int i2) {
        int o = kq4.o(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (br4.c(kq4.o(iArr, i), o) < 0) {
                i++;
            }
            while (br4.c(kq4.o(iArr, i2), o) > 0) {
                i2--;
            }
            if (i <= i2) {
                int o2 = kq4.o(iArr, i);
                kq4.B(iArr, i, kq4.o(iArr, i2));
                kq4.B(iArr, i2, o2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @go4
    private static final void e(long[] jArr, int i, int i2) {
        int a = a(jArr, i, i2);
        int i3 = a - 1;
        if (i < i3) {
            e(jArr, i, i3);
        }
        if (a < i2) {
            e(jArr, a, i2);
        }
    }

    @go4
    private static final void f(byte[] bArr, int i, int i2) {
        int b = b(bArr, i, i2);
        int i3 = b - 1;
        if (i < i3) {
            f(bArr, i, i3);
        }
        if (b < i2) {
            f(bArr, b, i2);
        }
    }

    @go4
    private static final void g(short[] sArr, int i, int i2) {
        int c = c(sArr, i, i2);
        int i3 = c - 1;
        if (i < i3) {
            g(sArr, i, i3);
        }
        if (c < i2) {
            g(sArr, c, i2);
        }
    }

    @go4
    private static final void h(int[] iArr, int i, int i2) {
        int d = d(iArr, i, i2);
        int i3 = d - 1;
        if (i < i3) {
            h(iArr, i, i3);
        }
        if (d < i2) {
            h(iArr, d, i2);
        }
    }

    @go4
    public static final void i(@NotNull long[] jArr, int i, int i2) {
        c25.p(jArr, "array");
        e(jArr, i, i2 - 1);
    }

    @go4
    public static final void j(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, "array");
        f(bArr, i, i2 - 1);
    }

    @go4
    public static final void k(@NotNull short[] sArr, int i, int i2) {
        c25.p(sArr, "array");
        g(sArr, i, i2 - 1);
    }

    @go4
    public static final void l(@NotNull int[] iArr, int i, int i2) {
        c25.p(iArr, "array");
        h(iArr, i, i2 - 1);
    }
}