package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayf {
    public final zzaxq zza;
    public final zzayc zzb;
    public final Object zzc;
    public final zzasa[] zzd;

    public zzayf(zzaxq zzaxqVar, zzayc zzaycVar, Object obj, zzasa[] zzasaVarArr) {
        this.zza = zzaxqVar;
        this.zzb = zzaycVar;
        this.zzc = obj;
        this.zzd = zzasaVarArr;
    }

    public final boolean zza(zzayf zzayfVar, int i) {
        return zzayfVar != null && zzazo.zzo(this.zzb.zza(i), zzayfVar.zzb.zza(i)) && zzazo.zzo(this.zzd[i], zzayfVar.zzd[i]);
    }
}