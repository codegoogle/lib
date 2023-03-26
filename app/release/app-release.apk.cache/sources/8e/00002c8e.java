package com.google.android.gms.internal.ads;

import com.p7700g.p99005.g15;
import com.p7700g.p99005.wo1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghf implements zzfwl {
    private static final Collection zza = Arrays.asList(64);
    private static final byte[] zzb = new byte[16];
    private final zzgif zzc;
    private final byte[] zzd;

    public zzghf(byte[] bArr) throws GeneralSecurityException {
        if (zzfze.zza(1)) {
            Collection collection = zza;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.zzd = Arrays.copyOfRange(bArr, i, length);
                this.zzc = new zzgif(copyOfRange);
                return;
            }
            throw new InvalidKeyException(wo1.n("invalid key size: ", length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzd;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) zzghs.zza.zza("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] zza2 = this.zzc.zza(zzb, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr4 = bArr3[i];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                zza2 = zzghh.zzd(zzghg.zzb(zza2), this.zzc.zza(bArr4, 16));
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = zza2.length;
                if (length >= length2) {
                    int i2 = length - length2;
                    zzd = Arrays.copyOf(bArr5, length);
                    for (int i3 = 0; i3 < zza2.length; i3++) {
                        int i4 = i2 + i3;
                        zzd[i4] = (byte) (zzd[i4] ^ zza2[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                zzd = zzghh.zzd(zzghg.zza(bArr5), zzghg.zzb(zza2));
            }
            byte[] zza3 = this.zzc.zza(zzd, 16);
            byte[] bArr6 = (byte[]) zza3.clone();
            bArr6[8] = (byte) (bArr6[8] & g15.c);
            bArr6[12] = (byte) (bArr6[12] & g15.c);
            cipher.init(1, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr6));
            return zzghh.zzc(zza3, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}