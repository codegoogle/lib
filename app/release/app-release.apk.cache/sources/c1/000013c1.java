package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ri  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0954Ri implements AnonymousClass11 {
    public static byte[] A07;
    public static String[] A08;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C0636Es A04;
    public final /* synthetic */ C05008y A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, 67, 93, 73};
    }

    public static void A02() {
        A08 = new String[]{"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    }

    public C0954Ri(C0636Es c0636Es, Runnable runnable, long j, C05008y c05008y) {
        this.A04 = c0636Es;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c05008y;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAF(RG rg) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A06(this.A05.A05(AnonymousClass92.A03), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0B();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAG(RG rg) {
        Map A01;
        if (rg != this.A04.A01) {
            return;
        }
        this.A04.A0G().removeCallbacks(this.A06);
        C0636Es c0636Es = this.A04;
        c0636Es.A02 = rg;
        c0636Es.A07.A0E(rg);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            this.A04.A06(this.A05.A05(AnonymousClass92.A05), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAH(RG rg) {
        if (!this.A01) {
            this.A01 = true;
            C0636Es c0636Es = this.A04;
            C05008y c05008y = this.A05;
            AnonymousClass92 anonymousClass92 = AnonymousClass92.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c0636Es.A06(c05008y.A05(anonymousClass92), null);
        }
        this.A04.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass11
    public final void AAJ(RG rg, C0755Jm c0755Jm) {
        Map A01;
        if (rg != this.A04.A01) {
            return;
        }
        this.A04.A0G().removeCallbacks(this.A06);
        this.A04.A0P(rg);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 58), String.valueOf(c0755Jm.A04().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(c0755Jm.A05()));
            this.A04.A06(this.A05.A05(AnonymousClass92.A05), A01);
        }
        this.A04.A0O();
    }
}