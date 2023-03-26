package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.microsoft.appcenter.AppCenter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbnx implements zzbom {
    public static final /* synthetic */ zzbnx zza = new zzbnx();

    private /* synthetic */ zzbnx() {
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        zzcmj zzcmjVar = (zzcmj) obj;
        zzbom zzbomVar = zzbol.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzcfi.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcmjVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(AppCenter.PAIR_DELIMITER, 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + AppCenter.PAIR_DELIMITER + valueOf);
        }
        ((zzbrd) zzcmjVar).zzd("openableURLs", hashMap);
    }
}