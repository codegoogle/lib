package com.p7700g.p99005;

import com.p7700g.p99005.qi4;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: AddressComparator.java */
/* loaded from: classes3.dex */
public abstract class o04 implements Comparator<l24> {
    public final boolean s;

    /* compiled from: AddressComparator.java */
    /* loaded from: classes3.dex */
    public static class a extends o04 {
        public a() {
            this(true);
        }

        private static int t(i24 i24Var, i24 i24Var2) {
            return i24Var.f4(i24Var2);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0259 A[LOOP:0: B:18:0x0059->B:74:0x0259, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0258 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private int v(i24 i24Var, i24 i24Var2) {
            f34 f34Var;
            a aVar;
            f34 f34Var2;
            int j;
            f34 f34Var3;
            f34 f34Var4;
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            long j2;
            long j3;
            long j4;
            int i6;
            long j5;
            long j6;
            long j7;
            long j8;
            long j9;
            int n;
            i24 i24Var3 = i24Var;
            i24 i24Var4 = i24Var2;
            if ((i24Var3 instanceof f34) && (i24Var4 instanceof f34)) {
                f34Var = (f34) i24Var3;
                f34Var2 = (f34) i24Var4;
                aVar = this;
            } else {
                f34Var = null;
                aVar = this;
                f34Var2 = null;
            }
            if ((aVar.s || i24Var.z3() || i24Var2.z3()) && (j = o04.j(i24Var, i24Var2)) != 0) {
                return j;
            }
            int g3 = i24Var.g3();
            int g32 = i24Var2.g3();
            byte[] bArr5 = new byte[g3];
            byte[] bArr6 = new byte[g3];
            byte[] bArr7 = new byte[g32];
            byte[] bArr8 = new byte[g32];
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            while (true) {
                if (i7 >= i24Var.p1() && i8 >= i24Var2.p1()) {
                    return 0;
                }
                if (f34Var != null) {
                    if (i9 == 0) {
                        int i17 = i7 + 1;
                        e34 t = f34Var.t(i7);
                        int A0 = t.A0();
                        j10 = t.L4();
                        j11 = t.G4();
                        i7 = i17;
                        i9 = A0;
                    }
                    if (i11 == 0) {
                        int i18 = i8 + 1;
                        e34 t2 = f34Var2.t(i8);
                        int A02 = t2.A0();
                        j12 = t2.L4();
                        j13 = t2.G4();
                        f34Var3 = f34Var;
                        f34Var4 = f34Var2;
                        bArr = bArr6;
                        bArr2 = bArr8;
                        bArr3 = bArr5;
                        bArr4 = bArr7;
                        i = i7;
                        i2 = i18;
                        i11 = A02;
                        i3 = i10;
                        if (i11 == i9) {
                            j7 = j10;
                            j8 = j11;
                            j9 = j12;
                            j3 = j13;
                            j4 = j3;
                            i5 = 0;
                            j5 = j9;
                            i6 = 0;
                            j2 = j7;
                            j6 = j8;
                        } else {
                            int i19 = i11 - i9;
                            if (i19 > 0) {
                                long j14 = ~((-1) << i19);
                                j4 = j13 & j14;
                                j5 = j12 & j14;
                                i5 = 0;
                                long j15 = j10;
                                i6 = i19;
                                j3 = j13 >>> i19;
                                j9 = j12 >>> i19;
                                j7 = j15;
                                j8 = j11;
                                j6 = j8;
                                j2 = j7;
                            } else {
                                int i20 = -i19;
                                long j16 = j10 >>> i20;
                                long j17 = ~((-1) << i20);
                                i5 = i20;
                                j2 = j10 & j17;
                                j3 = j13;
                                j4 = j3;
                                i6 = 0;
                                j5 = j12;
                                j6 = j11 & j17;
                                j7 = j16;
                                j8 = j11 >>> i20;
                                j9 = j5;
                            }
                        }
                        n = n(j7, j8, j9, j3);
                        if (n != 0) {
                            return n;
                        }
                        bArr8 = bArr2;
                        bArr5 = bArr3;
                        bArr7 = bArr4;
                        i7 = i;
                        i8 = i2;
                        i10 = i3;
                        i9 = i5;
                        i11 = i6;
                        j10 = j2;
                        j11 = j6;
                        j12 = j5;
                        bArr6 = bArr;
                        f34Var = f34Var3;
                        f34Var2 = f34Var4;
                        j13 = j4;
                        i24Var3 = i24Var;
                        i24Var4 = i24Var2;
                    } else {
                        f34Var3 = f34Var;
                        f34Var4 = f34Var2;
                    }
                } else {
                    int i21 = 7;
                    if (i9 == 0) {
                        if (i10 == 0) {
                            int i22 = i7 + 1;
                            j24 e0 = i24Var3.e0(i7);
                            bArr5 = e0.l1(bArr5);
                            bArr6 = e0.t4(bArr6);
                            int A03 = e0.A0();
                            i13 = 0;
                            i10 = e0.g3();
                            i7 = i22;
                            i4 = A03;
                        } else {
                            i4 = i12;
                        }
                        if (7 < i10) {
                            i12 = i4 - 56;
                            i10 -= 7;
                            int i23 = 7;
                            j10 = 0;
                            j11 = 0;
                            while (true) {
                                int i24 = i23 - 1;
                                if (i23 <= 0) {
                                    break;
                                }
                                i13++;
                                j10 = (j10 << 8) | bArr5[i13];
                                j11 = (j11 << 8) | bArr6[i13];
                                i23 = i24;
                                f34Var = f34Var;
                                f34Var2 = f34Var2;
                                i10 = i10;
                            }
                            f34Var3 = f34Var;
                            f34Var4 = f34Var2;
                            i9 = 56;
                        } else {
                            f34Var3 = f34Var;
                            f34Var4 = f34Var2;
                            int i25 = i10 - 1;
                            int i26 = i4 - (i25 << 3);
                            long j18 = 0;
                            long j19 = 0;
                            while (true) {
                                int i27 = i25 - 1;
                                if (i25 <= 0) {
                                    break;
                                }
                                i13++;
                                j18 = (j18 << 8) | bArr5[i13];
                                j19 = (j19 << 8) | bArr6[i13];
                                i25 = i27;
                                i4 = i4;
                            }
                            i13++;
                            int i28 = 8 - i26;
                            long j20 = (bArr5[i13] >>> i28) | (j18 << i26);
                            j11 = (j19 << i26) | (bArr6[i13] >>> i28);
                            i9 = i4;
                            i10 = 0;
                            i12 = 0;
                            bArr6 = bArr6;
                            j10 = j20;
                        }
                    } else {
                        f34Var3 = f34Var;
                        f34Var4 = f34Var2;
                    }
                    if (i11 == 0) {
                        if (i15 == 0) {
                            int i29 = i8 + 1;
                            j24 e02 = i24Var4.e0(i8);
                            bArr7 = e02.l1(bArr7);
                            bArr8 = e02.t4(bArr8);
                            int A04 = e02.A0();
                            i15 = e02.g3();
                            i11 = A04;
                            i16 = 0;
                            i8 = i29;
                        } else {
                            i11 = i14;
                        }
                        int i30 = i15;
                        if (7 < i30) {
                            i14 = i11 - 56;
                            i15 = i30 - 7;
                            j12 = 0;
                            j13 = 0;
                            while (true) {
                                int i31 = i21 - 1;
                                if (i21 <= 0) {
                                    break;
                                }
                                i16++;
                                j12 = (j12 << 8) | bArr7[i16];
                                j13 = (j13 << 8) | bArr8[i16];
                                i21 = i31;
                            }
                            bArr = bArr6;
                            bArr2 = bArr8;
                            bArr3 = bArr5;
                            bArr4 = bArr7;
                            i = i7;
                            i2 = i8;
                            i3 = i10;
                            i11 = 56;
                        } else {
                            int i32 = i30 - 1;
                            int i33 = i11 - (i32 << 3);
                            long j21 = 0;
                            long j22 = 0;
                            while (true) {
                                int i34 = i32 - 1;
                                if (i32 <= 0) {
                                    break;
                                }
                                i16++;
                                j21 = (j21 << 8) | bArr7[i16];
                                j22 = (j22 << 8) | bArr8[i16];
                                i32 = i34;
                                bArr6 = bArr6;
                            }
                            bArr = bArr6;
                            i16++;
                            long j23 = j21 << i33;
                            int i35 = 8 - i33;
                            j12 = j23 | (bArr7[i16] >>> i35);
                            j13 = (j22 << i33) | (bArr8[i16] >>> i35);
                            bArr2 = bArr8;
                            bArr3 = bArr5;
                            bArr4 = bArr7;
                            i = i7;
                            i2 = i8;
                            i3 = i10;
                            i14 = 0;
                            i15 = 0;
                        }
                        if (i11 == i9) {
                        }
                        n = n(j7, j8, j9, j3);
                        if (n != 0) {
                        }
                    }
                }
                bArr = bArr6;
                bArr2 = bArr8;
                bArr3 = bArr5;
                bArr4 = bArr7;
                i = i7;
                i2 = i8;
                i3 = i10;
                if (i11 == i9) {
                }
                n = n(j7, j8, j9, j3);
                if (n != 0) {
                }
            }
        }

        @Override // com.p7700g.p99005.o04, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(l24 l24Var, l24 l24Var2) {
            return super.compare(l24Var, l24Var2);
        }

        @Override // com.p7700g.p99005.o04
        public int k(v04 v04Var, v04 v04Var2) {
            int A0 = v04Var.A0() - v04Var2.A0();
            if (A0 == 0) {
                int t = t(v04Var, v04Var2);
                return t == 0 ? u(v04Var, v04Var2) : t;
            }
            return A0;
        }

        @Override // com.p7700g.p99005.o04
        public int l(i24 i24Var, i24 i24Var2) {
            int A0 = i24Var.A0() - i24Var2.A0();
            if (A0 == 0) {
                int t = t(i24Var, i24Var2);
                return t == 0 ? v(i24Var, i24Var2) : t;
            }
            return A0;
        }

        @Override // com.p7700g.p99005.o04
        public int m(int i, int i2, int i3, int i4) {
            int i5 = (i - i2) - (i3 - i4);
            return i5 == 0 ? i2 - i4 : i5;
        }

        @Override // com.p7700g.p99005.o04
        public int n(long j, long j2, long j3, long j4) {
            long j5 = (j - j2) - (j3 - j4);
            if (j5 == 0) {
                j5 = j2 - j4;
            }
            return o04.p(j5);
        }

        @Override // com.p7700g.p99005.o04
        public int o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            int compareTo = bigInteger.subtract(bigInteger2).compareTo(bigInteger3.subtract(bigInteger4));
            return compareTo == 0 ? bigInteger2.compareTo(bigInteger4) : compareTo;
        }

