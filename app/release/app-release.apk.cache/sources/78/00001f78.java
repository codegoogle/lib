package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbnw implements zzbom {
    public static final /* synthetic */ zzbnw zza = new zzbnw();

    private /* synthetic */ zzbnw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        zzcmj zzcmjVar = (zzcmj) obj;
        zzbom zzbomVar = zzbol.zza;
        String str = (String) map.get("u");
        if (str == null) {
            zzcfi.zzj("URL missing from httpTrack GMSG.");
        } else {
            new com.google.android.gms.ads.internal.util.zzby(zzcmjVar.getContext(), ((zzcmr) zzcmjVar).zzp().zza, str).zzb();
        }
    }
}