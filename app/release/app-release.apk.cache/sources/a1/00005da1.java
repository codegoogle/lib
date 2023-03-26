package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.s04;

/* compiled from: ParsedAddressGrouping.java */
/* loaded from: classes3.dex */
public class t64 {
    private static final Integer[] a = new Integer[32767];

    static {
        for (int i = 0; i <= 128; i++) {
            a[i] = Integer.valueOf(i);
        }
    }

    public static Integer a(int i) {
        if (i >= 0) {
            Integer[] numArr = a;
            if (i < numArr.length) {
                Integer num = numArr[i];
                if (num == null) {
                    Integer valueOf = Integer.valueOf(i);
                    numArr[i] = valueOf;
                    return valueOf;
                }
                return num;
            }
        }
        return Integer.valueOf(i);
    }

    public static Integer b(int i, int i2) {
        if (i2 <= 0) {
            return a(0);
        }
        if (i2 <= i) {
            return a(i2);
        }
        return null;
    }

    public static int c(int i, int i2, int i3) {
        return i2 > 1 ? i2 == 2 ? i >> 4 : i / i3 : i >> 3;
    }

    public static Integer d(int i, int i2, int i3) {
        return a((i == 8 ? i3 << 3 : i == 16 ? i3 << 4 : i * i3) + i2);
    }

    public static int e(int i, int i2, int i3) {
        return i2 > 1 ? i2 == 2 ? (i - 1) >> 4 : (i - 1) / i3 : (i - 1) >> 3;
    }

    public static Integer f(int i, int i2, int i3) {
        return b(i, i2 - (i == 8 ? i3 << 3 : i == 16 ? i3 << 4 : i3 * i));
    }

