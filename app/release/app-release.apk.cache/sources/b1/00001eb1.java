package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbgm extends zzgkq implements zzgmb {
    private static final zzbgm zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbgm zzbgmVar = new zzbgm();
        zzb = zzbgmVar;
        zzgkq.zzaP(zzbgm.class, zzbgmVar);
    }

    private zzbgm() {
    }

    public static zzbgl zza() {
        return (zzbgl) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzbgm zzbgmVar, int i) {
        zzbgmVar.zze |= 1;
        zzbgmVar.zzf = i;
    }

    public static /* synthetic */ void zze(zzbgm zzbgmVar, int i) {
        zzbgmVar.zze |= 2;
        zzbgmVar.zzg = i;
    }

    public static /* synthetic */ void zzf(zzbgm zzbgmVar, int i) {
        zzbgmVar.zze |= 4;
        zzbgmVar.zzh = i;
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
                    return new zzbgl(null);
                }
                return new zzbgm();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}