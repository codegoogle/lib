package com.p7700g.p99005;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: URIProvider.java */
/* loaded from: classes3.dex */
public class pu3 implements yx3<URI> {
    @Override // com.p7700g.p99005.yx3
    public boolean c(Class<?> cls) {
        return cls == URI.class;
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: d */
    public URI a(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(wo1.u("Error parsing uri '", str, "'"), e);
        }
    }

    @Override // com.p7700g.p99005.mn4.a
    /* renamed from: e */
    public String b(URI uri) {
        return uri.toASCIIString();
    }
}