package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafa implements zzafg {
    private final zzze zza;
    private final zzzd zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzafa(zzze zzzeVar, zzzd zzzdVar) {
        this.zza = zzzeVar;
        this.zzb = zzzdVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final long zzd(zzys zzysVar) {
        long j = this.zzd;
        if (j >= 0) {
            this.zzd = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final zzzu zze() {
        zzcw.zzf(this.zzc != -1);
        return new zzzc(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeg.zzd(jArr, j, true, true)];
    }
}