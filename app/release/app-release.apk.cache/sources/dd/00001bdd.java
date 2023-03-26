package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafs implements zzyr {
    public static final zzyy zza = zzafr.zza;
    private final zzaft zzb = new zzaft(null);
    private final zzdy zzc = new zzdy(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        int zza2 = zzysVar.zza(this.zzc.zzH(), 0, 16384);
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
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzys zzysVar) throws IOException {
        int i;
        zzdy zzdyVar = new zzdy(10);
        int i2 = 0;
        while (true) {
            zzyl zzylVar = (zzyl) zzysVar;
            zzylVar.zzm(zzdyVar.zzH(), 0, 10, false);
            zzdyVar.zzF(0);
            if (zzdyVar.zzm() != 4801587) {
                break;
            }
            zzdyVar.zzG(3);
            int zzj = zzdyVar.zzj();
            i2 += zzj + 10;
            zzylVar.zzl(zzj, false);
        }
        zzysVar.zzj();
        zzyl zzylVar2 = (zzyl) zzysVar;
        zzylVar2.zzl(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzylVar2.zzm(zzdyVar.zzH(), 0, 7, false);
                zzdyVar.zzF(0);
                int zzo = zzdyVar.zzo();
                if (zzo != 44096 && zzo != 44097) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] zzH = zzdyVar.zzH();
                int i6 = zzxz.zza;
                if (zzH.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzH[2] & 255) << 8) | (zzH[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzH[4] & 255) << 16) | ((zzH[5] & 255) << 8) | (zzH[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzo == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzylVar2.zzl(i - 7, false);
            }
            zzylVar2.zzl(i3, false);
        }
    }
}