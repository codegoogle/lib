package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzaas {
    public final zzzy zza;

    public zzaas(zzzy zzzyVar) {
        this.zza = zzzyVar;
    }

    public abstract boolean zza(zzdy zzdyVar) throws zzbp;

    public abstract boolean zzb(zzdy zzdyVar, long j) throws zzbp;

    public final boolean zzf(zzdy zzdyVar, long j) throws zzbp {
        return zza(zzdyVar) && zzb(zzdyVar, j);
    }
}