package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnd extends zzbme {
    public final /* synthetic */ zzbng zza;

    public /* synthetic */ zzbnd(zzbng zzbngVar, zzbnc zzbncVar) {
        this.zza = zzbngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblvVar, String str) {
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomTemplateAd zzf;
        zzbng zzbngVar = this.zza;
        onCustomClickListener = zzbngVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbngVar.zzb;
        zzf = zzbngVar.zzf(zzblvVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}