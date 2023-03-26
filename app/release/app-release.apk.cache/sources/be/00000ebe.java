package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6E extends Handler {
    public final /* synthetic */ C6F A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6E(C6F c6f, Looper looper) {
        super(looper);
        this.A00 = c6f;
    }

    @Override // android.os.Handler
    @SuppressLint({"CatchGeneralException"})
    public final void handleMessage(Message message) {
        MotionEvent motionEvent;
        C6P c6p;
        if (KU.A02(this)) {
            return;
        }
        try {
            if (C6C.A00[C6D.values()[message.what].ordinal()] == 1 && (motionEvent = (MotionEvent) message.obj) != null) {
                c6p = this.A00.A02;
                c6p.A01(motionEvent);
            }
        } catch (Throwable th) {
            try {
                C6B.A04(th);
            } catch (Throwable th2) {
                KU.A00(th2, this);
            }
        }
    }
}