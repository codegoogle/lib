package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcdk implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzcdk(zzcdn zzcdnVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@x1 Runnable runnable) {
        return new Thread(runnable, wo1.l("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}