package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0659Fr {
    public static String[] A05;
    public static final C0659Fr A06;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final C0657Fp[] A04;

    public static void A00() {
        A05 = new String[]{"mUl0ad45", "wOnHxFom99khzfrw556TP2S7iTnXdaDI", "F2b18zOkBdzPS6Rw7y0xeVy", "72pK6LdfIPudsj2MuQDeavvJ5e506zcn", "15GKEV160LP26gLZR3RCLRKabW82Co", "R2OsGPNc82TrpFQIYzL", "mRreVGJS4QtDd4oKVCrkQCvx0ML", "uB3KfkVK117X08r1dhVcVjbfa1nPKP9i"};
    }

    static {
        A00();
        A06 = new C0659Fr(new long[0]);
    }

    public C0659Fr(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A03 = Arrays.copyOf(jArr, length);
        this.A04 = new C0657Fp[length];
        for (int i = 0; i < length; i++) {
            this.A04[i] = new C0657Fp();
        }
        this.A01 = 0L;
        this.A02 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r3 >= r9.A03.length) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A01(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.A03;
            if (i >= jArr.length) {
                break;
            }
            long j2 = jArr[i];
            String[] strArr = A05;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "npAqm7bEBhy427JdaT1Ni0I7koiD7S";
            strArr2[6] = "tFKaeO8lP01t1nMB1y4UInduFYw";
            if (j2 == Long.MIN_VALUE) {
                break;
            }
            if (j < jArr[i]) {
                C0657Fp[] c0657FpArr = this.A04;
                String[] strArr3 = A05;
                if (strArr3[2].length() != strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[7] = "Q7qi9RXitykg8APizUDlkxccyVnHWt3u";
                    strArr4[1] = "mzuq9lDyRMMzUIbIxWm25ivrGAnK4SRi";
                    if (c0657FpArr[i].A02()) {
                        break;
                    }
                } else {
                    String[] strArr5 = A05;
                    strArr5[3] = "GUT9witaJOdRyBBc2tjzvJfymhz5uMqF";
                    strArr5[3] = "GUT9witaJOdRyBBc2tjzvJfymhz5uMqF";
                    if (c0657FpArr[i].A02()) {
                        break;
                    }
                }
            }
            i++;
        }
    }

    public final int A02(long j) {
        int length = this.A03.length - 1;
        while (length >= 0) {
            long[] jArr = this.A03;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.A04[length].A02()) {
            return -1;
        }
        return length;
    }
}