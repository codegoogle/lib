package com.p7700g.p99005;

import java.util.Arrays;
import java.util.List;

/* compiled from: DependencyCycleException.java */
/* loaded from: classes3.dex */
public class ap2 extends bp2 {
    private final List<so2<?>> s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ap2(List<so2<?>> list) {
        super(r0.toString());
        StringBuilder G = wo1.G("Dependency cycle detected: ");
        G.append(Arrays.toString(list.toArray()));
        this.s = list;
    }

    public List<so2<?>> f() {
        return this.s;
    }
}