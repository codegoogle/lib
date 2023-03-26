package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxl {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzggb zza(zzgfw zzgfwVar) {
        zzgfy zza2 = zzggb.zza();
        zza2.zzb(zzgfwVar.zzc());
        for (zzgfv zzgfvVar : zzgfwVar.zzh()) {
            zzgfz zza3 = zzgga.zza();
            zza3.zzb(zzgfvVar.zzc().zzf());
            zza3.zzd(zzgfvVar.zzi());
            zza3.zzc(zzgfvVar.zzj());
            zza3.zza(zzgfvVar.zza());
            zza2.zza((zzgga) zza3.zzal());
        }
        return (zzggb) zza2.zzal();
    }

    public static void zzb(zzgfw zzgfwVar) throws GeneralSecurityException {
        int zzc = zzgfwVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgfv zzgfvVar : zzgfwVar.zzh()) {
            if (zzgfvVar.zzi() == 3) {
                if (zzgfvVar.zzh()) {
                    if (zzgfvVar.zzj() != 2) {
                        if (zzgfvVar.zzi() != 2) {
                            if (zzgfvVar.zza() == zzc) {
                                if (z) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z = true;
                            }
                            z2 &= zzgfvVar.zzc().zzi() == 5;
                            i++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgfvVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgfvVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgfvVar.zza())));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}