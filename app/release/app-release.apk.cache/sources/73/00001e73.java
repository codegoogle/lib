package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbee extends zzgkq implements zzgmb {
    private static final zzbee zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbee zzbeeVar = new zzbee();
        zzb = zzbeeVar;
        zzgkq.zzaP(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbed zza() {
        return (zzbed) zzb.zzay();
    }

    public static zzbee zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbee zzbeeVar, boolean z) {
        zzbeeVar.zze |= 1;
        zzbeeVar.zzf = z;
    }

    public static /* synthetic */ void zzf(zzbee zzbeeVar, int i) {
        zzbeeVar.zze |= 2;
        zzbeeVar.zzg = i;
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
                    return new zzbed(null);
                }
                return new zzbee();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}