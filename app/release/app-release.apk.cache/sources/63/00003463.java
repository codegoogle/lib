package com.ironsource.mediationsdk.a;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes3.dex */
public final class i extends Thread {
    private static i s;
    private a t;

    /* loaded from: classes3.dex */
    public class a extends HandlerThread {
        public Handler s;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }
    }

    private i() {
        a aVar = new a(i.class.getSimpleName());
        this.t = aVar;
        aVar.start();
        a aVar2 = this.t;
        aVar2.s = new Handler(aVar2.getLooper());
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (s == null) {
                s = new i();
            }
            iVar = s;
        }
        return iVar;
    }

    public final synchronized void a(Runnable runnable) {
        a aVar = this.t;
        if (aVar == null) {
            return;
        }
        Handler handler = aVar.s;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}