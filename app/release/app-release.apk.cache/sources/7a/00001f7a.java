package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.microsoft.appcenter.AppCenter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbny implements zzbom {
    public static final /* synthetic */ zzbny zza = new zzbny();

    private /* synthetic */ zzbny() {
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        zzcmj zzcmjVar = (zzcmj) obj;
        zzbom zzbomVar = zzbol.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
            zzcfi.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzcfi.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcmjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + AppCenter.PAIR_DELIMITER + valueOf);
        ((zzbrd) zzcmjVar).zzd("openableApp", hashMap);
    }
}