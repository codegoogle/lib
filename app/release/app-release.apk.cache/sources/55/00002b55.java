package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvr extends zzfvo implements ScheduledExecutorService, zzfvm {
    public final ScheduledExecutorService zza;

    public zzfvr(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfwa zzf = zzfwa.zzf(runnable, null);
        return new zzfvp(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfvq zzfvqVar = new zzfvq(runnable);
        return new zzfvp(zzfvqVar, this.zza.scheduleAtFixedRate(zzfvqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfvq zzfvqVar = new zzfvq(runnable);
        return new zzfvp(zzfvqVar, this.zza.scheduleWithFixedDelay(zzfvqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfwa zzfwaVar = new zzfwa(callable);
        return new zzfvp(zzfwaVar, this.zza.schedule(zzfwaVar, j, timeUnit));
    }
}