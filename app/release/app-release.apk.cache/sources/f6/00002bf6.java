package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbp extends zzgkq implements zzgmb {
    private static final zzgbp zzb;
    private int zze;

    static {
        zzgbp zzgbpVar = new zzgbp();
        zzb = zzgbpVar;
        zzgkq.zzaP(zzgbp.class, zzgbpVar);
    }

    private zzgbp() {
    }

    public static zzgbo zzc() {
        return (zzgbo) zzb.zzay();
    }

    public static zzgbp zze() {
        return zzb;
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
                    return new zzgbo(null);
                }
                return new zzgbp();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}