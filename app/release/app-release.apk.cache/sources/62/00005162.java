package com.p7700g.p99005;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry.java */
/* loaded from: classes2.dex */
public final class my1 {
    private final List<ImageHeaderParser> a = new ArrayList();

    public synchronized void a(@x1 ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    @x1
    public synchronized List<ImageHeaderParser> b() {
        return this.a;
    }
}