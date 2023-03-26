package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahy implements zzzu {
    private final zzahv zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzahy(zzahv zzahvVar, int i, long j, long j2) {
        this.zza = zzahvVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzahvVar.zzd;
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzeg.zzw(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        long zzr = zzeg.zzr((this.zza.zzc * j) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j2 = this.zzc;
        int i = this.zza.zzd;
        long zza = zza(zzr);
        zzzv zzzvVar = new zzzv(zza, (i * zzr) + j2);
        if (zza < j && zzr != this.zzd - 1) {
            long j3 = zzr + 1;
            return new zzzs(zzzvVar, new zzzv(zza(j3), (j3 * this.zza.zzd) + this.zzc));
        }
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}