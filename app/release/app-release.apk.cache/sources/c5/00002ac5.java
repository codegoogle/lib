package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfqw extends zzfqy {
    public zzfqw() {
        super(null);
    }

    public static final zzfqy zzf(int i) {
        zzfqy zzfqyVar;
        zzfqy zzfqyVar2;
        zzfqy zzfqyVar3;
        if (i < 0) {
            zzfqyVar3 = zzfqy.zzb;
            return zzfqyVar3;
        } else if (i > 0) {
            zzfqyVar2 = zzfqy.zzc;
            return zzfqyVar2;
        } else {
            zzfqyVar = zzfqy.zza;
            return zzfqyVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zzd(boolean z, boolean z2) {
        return zzf(zzftn.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqy
    public final zzfqy zze(boolean z, boolean z2) {
        return zzf(zzftn.zza(false, false));
    }
}