        public int u(v04 v04Var, v04 v04Var2) {
            int V0 = v04Var.V0();
            for (int i = 0; i < V0; i++) {
                x04 D0 = v04Var.D0(i);
                x04 D02 = v04Var2.D0(i);
                int m = m(D0.h3(), D0.B1(), D02.h3(), D02.B1());
                if (m != 0) {
                    return m;
                }
            }
            return 0;
        }

        public a(boolean z) {
            super(z);
        }
    }

    /* compiled from: AddressComparator.java */
    /* loaded from: classes3.dex */
    public static class b extends o04 {
        private final boolean t;
        private final boolean u;

        public b(boolean z) {
            this(true, z);
        }

        @Override // com.p7700g.p99005.o04, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(l24 l24Var, l24 l24Var2) {
            return super.compare(l24Var, l24Var2);
        }

        @Override // com.p7700g.p99005.o04
        public int k(v04 v04Var, v04 v04Var2) {
            int B1;
            int B12;
            int g3 = v04Var.g3() - v04Var2.g3();
            if (g3 != 0) {
                return g3;
            }
            boolean z = this.t;
            do {
                int V0 = v04Var.V0();
                for (int i = 0; i < V0; i++) {
                    x04 D0 = v04Var.D0(i);
                    x04 D02 = v04Var2.D0(i);
                    if (z) {
                        B1 = D0.h3();
                        B12 = D02.h3();
                    } else {
                        B1 = D0.B1();
                        B12 = D02.B1();
                    }
                    int i2 = B1 - B12;
                    if (i2 != 0) {
                        return (!this.u || z == this.t) ? i2 : -i2;
                    }
                }
                z = !z;
            } while (z != this.t);
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:92:0x01c8 A[LOOP:1: B:21:0x005c->B:92:0x01c8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01c3 A[SYNTHETIC] */
        @Override // com.p7700g.p99005.o04
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int l(i24 i24Var, i24 i24Var2) {
            int j;
            f34 f34Var;
            f34 f34Var2;
            int i;
            int i2;
            int i3;
            long j2;
            long j3;
            long j4;
            b bVar = this;
            i24 i24Var3 = i24Var;
            i24 i24Var4 = i24Var2;
            int A0 = i24Var.A0() - i24Var2.A0();
            if (A0 != 0) {
                return A0;
            }
            if ((bVar.s || i24Var.z3() || i24Var2.z3()) && (j = o04.j(i24Var, i24Var2)) != 0) {
                return j;
            }
            boolean z = bVar.t;
            if ((i24Var3 instanceof f34) && (i24Var4 instanceof f34)) {
                f34Var = (f34) i24Var3;
                f34Var2 = (f34) i24Var4;
            } else {
                f34Var = null;
                f34Var2 = null;
            }
            do {
                byte[] bArr = new byte[i24Var.g3()];
                byte[] bArr2 = new byte[i24Var2.g3()];
                i = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                long j5 = 0;
                long j6 = 0;
                while (true) {
                    if (i4 < i24Var.p1() || i5 < i24Var2.p1()) {
                        if (f34Var != null) {
                            if (i6 == 0) {
                                int i14 = i4 + 1;
                                e34 t = f34Var.t(i4);
                                i6 = t.A0();
                                j5 = z ? t.L4() : t.G4();
                                i4 = i14;
                            }
                            if (i8 == 0) {
                                int i15 = i5 + 1;
                                e34 t2 = f34Var2.t(i5);
                                i8 = t2.A0();
                                j6 = z ? t2.L4() : t2.G4();
                                i5 = i15;
                            }
                        } else {
                            if (i6 == 0) {
                                if (i7 == 0) {
                                    int i16 = i4 + 1;
                                    j24 e0 = i24Var3.e0(i4);
                                    bArr = z ? e0.l1(bArr) : e0.t4(bArr);
                                    int A02 = e0.A0();
                                    i10 = 0;
                                    i7 = e0.g3();
                                    i4 = i16;
                                    i6 = A02;
                                } else {
                                    i6 = i9;
                                }
                                if (7 < i7) {
                                    i9 = i6 - 56;
                                    i7 -= 7;
                                    int i17 = 7;
                                    j5 = 0;
                                    while (true) {
                                        int i18 = i17 - 1;
                                        if (i17 <= 0) {
                                            break;
                                        }
                                        i10++;
                                        j5 = (j5 << 8) | bArr[i10];
                                        i17 = i18;
                                        i4 = i4;
                                    }
                                    i6 = 56;
                                } else {
                                    int i19 = i4;
                                    int i20 = i7 - 1;
                                    int i21 = i6 - (i20 << 3);
                                    long j7 = 0;
                                    while (true) {
                                        int i22 = i20 - 1;
                                        if (i20 <= 0) {
                                            break;
                                        }
                                        i10++;
                                        j7 = (j7 << 8) | bArr[i10];
                                        i20 = i22;
                                    }
                                    i10++;
                                    j5 = (j7 << i21) | (bArr[i10] >>> (8 - i21));
                                    i4 = i19;
                                    i7 = 0;
                                    i9 = 0;
                                }
                            }
                            if (i8 == 0) {
                                if (i12 == 0) {
                                    int i23 = i5 + 1;
                                    j24 e02 = i24Var4.e0(i5);
                                    bArr2 = z ? e02.l1(bArr2) : e02.t4(bArr2);
                                    i5 = i23;
                                    i8 = e02.A0();
                                    i2 = e02.g3();
                                    i3 = 7;
                                    i13 = 0;
                                } else {
                                    i8 = i11;
                                    i2 = i12;
                                    i3 = 7;
                                }
                                if (i3 < i2) {
                                    i11 = i8 - 56;
                                    i12 = i2 - 7;
                                    j6 = 0;
                                    while (true) {
                                        int i24 = i3 - 1;
                                        if (i3 <= 0) {
                                            break;
                                        }
                                        i13++;
                                        j6 = (j6 << 8) | bArr[i13];
                                        i3 = i24;
                                    }
                                    i8 = 56;
                                } else {
                                    int i25 = i2 - 1;
                                    int i26 = i8 - (i25 << 3);
                                    long j8 = 0;
                                    while (true) {
                                        int i27 = i25 - 1;
                                        if (i25 <= 0) {
                                            break;
                                        }
                                        i13++;
                                        j8 = (j8 << 8) | bArr[i13];
                                        i25 = i27;
                                    }
                                    i13++;
                                    j6 = (j8 << i26) | (bArr[i13] >>> (8 - i26));
                                    i11 = 0;
                                    i12 = 0;
                                }
                            }
                        }
                        if (i8 == i6) {
                            j2 = j5;
                            j3 = j6;
                            i6 = 0;
                        } else {
                            i8 -= i6;
                            if (i8 > 0) {
                                long j9 = j6 & (~((-1) << i8));
                                j6 >>= i8;
                                i6 = 0;
                                j3 = j9;
                                j2 = j5;
                                j4 = j5 - j6;
                                if (j4 == 0) {
                                    return o04.p(j4);
                                }
                                i24Var4 = i24Var2;
                                j5 = j2;
                                j6 = j3;
                                i = 0;
                                bVar = this;
                                i24Var3 = i24Var;
                            } else {
                                int i28 = -i8;
                                j2 = j5 & (~((-1) << i28));
                                i6 = i28;
                                j5 >>= i28;
                                j3 = j6;
                            }
                        }
                        i8 = 0;
                        j4 = j5 - j6;
                        if (j4 == 0) {
                        }
                    } else {
                        z = !z;
                    }
                }
            } while (z != bVar.t);
            return i;
        }

        @Override // com.p7700g.p99005.o04
        public int m(int i, int i2, int i3, int i4) {
            if (this.t) {
                int i5 = i - i3;
                return i5 == 0 ? i2 - i4 : i5;
            }
            int i6 = i2 - i4;
            return i6 == 0 ? i - i3 : i6;
        }

        @Override // com.p7700g.p99005.o04
        public int n(long j, long j2, long j3, long j4) {
            long j5;
            if (this.t) {
                j5 = j - j3;
                if (j5 == 0) {
                    j5 = j2 - j4;
                }
            } else {
                long j6 = j2 - j4;
                j5 = j6 == 0 ? j - j3 : j6;
            }
            return o04.p(j5);
        }

        @Override // com.p7700g.p99005.o04
        public int o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            int compareTo;
            if (this.t) {
                compareTo = bigInteger.compareTo(bigInteger3);
                if (compareTo == 0) {
                    compareTo = bigInteger2.compareTo(bigInteger4);
                }
            } else {
                int compareTo2 = bigInteger2.compareTo(bigInteger4);
                compareTo = compareTo2 == 0 ? bigInteger.compareTo(bigInteger3) : compareTo2;
            }
            return o04.p(compareTo);
        }

        public b(boolean z, boolean z2) {
            this(true, z2, false);
        }

        public b(boolean z, boolean z2, boolean z3) {
            super(z);
            this.t = z2;
            this.u = z3;
        }
    }

