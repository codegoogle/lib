package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbef extends zzgkm implements zzgmb {
    private zzbef() {
        super(zzbeg.zzc());
    }

    public final zzbef zza(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbeg.zzd((zzbeg) this.zza, z);
        return this;
    }

    public final zzbef zzb(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbeg.zze((zzbeg) this.zza, z);
        return this;
    }

    public final zzbef zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbeg.zzf((zzbeg) this.zza, i);
        return this;
    }

    public /* synthetic */ zzbef(zzbdt zzbdtVar) {
        super(zzbeg.zzc());
    }
}