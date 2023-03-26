package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public abstract class Si extends AbstractC0856No {
    public static byte[] A06;
    public static String[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C0702Hi A00;
    @Nullable
    public C0679Gl A01;
    public C0674Gg A02;
    public final AnonymousClass16 A03;
    public final AnonymousClass19 A04;
    public final NX A05;

    public static String A0K(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A06 = new byte[]{9, 5, 7, 68, 12, Flags.CD, 9, 15, 8, 5, 5, 1, 68, Flags.CD, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, Flags.CD, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    public static void A0M() {
        A07 = new String[]{"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    }

    static {
        A0M();
        A0L();
        A0B = (int) (C0795Le.A01 * 48.0f);
        A0F = (int) (C0795Le.A01 * 16.0f);
        A08 = (int) (C0795Le.A01 * 4.0f);
        A0E = (int) (C0795Le.A01 * 44.0f);
        A0C = (int) (C0795Le.A01 * 8.0f);
        A0D = (int) (C0795Le.A01 * 12.0f);
        A0H = (int) (C0795Le.A01 * 12.0f);
        A0G = (int) (C0795Le.A01 * 26.0f);
        A09 = C2G.A01(-1, 77);
        A0A = C2G.A01(A09, 90);
    }

    public Si(C0860Ns c0860Ns, boolean z) {
        super(c0860Ns, z);
        this.A03 = c0860Ns.A04();
        this.A04 = this.A03.A0M();
        this.A05 = A0J(c0860Ns);
        M1 A082 = c0860Ns.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private NX A0J(C0860Ns c0860Ns) {
        String A0K;
        NX c1082Wj;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0860Ns.A04().A0T().equals(A0K(37, 14, 56))) {
            A0K = EnumC0888Ou.A04.A02();
        } else if (A07[3].charAt(14) != '2') {
            throw new RuntimeException();
        } else {
            String[] strArr = A07;
            strArr[5] = "WUaGuSp4tuIpD6iTfwLrbbBI";
            strArr[5] = "WUaGuSp4tuIpD6iTfwLrbbBI";
            A0K = A0K(0, 37, 124);
        }
        if (J8.A1M(c0860Ns.A05())) {
            c1082Wj = new C1165Zs(c0860Ns.A05(), A0B, getColors(), A0K, c0860Ns.A06(), c0860Ns.A09(), c0860Ns.A0B(), c0860Ns.A07());
            layoutParams.setMargins(AbstractC0856No.A09, 0, AbstractC0856No.A09, AbstractC0856No.A09);
        } else {
            c1082Wj = new C1082Wj(c0860Ns.A05(), A0B, this.A04.A0F().A00() == C1E.A05, getColors(), A0K, c0860Ns.A06(), c0860Ns.A09(), c0860Ns.A0B(), c0860Ns.A07());
            this.A02 = new C0674Gg(c1082Wj, 400, 100, 0);
        }
        C0795Le.A0N(c1082Wj);
        c1082Wj.A0D(c0860Ns.A00());
        addView(c1082Wj, layoutParams);
        return c1082Wj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d, bundle);
        this.A05.setInfo(anonymousClass19.A0F(), anonymousClass19.A0G(), str, this.A03.A0O().A01(), null);
    }

    public final int A0e(@Nullable M1 m1) {
        return m1 == null ? M1.A00 : m1.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new C0702Hi(true);
            C0679Gl c0679Gl = this.A01;
            if (c0679Gl != null) {
                C0702Hi c0702Hi = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                String[] strArr = A07;
                strArr[7] = "KTvg88bTO6HmKn15GgbH1";
                strArr[7] = "KTvg88bTO6HmKn15GgbH1";
                c0702Hi.A0J(c0679Gl);
            }
            C1H A01 = this.A03.A0L().A01();
            this.A00.A0J(new C0675Gh(getAdDetailsView().getCTAButton(), 300, -1, A01.A09(true)));
            this.A00.A0J(new C0680Gm(getAdDetailsView().getCTAButton(), 300, C0795Le.A09(A09, A0A, A08), C0795Le.A06(A01.A08(true), A08)));
            this.A00.A0J(new C0676Gi(expandableLayout, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, false));
            this.A00.A0I(IronSourceConstants.IS_AUCTION_FAILED);
        }
    }

    public AnonymousClass16 getAdDataBundle() {
        return this.A03;
    }

    public C0674Gg getAdDetailsAnimation() {
        return this.A02;
    }

    public NX getAdDetailsView() {
        return this.A05;
    }

    public AnonymousClass19 getAdInfo() {
        return this.A04;
    }

    public C0702Hi getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0D(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        C0679Gl c0679Gl = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        strArr[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (c0679Gl == null) {
            this.A01 = new C0679Gl(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0J(this.A01);
            this.A00.A0H();
        }
    }
}