package com.p7700g.p99005;

/* compiled from: CompletableCallbackWithAction.java */
/* loaded from: classes2.dex */
public class wa1 implements va1 {
    @x1
    private final va1 b;
    @x1
    private final ta1 c;

    public wa1(@x1 va1 va1Var, @x1 ta1 ta1Var) {
        this.b = va1Var;
        this.c = ta1Var;
    }

    @Override // com.p7700g.p99005.va1
    public void a(@x1 gc1 gc1Var) {
        try {
            this.c.run();
        } catch (Exception unused) {
        }
        this.b.a(gc1Var);
    }

    @Override // com.p7700g.p99005.va1
    public void complete() {
        try {
            this.c.run();
        } catch (Exception unused) {
        }
        this.b.complete();
    }
}