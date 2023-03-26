package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzamh extends zzgkq implements zzgmb {
    private static final zzamh zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzgji zzh = zzgji.zzb;

    static {
        zzamh zzamhVar = new zzamh();
        zzb = zzamhVar;
        zzgkq.zzaP(zzamh.class, zzamhVar);
    }

    private zzamh() {
    }

    public static zzamh zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zzf;
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
                    return new zzamg(null);
                }
                return new zzamh();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zze & 1) != 0;
    }
}