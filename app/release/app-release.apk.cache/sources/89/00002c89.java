package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgha implements zzgie {
    private static final ThreadLocal zza = new zzggz();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzgha(byte[] bArr, int i) throws GeneralSecurityException {
        if (zzfze.zza(2)) {
            zzgim.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) zza.get()).getBlockSize();
            this.zzd = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.zzc = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private final void zzc(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzc);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.zzb, ivParameterSpec);
        } else {
            cipher.init(2, this.zzb, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgie
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.zzc;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            zzc(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzgie
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[i + length];
            byte[] zza2 = zzgik.zza(i);
            System.arraycopy(zza2, 0, bArr2, 0, this.zzc);
            zzc(bArr, 0, length, bArr2, this.zzc, zza2, true);
            return bArr2;
        }
        int i2 = this.zzc;
        StringBuilder G = wo1.G("plaintext length can not exceed ");
        G.append(Integer.MAX_VALUE - i2);
        throw new GeneralSecurityException(G.toString());
    }
}