package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbxc extends zzbme {
    public final /* synthetic */ zzbxf zza;

    public /* synthetic */ zzbxc(zzbxf zzbxfVar, zzbxb zzbxbVar) {
        this.zza = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblvVar, String str) {
        zzbxf zzbxfVar = this.zza;
        if (zzbxf.zzc(zzbxfVar) == null) {
            return;
        }
        zzbxf.zzc(zzbxfVar).onCustomClick(zzbxf.zze(zzbxfVar, zzblvVar), str);
    }
}