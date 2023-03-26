package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaht implements zzahs {
    private final zzyu zza;
    private final zzzy zzb;
    private final zzahv zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaht(zzyu zzyuVar, zzzy zzzyVar, zzahv zzahvVar, String str, int i) throws zzbp {
        this.zza = zzyuVar;
        this.zzb = zzzyVar;
        this.zzc = zzahvVar;
        int i2 = (zzahvVar.zzb * zzahvVar.zze) / 8;
        int i3 = zzahvVar.zzd;
        if (i3 == i2) {
            int i4 = zzahvVar.zzc * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.zze = max;
            zzab zzabVar = new zzab();
            zzabVar.zzS(str);
            zzabVar.zzv(i5);
            zzabVar.zzO(i5);
            zzabVar.zzL(max);
            zzabVar.zzw(zzahvVar.zzb);
            zzabVar.zzT(zzahvVar.zzc);
            zzabVar.zzN(i);
            this.zzd = zzabVar.zzY();
            return;
        }
        throw zzbp.zza("Expected block size: " + i2 + "; got: " + i3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i, long j) {
        this.zza.zzL(new zzahy(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final boolean zzc(zzys zzysVar, long j) throws IOException {
        int i;
        zzahv zzahvVar;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                break;
            }
            int zza = zzzw.zza(this.zzb, zzysVar, (int) Math.min(i3 - i2, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        int i4 = this.zzc.zzd;
        int i5 = this.zzg / i4;
        if (i5 > 0) {
            long j3 = this.zzf;
            long zzw = zzeg.zzw(this.zzh, 1000000L, zzahvVar.zzc);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzs(j3 + zzw, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return i <= 0;
    }
}