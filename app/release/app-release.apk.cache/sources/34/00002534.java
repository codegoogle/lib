package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzdqd implements zzfok {
    public static final /* synthetic */ zzdqd zza = new zzdqd();

    private /* synthetic */ zzdqd() {
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbkn zzbknVar : (List) obj) {
            if (zzbknVar != null) {
                arrayList.add(zzbknVar);
            }
        }
        return arrayList;
    }
}