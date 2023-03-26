package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbfg extends zzgkq implements zzgmb {
    private static final zzbfg zzb;
    private int zze;
    private int zzf;
    private zzgkv zzg = zzgkq.zzaG();

    static {
        zzbfg zzbfgVar = new zzbfg();
        zzb = zzbfgVar;
        zzgkq.zzaP(zzbfg.class, zzbfgVar);
    }

    private zzbfg() {
    }

    public static /* synthetic */ zzbfg zza() {
        return zzb;
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
                    return new zzbff(null);
                }
                return new zzbfg();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzbez.zza, "zzg"});
        }
        return (byte) 1;
    }
}