    public o04(boolean z) {
        this.s = z;
    }

    public static int j(i24 i24Var, i24 i24Var2) {
        int p1 = i24Var.p1();
        int p12 = p1 - i24Var2.p1();
        if (p12 == 0) {
            for (int i = 0; i < p1; i++) {
                p12 = i24Var.e0(i).A0() - i24Var2.e0(i).A0();
                if (p12 != 0) {
                    break;
                }
            }
        }
        return p12;
    }

    public static int p(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? 1 : -1;
    }

    private static int q(j24 j24Var) {
        if (j24Var instanceof kl4) {
            return 1;
        }
        if (j24Var instanceof gc4) {
            return 2;
        }
        if (j24Var instanceof cc4) {
            return 3;
        }
        if (j24Var instanceof ri4) {
            return 4;
        }
        if (j24Var instanceof x24) {
            return -1;
        }
        if (j24Var instanceof g34) {
            return -2;
        }
        return j24Var instanceof c34 ? -3 : 0;
    }

    private static int r(i24 i24Var) {
        if (i24Var instanceof qi4) {
            return 6;
        }
        if (i24Var instanceof qi4.n) {
            return 5;
        }
        if (i24Var instanceof bc4) {
            return 4;
        }
        if (i24Var instanceof jl4) {
            return 3;
        }
        if (i24Var instanceof i34) {
            return -1;
        }
        if (i24Var instanceof y24) {
            return -2;
        }
        return i24Var instanceof f34 ? -3 : 0;
    }

