package com.p7700g.p99005;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* compiled from: AdaptedHttpStack.java */
/* loaded from: classes3.dex */
public class d53 extends e53 {
    private final m53 a;

    public d53(m53 httpStack) {
        this.a = httpStack;
    }

    @Override // com.p7700g.p99005.e53
    public l53 b(t43<?> request, Map<String, String> additionalHeaders) throws IOException, e43 {
        try {
            HttpResponse a = this.a.a(request, additionalHeaders);
            int statusCode = a.getStatusLine().getStatusCode();
            Header[] allHeaders = a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new l43(header.getName(), header.getValue()));
            }
            if (a.getEntity() == null) {
                return new l53(statusCode, arrayList);
            }
            long contentLength = a.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new l53(statusCode, arrayList, (int) a.getEntity().getContentLength(), a.getEntity().getContent());
            }
            throw new IOException(wo1.p("Response too large: ", contentLength));
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}