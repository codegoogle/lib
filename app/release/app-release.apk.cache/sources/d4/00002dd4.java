package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzip implements zzjs {
    public final /* synthetic */ zziw zza;

    public zzip(zziw zziwVar) {
        this.zza = zziwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjs
    public final void zza(long j) {
        if (j >= 2000) {
            this.zza.zzD = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjs
    public final void zzb() {
        zzdg zzdgVar;
        zzdgVar = this.zza.zzh;
        zzdgVar.zzh(2);
    }
}