    private static int s(q14 q14Var) {
        if (q14Var instanceof dc4) {
            return 1;
        }
        return q14Var instanceof si4 ? 2 : 0;
    }

    public int a(n04 n04Var, n04 n04Var2) {
        if (n04Var == n04Var2) {
            return 0;
        }
        int b2 = b(n04Var.O0(), n04Var2.O0());
        return (b2 == 0 && (n04Var instanceof ni4)) ? Objects.compare(((ni4) n04Var).S6(), ((ni4) n04Var2).S6(), Comparator.nullsFirst(bz3.s)) : b2;
    }

    public int b(v04 v04Var, v04 v04Var2) {
        int i;
        int r;
        if (v04Var == v04Var2) {
            return 0;
        }
        if (v04Var.getClass().equals(v04Var2.getClass()) || (r = r(v04Var) - r(v04Var2)) == 0) {
            if (v04Var instanceof qi4) {
                int i2 = ((qi4) v04Var2).W - ((qi4) v04Var).W;
                if (i2 != 0) {
                    return i2;
                }
            } else if ((v04Var instanceof jl4) && (i = ((jl4) v04Var2).L - ((jl4) v04Var).L) != 0) {
                return i;
            }
            return k(v04Var, v04Var2);
        }
        return r;
    }

    public int d(x04 x04Var, x04 x04Var2) {
        int q;
        if (x04Var == x04Var2) {
            return 0;
        }
        return (x04Var.getClass().equals(x04Var2.getClass()) || (q = q(x04Var) - q(x04Var2)) == 0) ? m(x04Var.h3(), x04Var.B1(), x04Var2.h3(), x04Var2.B1()) : q;
    }

