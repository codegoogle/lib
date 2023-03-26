package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcsv implements zzcsp {
    private final zzdzb zza;

    public zzcsv(zzdzb zzdzbVar) {
        this.zza = zzdzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zzj(zzdyx.SHAKE);
        } else if (c != 1) {
            this.zza.zzj(zzdyx.NONE);
        } else {
            this.zza.zzj(zzdyx.FLICK);
        }
    }
}