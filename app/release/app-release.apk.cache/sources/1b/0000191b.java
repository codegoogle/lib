package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class BooleanResult implements Result {
    private final Status zaa;
    private final boolean zab;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@x1 Status status, boolean z) {
        this.zaa = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.zab = z;
    }

    @KeepForSdk
    public final boolean equals(@z1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof BooleanResult) {
            BooleanResult booleanResult = (BooleanResult) obj;
            return this.zaa.equals(booleanResult.zaa) && this.zab == booleanResult.zab;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.Result
    @x1
    @KeepForSdk
    public Status getStatus() {
        return this.zaa;
    }

    @KeepForSdk
    public boolean getValue() {
        return this.zab;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.zaa.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zab ? 1 : 0);
    }
}