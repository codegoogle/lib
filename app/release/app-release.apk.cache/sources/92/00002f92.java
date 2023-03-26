package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzc implements zzzu {
    private final zzze zza;
    private final long zzb;

    public zzzc(zzze zzzeVar, long j) {
        this.zza = zzzeVar;
        this.zzb = j;
    }

    private final zzzv zza(long j, long j2) {
        return new zzzv((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        zzcw.zzb(this.zza.zzk);
        zzze zzzeVar = this.zza;
        zzzd zzzdVar = zzzeVar.zzk;
        long[] jArr = zzzdVar.zza;
        long[] jArr2 = zzzdVar.zzb;
        int zzd = zzeg.zzd(jArr, zzzeVar.zzb(j), true, false);
        zzzv zza = zza(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zza.zzb != j && zzd != jArr.length - 1) {
            int i = zzd + 1;
            return new zzzs(zza, zza(jArr[i], jArr2[i]));
        }
        return new zzzs(zza, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}