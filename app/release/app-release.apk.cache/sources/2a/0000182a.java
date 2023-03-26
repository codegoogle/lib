package com.google.android.gms.ads.mediation.customevent;

import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    @z1
    public Object getExtra(@x1 String str) {
        return this.zza.get(str);
    }

    public void setExtra(@x1 String str, @x1 Object obj) {
        this.zza.put(str, obj);
    }
}