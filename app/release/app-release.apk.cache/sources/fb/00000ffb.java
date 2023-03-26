package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Bk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0560Bk extends Handler {
    public final /* synthetic */ C1124Xz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    public HandlerC0560Bk(C1124Xz c1124Xz, Looper looper) {
        super(looper);
        this.A00 = c1124Xz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bk != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (KU.A02(this)) {
            return;
        }
        try {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.A00.A0B(obj, obj2);
                return;
            }
            this.A00.A0C(obj, obj2);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}