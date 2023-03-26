package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfzi extends zzgas {
    public zzfzi() {
        super(zzgdc.class, new zzfzg(zzfwl.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfzh(this, zzgdf.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgdc.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgdc zzgdcVar = (zzgdc) zzgmaVar;
        zzgim.zzb(zzgdcVar.zza(), 0);
        if (zzgdcVar.zzf().zzd() != 64) {
            throw new InvalidKeyException(wo1.n("invalid key size: ", zzgdcVar.zzf().zzd(), ". Valid keys must have 64 bytes."));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}