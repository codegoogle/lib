package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzggy extends zzgkq implements zzgmb {
    private static final zzggy zzb;
    private int zze;

    static {
        zzggy zzggyVar = new zzggy();
        zzb = zzggyVar;
        zzgkq.zzaP(zzggy.class, zzggyVar);
    }

    private zzggy() {
    }

    public static zzggy zzc() {
        return zzb;
    }

    public static zzggy zzd(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzggy) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzggx(null);
                }
                return new zzggy();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}