package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeh extends zzgkq implements zzgmb {
    private static final zzbeh zzb;
    private zzgkz zze = zzgkq.zzaJ();

    static {
        zzbeh zzbehVar = new zzbeh();
        zzb = zzbehVar;
        zzgkq.zzaP(zzbeh.class, zzbehVar);
    }

    private zzbeh() {
    }

    public static zzbeb zza() {
        return (zzbeb) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzbeh zzbehVar, zzbea zzbeaVar) {
        zzbeaVar.getClass();
        zzgkz zzgkzVar = zzbehVar.zze;
        if (!zzgkzVar.zzc()) {
            zzbehVar.zze = zzgkq.zzaK(zzgkzVar);
        }
        zzbehVar.zze.add(zzbeaVar);
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
                    return new zzbeb(null);
                }
                return new zzbeh();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbea.class});
        }
        return (byte) 1;
    }
}