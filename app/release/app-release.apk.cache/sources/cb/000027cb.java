package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzeor implements zzfok {
    public static final /* synthetic */ zzeor zza = new zzeor();

    private /* synthetic */ zzeor() {
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzetf() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
            }
        };
    }
}