    public int f(q14 q14Var, q14 q14Var2) {
        int s;
        if (q14Var == q14Var2) {
            return 0;
        }
        if (q14Var.getClass().equals(q14Var2.getClass()) || (s = s(q14Var) - s(q14Var2)) == 0) {
            if ((q14Var instanceof dc4) && (q14Var2 instanceof dc4)) {
                dc4 dc4Var = (dc4) q14Var;
                dc4 dc4Var2 = (dc4) q14Var2;
                return n(dc4Var.b0().X6(), dc4Var.a0().X6(), dc4Var2.b0().X6(), dc4Var2.a0().X6());
            }
            return o(q14Var.C1(), q14Var.getValue(), q14Var2.C1(), q14Var2.getValue());
        }
        return s;
    }

    public int g(i24 i24Var, i24 i24Var2) {
        int r;
        if (i24Var instanceof n04) {
            if (i24Var2 instanceof n04) {
                return a((n04) i24Var, (n04) i24Var2);
            }
            if (this.s) {
                return -1;
            }
            i24Var = ((n04) i24Var).O0();
        } else if (i24Var2 instanceof n04) {
            if (this.s) {
                return 1;
            }
            i24Var2 = ((n04) i24Var2).O0();
        }
        if ((i24Var instanceof v04) && (i24Var2 instanceof v04)) {
            return b((v04) i24Var, (v04) i24Var2);
        }
        if (i24Var == i24Var2) {
            return 0;
        }
        return (i24Var.getClass().equals(i24Var2.getClass()) || (r = r(i24Var) - r(i24Var2)) == 0) ? l(i24Var, i24Var2) : r;
    }

