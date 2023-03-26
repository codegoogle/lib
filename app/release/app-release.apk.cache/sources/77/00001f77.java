package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbnv implements zzbom {
    public static final /* synthetic */ zzbnv zza = new zzbnv();

    private /* synthetic */ zzbnv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        zzcmq zzcmqVar = (zzcmq) obj;
        zzbom zzbomVar = zzbol.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzaoc zzK = zzcmqVar.zzK();
            if (zzK != null) {
                zzK.zzc().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzcfi.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}