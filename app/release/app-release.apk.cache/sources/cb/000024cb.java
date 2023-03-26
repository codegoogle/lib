package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdmg implements zzbom {
    private final WeakReference zza;

    public /* synthetic */ zzdmg(zzdmh zzdmhVar, zzdmf zzdmfVar) {
        this.zza = new WeakReference(zzdmhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        zzdmh zzdmhVar = (zzdmh) this.zza.get();
        if (zzdmhVar == null) {
            return;
        }
        zzdmh.zzb(zzdmhVar).zza();
    }
}