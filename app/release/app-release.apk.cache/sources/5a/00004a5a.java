package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.i2;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: RemoteWorkManager.java */
/* loaded from: classes.dex */
public abstract class jg0 {
    @x1
    public static jg0 o(@x1 Context context) {
        jg0 K = rc0.H(context).K();
        if (K != null) {
            return K;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @x1
    public final ig0 a(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 vb0 work) {
        return b(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @x1
    public abstract ig0 b(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 List<vb0> work);

    @x1
    public final ig0 c(@x1 vb0 work) {
        return d(Collections.singletonList(work));
    }

    @x1
    public abstract ig0 d(@x1 List<vb0> work);

    @x1
    public abstract gn2<Void> e();

    @x1
    public abstract gn2<Void> f(@x1 String tag);

    @x1
    public abstract gn2<Void> g(@x1 String uniqueWorkName);

    @x1
    public abstract gn2<Void> h(@x1 UUID id);

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public abstract gn2<Void> i(@x1 cc0 continuation);

    @x1
    public abstract gn2<Void> j(@x1 gc0 request);

    @x1
    public abstract gn2<Void> k(@x1 List<gc0> requests);

    @x1
    public abstract gn2<Void> l(@x1 String uniqueWorkName, @x1 mb0 existingPeriodicWorkPolicy, @x1 yb0 periodicWork);

    @x1
    public final gn2<Void> m(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 vb0 work) {
        return n(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @x1
    public abstract gn2<Void> n(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 List<vb0> work);

    @x1
    public abstract gn2<List<dc0>> p(@x1 fc0 workQuery);

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public abstract gn2<Void> q(@x1 UUID id, @x1 kb0 data);
}