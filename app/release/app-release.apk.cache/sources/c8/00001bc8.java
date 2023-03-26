package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaey implements zzzu {
    public final /* synthetic */ zzaez zza;

    public /* synthetic */ zzaey(zzaez zzaezVar, zzaex zzaexVar) {
        this.zza = zzaezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        zzafl zzaflVar;
        long j;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        j = zzaezVar.zzf;
        return zzaflVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        zzafl zzaflVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaez zzaezVar = this.zza;
        zzaflVar = zzaezVar.zzd;
        long zzg = zzaflVar.zzg(j);
        j2 = zzaezVar.zzb;
        j3 = zzaezVar.zzc;
        j4 = zzaezVar.zzb;
        j5 = zzaezVar.zzf;
        long j8 = ((j3 - j4) * zzg) / j5;
        j6 = zzaezVar.zzb;
        j7 = zzaezVar.zzc;
        zzzv zzzvVar = new zzzv(j, zzeg.zzr((j2 + j8) - 30000, j6, j7 - 1));
        return new zzzs(zzzvVar, zzzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }
}