package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p7700g.p99005.z1;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzyh {
    public final zzyb zza;
    public final zzyg zzb;
    @z1
    public zzyd zzc;
    private final int zzd;

    public zzyh(zzye zzyeVar, zzyg zzygVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzygVar;
        this.zzd = i;
        this.zza = new zzyb(zzyeVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int zzf(zzys zzysVar, long j, zzzr zzzrVar) {
        if (j == zzysVar.zzf()) {
            return 0;
        }
        zzzrVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzys zzysVar, long j) throws IOException {
        long zzf = j - zzysVar.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.K) {
            return false;
        }
        ((zzyl) zzysVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzyd zzydVar = this.zzc;
            zzcw.zzb(zzydVar);
            j = zzydVar.zzf;
            j2 = zzydVar.zzg;
            j3 = zzydVar.zzh;
            if (j2 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzysVar, j, zzzrVar);
            } else if (!zzg(zzysVar, j3)) {
                return zzf(zzysVar, j3, zzzrVar);
            } else {
                zzysVar.zzj();
                zzyg zzygVar = this.zzb;
                j4 = zzydVar.zzb;
                zzyf zza = zzygVar.zza(zzysVar, j4);
                i = zza.zzb;
                if (i == -3) {
                    zzc(false, j3);
                    return zzf(zzysVar, j3, zzzrVar);
                } else if (i == -2) {
                    j10 = zza.zzc;
                    j11 = zza.zzd;
                    zzyd.zzh(zzydVar, j10, j11);
                } else if (i != -1) {
                    j5 = zza.zzd;
                    zzg(zzysVar, j5);
                    j6 = zza.zzd;
                    zzc(true, j6);
                    j7 = zza.zzd;
                    return zzf(zzysVar, j7, zzzrVar);
                } else {
                    j8 = zza.zzc;
                    j9 = zza.zzd;
                    zzyd.zzg(zzydVar, j8, j9);
                }
            }
        }
    }

    public final zzzu zzb() {
        return this.zza;
    }

    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzyd zzydVar = this.zzc;
        if (zzydVar != null) {
            j6 = zzydVar.zza;
            if (j6 == j) {
                return;
            }
        }
        long zzf = this.zza.zzf(j);
        zzyb zzybVar = this.zza;
        j2 = zzybVar.zzc;
        j3 = zzybVar.zzd;
        j4 = zzybVar.zze;
        j5 = zzybVar.zzf;
        this.zzc = new zzyd(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}