package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzatj {
    private int zza;

    public final void zza(int i) {
        this.zza |= Integer.MIN_VALUE;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i) {
        this.zza = i;
    }

    public final boolean zzd(int i) {
        return (this.zza & i) == i;
    }

    public final boolean zze() {
        return zzd(Integer.MIN_VALUE);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }
}