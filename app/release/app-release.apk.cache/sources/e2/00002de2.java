package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjc {
    public final zzry zza;
    public final Object zzb;
    public final zztq[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzjd zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzju[] zzi;
    private final zzvm zzj;
    private final zzjm zzk;
    @z1
    private zzjc zzl;
    private zzty zzm;
    private zzvn zzn;
    private long zzo;

    public zzjc(zzju[] zzjuVarArr, long j, zzvm zzvmVar, zzvv zzvvVar, zzjm zzjmVar, zzjd zzjdVar, zzvn zzvnVar, byte[] bArr) {
        this.zzi = zzjuVarArr;
        this.zzo = j;
        this.zzj = zzvmVar;
        this.zzk = zzjmVar;
        zzsa zzsaVar = zzjdVar.zza;
        this.zzb = zzsaVar.zza;
        this.zzf = zzjdVar;
        this.zzm = zzty.zza;
        this.zzn = zzvnVar;
        this.zzc = new zztq[2];
        this.zzh = new boolean[2];
        long j2 = zzjdVar.zzb;
        long j3 = zzjdVar.zzd;
        zzry zzo = zzjmVar.zzo(zzsaVar, zzvvVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzrf(zzo, true, 0L, j3) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzvn zzvnVar = this.zzn;
            if (i >= zzvnVar.zza) {
                return;
            }
            zzvnVar.zzb(i);
            zzvg zzvgVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzvn zzvnVar = this.zzn;
            if (i >= zzvnVar.zza) {
                return;
            }
            zzvnVar.zzb(i);
            zzvg zzvgVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzvn zzvnVar, long j, boolean z) {
        return zzb(zzvnVar, j, false, new boolean[2]);
    }

    public final long zzb(zzvn zzvnVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzvnVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzvnVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzju[] zzjuVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzjuVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzvnVar;
        zzt();
        long zzf = this.zza.zzf(zzvnVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzju[] zzjuVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzjuVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zztq[] zztqVarArr = this.zzc;
            if (i4 >= 2) {
                return zzf;
            }
            if (zztqVarArr[i4] != null) {
                zzcw.zzf(zzvnVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzcw.zzf(zzvnVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (this.zzd) {
            long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
        }
        return this.zzf.zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    @z1
    public final zzjc zzg() {
        return this.zzl;
    }

    public final zzty zzh() {
        return this.zzm;
    }

    public final zzvn zzi() {
        return this.zzn;
    }

    public final zzvn zzj(float f, zzci zzciVar) throws zzgt {
        zzvg[] zzvgVarArr;
        zzvn zzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzciVar);
        for (zzvg zzvgVar : zzj.zzc) {
        }
        return zzj;
    }

    public final void zzk(long j) {
        zzcw.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzci zzciVar) throws zzgt {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzvn zzj = zzj(f, zzciVar);
        zzjd zzjdVar = this.zzf;
        long j = zzjdVar.zzb;
        long j2 = zzjdVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzjd zzjdVar2 = this.zzf;
        this.zzo = (zzjdVar2.zzb - zza) + j3;
        this.zzf = zzjdVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzcw.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjm zzjmVar = this.zzk;
        zzry zzryVar = this.zza;
        try {
            if (zzryVar instanceof zzrf) {
                zzjmVar.zzh(((zzrf) zzryVar).zza);
            } else {
                zzjmVar.zzh(zzryVar);
            }
        } catch (RuntimeException e) {
            zzdn.zza("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(@z1 zzjc zzjcVar) {
        if (zzjcVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzjcVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzry zzryVar = this.zza;
        if (zzryVar instanceof zzrf) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrf) zzryVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}