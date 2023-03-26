package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbj extends zzgkq implements zzgmb {
    private static final zzgbj zzb;
    private int zze;
    private zzgji zzf = zzgji.zzb;
    private zzgbp zzg;

    static {
        zzgbj zzgbjVar = new zzgbj();
        zzb = zzgbjVar;
        zzgkq.zzaP(zzgbj.class, zzgbjVar);
    }

    private zzgbj() {
    }

    public static zzgbi zzc() {
        return (zzgbi) zzb.zzay();
    }

    public static zzgbj zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgbj) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzj(zzgbj zzgbjVar, zzgbp zzgbpVar) {
        zzgbpVar.getClass();
        zzgbjVar.zzg = zzgbpVar;
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
                    return new zzgbi(null);
                }
                return new zzgbj();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgbp zzf() {
        zzgbp zzgbpVar = this.zzg;
        return zzgbpVar == null ? zzgbp.zze() : zzgbpVar;
    }

    public final zzgji zzg() {
        return this.zzf;
    }
}