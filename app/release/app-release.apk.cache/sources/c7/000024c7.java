package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdmc implements zzbom {
    private final WeakReference zza;

    public /* synthetic */ zzdmc(zzdmh zzdmhVar, zzdmb zzdmbVar) {
        this.zza = new WeakReference(zzdmhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        zzdbr zzdbrVar;
        zzdje zzdjeVar;
        zzdmh zzdmhVar = (zzdmh) this.zza.get();
        if (zzdmhVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdbrVar = zzdmhVar.zzh;
            zzdbrVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                zzdjeVar = zzdmhVar.zzi;
                zzdjeVar.zzq();
            }
        }
    }
}