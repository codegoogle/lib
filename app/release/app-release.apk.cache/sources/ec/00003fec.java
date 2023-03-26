package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* compiled from: BaseHttpStack.java */
/* loaded from: classes3.dex */
public abstract class e53 implements m53 {
    @Override // com.p7700g.p99005.m53
    @Deprecated
    public final HttpResponse a(t43<?> request, Map<String, String> additionalHeaders) throws IOException, e43 {
        l53 b = b(request, additionalHeaders);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b.d(), ""));
        ArrayList arrayList = new ArrayList();
        for (l43 l43Var : b.c()) {
            arrayList.add(new BasicHeader(l43Var.a(), l43Var.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream a = b.a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength(b.b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract l53 b(t43<?> request, Map<String, String> additionalHeaders) throws IOException, e43;
}