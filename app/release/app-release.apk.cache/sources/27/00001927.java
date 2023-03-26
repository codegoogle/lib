package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @x1
    public abstract R get();

    public abstract boolean isDone();
}