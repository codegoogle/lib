package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class B0 implements InterfaceC1167Zu, InterfaceC1166Zt {
    public static String[] A06;
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC1166Zt A03;
    public C1157Zh[] A04 = new C1157Zh[0];
    public final InterfaceC1167Zu A05;

    static {
        A01();
    }

    public static void A01() {
        A06 = new String[]{"xZ98n6jXZ", "w0wM6S1AW5kwd8mBaLXb8IJFUPLi1ZSY", "", "5GeP1Ey0MjdLLaKEOlMigJbDmIHcG3Ps", "Q5WYazqpabUa99ZYxsI", "Gm0HQrfOciURdkrLDtJ", "cUS8ttxVNiquYZeS", "9hpvQN9G3pxye3p4YcQpNMMd2GK"};
    }

    public B0(InterfaceC1167Zu interfaceC1167Zu, boolean z, long j, long j2) {
        this.A05 = interfaceC1167Zu;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C0533Af A00(long j, C0533Af c0533Af) {
        long A0E = C0726Ig.A0E(c0533Af.A01, 0L, j - this.A01);
        long j2 = c0533Af.A00;
        long j3 = this.A00;
        long A0E2 = C0726Ig.A0E(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (A0E == c0533Af.A01 && A0E2 == c0533Af.A00) {
            return c0533Af;
        }
        return new C0533Af(A0E, A0E2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Fe
    /* renamed from: A02 */
    public final void A9F(InterfaceC1167Zu interfaceC1167Zu) {
        this.A03.A9F(this);
    }

    public static boolean A03(long j, H8[] h8Arr) {
        if (j != 0) {
            for (H8 h8 : h8Arr) {
                if (h8 != null && !IJ.A0A(h8.A6t().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A04() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final boolean A4A(long j) {
        return this.A05.A4A(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void A4m(long j, boolean z) {
        this.A05.A4m(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long A5J(long j, C0533Af c0533Af) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5J(j, A00(j, c0533Af));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long A5Y() {
        long A5Y = this.A05.A5Y();
        if (A5Y != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A5Y < j) {
                return A5Y;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long A6Z() {
        long A6Z = this.A05.A6Z();
        if (A6Z != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A6Z < j) {
                return A6Z;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final TrackGroupArray A79() {
        return this.A05.A79();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void A8V() throws IOException {
        this.A05.A8V();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1166Zt
    public final void AAb(InterfaceC1167Zu interfaceC1167Zu) {
        this.A03.AAb(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void ABi(InterfaceC1166Zt interfaceC1166Zt, long j) {
        this.A03 = interfaceC1166Zt;
        this.A05.ABi(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final long AC1() {
        if (A04()) {
            long j = this.A02;
            this.A02 = -9223372036854775807L;
            long AC1 = AC1();
            return AC1 != -9223372036854775807L ? AC1 : j;
        }
        long AC12 = this.A05.AC1();
        String[] strArr = A06;
        if (strArr[7].length() != strArr[2].length()) {
            String[] strArr2 = A06;
            strArr2[5] = "JN4lYhgdVtJugUzGLO1";
            strArr2[4] = "V7PIoeFvQi5pkabjQnk";
            if (AC12 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            boolean z = true;
            I1.A04(AC12 >= this.A01);
            long discontinuityUs = this.A00;
            if (discontinuityUs != Long.MIN_VALUE && AC12 > discontinuityUs) {
                z = false;
            }
            I1.A04(z);
            return AC12;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    public final void AC9(long j) {
        this.A05.AC9(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r5 > r3) goto L18;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ACn(long j) {
        C1157Zh[] c1157ZhArr;
        this.A02 = -9223372036854775807L;
        boolean z = false;
        for (C1157Zh c1157Zh : this.A04) {
            if (c1157Zh != null) {
                c1157Zh.A01();
            }
        }
        long ACn = this.A05.ACn(j);
        if (ACn != j) {
            if (ACn >= this.A01) {
                long j2 = this.A00;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            I1.A04(z);
            return ACn;
        }
        z = true;
        I1.A04(z);
        return ACn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r7 > r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1167Zu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ACo(H8[] h8Arr, boolean[] zArr, InterfaceC0647Fd[] interfaceC0647FdArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        int i;
        this.A04 = new C1157Zh[interfaceC0647FdArr.length];
        InterfaceC0647Fd[] interfaceC0647FdArr2 = new InterfaceC0647Fd[interfaceC0647FdArr.length];
        int i2 = 0;
        while (true) {
            InterfaceC0647Fd interfaceC0647Fd = null;
            if (i2 >= interfaceC0647FdArr.length) {
                break;
            }
            C1157Zh[] c1157ZhArr = this.A04;
            c1157ZhArr[i2] = (C1157Zh) interfaceC0647FdArr[i2];
            if (c1157ZhArr[i2] != null) {
                interfaceC0647Fd = c1157ZhArr[i2].A01;
            }
            interfaceC0647FdArr2[i2] = interfaceC0647Fd;
            i2++;
        }
        long ACo = this.A05.ACo(h8Arr, zArr, interfaceC0647FdArr2, zArr2, j);
        if (A04()) {
            long j3 = this.A01;
            if (j == j3 && A03(j3, h8Arr)) {
                j2 = ACo;
                this.A02 = j2;
                if (ACo != j) {
                    if (ACo >= this.A01) {
                        long j4 = this.A00;
                        if (j4 != Long.MIN_VALUE) {
                        }
                    }
                    z = false;
                    I1.A04(z);
                    for (i = 0; i < interfaceC0647FdArr.length; i++) {
                        if (interfaceC0647FdArr2[i] == null) {
                            this.A04[i] = null;
                        } else if (interfaceC0647FdArr[i] == null || this.A04[i].A01 != interfaceC0647FdArr2[i]) {
                            this.A04[i] = new C1157Zh(this, interfaceC0647FdArr2[i]);
                        }
                        interfaceC0647FdArr[i] = this.A04[i];
                    }
                    return ACo;
                }
                z = true;
                I1.A04(z);
                while (i < interfaceC0647FdArr.length) {
                }
                return ACo;
            }
        }
        j2 = -9223372036854775807L;
        this.A02 = j2;
        if (ACo != j) {
        }
        z = true;
        I1.A04(z);
        while (i < interfaceC0647FdArr.length) {
        }
        return ACo;
    }
}