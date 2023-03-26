package com.p7700g.p99005;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class p00 {
    private final HashMap<String, k00> a = new HashMap<>();

    public final void a() {
        for (k00 k00Var : this.a.values()) {
            k00Var.b();
        }
        this.a.clear();
    }

    public final k00 b(String str) {
        return this.a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, k00 k00Var) {
        k00 put = this.a.put(str, k00Var);
        if (put != null) {
            put.e();
        }
    }
}