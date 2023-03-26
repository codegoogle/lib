package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zacp;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @x1
    public final PendingResult<S> createFailedResult(@x1 Status status) {
        return new zacp(status);
    }

    @x1
    public Status onFailure(@x1 Status status) {
        return status;
    }

    @s2
    @z1
    public abstract PendingResult<S> onSuccess(@x1 R r);
}