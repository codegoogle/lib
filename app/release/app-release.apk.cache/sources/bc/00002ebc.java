package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzre implements zztq {
    public final zztq zza;
    public final /* synthetic */ zzrf zzb;
    private boolean zzc;

    public zzre(zzrf zzrfVar, zztq zztqVar) {
        this.zzb = zzrfVar;
        this.zza = zztqVar;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zzizVar, zzgb zzgbVar, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgbVar.zzc(4);
            return -4;
        }
        int zza = this.zza.zza(zzizVar, zzgbVar, i);
        if (zza == -5) {
            zzad zzadVar = zzizVar.zza;
            Objects.requireNonNull(zzadVar);
            int i2 = zzadVar.zzC;
            if (i2 == 0) {
                if (zzadVar.zzD != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzadVar.zzD : 0;
            zzab zzb = zzadVar.zzb();
            zzb.zzC(i2);
            zzb.zzD(i3);
            zzizVar.zza = zzb.zzY();
            return -5;
        }
        zzrf zzrfVar = this.zzb;
        long j = zzrfVar.zzb;
        if (j == Long.MIN_VALUE || ((zza != -4 || zzgbVar.zzd < j) && !(zza == -3 && zzrfVar.zzb() == Long.MIN_VALUE && !zzgbVar.zzc))) {
            return zza;
        }
        zzgbVar.zzb();
        zzgbVar.zzc(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}