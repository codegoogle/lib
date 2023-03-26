package com.microsoft.appcenter.http;

import android.text.TextUtils;
import com.p7700g.p99005.x1;
import java.io.IOException;

/* loaded from: classes3.dex */
public class HttpException extends IOException {
    private final HttpResponse mHttpResponse;

    public HttpException(@x1 HttpResponse httpResponse) {
        super(getDetailMessage(httpResponse.getStatusCode(), httpResponse.getPayload()));
        this.mHttpResponse = httpResponse;
    }

    @x1
    private static String getDetailMessage(int i, @x1 String str) {
        if (TextUtils.isEmpty(str)) {
            return String.valueOf(i);
        }
        return i + " - " + str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mHttpResponse.equals(((HttpException) obj).mHttpResponse);
    }

    public HttpResponse getHttpResponse() {
        return this.mHttpResponse;
    }

    public int hashCode() {
        return this.mHttpResponse.hashCode();
    }
}