package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfd extends zzgkq implements zzgmb {
    private static final zzgfd zzb;
    private int zze;
    private zzgfg zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgfd zzgfdVar = new zzgfd();
        zzb = zzgfdVar;
        zzgkq.zzaP(zzgfd.class, zzgfdVar);
    }

    private zzgfd() {
    }

    public static zzgfc zzc() {
        return (zzgfc) zzb.zzay();
    }

    public static zzgfd zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgfd) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzi(zzgfd zzgfdVar, zzgfg zzgfgVar) {
        zzgfgVar.getClass();
        zzgfdVar.zzf = zzgfgVar;
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
                    return new zzgfc(null);
                }
                return new zzgfd();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgfg zzf() {
        zzgfg zzgfgVar = this.zzf;
        return zzgfgVar == null ? zzgfg.zzf() : zzgfgVar;
    }

    public final zzgji zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}