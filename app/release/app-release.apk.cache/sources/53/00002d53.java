package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgon extends zzgkq implements zzgmb {
    private static final zzgon zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgon zzgonVar = new zzgon();
        zzb = zzgonVar;
        zzgkq.zzaP(zzgon.class, zzgonVar);
    }

    private zzgon() {
    }

    public static zzgom zza() {
        return (zzgom) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzgon zzgonVar, String str) {
        zzgonVar.zze |= 1;
        zzgonVar.zzf = str;
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
                    return new zzgom(null);
                }
                return new zzgon();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}