package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgri;
import com.p7700g.p99005.a6;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzn implements zzbiv {
    public final /* synthetic */ zzbix zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ Uri zzc;

    public zzn(zzs zzsVar, zzbix zzbixVar, Context context, Uri uri) {
        this.zza = zzbixVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zza() {
        a6 d = new a6.a(this.zza.zza()).d();
        d.P.setPackage(zzgri.zza(this.zzb));
        d.c(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}