package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgif implements zzgbg {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgif(byte[] bArr) throws GeneralSecurityException {
        zzgim.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zzb2 = zzghg.zzb(zzb.doFinal(new byte[16]));
        this.zzb = zzb2;
        this.zzc = zzghg.zzb(zzb2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzfze.zza(1)) {
            return (Cipher) zzghs.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgbg
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzd;
        if (i <= 16) {
            Cipher zzb = zzb();
            zzb.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                zzd = zzghh.zze(bArr, (max - 1) * 16, this.zzb, 0, 16);
            } else {
                zzd = zzghh.zzd(zzghg.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = zzb.doFinal(zzghh.zze(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzghh.zzd(zzd, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}