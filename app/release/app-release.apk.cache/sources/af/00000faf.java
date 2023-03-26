package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AM {
    public static String[] A0C;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AK A04;
    public AK A05;
    public AK A06;
    public AbstractC0536Aj A07;
    public Object A08;
    public boolean A09;
    public final C0534Ah A0A = new C0534Ah();
    public final C0535Ai A0B = new C0535Ai();

    static {
        A08();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AL A02(int i, long j, long j2) {
        FG fg = new FG(i, j2);
        this.A07.A0A(fg.A02, this.A0A);
        int A04 = this.A0A.A04(j);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0B = A0B(fg, A09);
        return new AL(fg, j, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0B, A0C(fg, A0B));
    }

    public static void A08() {
        A0C = new String[]{"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    }

    private long A00(int i) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0B(i, this.A0A, true).A03;
        int i2 = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A05(obj2)) != -1) {
            int oldFrontWindowIndex = this.A07.A0A(oldFrontPeriodIndex, this.A0A).A00;
            if (oldFrontWindowIndex == i2) {
                return this.A03;
            }
        }
        for (AK A0F = A0F(); A0F != null; A0F = A0F.A01) {
            if (A0F.A09.equals(obj)) {
                return A0F.A02.A04.A03;
            }
        }
        for (AK A0F2 = A0F(); A0F2 != null; A0F2 = A0F2.A01) {
            int A05 = this.A07.A05(A0F2.A09);
            if (A05 != -1) {
                int holderWindowIndex = this.A07.A0A(A05, this.A0A).A00;
                if (holderWindowIndex == i2) {
                    return A0F2.A02.A04.A03;
                }
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private AL A01(int i, int i2, int i3, long durationUs, long j) {
        long j2;
        FG fg = new FG(i, i2, i3, j);
        boolean A0B = A0B(fg, Long.MIN_VALUE);
        boolean A0C2 = A0C(fg, A0B);
        long A0A = this.A07.A0A(fg.A02, this.A0A).A0A(fg.A00, fg.A01);
        if (i3 == this.A0A.A02(i2)) {
            j2 = this.A0A.A06();
        } else {
            j2 = 0;
        }
        return new AL(fg, j2, Long.MIN_VALUE, durationUs, A0A, A0B, A0C2);
    }

    @Nullable
    private AL A03(AK ak, long j) {
        long j2;
        AL al = ak.A02;
        if (al.A06) {
            int A04 = this.A07.A04(al.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A04 == -1) {
                return null;
            }
            int i = this.A07.A0B(A04, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j3 = al.A04.A03;
            if (this.A07.A0C(i, this.A0B).A00 == A04) {
                long windowSequenceNumber = ak.A08();
                Pair<Integer, Long> A09 = this.A07.A09(this.A0B, this.A0A, i, -9223372036854775807L, Math.max(0L, (windowSequenceNumber + al.A01) - j));
                if (A09 == null) {
                    return null;
                }
                Object nextPeriodUid = A09.first;
                A04 = ((Integer) nextPeriodUid).intValue();
                Object nextPeriodUid2 = A09.second;
                j2 = ((Long) nextPeriodUid2).longValue();
                Object nextPeriodUid3 = ak.A01;
                if (nextPeriodUid3 != null && ak.A01.A09.equals(obj)) {
                    j3 = ak.A01.A02.A04.A03;
                } else {
                    j3 = this.A02;
                    long startPositionUs = j3 + 1;
                    this.A02 = startPositionUs;
                }
            } else {
                j2 = 0;
            }
            return A06(A07(A04, j2, j3), j2, j2);
        }
        FG currentPeriodId = al.A04;
        this.A07.A0A(currentPeriodId.A02, this.A0A);
        if (currentPeriodId.A02()) {
            int adGroupIndex = currentPeriodId.A00;
            int A01 = this.A0A.A01(adGroupIndex);
            if (A01 == -1) {
                return null;
            }
            int adCountInCurrentAdGroup = this.A0A.A03(adGroupIndex, currentPeriodId.A01);
            if (adCountInCurrentAdGroup < A01) {
                if (this.A0A.A0E(adGroupIndex, adCountInCurrentAdGroup)) {
                    return A01(currentPeriodId.A02, adGroupIndex, adCountInCurrentAdGroup, al.A00, currentPeriodId.A03);
                }
                return null;
            }
            return A02(currentPeriodId.A02, al.A00, currentPeriodId.A03);
        }
        long j4 = al.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[1] = "6G";
        strArr[1] = "6G";
        if (j4 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(al.A02);
            if (A05 == -1) {
                return A02(currentPeriodId.A02, al.A02, currentPeriodId.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(currentPeriodId.A02, A05, A02, al.A02, currentPeriodId.A03);
            }
            return null;
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i2 = A00 - 1;
        if (this.A0A.A09(i2) != Long.MIN_VALUE || this.A0A.A0D(i2)) {
            return null;
        }
        int adGroupCount = this.A0A.A02(i2);
        if (!this.A0A.A0E(i2, adGroupCount)) {
            return null;
        }
        long A07 = this.A0A.A07();
        int i3 = currentPeriodId.A02;
        long contentDurationUs = currentPeriodId.A03;
        return A01(i3, i2, adGroupCount, A07, contentDurationUs);
    }

    private AL A04(AL al, FG fg) {
        long A07;
        long j = al.A03;
        long endPositionUs = al.A02;
        boolean A0B = A0B(fg, endPositionUs);
        boolean A0C2 = A0C(fg, A0B);
        this.A07.A0A(fg.A02, this.A0A);
        boolean isLastInPeriod = fg.A02();
        if (isLastInPeriod) {
            A07 = this.A0A.A0A(fg.A00, fg.A01);
        } else if (A0C[2].charAt(30) != 'V') {
            throw new RuntimeException();
        } else {
            String[] strArr = A0C;
            strArr[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            strArr[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            A07 = endPositionUs == Long.MIN_VALUE ? this.A0A.A07() : endPositionUs;
        }
        return new AL(fg, j, endPositionUs, al.A00, A07, A0B, A0C2);
    }

    private AL A05(AO ao) {
        return A06(ao.A04, ao.A01, ao.A02);
    }

    private AL A06(FG fg, long j, long j2) {
        this.A07.A0A(fg.A02, this.A0A);
        if (fg.A02()) {
            if (!this.A0A.A0E(fg.A00, fg.A01)) {
                return null;
            }
            return A01(fg.A02, fg.A00, fg.A01, j, fg.A03);
        }
        return A02(fg.A02, j2, fg.A03);
    }

    private FG A07(int i, long j, long j2) {
        this.A07.A0A(i, this.A0A);
        int A05 = this.A0A.A05(j);
        if (A05 == -1) {
            return new FG(i, j2);
        }
        return new FG(i, A05, this.A0A.A02(A05), j2);
    }

    private boolean A09() {
        AK A0F = A0F();
        if (A0F == null) {
            return true;
        }
        while (true) {
            int A04 = this.A07.A04(A0F.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (A0F.A01 != null && !A0F.A02.A06) {
                A0F = A0F.A01;
            }
            if (A04 == -1 || A0F.A01 == null || A0F.A01.A02.A04.A02 != A04) {
                break;
            }
            A0F = A0F.A01;
        }
        boolean A0T = A0T(A0F);
        A0F.A02 = A04(A0F.A02, A0F.A02.A04);
        if (A0T) {
            boolean A0Q = A0Q();
            if (A0C[7].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "GuDKwHudSgXHMcEdzJg";
            strArr[5] = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk";
            return !A0Q;
        }
        return true;
    }

    private boolean A0A(AK ak, AL al) {
        AL al2 = ak.A02;
        return al2.A03 == al.A03 && al2.A02 == al.A02 && al2.A04.equals(al.A04);
    }

    private boolean A0B(FG fg, long j) {
        int A00 = this.A07.A0A(fg.A02, this.A0A).A00();
        if (A00 == 0) {
            return true;
        }
        int i = A00 - 1;
        boolean A02 = fg.A02();
        if (this.A0A.A09(i) != Long.MIN_VALUE) {
            return !A02 && j == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i);
        if (postrollAdCount == -1) {
            return false;
        }
        if (A02 && fg.A00 == i && fg.A01 == postrollAdCount + (-1)) {
            return true;
        }
        return !A02 && this.A0A.A02(i) == postrollAdCount;
    }

    private boolean A0C(FG fg, boolean z) {
        return !this.A07.A0C(this.A07.A0A(fg.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0G(fg.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final AK A0D() {
        AK ak = this.A05;
        if (ak != null) {
            if (ak == this.A06) {
                this.A06 = ak.A01;
            }
            this.A05.A0E();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            AK ak2 = this.A04;
            this.A05 = ak2;
            this.A06 = ak2;
        }
        return this.A05;
    }

    public final AK A0E() {
        AK ak = this.A06;
        I1.A04((ak == null || ak.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final AK A0F() {
        return A0Q() ? this.A05 : this.A04;
    }

    public final AK A0G() {
        return this.A04;
    }

    public final AK A0H() {
        return this.A05;
    }

    public final AK A0I() {
        return this.A06;
    }

    @Nullable
    public final AL A0J(long j, AO ao) {
        AK ak = this.A04;
        return ak == null ? A05(ao) : A03(ak, j);
    }

    public final AL A0K(AL al, int i) {
        return A04(al, al.A04.A01(i));
    }

    public final InterfaceC1167Zu A0L(InterfaceC0530Ac[] interfaceC0530AcArr, HB hb, HE he, FI fi, Object obj, AL al) {
        AK ak = this.A04;
        AK ak2 = new AK(interfaceC0530AcArr, ak == null ? al.A03 : ak.A08() + this.A04.A02.A01, hb, he, fi, obj, al);
        if (this.A04 != null) {
            I1.A04(A0Q());
            this.A04.A01 = ak2;
        }
        this.A08 = null;
        this.A04 = ak2;
        this.A00++;
        return ak2.A08;
    }

    public final FG A0M(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0N(long j) {
        AK ak = this.A04;
        if (ak != null) {
            ak.A0H(j);
        }
    }

    public final void A0O(AbstractC0536Aj abstractC0536Aj) {
        this.A07 = abstractC0536Aj;
    }

    public final void A0P(boolean z) {
        AK A0F = A0F();
        if (A0F != null) {
            this.A08 = z ? A0F.A09 : null;
            this.A03 = A0F.A02.A04.A03;
            A0F.A0E();
            A0T(A0F);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0Q() {
        return this.A05 != null;
    }

    public final boolean A0R() {
        AK ak = this.A04;
        return ak == null || (!ak.A02.A05 && this.A04.A0I() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0S(int i) {
        this.A01 = i;
        return A09();
    }

    public final boolean A0T(AK ak) {
        I1.A04(ak != null);
        boolean z = false;
        this.A04 = ak;
        while (ak.A01 != null) {
            ak = ak.A01;
            if (ak == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            ak.A0E();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0U(InterfaceC1167Zu interfaceC1167Zu) {
        AK ak = this.A04;
        return ak != null && ak.A08 == interfaceC1167Zu;
    }

    public final boolean A0V(FG fg, long j) {
        int i = fg.A02;
        AK ak = null;
        for (AK A0F = A0F(); A0F != null; A0F = A0F.A01) {
            if (ak == null) {
                A0F.A02 = A0K(A0F.A02, i);
            } else {
                if (i != -1) {
                    Object obj = A0F.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0B(i, this.A0A, true).A03)) {
                        AL A03 = A03(ak, j);
                        if (A03 == null) {
                            return true ^ A0T(ak);
                        }
                        A0F.A02 = A0K(A0F.A02, i);
                        if (!A0A(A0F, A03)) {
                            return true ^ A0T(ak);
                        }
                    }
                }
                return true ^ A0T(ak);
            }
            if (A0F.A02.A06) {
                i = this.A07.A04(i, this.A0A, this.A0B, this.A01, this.A09);
            }
            ak = A0F;
        }
        return true;
    }

    public final boolean A0W(boolean z) {
        this.A09 = z;
        return A09();
    }
}