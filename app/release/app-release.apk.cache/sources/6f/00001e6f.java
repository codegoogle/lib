package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbea extends zzgkq implements zzgmb {
    private static final zzbea zzb;
    private int zze;
    private int zzf;
    private zzbee zzg;
    private zzbeg zzh;

    static {
        zzbea zzbeaVar = new zzbea();
        zzb = zzbeaVar;
        zzgkq.zzaP(zzbea.class, zzbeaVar);
    }

    private zzbea() {
    }

    public static zzbdz zza() {
        return (zzbdz) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzbea zzbeaVar, zzbee zzbeeVar) {
        zzbeeVar.getClass();
        zzbeaVar.zzg = zzbeeVar;
        zzbeaVar.zze |= 2;
    }

    public static /* synthetic */ void zze(zzbea zzbeaVar, zzbeg zzbegVar) {
        zzbegVar.getClass();
        zzbeaVar.zzh = zzbegVar;
        zzbeaVar.zze |= 4;
    }

    public static /* synthetic */ void zzf(zzbea zzbeaVar, int i) {
        zzbeaVar.zzf = 1;
        zzbeaVar.zze = 1 | zzbeaVar.zze;
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
                    return new zzbdz(null);
                }
                return new zzbea();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbec.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}