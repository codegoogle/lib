package com.p7700g.p99005;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper.java */
/* loaded from: classes.dex */
public final class b0 {
    private final Set<c0> a = new CopyOnWriteArraySet();
    private volatile Context b;

    public void a(@x1 c0 c0Var) {
        if (this.b != null) {
            c0Var.a(this.b);
        }
        this.a.add(c0Var);
    }

    public void b() {
        this.b = null;
    }

    public void c(@x1 Context context) {
        this.b = context;
        for (c0 c0Var : this.a) {
            c0Var.a(context);
        }
    }

    @z1
    public Context d() {
        return this.b;
    }

    public void e(@x1 c0 c0Var) {
        this.a.remove(c0Var);
    }
}