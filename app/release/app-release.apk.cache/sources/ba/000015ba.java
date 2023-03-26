package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Zy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1171Zy extends AbstractC0536Aj {
    public static String[] A09;
    public static final Object A0A;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    @Nullable
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public static void A00() {
        A09 = new String[]{"LiVpibqpJatuLGaZNpcVvLbqNHldnUzA", "bX5xO856XIcJE12GDRsOqh2", "ZVG", "hIvfEeguXT", "OzXlbx4H0xP2XpsF07euT", "fU7LOfxMrEgavyMWFPaWlv5y0089z6Uh", "tbzCzUNP5mUbYRUDq8rztMXXiQr3Ary2", "G8Ws4pPS3koy2aZpOP3X3qbhHPqHsp6i"};
    }

    static {
        A00();
        A0A = new Object();
    }

    public C1171Zy(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, @Nullable Object obj) {
        this.A01 = j;
        this.A05 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A02 = j6;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = obj;
    }

    public C1171Zy(long j, long j2, long j3, long j4, boolean z, boolean z2, @Nullable Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C1171Zy(long j, boolean z, boolean z2, @Nullable Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0536Aj
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0536Aj
    public final int A02() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0536Aj
    public final int A05(Object obj) {
        return A0A.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0536Aj
    public final C0534Ah A0B(int i, C0534Ah c0534Ah, boolean z) {
        I1.A00(i, 0, 1);
        return c0534Ah.A0B(null, z ? A0A : null, 0, this.A00, -this.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r13 > r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        r13 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r13 > r2) goto L17;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0536Aj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0535Ai A0E(int i, C0535Ai c0535Ai, boolean z, long j) {
        Object obj;
        I1.A00(i, 0, 1);
        if (z) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j2 = this.A02;
        boolean z2 = this.A07;
        if (A09[1].length() != 20) {
            String[] strArr = A09;
            strArr[1] = "fKWrusBplbW";
            strArr[1] = "fKWrusBplbW";
            if (z2 && j != 0) {
                long j3 = this.A03;
                if (j3 == -9223372036854775807L) {
                    j2 = -9223372036854775807L;
                } else {
                    j2 += j;
                    if (A09[3].length() == 10) {
                        String[] strArr2 = A09;
                        strArr2[2] = "wVi";
                        strArr2[4] = "2OdzkdLKms985VAdE1FhN";
                    }
                }
            }
            return c0535Ai.A04(obj, this.A01, this.A05, this.A08, this.A07, j2, this.A03, 0, 0, this.A04);
        }
        throw new RuntimeException();
    }
}