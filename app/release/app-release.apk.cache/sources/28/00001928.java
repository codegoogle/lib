package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.p7700g.p99005.x1;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class PendingResult<R extends Result> {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface StatusListener {
        @KeepForSdk
        void onComplete(@x1 Status status);
    }

    @KeepForSdk
    public void addStatusListener(@x1 StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @x1
    public abstract R await();

    @x1
    public abstract R await(long j, @x1 TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@x1 ResultCallback<? super R> resultCallback);

    public abstract void setResultCallback(@x1 ResultCallback<? super R> resultCallback, long j, @x1 TimeUnit timeUnit);

    @x1
    public <S extends Result> TransformedResult<S> then(@x1 ResultTransform<? super R, ? extends S> resultTransform) {
        throw new UnsupportedOperationException();
    }
}