    public int h(j24 j24Var, j24 j24Var2) {
        int A0;
        int q;
        if ((j24Var instanceof x04) && (j24Var2 instanceof x04)) {
            return d((x04) j24Var, (x04) j24Var2);
        }
        if (j24Var == j24Var2) {
            return 0;
        }
        if (j24Var.getClass().equals(j24Var2.getClass()) || (q = q(j24Var) - q(j24Var2)) == 0) {
            if (!this.s || (A0 = j24Var.A0() - j24Var2.A0()) == 0) {
                if ((j24Var instanceof e34) && (j24Var2 instanceof e34)) {
                    e34 e34Var = (e34) j24Var;
                    e34 e34Var2 = (e34) j24Var2;
                    return n(e34Var.L4(), e34Var.G4(), e34Var2.L4(), e34Var2.G4());
                }
                return o(j24Var.C1(), j24Var.getValue(), j24Var2.C1(), j24Var2.getValue());
            }
            return A0;
        }
        return q;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(l24 l24Var, l24 l24Var2) {
        int A0;
        if (l24Var instanceof i24) {
            if (l24Var2 instanceof i24) {
                return g((i24) l24Var, (i24) l24Var2);
            }
            if (this.s) {
                return 1;
            }
            if (l24Var.z3()) {
                i24 i24Var = (i24) l24Var;
                if (i24Var.p1() > 0) {
                    return 1;
                }
                l24Var = i24Var.e0(0);
            }
        }
        boolean z = l24Var instanceof j24;
        if (z) {
            if (l24Var2 instanceof j24) {
                return h((j24) l24Var, (j24) l24Var2);
            }
            if (this.s) {
                return -1;
            }
        } else if (l24Var instanceof q14) {
            if (l24Var2 instanceof q14) {
                return f((q14) l24Var, (q14) l24Var2);
            }
            if (this.s) {
                return l24Var2 instanceof i24 ? -1 : 1;
            }
        }
        if (l24Var == l24Var2) {
            return 0;
        }
        if (!this.s || (A0 = l24Var.A0() - l24Var2.A0()) == 0) {
            if (l24Var2 instanceof i24) {
                i24 i24Var2 = (i24) l24Var2;
                if (l24Var2.z3() && i24Var2.p1() > 0) {
                    return 1;
                }
                if (z) {
                    return h((j24) l24Var, i24Var2.e0(0));
                }
                l24Var2 = i24Var2.e0(0);
            }
            return o(l24Var.C1(), l24Var.getValue(), l24Var2.C1(), l24Var2.getValue());
        }
        return A0;
    }

    public abstract int k(v04 v04Var, v04 v04Var2);

    public abstract int l(i24 i24Var, i24 i24Var2);

    public abstract int m(int i, int i2, int i3, int i4);

    public abstract int n(long j, long j2, long j3, long j4);

    public abstract int o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4);
}