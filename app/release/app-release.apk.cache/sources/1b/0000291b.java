package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbb implements zzemw {
    public final /* synthetic */ zzfbc zza;

    public zzfbb(zzfbc zzfbcVar) {
        this.zza = zzfbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdst zzdstVar;
        zzdst zzdstVar2 = (zzdst) obj;
        synchronized (this.zza) {
            this.zza.zzg = zzdstVar2;
            zzdstVar = this.zza.zzg;
            zzdstVar.zzW();
        }
    }
}