package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfyx extends zzfyy {
    public zzfyx(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final zzfyw zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzfyv(bArr, i);
    }
}