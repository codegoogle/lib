package com.google.android.gms.internal.ads;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrk {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzfrk(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        StringBuilder G = wo1.G("Multiple entries with same key: ");
        G.append(this.zza);
        G.append(AppCenter.KEY_VALUE_DELIMITER);
        G.append(this.zzb);
        G.append(" and ");
        G.append(this.zza);
        G.append(AppCenter.KEY_VALUE_DELIMITER);
        G.append(this.zzc);
        return new IllegalArgumentException(G.toString());
    }
}