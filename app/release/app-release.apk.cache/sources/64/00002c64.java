package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgfr extends zzgkq implements zzgmb {
    private static final zzgfr zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        zzgfr zzgfrVar = new zzgfr();
        zzb = zzgfrVar;
        zzgkq.zzaP(zzgfr.class, zzgfrVar);
    }

    private zzgfr() {
    }

    public final int zza() {
        return this.zzg;
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
                    return new zzgfq(null);
                }
                return new zzgfr();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }
}