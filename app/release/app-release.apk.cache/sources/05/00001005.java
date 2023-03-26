package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Bu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0568Bu extends Handler {
    public final /* synthetic */ Y2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bu != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public HandlerC0568Bu(Y2 y2, Looper looper) {
        super(looper);
        this.A00 = y2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bu != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<C1124Xz> list;
        if (KU.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) message.obj;
            list = this.A00.A09;
            for (C1124Xz c1124Xz : list) {
                if (c1124Xz.A0O(bArr)) {
                    c1124Xz.A0K(message.what);
                    return;
                }
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}