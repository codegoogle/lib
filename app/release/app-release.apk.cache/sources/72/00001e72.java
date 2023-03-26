package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbed extends zzgkm implements zzgmb {
    private zzbed() {
        super(zzbee.zzc());
    }

    public final zzbed zza(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbee.zze((zzbee) this.zza, z);
        return this;
    }

    public final zzbed zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbee.zzf((zzbee) this.zza, i);
        return this;
    }

    public /* synthetic */ zzbed(zzbdt zzbdtVar) {
        super(zzbee.zzc());
    }
}