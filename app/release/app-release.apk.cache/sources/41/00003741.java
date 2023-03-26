package com.microsoft.appcenter.http;

import android.os.Handler;
import android.os.Looper;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class HttpClientRetryer extends HttpClientDecorator {
    @r2
    public static final long[] RETRY_INTERVALS;
    private final Handler mHandler;
    private final Random mRandom;

    /* loaded from: classes3.dex */
    public class RetryableCall extends HttpClientCallDecorator {
        private int mRetryCount;

        public RetryableCall(HttpClient httpClient, String str, String str2, Map<String, String> map, HttpClient.CallTemplate callTemplate, ServiceCallback serviceCallback) {
            super(httpClient, str, str2, map, callTemplate, serviceCallback);
        }

        @Override // com.microsoft.appcenter.http.HttpClientCallDecorator, com.microsoft.appcenter.http.ServiceCall
        public synchronized void cancel() {
            HttpClientRetryer.this.mHandler.removeCallbacks(this);
            super.cancel();
        }

        @Override // com.microsoft.appcenter.http.HttpClientCallDecorator, com.microsoft.appcenter.http.ServiceCallback
        public void onCallFailed(Exception exc) {
            String str;
            int i = this.mRetryCount;
            long[] jArr = HttpClientRetryer.RETRY_INTERVALS;
            if (i < jArr.length && HttpUtils.isRecoverableError(exc)) {
                long parseLong = (!(exc instanceof HttpException) || (str = ((HttpException) exc).getHttpResponse().getHeaders().get(DefaultHttpClient.X_MS_RETRY_AFTER_MS_HEADER)) == null) ? 0L : Long.parseLong(str);
                if (parseLong == 0) {
                    int i2 = this.mRetryCount;
                    this.mRetryCount = i2 + 1;
                    long j = jArr[i2] / 2;
                    parseLong = j + HttpClientRetryer.this.mRandom.nextInt((int) j);
                }
                StringBuilder G = wo1.G("Try #");
                G.append(this.mRetryCount);
                G.append(" failed and will be retried in ");
                G.append(parseLong);
                G.append(" ms");
                String sb = G.toString();
                if (exc instanceof UnknownHostException) {
                    sb = wo1.t(sb, " (UnknownHostException)");
                }
                AppCenterLog.warn("AppCenter", sb, exc);
                HttpClientRetryer.this.mHandler.postDelayed(this, parseLong);
                return;
            }
            this.mServiceCallback.onCallFailed(exc);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        RETRY_INTERVALS = new long[]{TimeUnit.SECONDS.toMillis(10L), timeUnit.toMillis(5L), timeUnit.toMillis(20L)};
    }

    public HttpClientRetryer(HttpClient httpClient) {
        this(httpClient, new Handler(Looper.getMainLooper()));
    }

    @Override // com.microsoft.appcenter.http.HttpClient
    public ServiceCall callAsync(String str, String str2, Map<String, String> map, HttpClient.CallTemplate callTemplate, ServiceCallback serviceCallback) {
        RetryableCall retryableCall = new RetryableCall(this.mDecoratedApi, str, str2, map, callTemplate, serviceCallback);
        retryableCall.run();
        return retryableCall;
    }

    @r2
    public HttpClientRetryer(HttpClient httpClient, Handler handler) {
        super(httpClient);
        this.mRandom = new Random();
        this.mHandler = handler;
    }
}