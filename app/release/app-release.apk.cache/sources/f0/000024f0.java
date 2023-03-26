package com.google.android.gms.internal.ads;

import com.p7700g.p99005.y7;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdnq {
    public zzbmc zza;
    public zzblz zzb;
    public zzbmp zzc;
    public zzbmm zzd;
    public zzbrb zze;
    public final y7 zzf = new y7();
    public final y7 zzg = new y7();

    public final zzdnq zza(zzblz zzblzVar) {
        this.zzb = zzblzVar;
        return this;
    }

    public final zzdnq zzb(zzbmc zzbmcVar) {
        this.zza = zzbmcVar;
        return this;
    }

    public final zzdnq zzc(String str, zzbmi zzbmiVar, @z1 zzbmf zzbmfVar) {
        this.zzf.put(str, zzbmiVar);
        if (zzbmfVar != null) {
            this.zzg.put(str, zzbmfVar);
        }
        return this;
    }

    public final zzdnq zzd(zzbrb zzbrbVar) {
        this.zze = zzbrbVar;
        return this;
    }

    public final zzdnq zze(zzbmm zzbmmVar) {
        this.zzd = zzbmmVar;
        return this;
    }

    public final zzdnq zzf(zzbmp zzbmpVar) {
        this.zzc = zzbmpVar;
        return this;
    }

    public final zzdns zzg() {
        return new zzdns(this);
    }
}