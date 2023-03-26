package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.UUID;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class RE implements InterfaceC02940n, C1Y {
    public static byte[] A0B;
    public static String[] A0C;
    public long A00;
    public RewardData A01;
    public InterfaceC03040x A02;
    public C03050y A03;
    public RU A04;
    public C1080Wh A05;
    public String A06;
    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    static {
        A06();
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, bx.W5, 121, 45, 126, 121, 108, g15.c, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, g15.c, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, g15.c, 104, 45, 121, 101, 108, 121, 45, 100, 121, bx.W5, 126, 45, 100, 99, 45, 116, 98, 120, g15.c, 45, 76, 99, 105, g15.c, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, bx.W5, 27, 37, 39, 48, 45, 50, 45, 48, 61, 93, 82, 87, 91, 80, 74, 106, 81, 85, 91, 80, 17, 25, 24, 21, 29, 8, 21, 19, 18, 56, 29, 8, 29, 52, 40, 37, 39, 33, 41, 33, bx.W5, 48, 13, 32, 4, 6, 17, 16, 17, 18, 29, 26, 17, 16, 59, 6, 29, 17, 26, 0, 21, 0, 29, 27, 26, ax5.a, 17, 13, 117, 98, 118, 114, 98, 116, 115, 83, 110, 106, 98, 29, 6, 1, 25, 29, 13, 33, 12, 38, 57, 53, 39, 4, 41, 32, 53, 80, 78, 73, 67, 72, 80};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    public static void A06() {
        A0C = new String[]{"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    }

    private int A00() {
        int rotation = ((WindowManager) this.A05.getSystemService(A03(205, 6, 47))).getDefaultDisplay().getRotation();
        NV adOrientation = A02();
        if (adOrientation == NV.A06) {
            return -1;
        }
        if (adOrientation == NV.A04) {
            if (rotation == 2 || rotation == 3) {
                if (A0C[1].charAt(29) != 'g') {
                    String[] strArr = A0C;
                    strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
                    strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
                    return 8;
                }
                throw new RuntimeException();
            }
            return 0;
        } else if (rotation != 2) {
            return 1;
        } else {
            return 9;
        }
    }

    private final KL A01() {
        return this.A04.A0A();
    }

    private NV A02() {
        return this.A04.A0B();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A07(Intent intent) {
        RU ru = this.A04;
        RewardData rewardData = this.A01;
        ru.A0E(intent, rewardData, C0872Oe.A03(rewardData, this.A0A, this.A06));
    }

    private final void A08(C1080Wh c1080Wh, InterfaceC03040x interfaceC03040x, Map<String, Object> map, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A04 = new RU(c1080Wh, map, this, str);
        this.A04.A0F(c1080Wh, enumSet);
    }

    private void A09(KL kl) {
        if (kl.equals(KL.A06)) {
            this.A05.A0A().AD7(EnumC02840d.A03);
        } else if (kl.equals(KL.A07)) {
            this.A05.A0A().AD7(EnumC02840d.A06);
        } else if (kl.equals(KL.A09)) {
            this.A05.A0A().AD7(EnumC02840d.A08);
        } else if (kl.equals(KL.A08)) {
            this.A05.A0A().AD7(EnumC02840d.A07);
        } else if (!kl.equals(KL.A03)) {
        } else {
            if (this.A04.A0G()) {
                C0S A0A = this.A05.A0A();
                String[] strArr = A0C;
                if (strArr[5].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
                strArr2[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
                A0A.AD7(EnumC02840d.A05);
                return;
            }
            this.A05.A0A().AD7(EnumC02840d.A04);
        }
    }

    public final void A0A(C1080Wh c1080Wh, InterfaceC03040x interfaceC03040x, Map<String, Object> map, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        String A03;
        this.A05 = c1080Wh;
        this.A02 = interfaceC03040x;
        this.A08 = (String) map.get(A03(143, 11, 76));
        String str3 = this.A08;
        if (str3 != null) {
            A03 = str3.split(A03(107, 1, 19))[0];
        } else if (A0C[2].charAt(13) != 'u') {
            throw new RuntimeException();
        } else {
            String[] strArr = A0C;
            strArr[1] = "jgXU3SqF8Uv0ED4x1YEVN8i2uqYthAt6";
            strArr[1] = "jgXU3SqF8Uv0ED4x1YEVN8i2uqYthAt6";
            A03 = A03(0, 0, 5);
        }
        this.A06 = A03;
        this.A00 = ((Long) map.get(A03(178, 11, 15))).longValue();
        this.A07 = str2;
        this.A01 = rewardData;
        A08(c1080Wh, interfaceC03040x, map, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC03040x interfaceC03040x = this.A02;
            if (interfaceC03040x != null) {
                interfaceC03040x.A9o(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A04 = C0783Kq.A04(this.A05);
        A04.putExtra(A03(154, 24, 124), A00());
        A04.putExtra(A03(189, 8, 96), this.A0A);
        A04.putExtra(A03(143, 11, 76), this.A08);
        A04.putExtra(A03(178, 11, 15), this.A00);
        KL A01 = A01();
        A09(A01);
        A04.putExtra(A03(197, 8, 88), A01);
        String str = this.A07;
        if (str != null) {
            A04.putExtra(A03(WKSRecord.Service.CISCO_FNA, 13, 116), str);
        }
        A07(A04);
        A04.addFlags(268435456);
        A04.putExtra(A03(119, 11, 54), this.A04.A0C());
        try {
            C0783Kq.A0A(this.A05, A04);
            return true;
        } catch (ActivityNotFoundException e) {
            this.A05.A04().A82(A03(108, 11, 76), C04848i.A05, new C04858j(e));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02940n
    @Nullable
    public final String A5j() {
        return this.A04.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02940n
    public final AdPlacementType A6i() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void A8l(AdError adError) {
        InterfaceC03040x interfaceC03040x = this.A02;
        if (interfaceC03040x != null) {
            interfaceC03040x.A9o(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void A8m() {
        A04();
        this.A02.A9n(this);
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void ACA() {
        this.A03 = new C03050y(this.A05, this.A0A, this, this.A02);
        this.A03.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C1Y
    public final void ADb() {
        C03050y c03050y = this.A03;
        if (c03050y != null) {
            c03050y.A04();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02940n
    public final void onDestroy() {
        RU ru = this.A04;
        if (ru != null) {
            ru.A0D();
        }
    }
}