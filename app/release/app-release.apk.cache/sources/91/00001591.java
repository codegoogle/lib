package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.p7700g.p99005.g15;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZF implements CK {
    public static byte[] A05;
    public static String[] A06;
    public static final CN A07;
    public int A00;
    public int A01;
    public CM A02;
    public CW A03;
    public ZG A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{100, 95, 66, 68, 65, 65, 94, 67, 69, 84, 85, 17, 94, 67, 17, 68, 95, 67, 84, 82, 94, 86, 95, 88, 75, 84, 85, 17, 70, 80, 71, 17, 89, 84, 80, 85, 84, 67, 31, 107, g15.c, 110, 99, 101, 37, 120, 107, 125};
    }

    public static void A02() {
        A06 = new String[]{"TnN98hFrpPh0PRtpc088aNdcZccscvrw", "5aRpZ2NNsZI5w0o7DGq1eAqNryB", "mEVhsrU6MzIr1qyqOlGiN", "yrEmV4s21h7BLFfB7siMTKTjJQry3", "EfBKzRp", "ss80CflBP4AmUjPde3BocO42m8Tqd1M1", "kqV6vinpOYrD", "3vWKjffhrtNYzin5lJ6IQFsZaR1xXQhq"};
    }

    static {
        A02();
        A01();
        A07 = new ZE();
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A02 = cm;
        this.A03 = cm.ADY(0, 1);
        this.A04 = null;
        cm.A4w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ae, code lost:
        if (r6 != (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b0, code lost:
        r18.A01 += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
        r8 = r18.A01 / r18.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
        if (r8 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:
        r9 = r18.A04.A05(r19.A6m() - r18.A01);
        r12 = r18.A00 * r8;
        r18.A01 -= r12;
        r18.A03.ACf(r9, 1, r12, r18.A01, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
        if (r6 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e5, code lost:
        if (r6 != (-1)) goto L20;
     */
    @Override // com.facebook.ads.redexgen.X.CK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        int ACd;
        int size;
        if (this.A04 == null) {
            this.A04 = C0603Dh.A00(cl);
            ZG zg = this.A04;
            if (zg == null) {
                throw new AN(A00(0, 39, 121));
            }
            String[] strArr = A06;
            if (strArr[0].charAt(26) == strArr[7].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "qnd5ZZOQpU6p";
            strArr2[6] = "qnd5ZZOQpU6p";
            this.A03.A5A(Format.A06(null, A00(39, 9, 66), null, zg.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
            this.A00 = this.A04.A01();
        }
        if (!this.A04.A07()) {
            C0603Dh.A03(cl, this.A04);
            this.A02.ACk(this.A04);
        }
        CW cw = this.A03;
        int i = 32768 - this.A01;
        String[] strArr3 = A06;
        if (strArr3[3].length() != strArr3[2].length()) {
            String[] strArr4 = A06;
            strArr4[0] = "ZttzqU8TZk2sw4NPxxJqPVJwNlIpsBsB";
            strArr4[7] = "U3TfmanSbDpEsJ78blUW3XKzJFnKPbla";
            ACd = cw.ACd(cl, i, true);
            size = -1;
        } else {
            ACd = cw.ACd(cl, i, true);
            size = -1;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        return C0603Dh.A00(cl) != null;
    }
}