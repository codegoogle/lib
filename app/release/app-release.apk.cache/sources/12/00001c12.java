package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.g.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahr implements zzahs {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, WKSRecord.Service.CISCO_FNA, 143, 157, 173, 190, 209, 230, 253, a.aT, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzyu zzc;
    private final zzzy zzd;
    private final zzahv zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzdy zzh;
    private final int zzi;
    private final zzad zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzahr(zzyu zzyuVar, zzzy zzzyVar, zzahv zzahvVar) throws zzbp {
        this.zzc = zzyuVar;
        this.zzd = zzzyVar;
        this.zze = zzahvVar;
        int max = Math.max(1, zzahvVar.zzc / 10);
        this.zzi = max;
        zzdy zzdyVar = new zzdy(zzahvVar.zzf);
        zzdyVar.zzi();
        int zzi = zzdyVar.zzi();
        this.zzf = zzi;
        int i = zzahvVar.zzb;
        int i2 = (((zzahvVar.zzd - (i * 4)) * 8) / (zzahvVar.zze * i)) + 1;
        if (zzi == i2) {
            int zze = zzeg.zze(max, zzi);
            this.zzg = new byte[zzahvVar.zzd * zze];
            this.zzh = new zzdy((zzi + zzi) * i * zze);
            int i3 = ((zzahvVar.zzc * zzahvVar.zzd) * 8) / zzi;
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/raw");
            zzabVar.zzv(i3);
            zzabVar.zzO(i3);
            zzabVar.zzL((max + max) * i);
            zzabVar.zzw(zzahvVar.zzb);
            zzabVar.zzT(zzahvVar.zzc);
            zzabVar.zzN(2);
            this.zzj = zzabVar.zzY();
            return;
        }
        throw zzbp.zza("Expected frames per block: " + i2 + "; got: " + zzi, null);
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long j = this.zzl;
        long zzw = zzeg.zzw(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i);
        this.zzd.zzs(j + zzw, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i, long j) {
        this.zzc.zzL(new zzahy(this.zze, this.zzf, i, j));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzahs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzys zzysVar, long j) throws IOException {
        boolean z;
        int i;
        int zzd;
        int i2;
        int zze = zzeg.zze(this.zzi - zzd(this.zzm), this.zzf) * this.zze.zzd;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= zze) {
                    break;
                }
                int zza2 = zzysVar.zza(this.zzg, this.zzk, (int) Math.min(zze - i2, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / this.zze.zzd;
            if (i > 0) {
                byte[] bArr = this.zzg;
                zzdy zzdyVar = this.zzh;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = 0;
                    while (true) {
                        zzahv zzahvVar = this.zze;
                        int i5 = zzahvVar.zzb;
                        if (i4 < i5) {
                            byte[] zzH = zzdyVar.zzH();
                            int i6 = zzahvVar.zzd;
                            int i7 = (i4 * 4) + (i3 * i6);
                            int i8 = (i5 * 4) + i7;
                            int i9 = (short) (((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255));
                            int min = Math.min(bArr[i7 + 2] & 255, 88);
                            int i10 = zzb[min];
                            int i11 = (this.zzf * i3 * i5) + i4;
                            int i12 = i11 + i11;
                            zzH[i12] = (byte) (i9 & 255);
                            zzH[i12 + 1] = (byte) (i9 >> 8);
                            int i13 = 0;
                            for (int i14 = (i6 / i5) - 4; i13 < i14 + i14; i14 = i14) {
                                int i15 = bArr[((i13 / 2) % 4) + ((i13 / 8) * i5 * 4) + i8] & 255;
                                int i16 = i13 % 2 == 0 ? i15 & 15 : i15 >> 4;
                                int i17 = i16 & 7;
                                int i18 = (i17 + i17 + 1) * i10;
                                byte[] bArr2 = bArr;
                                int i19 = i18 >> 3;
                                if ((i16 & 8) != 0) {
                                    i19 = -i19;
                                }
                                i9 = zzeg.zzf(i9 + i19, -32768, 32767);
                                i12 += i5 + i5;
                                zzH[i12] = (byte) (i9 & 255);
                                zzH[i12 + 1] = (byte) (i9 >> 8);
                                min = zzeg.zzf(min + zza[i16], 0, 88);
                                i13++;
                                bArr = bArr2;
                                i10 = zzb[min];
                            }
                            i4++;
                        }
                    }
                }
                int zze2 = zze(this.zzf * i);
                zzdyVar.zzF(0);
                zzdyVar.zzE(zze2);
                this.zzk -= i * this.zze.zzd;
                zzdy zzdyVar2 = this.zzh;
                int zzd2 = zzdyVar2.zzd();
                zzzw.zzb(this.zzd, zzdyVar2, zzd2);
                int i20 = this.zzm + zzd2;
                this.zzm = i20;
                int zzd3 = zzd(i20);
                int i21 = this.zzi;
                if (zzd3 >= i21) {
                    zzf(i21);
                }
            }
            if (z && (zzd = zzd(this.zzm)) > 0) {
                zzf(zzd);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / this.zze.zzd;
        if (i > 0) {
        }
        if (z) {
            zzf(zzd);
        }
        return z;
    }
}