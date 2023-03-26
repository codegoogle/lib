package com.google.android.gms.internal.ads;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.d.a.b;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcuw {
    private final zzfgp zza;
    private final zzdwh zzb;
    private final zzfbx zzc;

    public zzcuw(zzdwh zzdwhVar, zzfbx zzfbxVar, zzfgp zzfgpVar) {
        this.zza = zzfgpVar;
        this.zzb = zzdwhVar;
        this.zzc = zzfbxVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : b.da : "cb" : b.h : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgp zzfgpVar = this.zza;
            zzfgo zzb = zzfgo.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j));
            zzb.zza(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "app_open_ad");
            zzb.zza("acr", zzb(i));
            zzfgpVar.zzb(zzb);
            return;
        }
        zzdwg zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "app_open_ad");
        zza.zzb("acr", zzb(i));
        zza.zzg();
    }
}