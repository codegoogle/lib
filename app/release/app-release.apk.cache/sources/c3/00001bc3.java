package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaet {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzad zzf;
    public final int zzg;
    @z1
    public final long[] zzh;
    @z1
    public final long[] zzi;
    public final int zzj;
    @z1
    private final zzaeu[] zzk;

    public zzaet(int i, int i2, long j, long j2, long j3, zzad zzadVar, int i3, @z1 zzaeu[] zzaeuVarArr, int i4, @z1 long[] jArr, @z1 long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzadVar;
        this.zzg = i3;
        this.zzk = zzaeuVarArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    @z1
    public final zzaeu zza(int i) {
        zzaeu[] zzaeuVarArr = this.zzk;
        if (zzaeuVarArr == null) {
            return null;
        }
        return zzaeuVarArr[i];
    }
}