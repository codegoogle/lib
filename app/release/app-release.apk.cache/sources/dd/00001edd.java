package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.util.DeviceProperties;
import com.ironsource.sdk.controller.v;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbic {
    private final String zza = (String) zzbjj.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbic(Context context, String str) {
        String packageName;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put(v.a, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put(AbstractLog.DEVICE, com.google.android.gms.ads.internal.util.zzs.zzq());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(context) ? "0" : "1");
        Future zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcaa) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzcaa) zzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzix)).booleanValue()) {
            this.zzb.put("is_bstar", true == DeviceProperties.isBstar(context) ? "1" : "0");
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}