package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgcn extends zzgkq implements zzgmb {
    private static final zzgcn zzb;
    private int zze;

    static {
        zzgcn zzgcnVar = new zzgcn();
        zzb = zzgcnVar;
        zzgkq.zzaP(zzgcn.class, zzgcnVar);
    }

    private zzgcn() {
    }

    public static zzgcm zzc() {
        return (zzgcm) zzb.zzay();
    }

    public static zzgcn zze() {
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
                    return new zzgcm(null);
                }
                return new zzgcn();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}