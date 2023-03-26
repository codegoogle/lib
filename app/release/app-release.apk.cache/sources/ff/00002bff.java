package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgby extends zzgkq implements zzgmb {
    private static final zzgby zzb;
    private int zze;
    private zzgce zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgby zzgbyVar = new zzgby();
        zzb = zzgbyVar;
        zzgkq.zzaP(zzgby.class, zzgbyVar);
    }

    private zzgby() {
    }

    public static zzgbx zzc() {
        return (zzgbx) zzb.zzay();
    }

    public static zzgby zze() {
        return zzb;
    }

    public static zzgby zzf(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgby) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzj(zzgby zzgbyVar, zzgce zzgceVar) {
        zzgceVar.getClass();
        zzgbyVar.zzf = zzgceVar;
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
                    return new zzgbx(null);
                }
                return new zzgby();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgce zzg() {
        zzgce zzgceVar = this.zzf;
        return zzgceVar == null ? zzgce.zze() : zzgceVar;
    }

    public final zzgji zzh() {
        return this.zzg;
    }
}