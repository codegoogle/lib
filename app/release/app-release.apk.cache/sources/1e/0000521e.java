package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class nd0<T> implements hd0<T> {
    private final List<String> a = new ArrayList();
    private T b;
    private yd0<T> c;
    private a d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(@x1 List<String> workSpecIds);

        void b(@x1 List<String> workSpecIds);
    }

    public nd0(yd0<T> tracker) {
        this.c = tracker;
    }

    private void h(@z1 a callback, @z1 T currentValue) {
        if (this.a.isEmpty() || callback == null) {
            return;
        }
        if (currentValue != null && !c(currentValue)) {
            callback.a(this.a);
        } else {
            callback.b(this.a);
        }
    }

    @Override // com.p7700g.p99005.hd0
    public void a(@z1 T newValue) {
        this.b = newValue;
        h(this.d, newValue);
    }

    public abstract boolean b(@x1 we0 workSpec);

    public abstract boolean c(@x1 T currentValue);

    public boolean d(@x1 String workSpecId) {
        T t = this.b;
        return t != null && c(t) && this.a.contains(workSpecId);
    }

    public void e(@x1 Iterable<we0> workSpecs) {
        this.a.clear();
        for (we0 we0Var : workSpecs) {
            if (b(we0Var)) {
                this.a.add(we0Var.d);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h(this.d, this.b);
    }

    public void f() {
        if (this.a.isEmpty()) {
            return;
        }
        this.a.clear();
        this.c.c(this);
    }

    public void g(@z1 a callback) {
        if (this.d != callback) {
            this.d = callback;
            h(callback, this.b);
        }
    }
}