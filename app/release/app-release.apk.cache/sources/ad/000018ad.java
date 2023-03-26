package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class HashAccumulator {
    @VisibleForTesting
    public static int zaa = 31;
    private int zab = 1;

    @x1
    @KeepForSdk
    public HashAccumulator addObject(@z1 Object obj) {
        this.zab = (zaa * this.zab) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zab;
    }

    @x1
    public final HashAccumulator zaa(boolean z) {
        this.zab = (zaa * this.zab) + (z ? 1 : 0);
        return this;
    }
}