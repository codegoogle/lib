package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgem extends zzgkq implements zzgmb {
    private static final zzgem zzb;
    private int zze;
    private zzges zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgem zzgemVar = new zzgem();
        zzb = zzgemVar;
        zzgkq.zzaP(zzgem.class, zzgemVar);
    }

    private zzgem() {
    }

    public static zzgel zzc() {
        return (zzgel) zzb.zzay();
    }

    public static zzgem zze() {
        return zzb;
    }

    public static zzgem zzf(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgem) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzj(zzgem zzgemVar, zzges zzgesVar) {
        zzgesVar.getClass();
        zzgemVar.zzf = zzgesVar;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgel(null);
                }
                return new zzgem();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzges zzg() {
        zzges zzgesVar = this.zzf;
        return zzgesVar == null ? zzges.zze() : zzgesVar;
    }

    public final zzgji zzh() {
        return this.zzg;
    }
}