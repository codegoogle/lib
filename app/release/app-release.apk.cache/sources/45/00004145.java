package com.p7700g.p99005;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes2.dex */
public final class ey1 implements wx1 {
    private final Set<sz1<?>> s = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.s.clear();
    }

    @x1
    public List<sz1<?>> d() {
        return z02.k(this.s);
    }

    public void e(@x1 sz1<?> sz1Var) {
        this.s.add(sz1Var);
    }

    public void f(@x1 sz1<?> sz1Var) {
        this.s.remove(sz1Var);
    }

    @Override // com.p7700g.p99005.wx1
    public void onDestroy() {
        for (sz1 sz1Var : z02.k(this.s)) {
            sz1Var.onDestroy();
        }
    }

    @Override // com.p7700g.p99005.wx1
    public void onStart() {
        for (sz1 sz1Var : z02.k(this.s)) {
            sz1Var.onStart();
        }
    }

    @Override // com.p7700g.p99005.wx1
    public void onStop() {
        for (sz1 sz1Var : z02.k(this.s)) {
            sz1Var.onStop();
        }
    }
}