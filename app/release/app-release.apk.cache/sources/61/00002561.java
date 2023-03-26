package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdrv implements zzfuy {
    public final /* synthetic */ String zza = "sendMessageToNativeJs";
    public final /* synthetic */ Map zzb;

    public zzdrv(zzdse zzdseVar, String str, Map map) {
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcli) obj).zzd(this.zza, this.zzb);
    }
}