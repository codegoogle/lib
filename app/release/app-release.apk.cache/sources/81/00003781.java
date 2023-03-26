package com.microsoft.appcenter.utils;

import android.os.AsyncTask;
import com.p7700g.p99005.x1;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public class AsyncTaskUtils {
    @x1
    @SafeVarargs
    public static <Params, Type extends AsyncTask<Params, ?, ?>> Type execute(String str, @x1 Type type, Params... paramsArr) {
        try {
            return (Type) type.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (RejectedExecutionException e) {
            AppCenterLog.warn(str, "THREAD_POOL_EXECUTOR saturated, fall back on SERIAL_EXECUTOR which has an unbounded queue", e);
            return (Type) type.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, paramsArr);
        }
    }
}