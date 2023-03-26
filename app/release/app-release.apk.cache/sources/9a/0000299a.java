package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzffu implements zzfuy {
    public final /* synthetic */ zzffk zza;
    public final /* synthetic */ zzffw zzb;

    public zzffu(zzffw zzffwVar, zzffk zzffkVar) {
        this.zzb = zzffwVar;
        this.zza = zzffkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzffy zzffyVar;
        zzffyVar = this.zzb.zza.zzd;
        zzffyVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object obj) {
        zzffy zzffyVar;
        zzffyVar = this.zzb.zza.zzd;
        zzffyVar.zzd(this.zza);
    }
}