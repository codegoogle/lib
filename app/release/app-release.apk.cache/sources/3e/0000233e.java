package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxp {
    private final zzdei zza;
    @z1
    private final zzdgo zzb;

    public zzcxp(zzdei zzdeiVar, @z1 zzdgo zzdgoVar) {
        this.zza = zzdeiVar;
        this.zzb = zzdgoVar;
    }

    public final zzdei zza() {
        return this.zza;
    }

    @z1
    public final zzdgo zzb() {
        return this.zzb;
    }

    public final zzdiz zzc() {
        zzdgo zzdgoVar = this.zzb;
        return zzdgoVar != null ? new zzdiz(zzdgoVar, zzcfv.zzf) : new zzdiz(new zzcxo(this), zzcfv.zzf);
    }
}