package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class RK extends AbstractC02960p {
    public static String[] A05;
    public static final String A06;
    public RI A00;
    public boolean A01;
    public final C1080Wh A02;
    public final JE A03;
    public final NK A04;

    public static void A04() {
        A05 = new String[]{"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    }

    static {
        A04();
        A06 = RK.class.getSimpleName();
    }

    public RK(C1080Wh c1080Wh, JE je, NK nk, C0901Ph c0901Ph, AbstractC02970q abstractC02970q) {
        super(c1080Wh, abstractC02970q, c0901Ph);
        this.A03 = je;
        this.A04 = nk;
        this.A02 = c1080Wh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02960p
    public final void A07(Map<String, String> map) {
        RI ri = this.A00;
        if (ri != null && !TextUtils.isEmpty(ri.A5j())) {
            this.A02.A0A().A2a();
            JE je = this.A03;
            String A5j = this.A00.A5j();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            je.A86(A5j, map);
        }
    }

    public final synchronized void A08() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A04())) {
                LZ.A00(new RJ(this));
            }
        }
    }

    public final void A09(RI ri) {
        this.A00 = ri;
    }
}