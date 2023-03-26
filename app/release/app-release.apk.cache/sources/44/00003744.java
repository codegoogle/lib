package com.microsoft.appcenter.http;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class HttpResponse {
    private final Map<String, String> headers;
    private final String payload;
    private final int statusCode;

    public HttpResponse(int i) {
        this(i, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.statusCode == httpResponse.statusCode && this.payload.equals(httpResponse.payload) && this.headers.equals(httpResponse.headers);
    }

    @x1
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @x1
    public String getPayload() {
        return this.payload;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.headers.hashCode() + wo1.x(this.payload, this.statusCode * 31, 31);
    }

    public HttpResponse(int i, @x1 String str) {
        this(i, str, new HashMap());
    }

    public HttpResponse(int i, @x1 String str, @x1 Map<String, String> map) {
        this.payload = str;
        this.statusCode = i;
        this.headers = map;
    }
}