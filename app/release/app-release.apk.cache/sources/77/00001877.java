package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzfuy;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzz implements zzfuy {
    public final /* synthetic */ zzaa zza;

    public zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzdwm zzdwmVar;
        zzdwc zzdwcVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzdwmVar = zzaaVar.zzr;
        zzdwcVar = zzaaVar.zzj;
        zzf.zzc(zzdwmVar, zzdwcVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzcfi.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* synthetic */ void zzb(@z1 Object obj) {
        zzam zzamVar = (zzam) obj;
        zzcfi.zze("Initialized webview successfully for SDKCore.");
    }
}