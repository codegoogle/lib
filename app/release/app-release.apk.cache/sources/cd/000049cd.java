package com.p7700g.p99005;

import com.p7700g.p99005.un3;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* compiled from: HttpClientStack.java */
@Deprecated
/* loaded from: classes3.dex */
public class j53 implements m53 {
    private static final String a = "Content-Type";
    public final HttpClient b;

    /* compiled from: HttpClientStack.java */
    /* loaded from: classes3.dex */
    public static final class a extends HttpEntityEnclosingRequestBase {
        public static final String s = "PATCH";

        public a() {
        }

        public String getMethod() {
            return "PATCH";
        }

        public a(final URI uri) {
            setURI(uri);
        }

        public a(final String uri) {
            setURI(URI.create(uri));
        }
    }

    public j53(HttpClient client) {
        this.b = client;
    }

    public static HttpUriRequest b(t43<?> request, Map<String, String> additionalHeaders) throws e43 {
        switch (request.p()) {
            case -1:
                byte[] s = request.s();
                if (s != null) {
                    HttpPost httpPost = new HttpPost(request.D());
                    httpPost.addHeader("Content-Type", request.t());
                    httpPost.setEntity(new ByteArrayEntity(s));
                    return httpPost;
                }
                return new HttpGet(request.D());
            case 0:
                return new HttpGet(request.D());
            case 1:
                HttpPost httpPost2 = new HttpPost(request.D());
                httpPost2.addHeader("Content-Type", request.k());
                e(httpPost2, request);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(request.D());
                httpPut.addHeader("Content-Type", request.k());
                e(httpPut, request);
                return httpPut;
            case 3:
                return new HttpDelete(request.D());
            case 4:
                return new HttpHead(request.D());
            case 5:
                return new HttpOptions(request.D());
            case 6:
                return new HttpTrace(request.D());
            case 7:
                a aVar = new a(request.D());
                aVar.addHeader("Content-Type", request.k());
                e(aVar, request);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static List<NameValuePair> c(Map<String, String> postParams) {
        ArrayList arrayList = new ArrayList(postParams.size());
        for (String str : postParams.keySet()) {
            arrayList.add(new BasicNameValuePair(str, postParams.get(str)));
        }
        return arrayList;
    }

    private static void e(HttpEntityEnclosingRequestBase httpRequest, t43<?> request) throws e43 {
        byte[] j = request.j();
        if (j != null) {
            httpRequest.setEntity(new ByteArrayEntity(j));
        }
    }

    private static void f(HttpUriRequest httpRequest, Map<String, String> headers) {
        for (String str : headers.keySet()) {
            httpRequest.setHeader(str, headers.get(str));
        }
    }

    @Override // com.p7700g.p99005.m53
    public HttpResponse a(t43<?> request, Map<String, String> additionalHeaders) throws IOException, e43 {
        HttpUriRequest b = b(request, additionalHeaders);
        f(b, additionalHeaders);
        f(b, request.o());
        d(b);
        HttpParams params = b.getParams();
        int A = request.A();
        HttpConnectionParams.setConnectionTimeout(params, un3.f.v);
        HttpConnectionParams.setSoTimeout(params, A);
        return this.b.execute(b);
    }

    public void d(HttpUriRequest request) throws IOException {
    }
}