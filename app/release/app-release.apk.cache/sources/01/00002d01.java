package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzglm extends zzglo {
    private zzglm() {
        super(null);
    }

    public /* synthetic */ zzglm(zzgll zzgllVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzglo
    public final List zza(Object obj, long j) {
        zzgkz zzgkzVar = (zzgkz) zzgnu.zzh(obj, j);
        if (zzgkzVar.zzc()) {
            return zzgkzVar;
        }
        int size = zzgkzVar.size();
        zzgkz zzd = zzgkzVar.zzd(size == 0 ? 10 : size + size);
        zzgnu.zzv(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzb(Object obj, long j) {
        ((zzgkz) zzgnu.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzc(Object obj, Object obj2, long j) {
        zzgkz zzgkzVar = (zzgkz) zzgnu.zzh(obj, j);
        zzgkz zzgkzVar2 = (zzgkz) zzgnu.zzh(obj2, j);
        int size = zzgkzVar.size();
        int size2 = zzgkzVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgkzVar.zzc()) {
                zzgkzVar = zzgkzVar.zzd(size2 + size);
            }
            zzgkzVar.addAll(zzgkzVar2);
        }
        if (size > 0) {
            zzgkzVar2 = zzgkzVar;
        }
        zzgnu.zzv(obj, j, zzgkzVar2);
    }
}