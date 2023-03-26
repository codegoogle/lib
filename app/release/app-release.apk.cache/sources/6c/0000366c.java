package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.a;
import com.ironsource.sdk.g.e;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes3.dex */
public final class a extends Handler {
    public c a;

    public a(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = this.a;
        if (cVar == null) {
            Logger.i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i == 1016) {
                cVar.a((com.ironsource.sdk.h.c) message.obj);
                return;
            }
            this.a.a((com.ironsource.sdk.h.c) message.obj, new e(i, a.AnonymousClass1.a(i)));
        } catch (Throwable th) {
            Logger.i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}