package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcyz implements zzfuy {
    public final /* synthetic */ zzcza zza;

    public zzcyz(zzcza zzczaVar) {
        this.zza = zzczaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzdgx zzdgxVar;
        zzdgxVar = this.zza.zzf;
        zzdgxVar.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdgx zzdgxVar;
        Void r2 = (Void) obj;
        zzdgxVar = this.zza.zzf;
        zzdgxVar.zzh(true);
    }
}