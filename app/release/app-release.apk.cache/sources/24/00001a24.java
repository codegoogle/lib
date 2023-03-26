package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class PendingResultUtil {
    private static final zas zaa = new zao();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        @z1
        T convert(@x1 R r);
    }

    @x1
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@x1 PendingResult<R> pendingResult, @x1 T t) {
        return toTask(pendingResult, new zaq(t));
    }

    @x1
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@x1 PendingResult<R> pendingResult, @x1 ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.addStatusListener(new zap(pendingResult, taskCompletionSource, resultConverter, zasVar));
        return taskCompletionSource.getTask();
    }

    @x1
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@x1 PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zar());
    }
}