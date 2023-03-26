package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class l50 {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final d50 b;
    private volatile s60 c;

    public l50(d50 d50Var) {
        this.b = d50Var;
    }

    private s60 c() {
        return this.b.f(d());
    }

    private s60 e(boolean z) {
        if (z) {
            if (this.c == null) {
                this.c = c();
            }
            return this.c;
        }
        return c();
    }

    public s60 a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    public void b() {
        this.b.a();
    }

    public abstract String d();

    public void f(s60 s60Var) {
        if (s60Var == this.c) {
            this.a.set(false);
        }
    }
}