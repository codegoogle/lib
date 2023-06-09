package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfzz implements zzgac {
    private final int zza;

    public zzfzz(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(wo1.l("Unsupported key length: ", i));
        }
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zza;
        if (i != 16) {
            if (i == 32) {
                return zzgan.zze;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzgan.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzfyu(bArr, false).zzb(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(wo1.l("Unexpected key length: ", length));
    }
}