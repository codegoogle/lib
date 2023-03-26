package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgch extends zzgkq implements zzgmb {
    private static final zzgch zzb;
    private int zze;
    private zzgcn zzf;
    private zzgji zzg = zzgji.zzb;

    static {
        zzgch zzgchVar = new zzgch();
        zzb = zzgchVar;
        zzgkq.zzaP(zzgch.class, zzgchVar);
    }

    private zzgch() {
    }

    public static zzgcg zzc() {
        return (zzgcg) zzb.zzay();
    }

    public static zzgch zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgch) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzi(zzgch zzgchVar, zzgcn zzgcnVar) {
        zzgcnVar.getClass();
        zzgchVar.zzf = zzgcnVar;
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
                    return new zzgcg(null);
                }
                return new zzgch();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgcn zzf() {
        zzgcn zzgcnVar = this.zzf;
        return zzgcnVar == null ? zzgcn.zze() : zzgcnVar;
    }

    public final zzgji zzg() {
        return this.zzg;
    }
}