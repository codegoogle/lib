package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerr implements zzetg {
    private final zzetg zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzerr(zzetg zzetgVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetgVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzfvl zzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb = zzfvc.zzo(zzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfvc.zzg(zzb, Throwable.class, zzerq.zza, zzcfv.zzf);
    }
}