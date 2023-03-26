package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public class IZ implements Comparator<C0720Ia> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C0720Ia c0720Ia, C0720Ia c0720Ia2) {
        if (c0720Ia.A00 < c0720Ia2.A00) {
            return -1;
        }
        return c0720Ia2.A00 < c0720Ia.A00 ? 1 : 0;
    }
}