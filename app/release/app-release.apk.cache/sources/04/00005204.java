package com.p7700g.p99005;

/* compiled from: ResultConsumer.java */
/* loaded from: classes2.dex */
public class na1<T> {
    @x1
    private final eq0<?> a;
    @x1
    private final wp0 b;
    @x1
    private final xa1<T> c;

    public na1(@x1 eq0<?> eq0Var, @x1 wp0 wp0Var, @x1 xa1<T> xa1Var) {
        this.a = eq0Var;
        this.b = wp0Var;
        this.c = xa1Var;
    }

    public void a(@x1 T t) {
        if (this.b.a()) {
            this.a.b();
            return;
        }
        try {
            this.c.accept(t);
        } catch (Exception e) {
            this.a.c(e);
        }
    }
}