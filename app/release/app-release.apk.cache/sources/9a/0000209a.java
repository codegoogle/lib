package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbyp extends zzbyj {
    public final /* synthetic */ List zza;

    public zzbyp(zzbys zzbysVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze(String str) {
        zzcfi.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(List list) {
        zzcfi.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}