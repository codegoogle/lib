package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import com.p7700g.p99005.i2;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkContinuation.java */
/* loaded from: classes.dex */
public abstract class cc0 {
    @x1
    public static cc0 a(@x1 List<cc0> continuations) {
        return continuations.get(0).b(continuations);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public abstract cc0 b(@x1 List<cc0> continuations);

    @x1
    public abstract wb0 c();

    @x1
    public abstract gn2<List<dc0>> d();

    @x1
    public abstract LiveData<List<dc0>> e();

    @x1
    public final cc0 f(@x1 vb0 work) {
        return g(Collections.singletonList(work));
    }

    @x1
    public abstract cc0 g(@x1 List<vb0> work);
}