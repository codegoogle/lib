package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzftx extends zzftz {
    public zzftx(zzfvl zzfvlVar, zzfuj zzfujVar) {
        super(zzfvlVar, zzfujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzfuj zzfujVar = (zzfuj) obj;
        zzfvl zza = zzfujVar.zza(obj2);
        zzfou.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfujVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfvl) obj);
    }
}