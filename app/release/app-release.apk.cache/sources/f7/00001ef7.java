package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class zzbjb {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbjb(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbjb zza(String str, double d) {
        return new zzbjb(str, Double.valueOf(d), 3);
    }

    public static zzbjb zzb(String str, long j) {
        return new zzbjb(str, Long.valueOf(j), 2);
    }

    public static zzbjb zzc(String str, String str2) {
        return new zzbjb(str, str2, 4);
    }

    public static zzbjb zzd(String str, boolean z) {
        return new zzbjb(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbke zza = zzbkg.zza();
        if (zza == null) {
            if (zzbkg.zzb() != null) {
                zzbkg.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}