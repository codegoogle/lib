package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjf {
    private final zzcf zza = new zzcf();
    private final zzch zzb = new zzch();
    private final zzkh zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    @z1
    private zzjc zzh;
    @z1
    private zzjc zzi;
    @z1
    private zzjc zzj;
    private int zzk;
    @z1
    private Object zzl;
    private long zzm;

    public zzjf(zzkh zzkhVar, Handler handler) {
        this.zzc = zzkhVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzci zzciVar, zzsa zzsaVar) {
        if (zzC(zzsaVar)) {
            return zzciVar.zze(zzciVar.zzn(zzsaVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzciVar.zza(zzsaVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzci zzciVar) {
        zzjc zzjcVar = this.zzh;
        if (zzjcVar == null) {
            return true;
        }
        int zza = zzciVar.zza(zzjcVar.zzb);
        while (true) {
            zza = zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjcVar.zzg() != null && !zzjcVar.zzf.zzg) {
                zzjcVar = zzjcVar.zzg();
            }
            zzjc zzg = zzjcVar.zzg();
            if (zza == -1 || zzg == null || zzciVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzjcVar = zzg;
        }
        boolean zzm = zzm(zzjcVar);
        zzjcVar.zzf = zzg(zzciVar, zzjcVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzsa zzsaVar) {
        return !zzsaVar.zzb() && zzsaVar.zze == -1;
    }

    private final long zzs(zzci zzciVar, Object obj, int i) {
        zzciVar.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0L;
    }

    @z1
    private final zzjd zzt(zzci zzciVar, zzjc zzjcVar, long j) {
        long j2;
        zzjd zzjdVar = zzjcVar.zzf;
        long zze = (zzjcVar.zze() + zzjdVar.zze) - j;
        if (zzjdVar.zzg) {
            long j3 = 0;
            int zzi = zzciVar.zzi(zzciVar.zza(zzjdVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi == -1) {
                return null;
            }
            int i = zzciVar.zzd(zzi, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            Objects.requireNonNull(obj);
            long j4 = zzjdVar.zza.zzd;
            if (zzciVar.zze(i, this.zzb, 0L).zzo == zzi) {
                Pair zzm = zzciVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zze));
                if (zzm == null) {
                    return null;
                }
                obj = zzm.first;
                long longValue = ((Long) zzm.second).longValue();
                zzjc zzg = zzjcVar.zzg();
                if (zzg != null && zzg.zzb.equals(obj)) {
                    j4 = zzg.zzf.zza.zzd;
                } else {
                    j4 = this.zze;
                    this.zze = 1 + j4;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            zzsa zzx = zzx(zzciVar, obj, j2, j4, this.zzb, this.zza);
            if (j3 != -9223372036854775807L && zzjdVar.zzc != -9223372036854775807L) {
                zzciVar.zzn(zzjdVar.zza.zza, this.zza).zzb();
            }
            return zzu(zzciVar, zzx, j3, j2);
        }
        zzsa zzsaVar = zzjdVar.zza;
        zzciVar.zzn(zzsaVar.zza, this.zza);
        if (zzsaVar.zzb()) {
            int i2 = zzsaVar.zzb;
            if (this.zza.zza(i2) == -1) {
                return null;
            }
            int zzf = this.zza.zzf(i2, zzsaVar.zzc);
            if (zzf < 0) {
                return zzv(zzciVar, zzsaVar.zza, i2, zzf, zzjdVar.zzc, zzsaVar.zzd);
            }
            long j5 = zzjdVar.zzc;
            if (j5 == -9223372036854775807L) {
                zzch zzchVar = this.zzb;
                zzcf zzcfVar = this.zza;
                Pair zzm2 = zzciVar.zzm(zzchVar, zzcfVar, zzcfVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                if (zzm2 == null) {
                    return null;
                }
                j5 = ((Long) zzm2.second).longValue();
            }
            zzs(zzciVar, zzsaVar.zza, zzsaVar.zzb);
            return zzw(zzciVar, zzsaVar.zza, Math.max(0L, j5), zzjdVar.zzc, zzsaVar.zzd);
        }
        int zze2 = this.zza.zze(zzsaVar.zze);
        this.zza.zzl(zzsaVar.zze);
        if (zze2 != this.zza.zza(zzsaVar.zze)) {
            return zzv(zzciVar, zzsaVar.zza, zzsaVar.zze, zze2, zzjdVar.zze, zzsaVar.zzd);
        }
        zzs(zzciVar, zzsaVar.zza, zzsaVar.zze);
        return zzw(zzciVar, zzsaVar.zza, 0L, zzjdVar.zze, zzsaVar.zzd);
    }

    @z1
    private final zzjd zzu(zzci zzciVar, zzsa zzsaVar, long j, long j2) {
        zzciVar.zzn(zzsaVar.zza, this.zza);
        if (zzsaVar.zzb()) {
            return zzv(zzciVar, zzsaVar.zza, zzsaVar.zzb, zzsaVar.zzc, j, zzsaVar.zzd);
        }
        return zzw(zzciVar, zzsaVar.zza, j2, j, zzsaVar.zzd);
    }

    private final zzjd zzv(zzci zzciVar, Object obj, int i, int i2, long j, long j2) {
        zzsa zzsaVar = new zzsa(obj, i, i2, j2);
        long zzg = zzciVar.zzn(zzsaVar.zza, this.zza).zzg(zzsaVar.zzb, zzsaVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsaVar.zzb);
        long j3 = 0;
        if (zzg != -9223372036854775807L && zzg <= 0) {
            j3 = Math.max(0L, (-1) + zzg);
        }
        return new zzjd(zzsaVar, j3, j, -9223372036854775807L, zzg, false, false, false, false);
    }

    private final zzjd zzw(zzci zzciVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzciVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc);
        }
        zzsa zzsaVar = new zzsa(obj, j3, zzc);
        boolean zzC = zzC(zzsaVar);
        boolean zzA = zzA(zzciVar, zzsaVar);
        boolean zzz = zzz(zzciVar, zzsaVar, zzC);
        if (zzc != -1) {
            this.zza.zzl(zzc);
        }
        if (zzc != -1) {
            this.zza.zzh(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzjd(zzsaVar, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzsa zzx(zzci zzciVar, Object obj, long j, long j2, zzch zzchVar, zzcf zzcfVar) {
        zzciVar.zzn(obj, zzcfVar);
        zzciVar.zze(zzcfVar.zzd, zzchVar, 0L);
        zzciVar.zza(obj);
        if (zzcfVar.zze == 0) {
            zzcfVar.zzb();
        }
        zzciVar.zzn(obj, zzcfVar);
        int zzd = zzcfVar.zzd(j);
        if (zzd == -1) {
            return new zzsa(obj, j2, zzcfVar.zzc(j));
        }
        return new zzsa(obj, zzd, zzcfVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zzfrg zzi = zzfrj.zzi();
        for (zzjc zzjcVar = this.zzh; zzjcVar != null; zzjcVar = zzjcVar.zzg()) {
            zzi.zze(zzjcVar.zzf.zza);
        }
        zzjc zzjcVar2 = this.zzi;
        final zzsa zzsaVar = zzjcVar2 == null ? null : zzjcVar2.zzf.zza;
        this.zzd.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // java.lang.Runnable
            public final void run() {
                zzjf.this.zzj(zzi, zzsaVar);
            }
        });
    }

    private final boolean zzz(zzci zzciVar, zzsa zzsaVar, boolean z) {
        int zza = zzciVar.zza(zzsaVar.zza);
        return !zzciVar.zze(zzciVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    @z1
    public final zzjc zza() {
        zzjc zzjcVar = this.zzh;
        if (zzjcVar == null) {
            return null;
        }
        if (zzjcVar == this.zzi) {
            this.zzi = zzjcVar.zzg();
        }
        zzjcVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjc zzjcVar2 = this.zzh;
            this.zzl = zzjcVar2.zzb;
            this.zzm = zzjcVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjc zzb() {
        zzjc zzjcVar = this.zzi;
        boolean z = false;
        if (zzjcVar != null && zzjcVar.zzg() != null) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    @z1
    public final zzjc zzc() {
        return this.zzj;
    }

    @z1
    public final zzjc zzd() {
        return this.zzh;
    }

    @z1
    public final zzjc zze() {
        return this.zzi;
    }

    @z1
    public final zzjd zzf(long j, zzjn zzjnVar) {
        zzjc zzjcVar = this.zzj;
        return zzjcVar == null ? zzu(zzjnVar.zza, zzjnVar.zzb, zzjnVar.zzc, zzjnVar.zzs) : zzt(zzjnVar.zza, zzjcVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjd zzg(zzci zzciVar, zzjd zzjdVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzsa zzsaVar = zzjdVar.zza;
        boolean zzC = zzC(zzsaVar);
        boolean zzA = zzA(zzciVar, zzsaVar);
        boolean zzz = zzz(zzciVar, zzsaVar, zzC);
        zzciVar.zzn(zzjdVar.zza.zza, this.zza);
        if (zzsaVar.zzb() || (i = zzsaVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzh(i);
            j = 0;
        }
        if (zzsaVar.zzb()) {
            j2 = this.zza.zzg(zzsaVar.zzb, zzsaVar.zzc);
        } else if (j == -9223372036854775807L) {
            j2 = this.zza.zze;
        } else {
            j3 = 0;
            j4 = 0;
            if (!zzsaVar.zzb()) {
                this.zza.zzl(zzsaVar.zzb);
            } else {
                int i2 = zzsaVar.zze;
                if (i2 != -1) {
                    this.zza.zzl(i2);
                }
            }
            return new zzjd(zzsaVar, zzjdVar.zzb, zzjdVar.zzc, j3, j4, false, zzC, zzA, zzz);
        }
        j3 = j;
        j4 = j2;
        if (!zzsaVar.zzb()) {
        }
        return new zzjd(zzsaVar, zzjdVar.zzb, zzjdVar.zzc, j3, j4, false, zzC, zzA, zzz);
    }

    public final zzsa zzh(zzci zzciVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzciVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzciVar.zza(obj2)) == -1 || zzciVar.zzd(zza, this.zza, false).zzd != i) {
            zzjc zzjcVar = this.zzh;
            while (true) {
                if (zzjcVar == null) {
                    zzjc zzjcVar2 = this.zzh;
                    while (true) {
                        if (zzjcVar2 != null) {
                            int zza2 = zzciVar.zza(zzjcVar2.zzb);
                            if (zza2 != -1 && zzciVar.zzd(zza2, this.zza, false).zzd == i) {
                                j2 = zzjcVar2.zzf.zza.zzd;
                                break;
                            }
                            zzjcVar2 = zzjcVar2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else if (zzjcVar.zzb.equals(obj)) {
                    j2 = zzjcVar.zzf.zza.zzd;
                    break;
                } else {
                    zzjcVar = zzjcVar.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzciVar.zzn(obj, this.zza);
        zzciVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzciVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzch zzchVar = this.zzb;
            if (zza3 >= zzchVar.zzo) {
                zzciVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzcf zzcfVar = this.zza;
                if (zzcfVar.zzd(zzcfVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    Objects.requireNonNull(obj3);
                }
                zza3--;
            } else {
                return zzx(zzciVar, obj3, j, j3, zzchVar, this.zza);
            }
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzjc zzjcVar = this.zzh;
        zzcw.zzb(zzjcVar);
        this.zzl = zzjcVar.zzb;
        this.zzm = zzjcVar.zzf.zza.zzd;
        while (zzjcVar != null) {
            zzjcVar.zzn();
            zzjcVar = zzjcVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    public final /* synthetic */ void zzj(zzfrg zzfrgVar, zzsa zzsaVar) {
        this.zzc.zzT(zzfrgVar.zzg(), zzsaVar);
    }

    public final void zzk(long j) {
        zzjc zzjcVar = this.zzj;
        if (zzjcVar != null) {
            zzjcVar.zzm(j);
        }
    }

    public final boolean zzl(zzry zzryVar) {
        zzjc zzjcVar = this.zzj;
        return zzjcVar != null && zzjcVar.zza == zzryVar;
    }

    public final boolean zzm(zzjc zzjcVar) {
        boolean z = false;
        zzcw.zzf(zzjcVar != null);
        if (zzjcVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjcVar;
        while (zzjcVar.zzg() != null) {
            zzjcVar = zzjcVar.zzg();
            if (zzjcVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjcVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjc zzjcVar = this.zzj;
        if (zzjcVar != null) {
            return !zzjcVar.zzf.zzi && zzjcVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzci zzciVar, long j, long j2) {
        zzjd zzjdVar;
        boolean z;
        zzjc zzjcVar = null;
        for (zzjc zzjcVar2 = this.zzh; zzjcVar2 != null; zzjcVar2 = zzjcVar2.zzg()) {
            zzjd zzjdVar2 = zzjcVar2.zzf;
            if (zzjcVar == null) {
                zzjdVar = zzg(zzciVar, zzjdVar2);
            } else {
                zzjd zzt = zzt(zzciVar, zzjcVar, j);
                if (zzt == null) {
                    return !zzm(zzjcVar);
                } else if (zzjdVar2.zzb != zzt.zzb || !zzjdVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzjcVar);
                } else {
                    zzjdVar = zzt;
                }
            }
            zzjcVar2.zzf = zzjdVar.zza(zzjdVar2.zzc);
            long j3 = zzjdVar2.zze;
            long j4 = zzjdVar.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzjcVar2.zzq();
                long j5 = zzjdVar.zze;
                long zze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzjcVar2.zze();
                if (zzjcVar2 == this.zzi) {
                    boolean z2 = zzjcVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzm(zzjcVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzjcVar2)) {
                }
            }
            zzjcVar = zzjcVar2;
        }
        return true;
    }

    public final boolean zzp(zzci zzciVar, int i) {
        this.zzf = i;
        return zzB(zzciVar);
    }

    public final boolean zzq(zzci zzciVar, boolean z) {
        this.zzg = z;
        return zzB(zzciVar);
    }

    public final zzjc zzr(zzju[] zzjuVarArr, zzvm zzvmVar, zzvv zzvvVar, zzjm zzjmVar, zzjd zzjdVar, zzvn zzvnVar) {
        zzjc zzjcVar = this.zzj;
        zzjc zzjcVar2 = new zzjc(zzjuVarArr, zzjcVar == null ? 1000000000000L : (zzjcVar.zze() + zzjcVar.zzf.zze) - zzjdVar.zzb, zzvmVar, zzvvVar, zzjmVar, zzjdVar, zzvnVar, null);
        zzjc zzjcVar3 = this.zzj;
        if (zzjcVar3 != null) {
            zzjcVar3.zzo(zzjcVar2);
        } else {
            this.zzh = zzjcVar2;
            this.zzi = zzjcVar2;
        }
        this.zzl = null;
        this.zzj = zzjcVar2;
        this.zzk++;
        zzy();
        return zzjcVar2;
    }
}