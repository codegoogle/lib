package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class RU implements InterfaceC03030w {
    public static byte[] A04;
    public static String[] A05;
    @Nullable
    public C7H A00;
    public NV A01 = NV.A06;
    public final RQ A02;
    public final C1Y A03;

    static {
        A06();
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{-97, bx.l7, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, bx.W5, 35, -45, -30, -37, -58, -61, -42, -61, -41, -40, bx.l7, -36, bx.j7, -36, -25, -36, -30, bx.j7, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    public static void A06() {
        A05 = new String[]{"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    }

    public RU(C1080Wh c1080Wh, Map<String, Object> map, C1Y c1y, @Nullable String str) {
        this.A02 = A01(c1080Wh, map, str, (JSONObject) map.get(A04(65, 4, 2)));
        this.A03 = c1y;
    }

    @Nullable
    private AdError A00(C1080Wh c1080Wh) {
        if (this.A02.A0W().isEmpty()) {
            c1080Wh.A04().A82(A04(62, 3, 18), C04848i.A0O, new C04858j(A04(5, 43, 6)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static RQ A01(C1080Wh c1080Wh, Map<String, Object> map, @Nullable String str, JSONObject jSONObject) {
        RQ adDataBundle = RQ.A01(jSONObject, c1080Wh);
        adDataBundle.A0b(str);
        AnonymousClass91 anonymousClass91 = (AnonymousClass91) map.get(A04(69, 10, 19));
        if (anonymousClass91 != null) {
            adDataBundle.A0Z(anonymousClass91.A06());
        }
        return adDataBundle;
    }

    private C7H A03(C1080Wh c1080Wh) {
        C7H c7h = this.A00;
        return c7h != null ? c7h : new C7H(c1080Wh);
    }

    private void A07(C1080Wh c1080Wh, EnumSet<CacheFlag> enumSet) {
        NV nv;
        C1S A06 = this.A02.A0M().A0E().A06();
        if (A06 != null) {
            nv = A06.A0B();
        } else {
            nv = NV.A06;
        }
        A09(nv);
        RT rt = new RT(this);
        C7H c7h = new C7H(c1080Wh);
        C03101d c03101d = new C03101d(this, this.A02, A04(79, 12, 17), c7h);
        if (c03101d.A09()) {
            c7h.A0X(new JL(this.A02.A0Q(), c1080Wh.A06()));
            c03101d.A08();
            return;
        }
        RQ rq = this.A02;
        if (A05[5].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "kxumv";
        strArr[5] = "kxumv";
        C03151i.A03(c1080Wh, rq, true, rt);
    }

    private void A08(C1080Wh c1080Wh, EnumSet<CacheFlag> enumSet) {
        C7H A03 = A03(c1080Wh);
        JL funnelLoggingHandler = new JL(this.A02.A0Q(), c1080Wh.A06());
        A03.A0X(funnelLoggingHandler);
        RQ rq = this.A02;
        String A042 = A04(79, 12, 17);
        C03101d c03101d = new C03101d(this, rq, A042, A03);
        if (c03101d.A09()) {
            c03101d.A08();
            return;
        }
        if (!TextUtils.isEmpty(this.A02.A0R())) {
            C7G c7g = new C7G(this.A02.A0R(), this.A02.A0U(), A042);
            c7g.A04 = true;
            c7g.A03 = A04(0, 5, 17);
            A03.A0T(c7g);
        }
        A03.A0S(new C7E(this.A02.A0O().A01(), OP.A04, OP.A04, this.A02.A0U(), A04(79, 12, 17)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i = 0;
        for (AnonymousClass19 anonymousClass19 : this.A02.A0W()) {
            C7E c7e = new C7E(anonymousClass19.A0E().A07(), C03111e.A00(anonymousClass19.A0E()), C03111e.A01(anonymousClass19.A0E()), this.A02.A0U(), A04(79, 12, 17));
            if (i == 0) {
                A03.A0R(c7e);
            } else {
                A03.A0S(c7e);
            }
            for (String str : anonymousClass19.A0H().A00()) {
                A03.A0S(new C7E(str, -1, -1, this.A02.A0U(), A04(79, 12, 17)));
            }
            if (contains && !TextUtils.isEmpty(anonymousClass19.A0E().A08())) {
                C7G c7g2 = new C7G(anonymousClass19.A0E().A08(), this.A02.A0U(), A04(79, 12, 17), anonymousClass19.A0E().A05());
                c7g2.A04 = false;
                if (i == 0) {
                    A03.A0W(c7g2);
                } else {
                    A03.A0V(c7g2);
                }
            }
            i++;
        }
        A03.A0Q(new RS(this), new C7A(this.A02.A0U(), A042));
    }

    private void A09(NV nv) {
        this.A01 = nv;
    }

    public final KL A0A() {
        if (!TextUtils.isEmpty(this.A02.A0R()) && Build.VERSION.SDK_INT >= 21) {
            KL kl = KL.A03;
            String[] strArr = A05;
            if (strArr[6].length() != strArr[2].length()) {
                String[] strArr2 = A05;
                strArr2[3] = "f4kXngrP8CD5dz";
                strArr2[3] = "f4kXngrP8CD5dz";
                return kl;
            }
        } else if (this.A02.A0W().size() > 1) {
            return KL.A06;
        } else {
            RQ rq = this.A02;
            String[] strArr3 = A05;
            if (strArr3[7].length() == strArr3[4].length()) {
                String[] strArr4 = A05;
                strArr4[3] = "ny";
                strArr4[3] = "ny";
                if (rq.A0M().A0E().A06() != null) {
                    return KL.A08;
                }
                boolean A0G = A0G();
                String[] strArr5 = A05;
                if (strArr5[6].length() != strArr5[2].length()) {
                    String[] strArr6 = A05;
                    strArr6[3] = "JH";
                    strArr6[3] = "JH";
                    if (A0G) {
                        KL kl2 = KL.A09;
                        if (A05[3].length() != 32) {
                            String[] strArr7 = A05;
                            strArr7[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                            strArr7[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                            return kl2;
                        }
                        String[] strArr8 = A05;
                        strArr8[3] = "ySAy4b6nQ";
                        strArr8[3] = "ySAy4b6nQ";
                        return kl2;
                    }
                    return KL.A07;
                }
                throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }

    public final NV A0B() {
        return this.A01;
    }

    public final String A0C() {
        return this.A02.A0Q();
    }

    public final void A0D() {
        this.A03.ADb();
    }

    public final void A0E(Intent intent, RewardData rewardData, String str) {
        this.A02.A0a(rewardData);
        this.A02.A0d(str);
        intent.putExtra(A04(48, 14, 94), this.A02);
    }

    public final void A0F(C1080Wh c1080Wh, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c1080Wh);
        if (A00 != null) {
            this.A03.A8l(A00);
            return;
        }
        this.A03.ACA();
        if (A0A() == KL.A08) {
            A07(c1080Wh, enumSet);
        } else {
            A08(c1080Wh, enumSet);
        }
    }

    public final boolean A0G() {
        return !TextUtils.isEmpty(this.A02.A0M().A0E().A08());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03030w
    public final void A96() {
        this.A03.A8m();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03030w
    public final void A97() {
        this.A03.A8l(AdError.CACHE_ERROR);
    }
}