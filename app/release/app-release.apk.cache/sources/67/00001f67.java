package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnf extends zzbmh {
    public final /* synthetic */ zzbng zza;

    public /* synthetic */ zzbnf(zzbng zzbngVar, zzbne zzbneVar) {
        this.zza = zzbngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zze(zzblv zzblvVar) {
        zzbng zzbngVar = this.zza;
        zzbng.zzb(zzbngVar).onCustomTemplateAdLoaded(zzbng.zzc(zzbngVar, zzblvVar));
    }
}