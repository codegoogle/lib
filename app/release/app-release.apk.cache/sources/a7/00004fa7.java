package com.p7700g.p99005;

import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.greedygame.mystique2.models.MediationType;
import com.p7700g.p99005.gz2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m13 {
    @NotNull
    public static final gz2 a(@NotNull Ad ad) {
        c25.p(ad, "ad");
        NativeMediatedAsset v = ad.v();
        return new gz2.a().c(v.e()).m(v.i()).v(v.q()).d(v.g()).a(v.j()).n(ad.y()).e(ad.t()).b();
    }

    @NotNull
    public static final MediationType b(@Nullable Partner partner) {
        if (partner == null) {
            return MediationType.NO_MEDIATION;
        }
        return b95.L1(partner.g(), "admob", false, 2, null) ? MediationType.ADMOB : b95.L1(partner.g(), "mopub", false, 2, null) ? MediationType.MOPUB : b95.L1(partner.g(), "fan", false, 2, null) ? MediationType.FACEBOOK : b95.L1(partner.g(), "admob_banner", false, 2, null) ? MediationType.ADMOB_BANNER : partner.e() == k13.S2S ? MediationType.S2S : MediationType.NO_MEDIATION;
    }
}