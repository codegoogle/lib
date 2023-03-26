package com.google.android.gms.internal.ads;

import com.anythink.expressad.foundation.d.c;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzboi implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        String str = (String) map.get("action");
        if (c.bZ.equals(str)) {
            zzcliVar.zzbn();
        } else if (c.ca.equals(str)) {
            zzcliVar.zzbo();
        }
    }
}