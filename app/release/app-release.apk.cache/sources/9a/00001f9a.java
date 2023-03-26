package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpc implements zzbom {
    private final zzbpb zza;

    public zzbpc(zzbpb zzbpbVar) {
        this.zza = zzbpbVar;
    }

    public static void zzb(zzcli zzcliVar, zzbpb zzbpbVar) {
        zzcliVar.zzaf("/reward", new zzbpc(zzbpbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzcax zzcaxVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzcaxVar = new zzcax(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzcfi.zzk("Unable to parse reward amount.", e);
            }
            this.zza.zza(zzcaxVar);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}