package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbhg extends zzgkm implements zzgmb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzbhg() {
        super(r0);
        zzbhh zzbhhVar;
        zzbhhVar = zzbhh.zzb;
    }

    public final zzbhg zza(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbhh.zzd((zzbhh) this.zza, z);
        return this;
    }

    public final zzbhg zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbhh.zze((zzbhh) this.zza, i);
        return this;
    }

    public final boolean zzc() {
        return ((zzbhh) this.zza).zzf();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzbhg(zzbdt zzbdtVar) {
        super(r1);
        zzbhh zzbhhVar;
        zzbhhVar = zzbhh.zzb;
    }
}