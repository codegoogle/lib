package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeys implements zzfok {
    public final /* synthetic */ zzeyw zza;

    public zzeys(zzeyw zzeywVar) {
        this.zza = zzeywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfdy zze;
        zzeyv zzeyvVar;
        zzcfi.zzh("", (zzebn) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyw zzeywVar = this.zza;
        zze = zzeywVar.zze();
        zzeywVar.zzd = new zzeyv(null, zze, null);
        zzeyvVar = this.zza.zzd;
        return zzeyvVar;
    }
}