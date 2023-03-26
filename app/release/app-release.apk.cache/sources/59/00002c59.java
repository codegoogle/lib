package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfg extends zzgkq implements zzgmb {
    private static final zzgfg zzb;
    private int zze;
    private zzgfa zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgfg zzgfgVar = new zzgfg();
        zzb = zzgfgVar;
        zzgkq.zzaP(zzgfg.class, zzgfgVar);
    }

    private zzgfg() {
    }

    public static zzgff zzd() {
        return (zzgff) zzb.zzay();
    }

    public static zzgfg zzf() {
        return zzb;
    }

    public static zzgfg zzg(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgfg) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzj(zzgfg zzgfgVar, zzgfa zzgfaVar) {
        zzgfaVar.getClass();
        zzgfgVar.zzf = zzgfaVar;
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
                    return new zzgff(null);
                }
                return new zzgfg();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgfa zzc() {
        zzgfa zzgfaVar = this.zzf;
        return zzgfaVar == null ? zzgfa.zzd() : zzgfaVar;
    }

    public final zzgji zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}