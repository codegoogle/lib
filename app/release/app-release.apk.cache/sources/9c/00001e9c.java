package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbfs extends zzgkq implements zzgmb {
    private static final zzbfs zzb;
    private int zze;
    private int zzf;
    private zzbgk zzg;

    static {
        zzbfs zzbfsVar = new zzbfs();
        zzb = zzbfsVar;
        zzgkq.zzaP(zzbfs.class, zzbfsVar);
    }

    private zzbfs() {
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
                    return new zzbfr(null);
                }
                return new zzbfs();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbez.zza, "zzg"});
        }
        return (byte) 1;
    }
}