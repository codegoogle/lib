package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahw {
    public final int zza;
    public final long zzb;

    private zzahw(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzahw zza(zzys zzysVar, zzdy zzdyVar) throws IOException {
        ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, 8, false);
        zzdyVar.zzF(0);
        return new zzahw(zzdyVar.zze(), zzdyVar.zzq());
    }
}