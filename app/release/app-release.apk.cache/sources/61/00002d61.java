package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpa extends zzgkq implements zzgmb {
    private static final zzgpa zzb;
    private int zze;
    private int zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgpa zzgpaVar = new zzgpa();
        zzb = zzgpaVar;
        zzgkq.zzaP(zzgpa.class, zzgpaVar);
    }

    private zzgpa() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzg = zzgjiVar;
        this.zzh = zzgjiVar;
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
                    return new zzgoz(null);
                }
                return new zzgpa();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}