package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbby implements Comparator {
    public zzbby(zzbbz zzbbzVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbn zzbbnVar = (zzbbn) obj;
        zzbbn zzbbnVar2 = (zzbbn) obj2;
        if (zzbbnVar.zzd() >= zzbbnVar2.zzd()) {
            if (zzbbnVar.zzd() > zzbbnVar2.zzd()) {
                return 1;
            }
            if (zzbbnVar.zzb() >= zzbbnVar2.zzb()) {
                if (zzbbnVar.zzb() > zzbbnVar2.zzb()) {
                    return 1;
                }
                float zzc = (zzbbnVar.zzc() - zzbbnVar.zzb()) * (zzbbnVar.zza() - zzbbnVar.zzd());
                float zzc2 = (zzbbnVar2.zzc() - zzbbnVar2.zzb()) * (zzbbnVar2.zza() - zzbbnVar2.zzd());
                if (zzc <= zzc2) {
                    return zzc < zzc2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}