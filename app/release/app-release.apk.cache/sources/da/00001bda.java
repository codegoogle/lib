package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafp implements zzyr {
    public static final zzyy zza = zzafo.zza;
    private final zzafq zzb = new zzafq(null);
    private final zzdy zzc = new zzdy(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        int zza2 = zzysVar.zza(this.zzc.zzH(), 0, 2786);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzb.zzb(zzyuVar, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyuVar.zzB();
        zzyuVar.zzL(new zzzt(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.zzj();
        r5 = r5 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzys zzysVar) throws IOException {
        zzdy zzdyVar = new zzdy(10);
        int i = 0;
        while (true) {
            zzyl zzylVar = (zzyl) zzysVar;
            zzylVar.zzm(zzdyVar.zzH(), 0, 10, false);
            zzdyVar.zzF(0);
            if (zzdyVar.zzm() != 4801587) {
                break;
            }
            zzdyVar.zzG(3);
            int zzj = zzdyVar.zzj();
            i += zzj + 10;
            zzylVar.zzl(zzj, false);
        }
        zzysVar.zzj();
        zzyl zzylVar2 = (zzyl) zzysVar;
        zzylVar2.zzl(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzylVar2.zzm(zzdyVar.zzH(), 0, 6, false);
                zzdyVar.zzF(0);
                if (zzdyVar.zzo() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int zzb = zzxw.zzb(zzdyVar.zzH());
                if (zzb == -1) {
                    return false;
                }
                zzylVar2.zzl(zzb - 6, false);
            }
            zzylVar2.zzl(i2, false);
        }
    }
}