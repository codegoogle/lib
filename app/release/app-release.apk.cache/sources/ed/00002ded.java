package com.google.android.gms.internal.ads;

import com.p7700g.p99005.u0;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjn {
    private static final zzsa zzt = new zzsa(new Object());
    public final zzci zza;
    public final zzsa zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    @z1
    public final zzgt zzf;
    public final boolean zzg;
    public final zzty zzh;
    public final zzvn zzi;
    public final List zzj;
    public final zzsa zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzbt zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzjn(zzci zzciVar, zzsa zzsaVar, long j, long j2, int i, @z1 zzgt zzgtVar, boolean z, zzty zztyVar, zzvn zzvnVar, List list, zzsa zzsaVar2, boolean z2, int i2, zzbt zzbtVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.zza = zzciVar;
        this.zzb = zzsaVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzgtVar;
        this.zzg = z;
        this.zzh = zztyVar;
        this.zzi = zzvnVar;
        this.zzj = list;
        this.zzk = zzsaVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzbtVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzo = z3;
        this.zzp = z4;
    }

    public static zzjn zzh(zzvn zzvnVar) {
        zzci zzciVar = zzci.zza;
        zzsa zzsaVar = zzt;
        return new zzjn(zzciVar, zzsaVar, -9223372036854775807L, 0L, 1, null, false, zzty.zza, zzvnVar, zzfrj.zzo(), zzsaVar, false, 0, zzbt.zza, 0L, 0L, 0L, false, false);
    }

    public static zzsa zzi() {
        return zzt;
    }

    @u0
    public final zzjn zza(zzsa zzsaVar) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsaVar, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    @u0
    public final zzjn zzb(zzsa zzsaVar, long j, long j2, long j3, long j4, zzty zztyVar, zzvn zzvnVar, List list) {
        return new zzjn(this.zza, zzsaVar, j2, j3, this.zze, this.zzf, this.zzg, zztyVar, zzvnVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j4, j, this.zzo, this.zzp);
    }

    @u0
    public final zzjn zzc(boolean z) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z, this.zzp);
    }

    @u0
    public final zzjn zzd(boolean z, int i) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    @u0
    public final zzjn zze(@z1 zzgt zzgtVar) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgtVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    @u0
    public final zzjn zzf(int i) {
        return new zzjn(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    @u0
    public final zzjn zzg(zzci zzciVar) {
        return new zzjn(zzciVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }
}