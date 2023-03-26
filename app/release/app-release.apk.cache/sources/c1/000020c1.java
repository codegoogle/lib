package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzca {
    public static final zzl zza = zzbz.zza;
    @z1
    public final Object zzb;
    public final int zzc;
    @z1
    public final zzbb zzd;
    @z1
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    public zzca(@z1 Object obj, int i, @z1 zzbb zzbbVar, @z1 Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzb = obj;
        this.zzc = i;
        this.zzd = zzbbVar;
        this.zze = obj2;
        this.zzf = i2;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = i3;
        this.zzj = i4;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzca.class == obj.getClass()) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc == zzcaVar.zzc && this.zzf == zzcaVar.zzf && this.zzg == zzcaVar.zzg && this.zzh == zzcaVar.zzh && this.zzi == zzcaVar.zzi && this.zzj == zzcaVar.zzj && zzfoq.zza(this.zzb, zzcaVar.zzb) && zzfoq.zza(this.zze, zzcaVar.zze) && zzfoq.zza(this.zzd, zzcaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}