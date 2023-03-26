package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqv extends zzgkq implements zzgmb {
    private static final zzaqv zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzaqv zzaqvVar = new zzaqv();
        zzb = zzaqvVar;
        zzgkq.zzaP(zzaqv.class, zzaqvVar);
    }

    private zzaqv() {
    }

    public static zzaqu zze() {
        return (zzaqu) zzb.zzay();
    }

    public static zzaqv zzg() {
        return zzb;
    }

    public static zzaqv zzh(zzgji zzgjiVar) throws zzglc {
        return (zzaqv) zzgkq.zzaB(zzb, zzgjiVar);
    }

    public static zzaqv zzi(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzaqv) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzl(zzaqv zzaqvVar, String str) {
        str.getClass();
        zzaqvVar.zze |= 1;
        zzaqvVar.zzf = str;
    }

    public static /* synthetic */ void zzm(zzaqv zzaqvVar, long j) {
        zzaqvVar.zze |= 16;
        zzaqvVar.zzj = j;
    }

    public static /* synthetic */ void zzn(zzaqv zzaqvVar, String str) {
        str.getClass();
        zzaqvVar.zze |= 2;
        zzaqvVar.zzg = str;
    }

    public static /* synthetic */ void zzo(zzaqv zzaqvVar, long j) {
        zzaqvVar.zze |= 4;
        zzaqvVar.zzh = j;
    }

    public static /* synthetic */ void zzp(zzaqv zzaqvVar, long j) {
        zzaqvVar.zze |= 8;
        zzaqvVar.zzi = j;
    }

    public final long zza() {
        return this.zzi;
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
                    return new zzaqu(null);
                }
                return new zzaqv();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final String zzk() {
        return this.zzf;
    }
}