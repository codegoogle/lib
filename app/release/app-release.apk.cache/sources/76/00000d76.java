package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02990s {
    public static InterfaceC02940n A00;

    public final InterfaceC02940n A00(AdPlacementType adPlacementType) {
        InterfaceC02940n interfaceC02940n = A00;
        if (interfaceC02940n != null) {
            return interfaceC02940n;
        }
        int i = C02980r.A00[adPlacementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return new C0641Ex();
                    }
                    return new C0643Ez();
                }
                return new RG();
            }
            return new RE();
        }
        return new RD();
    }
}