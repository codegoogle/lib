package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcr implements zzbbg {
    public final /* synthetic */ zzbcu zza;

    public zzbcr(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbg
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzbcu.zzh(this.zza);
        }
    }
}