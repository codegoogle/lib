package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzch {
    public static final zzl zzb;
    private static final zzbb zzr;
    public Object zzc = zza;
    public zzbb zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    @z1
    public zzau zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;
    public static final Object zza = new Object();
    private static final Object zzq = new Object();

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("androidx.media3.common.Timeline");
        zzahVar.zzb(Uri.EMPTY);
        zzr = zzahVar.zzc();
        zzb = zzcg.zza;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzch.class.equals(obj.getClass())) {
            zzch zzchVar = (zzch) obj;
            if (zzeg.zzS(this.zzc, zzchVar.zzc) && zzeg.zzS(this.zzd, zzchVar.zzd) && zzeg.zzS(null, null) && zzeg.zzS(this.zzk, zzchVar.zzk) && this.zze == zzchVar.zze && this.zzf == zzchVar.zzf && this.zzg == zzchVar.zzg && this.zzh == zzchVar.zzh && this.zzi == zzchVar.zzi && this.zzl == zzchVar.zzl && this.zzn == zzchVar.zzn && this.zzo == zzchVar.zzo && this.zzp == zzchVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zzd.hashCode() + ((this.zzc.hashCode() + 217) * 31)) * 961;
        zzau zzauVar = this.zzk;
        int hashCode2 = zzauVar == null ? 0 : zzauVar.hashCode();
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        boolean z3 = this.zzl;
        long j4 = this.zzn;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzch zza(Object obj, @z1 zzbb zzbbVar, @z1 Object obj2, long j, long j2, long j3, boolean z, boolean z2, @z1 zzau zzauVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zzd = zzbbVar != null ? zzbbVar : zzr;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzauVar != null;
        this.zzk = zzauVar;
        this.zzm = 0L;
        this.zzn = j5;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzcw.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}