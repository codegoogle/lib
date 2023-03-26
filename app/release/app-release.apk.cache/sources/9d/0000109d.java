package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class EX implements Runnable {
    public final /* synthetic */ ConditionVariable A00;

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}