    public static Integer g(int i, Integer num, int i2) {
        if (num != null) {
            return f(i, num.intValue(), i2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7 A[LOOP:0: B:26:0x0047->B:66:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a9 A[EDGE_INSN: B:74:0x00a9->B:67:0x00a9 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(n04.b bVar, n04.b bVar2, int i, int i2, int i3, int i4, Integer num, s04.c cVar, boolean z) {
        int c;
        if (num == null || cVar.g()) {
            return false;
        }
        if (num.intValue() < 0) {
            num = 0;
        } else {
            if (num.intValue() >= (i3 == 8 ? i << 3 : i3 == 16 ? i << 4 : i * i3)) {
                return false;
            }
        }
        if (!cVar.f() && (c = c(num.intValue(), i2, i3)) < i) {
            int intValue = g(i3, num, c).intValue();
            while (true) {
                int a2 = bVar.a(c);
                if (intValue != 0) {
                    if (intValue < i3) {
                        int i5 = i3 - intValue;
                        if (z) {
                            int i6 = ~((-1) << i5);
                            if ((a2 & i6) != 0 || (bVar2.a(c) & i6) != i6) {
                                return false;
                            }
                        } else if (Integer.numberOfTrailingZeros(a2) < i5) {
                            return false;
                        } else {
                            int a3 = bVar2.a(c);
                            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(~a3);
                            if (numberOfTrailingZeros < i5) {
                                if (Integer.numberOfTrailingZeros((a3 | ((-1) << i3)) >>> numberOfTrailingZeros) + numberOfTrailingZeros < i5) {
                                    return false;
                                }
                                z = numberOfTrailingZeros > 0;
                            }
                            z = true;
                        }
                    }
                    c++;
                    if (c < i) {
                    }
                } else if (a2 != 0) {
                    return false;
                } else {
                    int a4 = bVar2.a(c);
                    if (!z) {
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(~a4);
                        if (numberOfTrailingZeros2 > 0) {
                            if ((a4 >>> numberOfTrailingZeros2) != 0) {
                                return false;
                            }
                            z = true;
                        } else if (a4 != 0) {
                            return false;
                        }
                    } else if (a4 != i4) {
                        return false;
                    }
                    c++;
                    if (c < i) {
                        break;
                    }
                    intValue = 0;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(f34.h hVar, f34.h hVar2, f34.h hVar3, f34.h hVar4, f34.g gVar, int i, Integer num, s04.c cVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        boolean z6;
        boolean z7;
        boolean z8 = false;
        if (num == null || cVar.g()) {
            return false;
        }
        Integer num2 = num.intValue() < 0 ? 0 : num;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            int a2 = gVar.a(i10);
            Integer b = b(a2, num2.intValue() - i9);
            if (a2 != 0) {
                if (b == null) {
                    i9 += a2;
                } else {
                    int intValue = b.intValue();
                    boolean z9 = intValue != a2;
                    int i11 = 64;
                    if (z9) {
                        boolean z10 = a2 > 64;
                        if (z10) {
                            i4 = a2 - 64;
                            boolean z11 = intValue < i4;
                            if (z11) {
                                z2 = z10;
                                z3 = z11;
                                i3 = 64;
                                i2 = i10;
                                i5 = i4;
                                i6 = 0;
                                i4 = intValue;
                            } else {
                                i2 = i10;
                                z3 = z11;
                                i3 = 64;
                                z2 = false;
                                i6 = intValue - i4;
                                i5 = i4;
                            }
                            z4 = z;
                            while (true) {
                                if (z2) {
                                    z5 = z4;
                                } else {
                                    long a3 = hVar2.a(i2);
                                    if (i4 != 0) {
                                        z5 = z4;
                                        if (z3) {
                                            int i12 = i5 - i4;
                                            if (z5) {
                                                long j = ~((-1) << i12);
                                                if ((j & a3) != 0 || (j & hVar4.a(i2)) != j) {
                                                    return false;
                                                }
                                            } else if (Long.numberOfTrailingZeros(a3) < i12) {
                                                return false;
                                            } else {
                                                long a4 = hVar4.a(i2);
                                                i7 = i2;
                                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~a4);
                                                if (numberOfTrailingZeros < i12) {
                                                    if (Long.numberOfTrailingZeros(a4 >>> numberOfTrailingZeros) + numberOfTrailingZeros < i12) {
                                                        return false;
                                                    }
                                                    if (numberOfTrailingZeros <= 0) {
                                                        z4 = false;
                                                    }
                                                }
                                                z4 = true;
                                            }
                                        }
                                    } else if (a3 != 0) {
                                        return z8;
                                    } else {
                                        long a5 = hVar4.a(i2);
                                        if (!z4) {
                                            z7 = z4;
                                            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~a5);
                                            if (numberOfTrailingZeros2 > 0) {
                                                if (numberOfTrailingZeros2 < i11 && (a5 >>> numberOfTrailingZeros2) != 0) {
                                                    return false;
                                                }
                                                z4 = true;
                                                i7 = i2;
                                            } else if (a5 != 0) {
                                                return false;
                                            }
                                        } else if (a5 != ((-1) >>> (64 - i5))) {
                                            return z8;
                                        } else {
                                            z7 = z4;
                                        }
                                        z4 = z7;
                                        i7 = i2;
                                    }
                                    if (i6 == 0) {
                                        i8 = i7;
                                        if (hVar.a(i8) != 0) {
                                            return false;
                                        }
                                        long a6 = hVar3.a(i8);
                                        if (!z4) {
                                            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(~a6);
                                            if (numberOfTrailingZeros3 > 0) {
                                                if (numberOfTrailingZeros3 < 64 && (a6 >>> numberOfTrailingZeros3) != 0) {
                                                    return false;
                                                }
                                                z4 = true;
                                            } else if (a6 != 0) {
                                                return false;
                                            }
                                        } else if (a6 != ((-1) >>> (64 - i3))) {
                                            return false;
                                        }
                                    } else {
                                        i8 = i7;
                                        if (z9) {
                                            long a7 = hVar.a(i8);
                                            int i13 = i3 - i6;
                                            if (z4) {
                                                long j2 = ~((-1) << i13);
                                                if ((a7 & j2) != 0 || (hVar3.a(i8) & j2) != j2) {
                                                    return false;
                                                }
                                            } else if (Long.numberOfTrailingZeros(a7) < i13) {
                                                return false;
                                            } else {
                                                long a8 = hVar3.a(i8);
                                                z6 = z9;
                                                int numberOfTrailingZeros4 = Long.numberOfTrailingZeros(~a8);
                                                if (numberOfTrailingZeros4 < i13) {
                                                    if (Long.numberOfTrailingZeros(a8 >>> numberOfTrailingZeros4) + numberOfTrailingZeros4 < i13) {
                                                        return false;
                                                    }
                                                    if (numberOfTrailingZeros4 <= 0) {
                                                        z4 = false;
                                                        i2 = i8 + 1;
                                                        if (i2 == i) {
                                                            return true;
                                                        }
                                                        int a9 = gVar.a(i2);
                                                        z3 = a9 > 64;
                                                        if (z3) {
                                                            i5 = a9 - 64;
                                                            i3 = 64;
                                                        } else {
                                                            i3 = a9;
                                                            i5 = 0;
                                                        }
                                                        z9 = z6;
                                                        z2 = z3;
                                                        z8 = false;
                                                        i6 = 0;
                                                        i4 = 0;
                                                        i11 = 64;
                                                    }
                                                }
                                                z4 = true;
                                                i2 = i8 + 1;
                                                if (i2 == i) {
                                                }
                                            }
                                        }
                                    }
                                    z6 = z9;
                                    i2 = i8 + 1;
                                    if (i2 == i) {
                                    }
                                }
                                i7 = i2;
                                z4 = z5;
                                if (i6 == 0) {
                                }
                                z6 = z9;
                                i2 = i8 + 1;
                                if (i2 == i) {
                                }
                            }
                        } else {
                            i3 = a2;
                            z2 = z10;
                            i4 = 0;
                            i5 = 0;
                            z3 = false;
                            i2 = i10;
                        }
                    } else {
                        i2 = i10;
                        i3 = a2;
                        i4 = 0;
                        i5 = 0;
                        z2 = false;
                        z3 = false;
                    }
                    i6 = intValue;
                    z4 = z;
                    while (true) {
                        if (z2) {
                        }
                        i7 = i2;
                        z4 = z5;
                        if (i6 == 0) {
                        }
                        z6 = z9;
                        i2 = i8 + 1;
                        if (i2 == i) {
                        }
                        z9 = z6;
                        z2 = z3;
                        z8 = false;
                        i6 = 0;
                        i4 = 0;
                        i11 = 64;
                    }
                }
            }
        }
        return true;
    }
}