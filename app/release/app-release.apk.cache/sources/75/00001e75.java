package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeg extends zzgkq implements zzgmb {
    private static final zzbeg zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbeg zzbegVar = new zzbeg();
        zzb = zzbegVar;
        zzgkq.zzaP(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbef zza() {
        return (zzbef) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzbeg zzbegVar, boolean z) {
        zzbegVar.zze |= 1;
        zzbegVar.zzf = z;
    }

    public static /* synthetic */ void zze(zzbeg zzbegVar, boolean z) {
        zzbegVar.zze |= 2;
        zzbegVar.zzg = z;
    }

    public static /* synthetic */ void zzf(zzbeg zzbegVar, int i) {
        zzbegVar.zze |= 4;
        zzbegVar.zzh = i;
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
                    return new zzbef(null);
                }
                return new zzbeg();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}