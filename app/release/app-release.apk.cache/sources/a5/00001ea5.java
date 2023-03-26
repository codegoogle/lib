package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbga extends zzgkq implements zzgmb {
    private static final zzbga zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private int zzm;
    private zzgkz zzf = zzgkq.zzaJ();
    private String zzj = "";
    private String zzk = "";

    static {
        zzbga zzbgaVar = new zzbga();
        zzb = zzbgaVar;
        zzgkq.zzaP(zzbga.class, zzbgaVar);
    }

    private zzbga() {
    }

    public static zzbfw zza() {
        return (zzbfw) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzbga zzbgaVar, Iterable iterable) {
        zzgkz zzgkzVar = zzbgaVar.zzf;
        if (!zzgkzVar.zzc()) {
            zzbgaVar.zzf = zzgkq.zzaK(zzgkzVar);
        }
        zzgir.zzat(iterable, zzbgaVar.zzf);
    }

    public static /* synthetic */ void zze(zzbga zzbgaVar, int i) {
        zzbgaVar.zze |= 1;
        zzbgaVar.zzg = i;
    }

    public static /* synthetic */ void zzf(zzbga zzbgaVar, int i) {
        zzbgaVar.zze |= 2;
        zzbgaVar.zzh = i;
    }

    public static /* synthetic */ void zzg(zzbga zzbgaVar, long j) {
        zzbgaVar.zze |= 4;
        zzbgaVar.zzi = j;
    }

    public static /* synthetic */ void zzh(zzbga zzbgaVar, String str) {
        str.getClass();
        zzbgaVar.zze |= 8;
        zzbgaVar.zzj = str;
    }

    public static /* synthetic */ void zzi(zzbga zzbgaVar, String str) {
        str.getClass();
        zzbgaVar.zze |= 16;
        zzbgaVar.zzk = str;
    }

    public static /* synthetic */ void zzj(zzbga zzbgaVar, long j) {
        zzbgaVar.zze |= 32;
        zzbgaVar.zzl = j;
    }

    public static /* synthetic */ void zzk(zzbga zzbgaVar, int i) {
        zzbgaVar.zze |= 64;
        zzbgaVar.zzm = i;
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
                    return new zzbfw(null);
                }
                return new zzbga();
            }
            return zzgkq.zzaO(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", zzbfv.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}