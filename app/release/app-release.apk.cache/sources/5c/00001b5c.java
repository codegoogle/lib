package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaay implements zzzu {
    public final /* synthetic */ zzzu zza;
    public final /* synthetic */ zzaaz zzb;

    public zzaay(zzaaz zzaazVar, zzzu zzzuVar) {
        this.zzb = zzaazVar;
        this.zza = zzzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        long j2;
        long j3;
        zzzs zzg = this.zza.zzg(j);
        zzzv zzzvVar = zzg.zza;
        long j4 = zzzvVar.zzb;
        long j5 = zzzvVar.zzc;
        j2 = this.zzb.zzb;
        zzzv zzzvVar2 = new zzzv(j4, j2 + j5);
        zzzv zzzvVar3 = zzg.zzb;
        long j6 = zzzvVar3.zzb;
        long j7 = zzzvVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzzs(zzzvVar2, new zzzv(j6, j3 + j7));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return this.zza.zzh();
    }
}