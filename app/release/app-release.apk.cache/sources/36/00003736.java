package com.microsoft.appcenter.http;

import android.os.AsyncTask;
import com.microsoft.appcenter.http.DefaultHttpClientCallTask;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.HandlerUtils;
import com.p7700g.p99005.r2;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public class DefaultHttpClient implements HttpClient, DefaultHttpClientCallTask.Tracker {
    public static final String CHARSET_NAME = "UTF-8";
    public static final String CONTENT_ENCODING_KEY = "Content-Encoding";
    public static final String CONTENT_ENCODING_VALUE = "gzip";
    public static final String CONTENT_TYPE_KEY = "Content-Type";
    public static final String CONTENT_TYPE_VALUE = "application/json";
    public static final String METHOD_DELETE = "DELETE";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String X_MS_RETRY_AFTER_MS_HEADER = "x-ms-retry-after-ms";
    private final boolean mCompressionEnabled;
    private final Set<DefaultHttpClientCallTask> mTasks;

    public DefaultHttpClient() {
        this(true);
    }

    @Override // com.microsoft.appcenter.http.HttpClient
    public ServiceCall callAsync(String str, String str2, Map<String, String> map, HttpClient.CallTemplate callTemplate, final ServiceCallback serviceCallback) {
        final DefaultHttpClientCallTask defaultHttpClientCallTask = new DefaultHttpClientCallTask(str, str2, map, callTemplate, serviceCallback, this, this.mCompressionEnabled);
        try {
            defaultHttpClientCallTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (RejectedExecutionException e) {
            HandlerUtils.runOnUiThread(new Runnable() { // from class: com.microsoft.appcenter.http.DefaultHttpClient.1
                @Override // java.lang.Runnable
                public void run() {
                    serviceCallback.onCallFailed(e);
                }
            });
        }
        return new ServiceCall() { // from class: com.microsoft.appcenter.http.DefaultHttpClient.2
            @Override // com.microsoft.appcenter.http.ServiceCall
            public void cancel() {
                defaultHttpClientCallTask.cancel(true);
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.mTasks.size() > 0) {
            AppCenterLog.debug("AppCenter", "Cancelling " + this.mTasks.size() + " network call(s).");
            for (DefaultHttpClientCallTask defaultHttpClientCallTask : this.mTasks) {
                defaultHttpClientCallTask.cancel(true);
            }
            this.mTasks.clear();
        }
    }

    @r2
    public Set<DefaultHttpClientCallTask> getTasks() {
        return this.mTasks;
    }

    @r2
    public boolean isCompressionEnabled() {
        return this.mCompressionEnabled;
    }

    @Override // com.microsoft.appcenter.http.DefaultHttpClientCallTask.Tracker
    public synchronized void onFinish(DefaultHttpClientCallTask defaultHttpClientCallTask) {
        this.mTasks.remove(defaultHttpClientCallTask);
    }

    @Override // com.microsoft.appcenter.http.DefaultHttpClientCallTask.Tracker
    public synchronized void onStart(DefaultHttpClientCallTask defaultHttpClientCallTask) {
        this.mTasks.add(defaultHttpClientCallTask);
    }

    @Override // com.microsoft.appcenter.http.HttpClient
    public void reopen() {
    }

    public DefaultHttpClient(boolean z) {
        this.mTasks = new HashSet();
        this.mCompressionEnabled = z;
    }
}