package com.p7700g.p99005;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpResponse.java */
/* loaded from: classes3.dex */
public final class l53 {
    private final int a;
    private final List<l43> b;
    private final int c;
    private final InputStream d;

    public l53(int statusCode, List<l43> headers) {
        this(statusCode, headers, -1, null);
    }

    public final InputStream a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final List<l43> c() {
        return Collections.unmodifiableList(this.b);
    }

    public final int d() {
        return this.a;
    }

    public l53(int statusCode, List<l43> headers, int contentLength, InputStream content) {
        this.a = statusCode;
        this.b = headers;
        this.c = contentLength;
        this.d = content;
    }
}