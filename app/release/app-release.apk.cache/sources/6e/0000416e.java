package com.p7700g.p99005;

import com.google.gson.Gson;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: CarrierCnl.java */
/* loaded from: classes.dex */
public class f21 implements d21 {
    @x1
    private static final ExecutorService a = Executors.newSingleThreadExecutor();
    @x1
    public final String b;
    private final h31 c;
    @x1
    private final Executor d;
    @x1
    public final l21 e;

    public f21(@x1 Gson gson, @x1 x31 x31Var, @x1 String str, @x1 h31 h31Var, @x1 Executor executor) {
        this.b = str;
        this.c = h31Var;
        this.d = executor;
        this.e = new l21(gson, x31Var);
    }

    private /* synthetic */ Object d() throws Exception {
        this.e.clear(this.b);
        return null;
    }

    private /* synthetic */ Boolean f(dq0 dq0Var) throws Exception {
        return Boolean.valueOf(n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ List i() throws Exception {
        return this.e.a(this.b);
    }

    private /* synthetic */ Object j(List list) throws Exception {
        this.e.b(this.b, list);
        return null;
    }

    private /* synthetic */ Boolean l(dq0 dq0Var) throws Exception {
        return Boolean.valueOf(n());
    }

    private boolean n() {
        this.c.e(new b41());
        return true;
    }

    @Override // com.p7700g.p99005.d21
    public void a(@x1 va1 va1Var) {
        dq0.e(new Callable() { // from class: com.p7700g.p99005.tw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f21.this.e();
                return null;
            }
        }, a).q(new aq0() { // from class: com.p7700g.p99005.vw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return f21.this.g(dq0Var);
            }
        }).s(a21.b(va1Var), this.d);
    }

    @Override // com.p7700g.p99005.d21
    public void b(@x1 final List<j21> list, @x1 va1 va1Var) {
        dq0.e(new Callable() { // from class: com.p7700g.p99005.sw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f21.this.k(list);
                return null;
            }
        }, a).q(new aq0() { // from class: com.p7700g.p99005.uw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return f21.this.m(dq0Var);
            }
        }).s(a21.b(va1Var), this.d);
    }

    @Override // com.p7700g.p99005.d21
    public void c(@x1 ua1<List<j21>> ua1Var) {
        dq0.e(new Callable() { // from class: com.p7700g.p99005.rw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f21.this.i();
            }
        }, a).s(a21.a(ua1Var), this.d);
    }

    public /* synthetic */ Object e() {
        d();
        return null;
    }

    public /* synthetic */ Boolean g(dq0 dq0Var) {
        return Boolean.valueOf(n());
    }

    public /* synthetic */ Object k(List list) {
        this.e.b(this.b, list);
        return null;
    }

    public /* synthetic */ Boolean m(dq0 dq0Var) {
        return Boolean.valueOf(n());
    }
}