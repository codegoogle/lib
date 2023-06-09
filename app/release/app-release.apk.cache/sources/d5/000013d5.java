package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class S2 implements InterfaceC03271u {
    public static byte[] A04;
    public static String[] A05;
    public final AbstractC0962Rq A00;
    public final InterfaceC03221p A01;
    public final C03291w A02;
    public final C1080Wh A03;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, 28, 88, 23, 26, 18, 29, 27, 12, 88, 17, Flags.CD, 88, 22, 13, 20, 20, 56, 47, 52, 62, 54, ax5.a, 37, ax5.a, 34, 46, 40, 59, 41, 37, 49, ax5.a, 35, 9, 13, 14, 58, 43, 38, bx.W5, 33, 44, bx.W5, 1, bx.W5, 59, 56, 32, 61, 36, 98, 101, g15.c, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, 14, 9, 19, 24, 21, 17, 24, 17, 14, 3, 2, 8, 24, 3, 18, 21, 6, 19, 14, 8, 9, 24, 12, 2, 30, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, 19, 5, 5, 23, 17, 19, 76, 86, 96, 68, 94, 94, 68, 67, 74, 13, 79, 88, 67, 73, 65, 72, 13, 75, 66, 95, 13, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, bx.W5, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, 20, 13};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    public static void A02() {
        A05 = new String[]{"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    }

    public S2(C1080Wh c1080Wh, C03291w c03291w, InterfaceC03221p interfaceC03221p, AbstractC0962Rq abstractC0962Rq) {
        this.A03 = c1080Wh;
        this.A02 = c03291w;
        this.A01 = interfaceC03221p;
        this.A00 = abstractC0962Rq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03271u
    public final void A7I(Message message) {
        RewardedVideoAd A01 = this.A02.A01();
        String A00 = A00(203, 3, 16);
        if (A01 == null) {
            this.A03.A04().A82(A00, C04848i.A0A, new C04858j(A00(0, 17, 12)));
            return;
        }
        int i = message.what;
        String A002 = A00(120, 9, 2);
        String A003 = A00(17, 17, 14);
        if (i != 10) {
            if (i == 2100) {
                this.A01.AD0();
                Bundle bundle = message.getData().getBundle(A003);
                if (bundle != null) {
                    this.A02.A01 = bundle.getLong(A00(94, 26, 87));
                    this.A02.A00 = bundle.getInt(A00(69, 25, 51));
                } else {
                    InterfaceC04838h A042 = this.A03.A04();
                    int i2 = C04848i.A0K;
                    A042.A82(A00, i2, new C04858j(A00(129, 26, 89), A002 + message));
                }
                this.A02.A02(null);
            } else if (i != 2103) {
                if (i == 2106) {
                    this.A01.AD6();
                    this.A02.A02(null);
                } else if (i != 2010) {
                }
            }
            RewardedVideoAdListener rewardedVideoAdListener = this.A02.A04;
            String[] strArr = A05;
            if (strArr[6].length() != strArr[7].length()) {
                String[] strArr2 = A05;
                strArr2[6] = "eimvHB";
                strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                if (rewardedVideoAdListener == null) {
                    return;
                }
                int i3 = message.what;
                if (i3 == 2100) {
                    this.A02.A04.onAdLoaded(A01);
                    return;
                } else if (i3 != 2110) {
                    switch (i3) {
                        case 2104:
                            this.A02.A04.onAdClicked(A01);
                            return;
                        case 2105:
                            this.A02.A04.onLoggingImpression(A01);
                            String[] strArr3 = A05;
                            if (strArr3[0].length() != strArr3[5].length()) {
                                String[] strArr4 = A05;
                                strArr4[6] = "WCvtTN";
                                strArr4[7] = "y4UVYSvKEMUJHaNV8tet5";
                                return;
                            }
                            return;
                        case 2106:
                            if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                                RewardedVideoAdListener rewardedVideoAdListener2 = this.A02.A04;
                                String[] strArr5 = A05;
                                if (strArr5[3].length() != strArr5[4].length()) {
                                    String[] strArr6 = A05;
                                    strArr6[1] = "xBcXcH1FIqV1K6GDcI0Fko4DemMWRriz";
                                    strArr6[2] = "Y9fB";
                                    ((RewardedVideoAdExtendedListener) rewardedVideoAdListener2).onRewardedVideoActivityDestroyed();
                                    return;
                                }
                            } else {
                                return;
                            }
                            break;
                        default:
                            switch (i3) {
                                case 3000:
                                    this.A02.A04.onRewardedVideoCompleted();
                                    return;
                                case 3001:
                                    if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                        ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                                        return;
                                    }
                                    return;
                                case IronSourceConstants.BN_INSTANCE_LOAD /* 3002 */:
                                    if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                        ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    this.A02.A04.onRewardedVideoClosed();
                    return;
                }
            }
            throw new RuntimeException();
        }
        Bundle data = message.getData();
        String[] strArr7 = A05;
        if (strArr7[1].length() == strArr7[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr8 = A05;
        strArr8[1] = "xhuyCPLYH2PKP53E98JhdsnjasrGKyBu";
        strArr8[2] = "IOLF";
        Bundle bundle2 = data.getBundle(A003);
        if (bundle2 != null) {
            int i4 = bundle2.getInt(A00(51, 18, 95));
            String string = bundle2.getString(A00(182, 21, 125));
            AdError adError = new AdError(i4, string);
            this.A01.ACw(adError);
            if (this.A02.A04 != null) {
                this.A02.A04.onError(A01, adError);
            } else {
                Log.e(A00(34, 17, 59), string);
            }
        } else {
            this.A01.ACt(EnumC03211o.A05);
            InterfaceC04838h A043 = this.A03.A04();
            int i5 = C04848i.A0K;
            A043.A82(A00, i5, new C04858j(A00(155, 27, 49), A002 + message));
        }
        this.A02.A02(null);
    }
}