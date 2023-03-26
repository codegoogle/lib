package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.Eo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0634Eo extends AbstractC0962Rq {
    @Nullable
    public C0970Ry A00;
    public final C03291w A01;

    public C0634Eo(C03291w c03291w) {
        super(c03291w.A0B, A00(c03291w));
        this.A01 = c03291w;
    }

    public static InterfaceC03281v A00(C03291w c03291w) {
        return new S3(c03291w);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0962Rq
    public final void A05() {
        C0970Ry c0970Ry = this.A00;
        if (c0970Ry != null) {
            c0970Ry.A0D();
        }
        super.A00.ACt(EnumC03211o.A04);
    }

    public final void A07() {
        this.A00 = new C0970Ry(this.A01, this, this.A02);
        this.A00.A0F(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A08(RewardData rewardData) {
        this.A01.A03 = rewardData;
        C0970Ry c0970Ry = this.A00;
        if (c0970Ry != null) {
            c0970Ry.A0E(rewardData);
        }
    }

    public final void A09(RewardedVideoAd rewardedVideoAd, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A51()) {
            return;
        }
        this.A01.A02(rewardedVideoAd);
        C0970Ry c0970Ry = this.A00;
        if (c0970Ry != null) {
            c0970Ry.A0F(str, adExperienceType, z);
            return;
        }
        C03291w c03291w = this.A01;
        c03291w.A05 = str;
        c03291w.A02 = adExperienceType;
        c03291w.A08 = z;
        A07();
    }

    public final boolean A0A() {
        C0970Ry c0970Ry = this.A00;
        if (c0970Ry != null) {
            return c0970Ry.A0G();
        }
        return this.A01.A01 > 0 && LW.A00() > this.A01.A01;
    }

    public final boolean A0B() {
        C0970Ry c0970Ry = this.A00;
        if (c0970Ry != null) {
            return c0970Ry.A0H();
        }
        return super.A00.A5I() == EnumC03211o.A06;
    }

    public final boolean A0C(RewardedVideoAd rewardedVideoAd, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C5T) rewardedVideoShowAdConfig).A00();
        if (super.A00.A52()) {
            return false;
        }
        this.A01.A02(rewardedVideoAd);
        C0970Ry c0970Ry = this.A00;
        if (c0970Ry != null) {
            return c0970Ry.A0I(A00);
        }
        this.A00 = new C0970Ry(this.A01, this, this.A02);
        this.A00.A0I(A00);
        return false;
    }
}