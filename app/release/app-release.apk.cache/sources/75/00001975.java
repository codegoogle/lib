package com.google.android.gms.common.api.internal;

import com.p7700g.p99005.s2;
import java.util.concurrent.locks.Lock;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zaav implements Runnable {
    public final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    @s2
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        Lock lock3;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.zab.zab;
                } else {
                    zaa();
                    lock3 = this.zab.zab;
                }
            } catch (RuntimeException e) {
                zabiVar = this.zab.zaa;
                zabiVar.zam(e);
                lock3 = this.zab.zab;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.zab.zab;
            lock2.unlock();
            throw th;
        }
    }

    @s2
    public abstract void zaa();
}