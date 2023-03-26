package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbg implements zzemw {
    public final /* synthetic */ zzfbi zza;

    public zzfbg(zzfbi zzfbiVar) {
        this.zza = zzfbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdst zzdstVar;
        zzdst zzdstVar2 = (zzdst) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdstVar2;
            zzdstVar = this.zza.zzd;
            zzdstVar.zzW();
        }
    }
}