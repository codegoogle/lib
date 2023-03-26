package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcf {
    public static final zzl zza = zzce.zza;
    @z1
    public Object zzb;
    @z1
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzh = zzd.zza;

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcf.class.equals(obj.getClass())) {
            zzcf zzcfVar = (zzcf) obj;
            if (zzeg.zzS(this.zzb, zzcfVar.zzb) && zzeg.zzS(this.zzc, zzcfVar.zzc) && this.zzd == zzcfVar.zzd && this.zze == zzcfVar.zze && this.zzg == zzcfVar.zzg && zzeg.zzS(this.zzh, zzcfVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzc;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.zzd;
        long j = this.zze;
        return this.zzh.hashCode() + ((((((((hashCode + hashCode2) * 31) + i) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.zzg ? 1 : 0)) * 31);
    }

    public final int zza(int i) {
        return this.zzh.zza(i).zzc;
    }

    public final int zzb() {
        int i = this.zzh.zzc;
        return 0;
    }

    public final int zzc(long j) {
        long j2 = this.zze;
        if (j == Long.MIN_VALUE || j2 == -9223372036854775807L) {
            return -1;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        return -1;
    }

    public final int zzd(long j) {
        return -1;
    }

    public final int zze(int i) {
        return this.zzh.zza(i).zza(-1);
    }

    public final int zzf(int i, int i2) {
        return this.zzh.zza(i).zza(i2);
    }

    public final long zzg(int i, int i2) {
        zzc zza2 = this.zzh.zza(i);
        if (zza2.zzc != -1) {
            return zza2.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i) {
        long j = this.zzh.zza(i).zzb;
        return 0L;
    }

    public final long zzi() {
        long j = this.zzh.zzd;
        return 0L;
    }

    public final long zzj(int i) {
        long j = this.zzh.zza(i).zzg;
        return 0L;
    }

    public final zzcf zzk(@z1 Object obj, @z1 Object obj2, int i, long j, long j2, zzd zzdVar, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j;
        this.zzf = 0L;
        this.zzh = zzdVar;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int i) {
        boolean z = this.zzh.zza(i).zzh;
        return false;
    }
}