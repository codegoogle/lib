package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzggv extends zzgkq implements zzgmb {
    private static final zzggv zzb;
    private int zze;
    private zzgji zzf = zzgji.zzb;

    static {
        zzggv zzggvVar = new zzggv();
        zzb = zzggvVar;
        zzgkq.zzaP(zzggv.class, zzggvVar);
    }

    private zzggv() {
    }

    public static zzggu zzc() {
        return (zzggu) zzb.zzay();
    }

    public static zzggv zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzggv) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
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
                    return new zzggu(null);
                }
                return new zzggv();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgji zzf() {
        return this.zzf;
    }
}