package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes2.dex */
public class AdaptedHttpStack extends BaseHttpStack {
    private final HttpStack mHttpStack;

    public AdaptedHttpStack(HttpStack httpStack) {
        this.mHttpStack = httpStack;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            org.apache.http.HttpResponse performRequest = this.mHttpStack.performRequest(request, map);
            int statusCode = performRequest.getStatusLine().getStatusCode();
            Header[] allHeaders = performRequest.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new com.android.volley.Header(header.getName(), header.getValue()));
            }
            if (performRequest.getEntity() == null) {
                return new HttpResponse(statusCode, arrayList);
            }
            long contentLength = performRequest.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new HttpResponse(statusCode, arrayList, (int) performRequest.getEntity().getContentLength(), performRequest.getEntity().getContent());
            }
            throw new IOException(wo1.p("Response too large: ", contentLength));
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}