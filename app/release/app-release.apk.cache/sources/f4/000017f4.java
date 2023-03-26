package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzflx;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzh implements zzflx {
    public final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zza(int i, long j) {
        zzfku zzfkuVar;
        zzfkuVar = this.zza.zzi;
        zzfkuVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zzb(int i, long j, String str) {
        zzfku zzfkuVar;
        zzfkuVar = this.zza.zzi;
        zzfkuVar.zze(i, System.currentTimeMillis() - j, str);
    }
}