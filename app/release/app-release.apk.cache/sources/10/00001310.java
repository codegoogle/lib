package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Or  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0885Or extends ContentObserver {
    public final K7 A00;

    public C0885Or(Handler handler, K7 k7) {
        super(handler);
        this.A00 = k7;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0a();
    }
}