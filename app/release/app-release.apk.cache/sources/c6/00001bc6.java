package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaew {
    public final zzaet zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaew(zzaet zzaetVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzcw.zzd(length == length2);
        int length3 = jArr.length;
        zzcw.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzcw.zzd(length4 == length2);
        this.zza = zzaetVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int zza(long j) {
        for (int zzd = zzeg.zzd(this.zzf, j, true, false); zzd >= 0; zzd--) {
            if ((this.zzg[zzd] & 1) != 0) {
                return zzd;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zzb = zzeg.zzb(this.zzf, j, true, false); zzb < this.zzf.length; zzb++) {
            if ((this.zzg[zzb] & 1) != 0) {
                return zzb;
            }
        }
        return -1;
    }
}