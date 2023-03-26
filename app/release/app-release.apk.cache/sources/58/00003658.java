package com.ironsource.sdk.h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.a;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a extends Handler {
    public final ConcurrentHashMap<String, com.ironsource.sdk.k.c> a;

    public a(Looper looper) {
        super(looper);
        this.a = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:2:0x0000, B:5:0x0013, B:13:0x0023, B:15:0x0033, B:14:0x0027), top: B:20:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:2:0x0000, B:5:0x0013, B:13:0x0023, B:15:0x0033, B:14:0x0027), top: B:20:0x0000 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z;
        try {
            c cVar = (c) message.obj;
            String path = cVar.getPath();
            com.ironsource.sdk.k.c cVar2 = this.a.get(path);
            if (cVar2 == null) {
                return;
            }
            int i = message.what;
            if (i != 1016 && i != 1015) {
                z = false;
                if (z) {
                    cVar2.a(cVar, new com.ironsource.sdk.g.e(i, a.AnonymousClass1.a(i)));
                } else {
                    cVar2.a(cVar);
                }
                this.a.remove(path);
            }
            z = true;
            if (z) {
            }
            this.a.remove(path);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}