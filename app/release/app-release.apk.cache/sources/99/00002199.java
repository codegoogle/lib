package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzci {
    public static final zzci zza = new zzcd();
    public static final zzl zzb = zzcc.zza;

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzci) {
            zzci zzciVar = (zzci) obj;
            if (zzciVar.zzc() == zzc() && zzciVar.zzb() == zzb()) {
                zzch zzchVar = new zzch();
                zzcf zzcfVar = new zzcf();
                zzch zzchVar2 = new zzch();
                zzcf zzcfVar2 = new zzcf();
                for (int i = 0; i < zzc(); i++) {
                    if (!zze(i, zzchVar, 0L).equals(zzciVar.zze(i, zzchVar2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < zzb(); i2++) {
                    if (!zzd(i2, zzcfVar, true).equals(zzciVar.zzd(i2, zzcfVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zzch zzchVar = new zzch();
        zzcf zzcfVar = new zzcf();
        int zzc = zzc() + 217;
        for (int i = 0; i < zzc(); i++) {
            zzc = (zzc * 31) + zze(i, zzchVar, 0L).hashCode();
        }
        int zzb2 = zzb() + (zzc * 31);
        for (int i2 = 0; i2 < zzb(); i2++) {
            zzb2 = (zzb2 * 31) + zzd(i2, zzcfVar, true).hashCode();
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcf zzd(int i, zzcf zzcfVar, boolean z);

    public abstract zzch zze(int i, zzch zzchVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzcf zzcfVar, zzch zzchVar, int i2, boolean z) {
        int i3 = zzd(i, zzcfVar, false).zzd;
        if (zze(i3, zzchVar, 0L).zzp == i) {
            int zzj = zzj(i3, i2, z);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzchVar, 0L).zzo;
        }
        return i + 1;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == zzh(z) ? zzg(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzch zzchVar, zzcf zzcfVar, int i, long j) {
        Pair zzm = zzm(zzchVar, zzcfVar, i, j, 0L);
        Objects.requireNonNull(zzm);
        return zzm;
    }

    @z1
    public final Pair zzm(zzch zzchVar, zzcf zzcfVar, int i, long j, long j2) {
        zzcw.zza(i, 0, zzc());
        zze(i, zzchVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzchVar.zzm;
            j = 0;
        }
        int i2 = zzchVar.zzo;
        zzd(i2, zzcfVar, false);
        while (i2 < zzchVar.zzp) {
            long j4 = zzcfVar.zzf;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzd(i4, zzcfVar, false).zzf;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzd(i2, zzcfVar, true);
        long j6 = zzcfVar.zzf;
        long j7 = zzcfVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzcfVar.zzc;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcf zzn(Object obj, zzcf zzcfVar) {
        return zzd(zza(obj), zzcfVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}