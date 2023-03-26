package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgec extends zzgkq implements zzgmb {
    private static final zzgec zzb;
    private int zze;
    private zzgdw zzf;
    private zzgji zzg;
    private zzgji zzh;

    static {
        zzgec zzgecVar = new zzgec();
        zzb = zzgecVar;
        zzgkq.zzaP(zzgec.class, zzgecVar);
    }

    private zzgec() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzg = zzgjiVar;
        this.zzh = zzgjiVar;
    }

    public static zzgeb zzd() {
        return (zzgeb) zzb.zzay();
    }

    public static zzgec zzf() {
        return zzb;
    }

    public static zzgec zzg(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgec) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzk(zzgec zzgecVar, zzgdw zzgdwVar) {
        zzgdwVar.getClass();
        zzgecVar.zzf = zzgdwVar;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgeb(null);
                }
                return new zzgec();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgdw zzc() {
        zzgdw zzgdwVar = this.zzf;
        return zzgdwVar == null ? zzgdw.zze() : zzgdwVar;
    }

    public final zzgji zzh() {
        return this.zzg;
    }

    public final zzgji zzi() {
        return this.zzh;
    }
}