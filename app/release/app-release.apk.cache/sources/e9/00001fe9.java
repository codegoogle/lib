package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsa implements Runnable {
    public final /* synthetic */ zzbsl zza;
    public final /* synthetic */ zzbrh zzb;
    public final /* synthetic */ zzbsm zzc;

    public zzbsa(zzbsm zzbsmVar, zzbsl zzbslVar, zzbrh zzbrhVar) {
        this.zzc = zzbsmVar;
        this.zza = zzbslVar;
        this.zzb = zzbrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfvm zzfvmVar = zzcfv.zze;
                final zzbrh zzbrhVar = this.zzb;
                zzfvmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbrh.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}