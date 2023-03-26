package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzafl {
    private zzzy zzb;
    private zzyu zzc;
    private zzafg zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzafe zza = new zzafe();
    private zzafi zzj = new zzafi();

    public abstract long zza(zzdy zzdyVar);

    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzafi();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) throws IOException;

    public final int zze(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzb);
        int i = zzeg.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzysVar)) {
                long zzf = zzysVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzad zzadVar = this.zzj.zza;
                    this.zzi = zzadVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzadVar);
                        this.zzm = true;
                    }
                    zzafg zzafgVar = this.zzj.zzb;
                    if (zzafgVar != null) {
                        this.zzd = zzafgVar;
                    } else if (zzysVar.zzd() == -1) {
                        this.zzd = new zzafk(null);
                    } else {
                        zzaff zzb = this.zza.zzb();
                        this.zzd = new zzaez(this, this.zzf, zzysVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzysVar.zzf();
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzyl) zzysVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd = this.zzd.zzd(zzysVar);
            if (zzd >= 0) {
                zzzrVar.zza = zzd;
                return 1;
            }
            if (zzd < -1) {
                zzi(-(zzd + 2));
            }
            if (!this.zzl) {
                zzzu zze = this.zzd.zze();
                zzcw.zzb(zze);
                this.zzc.zzL(zze);
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zze(zzysVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzdy zza = this.zza.zza();
            long zza2 = zza(zza);
            if (zza2 >= 0) {
                long j2 = this.zzg;
                if (j2 + zza2 >= this.zze) {
                    long zzf2 = zzf(j2);
                    zzzw.zzb(this.zzb, zza, zza.zzd());
                    this.zzb.zzs(zzf2, 1, zza.zzd(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zza2;
            return 0;
        }
    }

    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    public final void zzh(zzyu zzyuVar, zzzy zzzyVar) {
        this.zzc = zzyuVar;
        this.zzb = zzzyVar;
        zzb(true);
    }

    public void zzi(long j) {
        this.zzg = j;
    }

    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j2);
            this.zze = zzg;
            zzafg zzafgVar = this.zzd;
            int i = zzeg.zza;
            zzafgVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}