package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccd implements zzfuy {
    public final /* synthetic */ zzfvl zza;

    public zzccd(zzcce zzcceVar, zzfvl zzfvlVar) {
        this.zza = zzfvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        List list;
        list = zzcce.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = zzcce.zzc;
        list.remove(this.zza);
    }
}