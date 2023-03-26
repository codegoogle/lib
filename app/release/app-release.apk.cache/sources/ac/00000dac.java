package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03171k {
    public int A00;
    @Nullable
    public RewardData A01;
    @Nullable
    public JU A02;
    @Nullable
    public String A03;
    @Nullable
    public String A04;
    public boolean A05;
    public final EnumC0759Jr A06;
    public final EnumC0760Js A07;
    public final String A08;
    @Nullable
    public final EnumSet<CacheFlag> A09;
    public final int A0A;
    public final AdPlacementType A0B;

    public C03171k(String str, EnumC0760Js enumC0760Js, AdPlacementType adPlacementType, EnumC0759Jr enumC0759Jr, int i) {
        this(str, enumC0760Js, adPlacementType, enumC0759Jr, i, EnumSet.of(CacheFlag.NONE));
    }

    public C03171k(String str, EnumC0760Js enumC0760Js, AdPlacementType adPlacementType, EnumC0759Jr enumC0759Jr, int i, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A08 = str;
        this.A0B = adPlacementType;
        this.A06 = enumC0759Jr;
        this.A0A = i;
        this.A09 = enumSet;
        this.A07 = enumC0760Js;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0B;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC0759Jr enumC0759Jr = this.A06;
        if (enumC0759Jr == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC0759Jr == EnumC0759Jr.A08) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final KC A01(C1080Wh c1080Wh, C0765Jx c0765Jx, @Nullable AdExperienceType adExperienceType) {
        LH lh;
        String str = this.A08;
        EnumC0759Jr enumC0759Jr = this.A06;
        if (enumC0759Jr != null) {
            lh = new LH(enumC0759Jr.getHeight(), this.A06.getWidth());
        } else {
            lh = null;
        }
        return new KC(c1080Wh, str, lh, this.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, this.A0A, AdSettings.isTestMode(c1080Wh), AdSettings.isChildDirected() || AdSettings.isMixedAudience(), c0765Jx, LN.A01(J8.A0H(c1080Wh)), this.A03, adExperienceType);
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(@Nullable RewardData rewardData) {
        this.A01 = rewardData;
    }

    public final void A04(@Nullable JU ju) {
        this.A02 = ju;
    }

    public final void A05(@Nullable String str) {
        this.A03 = str;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(boolean z) {
        this.A05 = z;
    }
}