package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.yp2;
import java.util.List;

/* compiled from: BatchedLogRequest.java */
@AutoValue
@yp2
/* loaded from: classes2.dex */
public abstract class z32 {
    @x1
    public static z32 a(@x1 List<c42> list) {
        return new t32(list);
    }

    @x1
    public static qp2 b() {
        return new gq2().f(r32.b).g(true).e();
    }

    @x1
    @yp2.a(name = "logRequest")
    public abstract List<c42> c();
}