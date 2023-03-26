package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzdqk implements zzfok {
    public static final /* synthetic */ zzdqk zza = new zzdqk();

    private /* synthetic */ zzdqk() {
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdql zzdqlVar : (List) obj) {
            if (zzdqlVar != null) {
                arrayList.add(zzdqlVar);
            }
        }
        return arrayList;
    }
}