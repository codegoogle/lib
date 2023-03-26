package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.facebook.ads.redexgen.X.8R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C8R<T> {
    public C8Q A00;

    @Nullable
    public abstract T A04();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8R != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final C8Q A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8R != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final void A01(C8Q c8q) {
        this.A00 = c8q;
    }
}