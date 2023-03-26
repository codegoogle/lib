package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.Collections;
import java.util.List;

/* compiled from: RemoteWorkContinuation.java */
/* loaded from: classes.dex */
public abstract class ig0 {
    @x1
    public static ig0 a(@x1 List<ig0> continuations) {
        return continuations.get(0).b(continuations);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public abstract ig0 b(@x1 List<ig0> continuations);

    @x1
    public abstract gn2<Void> c();

    @x1
    public final ig0 d(@x1 vb0 work) {
        return e(Collections.singletonList(work));
    }

    @x1
    public abstract ig0 e(@x1 List<vb0> work);
}