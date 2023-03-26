package com.microsoft.appcenter.http;

import com.p7700g.p99005.r2;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class HttpClientDecorator implements HttpClient {
    public final HttpClient mDecoratedApi;

    public HttpClientDecorator(HttpClient httpClient) {
        this.mDecoratedApi = httpClient;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mDecoratedApi.close();
    }

    @r2
    public HttpClient getDecoratedApi() {
        return this.mDecoratedApi;
    }

    @Override // com.microsoft.appcenter.http.HttpClient
    public void reopen() {
        this.mDecoratedApi.reopen();
    }
}