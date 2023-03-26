package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahc implements zzyg {
    private final zzee zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzahc(int i, zzee zzeeVar, int i2) {
        this.zzc = i;
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyf zza(zzys zzysVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzf = zzysVar.zzf();
        int min = (int) Math.min(112800L, zzysVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyl) zzysVar).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdyVar = this.zzb;
        int zzd = zzdyVar.zzd();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzdyVar.zza() >= 188 && (zza2 = (zza = zzaho.zza(zzdyVar.zzH(), zzdyVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzaho.zzb(zzdyVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzyf.zzd(zzb2, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + zzb2 > j) {
                    j2 = zzf + zza;
                } else {
                    j4 = zza;
                    j5 = zzb2;
                }
                return zzyf.zze(j2);
            }
            zzdyVar.zzF(zza2);
            j3 = zza2;
        }
        return j5 != -9223372036854775807L ? zzyf.zzf(j5, zzf + j3) : zzyf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zzb() {
        zzdy zzdyVar = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdyVar.zzD(bArr, 0);
    }
}