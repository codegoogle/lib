package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgdw extends zzgkq implements zzgmb {
    private static final zzgdw zzb;
    private zzgef zze;
    private zzgdq zzf;
    private int zzg;

    static {
        zzgdw zzgdwVar = new zzgdw();
        zzb = zzgdwVar;
        zzgkq.zzaP(zzgdw.class, zzgdwVar);
    }

    private zzgdw() {
    }

    public static zzgdv zzc() {
        return (zzgdv) zzb.zzay();
    }

    public static zzgdw zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzgdw zzgdwVar, zzgef zzgefVar) {
        zzgefVar.getClass();
        zzgdwVar.zze = zzgefVar;
    }

    public static /* synthetic */ void zzh(zzgdw zzgdwVar, zzgdq zzgdqVar) {
        zzgdqVar.getClass();
        zzgdwVar.zzf = zzgdqVar;
    }

    public final zzgdq zza() {
        zzgdq zzgdqVar = this.zzf;
        return zzgdqVar == null ? zzgdq.zzd() : zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgdv(null);
                }
                return new zzgdw();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgef zzf() {
        zzgef zzgefVar = this.zze;
        return zzgefVar == null ? zzgef.zzd() : zzgefVar;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}