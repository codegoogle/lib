package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class TransformedResult<R extends Result> {
    public abstract void andFinally(@x1 ResultCallbacks<? super R> resultCallbacks);

    @x1
    public abstract <S extends Result> TransformedResult<S> then(@x1 ResultTransform<? super R, ? extends S> resultTransform);
}