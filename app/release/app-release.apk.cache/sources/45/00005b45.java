package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: classes.dex */
public class s40 {
    @r2
    public final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    private final d50 b;

    public s40(d50 d50Var) {
        this.b = d50Var;
    }

    public <T> LiveData<T> a(String[] strArr, boolean z, Callable<T> callable) {
        return new h50(this.b, this, z, callable, strArr);
    }

    public void b(LiveData liveData) {
        this.a.add(liveData);
    }

    public void c(LiveData liveData) {
        this.a.remove(liveData);
    }
}