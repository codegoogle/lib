package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahu implements zzyr {
    public static final zzyy zza = zzahq.zza;
    private zzyu zzb;
    private zzzy zzc;
    private zzahs zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        int zzn;
        zzcw.zzb(this.zzc);
        int i = zzeg.zza;
        int i2 = this.zzd;
        if (i2 == 0) {
            zzcw.zzf(zzysVar.zzf() == 0);
            int i3 = this.zzg;
            if (i3 != -1) {
                ((zzyl) zzysVar).zzo(i3, false);
                this.zzd = 4;
            } else if (zzahx.zzc(zzysVar)) {
                ((zzyl) zzysVar).zzo((int) (zzysVar.zze() - zzysVar.zzf()), false);
                this.zzd = 1;
            } else {
                throw zzbp.zza("Unsupported or unrecognized wav file type.", null);
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            zzdy zzdyVar = new zzdy(8);
            zzahw zza2 = zzahw.zza(zzysVar, zzdyVar);
            if (zza2.zza != 1685272116) {
                zzysVar.zzj();
            } else {
                zzyl zzylVar = (zzyl) zzysVar;
                zzylVar.zzl(8, false);
                zzdyVar.zzF(0);
                zzylVar.zzm(zzdyVar.zzH(), 0, 8, false);
                j = zzdyVar.zzp();
                zzylVar.zzo(((int) zza2.zzb) + 8, false);
            }
            this.zze = j;
            this.zzd = 2;
            return 0;
        } else if (i2 != 2) {
            if (i2 != 3) {
                zzcw.zzf(this.zzh != -1);
                zzahs zzahsVar = this.zzf;
                Objects.requireNonNull(zzahsVar);
                return zzahsVar.zzc(zzysVar, this.zzh - zzysVar.zzf()) ? -1 : 0;
            }
            Pair zza3 = zzahx.zza(zzysVar);
            this.zzg = ((Long) zza3.first).intValue();
            long longValue = ((Long) zza3.second).longValue();
            long j2 = this.zze;
            if (j2 != -1 && longValue == 4294967295L) {
                longValue = j2;
            }
            long j3 = this.zzg + longValue;
            this.zzh = j3;
            long zzd = zzysVar.zzd();
            if (zzd != -1 && j3 > zzd) {
                this.zzh = zzd;
                j3 = zzd;
            }
            zzahs zzahsVar2 = this.zzf;
            Objects.requireNonNull(zzahsVar2);
            zzahsVar2.zza(this.zzg, j3);
            this.zzd = 4;
            return 0;
        } else {
            zzahv zzb = zzahx.zzb(zzysVar);
            int i4 = zzb.zza;
            if (i4 == 17) {
                this.zzf = new zzahr(this.zzb, this.zzc, zzb);
            } else if (i4 == 6) {
                this.zzf = new zzaht(this.zzb, this.zzc, zzb, "audio/g711-alaw", -1);
            } else if (i4 == 7) {
                this.zzf = new zzaht(this.zzb, this.zzc, zzb, "audio/g711-mlaw", -1);
            } else {
                int i5 = zzb.zze;
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i5 == 32) {
                            zzn = 4;
                            if (zzn != 0) {
                                this.zzf = new zzaht(this.zzb, this.zzc, zzb, "audio/raw", zzn);
                            } else {
                                throw zzbp.zzc("Unsupported WAV format type: " + i4);
                            }
                        }
                    }
                    zzn = 0;
                    if (zzn != 0) {
                    }
                }
                zzn = zzeg.zzn(i5);
                if (zzn != 0) {
                }
            }
            this.zzd = 3;
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzb = zzyuVar;
        this.zzc = zzyuVar.zzv(0, 1);
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzahs zzahsVar = this.zzf;
        if (zzahsVar != null) {
            zzahsVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzahx.zzc(zzysVar);
    }
}