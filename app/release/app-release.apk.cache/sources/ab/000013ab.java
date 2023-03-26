package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network.dex */
public abstract class RM implements InterfaceC02940n {
    public int A00;
    public RewardData A01;

    public abstract int A0B();

    public abstract boolean A0C();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(RewardData rewardData) {
        this.A01 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02940n
    public final AdPlacementType A6i() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}