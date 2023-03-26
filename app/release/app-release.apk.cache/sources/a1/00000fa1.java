package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: assets/audience_network.dex */
public class A7 extends Handler {
    public final /* synthetic */ C0570Ca A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7(C0570Ca c0570Ca, Looper looper) {
        super(looper);
        this.A00 = c0570Ca;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B(message);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}