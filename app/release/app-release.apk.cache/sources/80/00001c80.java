package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzalt extends zzgkq implements zzgmb {
    private static final zzalt zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzalt zzaltVar = new zzalt();
        zzb = zzaltVar;
        zzgkq.zzaP(zzalt.class, zzaltVar);
    }

    private zzalt() {
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
                    return new zzals(null);
                }
                return new zzalt();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzame.zza});
        }
        return (byte) 1;
    }
}