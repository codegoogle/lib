package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8G {
    public static final AtomicReference<C1081Wi> A00 = new AtomicReference<>();

    @Nullable
    public static C1081Wi A00() {
        return A00.get();
    }

    public static void A01(C1081Wi c1081Wi) {
        if (c1081Wi == null) {
            return;
        }
        A00.compareAndSet(null, c1081Wi);
    }
}