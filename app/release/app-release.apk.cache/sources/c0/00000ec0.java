package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6G {
    public final List<C6Q> A00 = new ArrayList();

    public final void A00() {
        for (C6Q biometricSignalLifecycleHandler : this.A00) {
            biometricSignalLifecycleHandler.ABY();
        }
    }

    public final void A01(C6Q c6q) {
        this.A00.add(c6q);
    }
}