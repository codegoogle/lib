package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgge extends zzgkq implements zzgmb {
    private static final zzgge zzb;
    private int zze;
    private zzggh zzf;

    static {
        zzgge zzggeVar = new zzgge();
        zzb = zzggeVar;
        zzgkq.zzaP(zzgge.class, zzggeVar);
    }

    private zzgge() {
    }

    public static zzggd zzc() {
        return (zzggd) zzb.zzay();
    }

    public static zzgge zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgge) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzh(zzgge zzggeVar, zzggh zzgghVar) {
        zzgghVar.getClass();
        zzggeVar.zzf = zzgghVar;
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
                    return new zzggd(null);
                }
                return new zzgge();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzggh zzf() {
        zzggh zzgghVar = this.zzf;
        return zzgghVar == null ? zzggh.zzc() : zzgghVar;
    }
}