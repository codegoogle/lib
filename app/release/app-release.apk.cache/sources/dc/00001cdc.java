package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapd {
    public static zzfwn zza;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzapc zzapcVar) throws IllegalAccessException, InvocationTargetException {
        Method zzj;
        zzfwn zza2;
        if (zza != null) {
            return true;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzct);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzapcVar != null && (zzj = zzapcVar.zzj("B6686OwUhvg9sC2Ywr/ef2K7k4+w2mnrIbLdBdrqQ7su4WMxR3/prcgS0L+6eNyY", "1l/ngTeh7Ob+HSjt2mKdxpX2SEfG+yjkE9qsfrYWj1c=")) != null) {
                str = (String) zzj.invoke(null, new Object[0]);
            }
        }
        try {
            zzfwt zza3 = zzfwy.zza(zzamn.zzb(str, true));
            for (zzgfr zzgfrVar : zzfzr.zza.zzd()) {
                if (!zzgfrVar.zzf().isEmpty()) {
                    if (!zzgfrVar.zze().isEmpty()) {
                        if (!zzgfrVar.zzd().isEmpty()) {
                            if (!zzgfrVar.zzd().equals("TinkAead") && !zzgfrVar.zzd().equals("TinkMac") && !zzgfrVar.zzd().equals("TinkHybridDecrypt") && !zzgfrVar.zzd().equals("TinkHybridEncrypt") && !zzgfrVar.zzd().equals("TinkPublicKeySign") && !zzgfrVar.zzd().equals("TinkPublicKeyVerify") && !zzgfrVar.zzd().equals("TinkStreamingAead") && !zzgfrVar.zzd().equals("TinkDeterministicAead")) {
                                zzfwi zza4 = zzfxk.zza(zzgfrVar.zzd());
                                zzfxk.zzn(zza4.zza());
                                zzgfrVar.zzf();
                                zzgfrVar.zze();
                                zzgfrVar.zza();
                                zzfxk.zzl(zza4.zzb(), zzgfrVar.zzg());
                            }
                        } else {
                            throw new GeneralSecurityException("Missing catalogue_name.");
                        }
                    } else {
                        throw new GeneralSecurityException("Missing primitive_name.");
                    }
                } else {
                    throw new GeneralSecurityException("Missing type_url.");
                }
            }
            zza2 = zzfzu.zza(zza3);
            zza = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}