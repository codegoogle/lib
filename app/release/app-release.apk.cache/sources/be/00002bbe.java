package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfzo extends zzgau {
    private static final byte[] zza = new byte[0];

    public zzfzo() {
        super(zzgdz.class, zzgec.class, new zzfzm(zzfwm.class));
    }

    public static /* bridge */ /* synthetic */ zzgaq zzh(int i, int i2, int i3, zzfwr zzfwrVar, byte[] bArr, int i4) {
        zzgds zza2 = zzgdt.zza();
        zzgee zza3 = zzgef.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgji.zzv(bArr));
        zzgef zzgefVar = (zzgef) zza3.zzal();
        zzgfn zza4 = zzgfo.zza();
        zza4.zza(zzfwrVar.zzb());
        zza4.zzb(zzgji.zzv(zzfwrVar.zzc()));
        int zzd = zzfwrVar.zzd() - 1;
        if (zzd == 0) {
            i5 = 3;
        } else if (zzd != 1) {
            i5 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i5);
        zzgdp zza5 = zzgdq.zza();
        zza5.zza((zzgfo) zza4.zzal());
        zzgdv zzc = zzgdw.zzc();
        zzc.zzb(zzgefVar);
        zzc.zza((zzgdq) zza5.zzal());
        zzc.zzc(i3);
        zza2.zza((zzgdw) zzc.zzal());
        return new zzgaq((zzgdt) zza2.zzal(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfzn(this, zzgdt.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgdz.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgdz zzgdzVar = (zzgdz) zzgmaVar;
        if (!zzgdzVar.zzg().zzD()) {
            zzgim.zzb(zzgdzVar.zza(), 0);
            zzfzx.zza(zzgdzVar.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 4;
    }
}