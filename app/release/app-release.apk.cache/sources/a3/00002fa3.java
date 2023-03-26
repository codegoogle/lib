package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzzt implements zzzu {
    private final long zza;
    private final zzzs zzb;

    public zzzt(long j, long j2) {
        this.zza = j;
        zzzv zzzvVar = j2 == 0 ? zzzv.zza : new zzzv(0L, j2);
        this.zzb = new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return false;
    }
}