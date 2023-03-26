package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.p7700g.p99005.bx;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class AK {
    public static byte[] A0F;
    public static String[] A0G;
    public long A00;
    public AK A01;
    public AL A02;
    public TrackGroupArray A03;
    public HC A04;
    public boolean A05;
    public boolean A06;
    public HC A07;
    public final InterfaceC1167Zu A08;
    public final Object A09;
    public final InterfaceC0647Fd[] A0A;
    public final boolean[] A0B;
    public final FI A0C;
    public final HB A0D;
    public final InterfaceC0530Ac[] A0E;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{bx.W5, 66, 65, 70, 62, 45, 66, 79, 70, 76, 65, 37, 76, 73, 65, 66, 79, 50, 71, 84, 75, 81, 70, 2, 84, 71, 78, 71, 67, 85, 71, 2, 72, 67, 75, 78, 71, 70, 16};
    }

    public static void A02() {
        A0G = new String[]{"veEP335vIU", "oLB3f1kinZ5WOxb9JrKF9bI12rnC7Hj4", "JTOn230cVZ0r3ImY4sjYKOAnliXJWsYG", "qI3jAuZXuqqi9ieUnmB3HYz1RRsZ6ptY", "FV6PRsoISyO05pqLoteca44", "2aqdzlIyDZTOMtMqQXI", "yc78GsDKEqwKVvSYIw58zbgjS6oh7wuT", "vKvp49qN2fZ5TwJRBPfaEcKl4xZFQEWJ"};
    }

    public AK(InterfaceC0530Ac[] interfaceC0530AcArr, long j, HB hb, HE he, FI fi, Object obj, AL al) {
        this.A0E = interfaceC0530AcArr;
        this.A00 = j - al.A03;
        this.A0D = hb;
        this.A0C = fi;
        this.A09 = I1.A01(obj);
        this.A02 = al;
        this.A0A = new InterfaceC0647Fd[interfaceC0530AcArr.length];
        this.A0B = new boolean[interfaceC0530AcArr.length];
        InterfaceC1167Zu A4P = fi.A4P(al.A04, he);
        this.A08 = al.A02 != Long.MIN_VALUE ? new B0(A4P, true, 0L, al.A02) : A4P;
    }

    private void A03(HC hc) {
        int i = 0;
        while (true) {
            int i2 = hc.A00;
            String[] strArr = A0G;
            if (strArr[1].charAt(21) != strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[2] = "zTmDI2eB0pskJnfpVdGiT2gSjaG941UO";
            strArr2[3] = "GwIuNKKr0Vh704cWvV3fzSTRpdmwONBr";
            if (i < i2) {
                boolean A00 = hc.A00(i);
                H8 A01 = hc.A01.A01(i);
                if (A00 && A01 != null) {
                    A01.A4s();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A04(HC hc) {
        HC hc2 = this.A07;
        this.A07 = hc;
        HC hc3 = this.A07;
        if (hc3 != null) {
            A03(hc3);
        }
    }

    private void A05(InterfaceC0647Fd[] interfaceC0647FdArr) {
        int i = 0;
        while (true) {
            InterfaceC0530Ac[] interfaceC0530AcArr = this.A0E;
            if (i < interfaceC0530AcArr.length) {
                if (interfaceC0530AcArr[i].A7A() == 5 && this.A04.A00(i)) {
                    interfaceC0647FdArr[i] = new C1163Zo();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A06(InterfaceC0647Fd[] interfaceC0647FdArr) {
        int i = 0;
        while (true) {
            InterfaceC0530Ac[] interfaceC0530AcArr = this.A0E;
            if (i < interfaceC0530AcArr.length) {
                if (interfaceC0530AcArr[i].A7A() == 5) {
                    interfaceC0647FdArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long A07() {
        if (this.A06) {
            return this.A08.A6Z();
        }
        return 0L;
    }

    public final long A08() {
        return this.A00;
    }

    public final long A09(long j) {
        return j - A08();
    }

    public final long A0A(long j) {
        return A08() + j;
    }

    public final long A0B(long j, boolean z) {
        return A0C(j, z, new boolean[this.A0E.length]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        com.facebook.ads.redexgen.X.I1.A04(r12.A04.A00(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r12.A0E[r5].A7A() == 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
        r12.A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r4.A01(r5) != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
        com.facebook.ads.redexgen.X.I1.A04(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A0C(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i >= this.A04.A00) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z && this.A04.A02(this.A07, i)) {
                z2 = true;
            }
            zArr2[i] = z2;
            i++;
        }
        A06(this.A0A);
        A04(this.A04);
        if (A0G[7].charAt(5) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[4] = "QjaNyuHuRXZwiIdLefV3JnB";
        strArr[5] = "qMpMOgpNZnnJVrHuPMC";
        H9 h9 = this.A04.A01;
        long ACo = this.A08.ACo(h9.A02(), this.A0B, this.A0A, zArr, j);
        A05(this.A0A);
        this.A05 = false;
        int i2 = 0;
        while (true) {
            InterfaceC0647Fd[] interfaceC0647FdArr = this.A0A;
            if (i2 < interfaceC0647FdArr.length) {
                InterfaceC0647Fd interfaceC0647Fd = interfaceC0647FdArr[i2];
                if (A0G[7].charAt(5) != '9') {
                    String[] strArr2 = A0G;
                    strArr2[4] = "ECZNN42Owql1H3dvmIySnd1";
                    strArr2[5] = "Y1ZBsUrBheVlA6CxnB4";
                } else {
                    String[] strArr3 = A0G;
                    strArr3[0] = "F5cg";
                    strArr3[0] = "F5cg";
                }
                i2++;
            } else {
                return ACo;
            }
        }
    }

    public final long A0D(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long A5Y = this.A08.A5Y();
        if (A5Y == Long.MIN_VALUE && z) {
            AL al = this.A02;
            String[] strArr = A0G;
            if (strArr[1].charAt(21) != strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "Yxep602BeUF0L8l";
            strArr2[0] = "Yxep602BeUF0L8l";
            return al.A01;
        }
        return A5Y;
    }

    public final void A0E() {
        A04(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.ACI(((B0) this.A08).A05);
            } else {
                this.A0C.ACI(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e(A00(0, 17, 116), A00(17, 22, 121), e);
        }
    }

    public final void A0F(float f) throws A4 {
        this.A06 = true;
        this.A03 = this.A08.A79();
        A0J(f);
        long A0B = A0B(this.A02.A03, false);
        this.A00 += this.A02.A03 - A0B;
        this.A02 = this.A02.A01(A0B);
    }

    public final void A0G(long j) {
        this.A08.A4A(A09(j));
    }

    public final void A0H(long j) {
        if (this.A06) {
            this.A08.AC9(A09(j));
        }
    }

    public final boolean A0I() {
        return this.A06 && (!this.A05 || this.A08.A5Y() == Long.MIN_VALUE);
    }

    public final boolean A0J(float f) throws A4 {
        H8[] A02;
        HC A0V = this.A0D.A0V(this.A0E, this.A03);
        if (A0V.A01(this.A07)) {
            return false;
        }
        this.A04 = A0V;
        for (H8 trackSelection : this.A04.A01.A02()) {
            if (trackSelection != null) {
                trackSelection.AAU(f);
            }
        }
        return true;
    }
}