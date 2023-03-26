package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaez implements zzafg {
    private final zzaff zza;
    private final long zzb;
    private final long zzc;
    private final zzafl zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaez(zzafl zzaflVar, long j, long j2, long j3, long j4, boolean z) {
        zzcw.zzd(j >= 0 && j2 > j);
        this.zzd = zzaflVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 != j2 - j && !z) {
            this.zze = 0;
        } else {
            this.zzf = j4;
            this.zze = 4;
        }
        this.zza = new zzaff();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzafg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzys zzysVar) throws IOException {
        long zzr;
        int i = this.zze;
        long j = -1;
        if (i == 0) {
            long zzf = zzysVar.zzf();
            this.zzg = zzf;
            this.zze = 1;
            long j2 = this.zzc - 65307;
            if (j2 > zzf) {
                return j2;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j3 = this.zzi;
                long j4 = this.zzj;
                if (j3 != j4) {
                    long zzf2 = zzysVar.zzf();
                    if (this.zza.zzc(zzysVar, j4)) {
                        this.zza.zzb(zzysVar, false);
                        zzysVar.zzj();
                        long j5 = this.zzh;
                        zzaff zzaffVar = this.zza;
                        long j6 = zzaffVar.zzb;
                        long j7 = j5 - j6;
                        int i2 = zzaffVar.zzd + zzaffVar.zze;
                        int i3 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
                        if (i3 < 0 || j7 >= 72000) {
                            if (i3 < 0) {
                                this.zzj = zzf2;
                                this.zzl = j6;
                            } else {
                                this.zzi = zzysVar.zzf() + i2;
                                this.zzk = j6;
                            }
                            long j8 = this.zzj;
                            long j9 = this.zzi;
                            long j10 = j8 - j9;
                            if (j10 < 100000) {
                                this.zzj = j9;
                                zzr = j9;
                            } else {
                                j = -1;
                                zzr = zzeg.zzr(((j7 * j10) / (this.zzl - this.zzk)) + (zzysVar.zzf() - (i2 * (i3 <= 0 ? 2L : 1L))), j9, j8 - 1);
                            }
                        }
                    } else {
                        zzr = this.zzi;
                        if (zzr == zzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (zzr == j) {
                        return zzr;
                    }
                    this.zze = 3;
                }
                zzr = -1;
                if (zzr == j) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzysVar, j);
                this.zza.zzb(zzysVar, false);
                zzaff zzaffVar2 = this.zza;
                if (zzaffVar2.zzb > this.zzh) {
                    zzysVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzyl) zzysVar).zzo(zzaffVar2.zzd + zzaffVar2.zze, false);
                this.zzi = zzysVar.zzf();
                this.zzk = this.zza.zzb;
                j = -1;
            }
        }
        this.zza.zza();
        if (this.zza.zzc(zzysVar, -1L)) {
            this.zza.zzb(zzysVar, false);
            zzaff zzaffVar3 = this.zza;
            ((zzyl) zzysVar).zzo(zzaffVar3.zzd + zzaffVar3.zze, false);
            long j11 = this.zza.zzb;
            while (true) {
                zzaff zzaffVar4 = this.zza;
                if ((zzaffVar4.zza & 4) == 4 || !zzaffVar4.zzc(zzysVar, -1L) || zzysVar.zzf() >= this.zzc || !this.zza.zzb(zzysVar, true)) {
                    break;
                }
                zzaff zzaffVar5 = this.zza;
                if (!zzyv.zze(zzysVar, zzaffVar5.zzd + zzaffVar5.zze)) {
                    break;
                }
                j11 = this.zza.zzb;
            }
            this.zzf = j11;
            this.zze = 4;
            return this.zzg;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    @z1
    public final /* bridge */ /* synthetic */ zzzu zze() {
        if (this.zzf != 0) {
            return new zzaey(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final void zzg(long j) {
        this.zzh = zzeg.zzr(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}