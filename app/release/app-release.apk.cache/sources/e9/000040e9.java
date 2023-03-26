package com.p7700g.p99005;

/* compiled from: TaskCompletionSource.java */
/* loaded from: classes.dex */
public class eq0<TResult> {
    @x1
    private final dq0<TResult> a = new dq0<>();

    @x1
    public dq0<TResult> a() {
        return this.a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(@z1 TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.a.V();
    }

    public boolean f(Exception exc) {
        return this.a.W(exc);
    }

    public boolean g(@z1 TResult tresult) {
        return this.a.X(tresult);
    }
}