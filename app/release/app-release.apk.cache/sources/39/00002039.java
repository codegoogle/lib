package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbv {
    private final zzw zza = new zzw();

    public final zzbv zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzbv zzb(zzbx zzbxVar) {
        zzy zzyVar;
        zzw zzwVar = this.zza;
        zzyVar = zzbxVar.zzc;
        for (int i = 0; i < zzyVar.zzb(); i++) {
            zzwVar.zza(zzyVar.zza(i));
        }
        return this;
    }

    public final zzbv zzc(int... iArr) {
        zzw zzwVar = this.zza;
        for (int i = 0; i < 20; i++) {
            zzwVar.zza(iArr[i]);
        }
        return this;
    }

    public final zzbv zzd(int i, boolean z) {
        zzw zzwVar = this.zza;
        if (z) {
            zzwVar.zza(i);
        }
        return this;
    }

    public final zzbx zze() {
        return new zzbx(this.zza.zzb(), null);
    }
}