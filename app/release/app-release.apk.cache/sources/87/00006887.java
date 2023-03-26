package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.i2;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: TransportRuntime.java */
@rl4
/* loaded from: classes2.dex */
public class z42 implements y42 {
    private static volatile a52 a;
    private final v92 b;
    private final v92 c;
    private final l72 d;
    private final e82 e;

    @ml4
    public z42(@ca2 v92 v92Var, @w92 v92 v92Var2, l72 l72Var, e82 e82Var, g82 g82Var) {
        this.b = v92Var;
        this.c = v92Var2;
        this.d = l72Var;
        this.e = e82Var;
        g82Var.a();
    }

    private p42 b(u42 u42Var) {
        return p42.a().i(this.b.a()).k(this.c.a()).j(u42Var.g()).h(new o42(u42Var.b(), u42Var.d())).g(u42Var.c().a()).d();
    }

    public static z42 c() {
        a52 a52Var = a;
        if (a52Var != null) {
            return a52Var.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b32> d(m42 m42Var) {
        if (m42Var instanceof n42) {
            return Collections.unmodifiableSet(((n42) m42Var).a());
        }
        return Collections.singleton(b32.b("proto"));
    }

    public static void f(Context context) {
        if (a == null) {
            synchronized (z42.class) {
                if (a == null) {
                    a = l42.d().a(context).build();
                }
            }
        }
    }

    @i2({i2.a.TESTS})
    @r2
    public static void i(a52 a52Var, Callable<Void> callable) throws Throwable {
        a52 a52Var2;
        synchronized (z42.class) {
            a52Var2 = a;
            a = a52Var;
        }
        try {
            callable.call();
            synchronized (z42.class) {
                a = a52Var2;
            }
        } catch (Throwable th) {
            synchronized (z42.class) {
                a = a52Var2;
                throw th;
            }
        }
    }

    @Override // com.p7700g.p99005.y42
    public void a(u42 u42Var, i32 i32Var) {
        this.d.a(u42Var.f().e(u42Var.c().c()), b(u42Var), i32Var);
    }

    @i2({i2.a.LIBRARY})
    public e82 e() {
        return this.e;
    }

    public h32 g(m42 m42Var) {
        return new w42(d(m42Var), v42.a().b(m42Var.getName()).c(m42Var.getExtras()).a(), this);
    }

    @Deprecated
    public h32 h(String str) {
        return new w42(d(null), v42.a().b(str).a(), this);
    }
}