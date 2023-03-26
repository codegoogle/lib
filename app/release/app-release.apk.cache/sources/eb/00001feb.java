package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsc implements zzcgc {
    public final /* synthetic */ zzbsl zza;
    public final /* synthetic */ zzfhh zzb;
    public final /* synthetic */ zzbsm zzc;

    public zzbsc(zzbsm zzbsmVar, zzbsl zzbslVar, zzfhh zzfhhVar) {
        this.zzc = zzbsmVar;
        this.zza = zzbslVar;
        this.zzb = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zza() {
        Object obj;
        zzfhu zzfhuVar;
        zzfhu zzfhuVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
                zzbsm zzbsmVar = this.zzc;
                zzfhuVar = zzbsmVar.zze;
                if (zzfhuVar != null) {
                    zzfhuVar2 = zzbsmVar.zze;
                    zzfhh zzfhhVar = this.zzb;
                    zzfhhVar.zze(false);
                    zzfhuVar2.zzb(zzfhhVar.zzj());
                }
            }
        }
    }
}