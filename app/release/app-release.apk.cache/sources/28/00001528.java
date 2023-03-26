package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.un3;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XY implements AJ {
    public static byte[] A0A;
    public static String[] A0B;
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C1207aY A07;
    public final IU A08;
    public final boolean A09;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{104, -85, -87, -74, -74, -73, -68, 104, -86, -83, 104, -76, -83, -69, -69, 104, -68, -80, -87, -74, 104, -81, -88, -69, -84, -84, -85, -72, -116, -75, -72, -106, -78, -89, -65, -88, -89, -87, -79, -121, -84, -70, -85, -72, -104, -85, -88, -69, -84, -84, -85, -72, -109, -71, -54, -35, -50, -50, -51, -38, -82, -41, -38, -72, -44, -55, bx.j7, -54, -55, -53, -45, -75, -37, -17, -29, -6, -60, -9, -24, -24, -25, -12, -49, -11, -23, -27, -22, -66, -15, -30, -30, bx.j7, -18, -55, -17};
    }

    public static void A03() {
        A0B = new String[]{"ilntiKeCpn72Dx7EE3Rw9hkq75JbKAcA", "wPL2yleQwYX6RVVdEOaHMWHZq50QYzDc", "zjYhmAwspMfnQIz92oeL2kf6IR", "AEUyDf5SOKQlymFmwa942o3bdmA", "6YNynFjnDYQOqc0QM1ycbBp5CCdF169p", "D8", "MEXbIoh", "5uze5Gp41PLyaey5Hs3T"};
    }

    public XY() {
        this(new C1207aY(true, 65536));
    }

    @Deprecated
    public XY(C1207aY c1207aY) {
        this(c1207aY, 15000, 50000, 2500, un3.f.v, -1, true);
    }

    @Deprecated
    public XY(C1207aY c1207aY, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c1207aY, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public XY(C1207aY c1207aY, int i, int i2, int i3, int i4, int i5, boolean z, IU iu) {
        String A01 = A01(21, 1, 103);
        String A012 = A01(54, 19, 80);
        A04(i3, 0, A012, A01);
        String A013 = A01(22, 32, 46);
        A04(i4, 0, A013, A01);
        String A014 = A01(84, 11, 100);
        A04(i, i3, A014, A012);
        A04(i, i4, A014, A013);
        A04(i2, i, A01(73, 11, 106), A014);
        this.A07 = c1207aY;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = iu;
    }

    private final int A00(InterfaceC1104Xf[] interfaceC1104XfArr, H9 h9) {
        int i = 0;
        for (int i2 = 0; i2 < interfaceC1104XfArr.length; i2++) {
            if (h9.A01(i2) != null) {
                i += C0726Ig.A01(interfaceC1104XfArr[i2].A7A());
            }
        }
        return i;
    }

    public static void A04(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        I1.A05(z, str + A01(0, 21, 48) + str2);
    }

    private void A05(boolean z) {
        this.A00 = 0;
        IU iu = this.A08;
        if (iu != null && this.A01) {
            iu.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A04();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final HE A5M() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final long A5R() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AAj() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AB2() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AB8(InterfaceC1104Xf[] interfaceC1104XfArr, TrackGroupArray trackGroupArray, H9 h9) {
        int i = this.A02;
        if (i == -1) {
            i = A00(interfaceC1104XfArr, h9);
        }
        this.A00 = i;
        this.A07.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean ACc() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r3 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r3 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r6.A00(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        r6.A03(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r3 != r4) goto L22;
     */
    @Override // com.facebook.ads.redexgen.X.AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AD8(long j, float f) {
        boolean z = true;
        boolean z2 = this.A07.A03() >= this.A00;
        boolean z3 = this.A01;
        long mediaDurationMinBufferUs = this.A06;
        if (f > 1.0f) {
            mediaDurationMinBufferUs = Math.min(C0726Ig.A0C(mediaDurationMinBufferUs, f), this.A05);
        }
        if (j < mediaDurationMinBufferUs) {
            boolean z4 = this.A09;
            if (A0B[1].charAt(1) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[5] = "Ppn0DE";
            strArr[5] = "Ppn0DE";
            if (!z4 && z2) {
                z = false;
            }
            this.A01 = z;
        } else if (j > this.A05 || z2) {
            this.A01 = false;
        }
        IU iu = this.A08;
        if (iu != null) {
            boolean z5 = this.A01;
            if (A0B[6].length() != 13) {
                String[] strArr2 = A0B;
                strArr2[3] = "7hiTZk3TS6kdJpPH1OWD5iH5Lha";
                strArr2[7] = "uWsgjDiVcVLtDVCTZxMR";
            } else {
                String[] strArr3 = A0B;
                strArr3[6] = "I9dScF5ijEM2hd";
                strArr3[6] = "I9dScF5ijEM2hd";
            }
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean ADB(long j, float f, boolean z) {
        long A0D = C0726Ig.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        if (A0B[6].length() != 13) {
            String[] strArr = A0B;
            strArr[6] = "eSzKm";
            strArr[6] = "eSzKm";
            return j2 <= 0 || A0D >= j2 || (!this.A09 && this.A07.A03() >= this.A00);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void onPrepared() {
        A05(false);
    }
}