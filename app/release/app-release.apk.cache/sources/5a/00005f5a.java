package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: RetryHelper.java */
/* loaded from: classes.dex */
public class u41 {
    @x1
    public static final b a = bz0.a;
    @x1
    public static final b b = wy0.a;
    private static final kj1 c = kj1.b("RetryHelper");
    public static final int d = 3;
    public static final int e = 10;
    @x1
    private final Executor f;
    private final long g;
    private final long h;

    /* compiled from: RetryHelper.java */
    /* loaded from: classes.dex */
    public interface b {
        dq0<Boolean> a(int i, @x1 Throwable th);
    }

    /* compiled from: RetryHelper.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        @x1
        dq0<T> a(int i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u41(@x1 Executor executor) {
        this(executor, r0.toMillis(10L), r0.toMillis(60L));
        TimeUnit timeUnit = TimeUnit.SECONDS;
    }

    @x1
    private <T> dq0<T> a(@x1 final String str, @x1 final String str2, @x1 final c<T> cVar, final int i, int i2, @x1 final b bVar) {
        final int min = Math.min(Math.max(3, i2), 9);
        final String v = wo1.v("InternalRetry tag: ", str, " uuid: ", str2);
        c.c(wo1.t(v, " step: %d maxRetry: %d"), Integer.valueOf(i), Integer.valueOf(min));
        yp0 yp0Var = new yp0();
        wp0 j = yp0Var.j();
        yp0Var.e(this.h);
        return (dq0<T>) q(cVar.a(i), j).w(new aq0() { // from class: com.p7700g.p99005.az0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return u41.this.g(v, bVar, i, min, str, str2, cVar, dq0Var);
            }
        }, this.f);
    }

    /* renamed from: b */
    public /* synthetic */ dq0 c(String str, String str2, c cVar, int i, int i2, b bVar, dq0 dq0Var) throws Exception {
        return a(str, str2, cVar, i + 1, i2, bVar);
    }

    /* renamed from: d */
    public /* synthetic */ dq0 e(String str, final int i, final int i2, Exception exc, final String str2, final String str3, final c cVar, final b bVar, dq0 dq0Var, dq0 dq0Var2) throws Exception {
        Boolean bool = (Boolean) dq0Var2.F();
        kj1 kj1Var = c;
        kj1Var.c("%s should retry: %s", str, bool);
        if (bool != null && bool.booleanValue() && i < i2 - 1) {
            kj1Var.g(exc, "%s retry step: %s", str, Integer.valueOf(i));
            return dq0.z(p(i)).u(new aq0() { // from class: com.p7700g.p99005.yy0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var3) {
                    return u41.this.c(str2, str3, cVar, i, i2, bVar, dq0Var3);
                }
            });
        }
        kj1Var.g(exc, "%s giving Up", str);
        if (dq0Var.H()) {
            return dq0.C(new CancellationException());
        }
        return dq0.C(exc);
    }

    /* renamed from: f */
    public /* synthetic */ dq0 g(final String str, final b bVar, final int i, final int i2, final String str2, final String str3, final c cVar, final dq0 dq0Var) throws Exception {
        final Exception E = dq0Var.E();
        if (!dq0Var.J() && !dq0Var.H()) {
            c.c("%s returning result", str);
            return dq0.D(dq0Var.F());
        }
        if (dq0Var.J()) {
            c.f(dq0Var.E());
        } else if (dq0Var.H()) {
            c.c(wo1.t(str, " cancelled"), new Object[0]);
            return dq0.C(new CancellationException());
        }
        return bVar.a(i, E).w(new aq0() { // from class: com.p7700g.p99005.xy0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return u41.this.e(str, i, i2, E, str2, str3, cVar, bVar, dq0Var, dq0Var2);
            }
        }, this.f);
    }

    public static /* synthetic */ Object j(eq0 eq0Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            eq0Var.f(dq0Var.E());
            return null;
        } else if (dq0Var.H()) {
            eq0Var.e();
            return null;
        } else {
            eq0Var.g(dq0Var.F());
            return null;
        }
    }

    private long p(int i) {
        return Math.min(TimeUnit.SECONDS.toMillis((i + 1) * 4), this.g);
    }

    @x1
    public <T> dq0<T> k(@x1 String str, int i, @x1 c<T> cVar) {
        return a(str, UUID.randomUUID().toString(), cVar, 0, i, a);
    }

    @x1
    public <T> dq0<T> l(@x1 String str, @x1 c<T> cVar) {
        return o(str, cVar, a);
    }

    @x1
    public <T> dq0<T> m(@x1 String str, @x1 c<T> cVar, int i) {
        return n(str, cVar, i, a);
    }

    @x1
    public <T> dq0<T> n(@x1 String str, @x1 c<T> cVar, int i, @x1 b bVar) {
        return a(str, UUID.randomUUID().toString(), cVar, 0, i, bVar);
    }

    @x1
    public <T> dq0<T> o(@x1 String str, @x1 c<T> cVar, @x1 b bVar) {
        return a(str, UUID.randomUUID().toString(), cVar, 0, 3, bVar);
    }

    @x1
    public <T> dq0<T> q(@x1 dq0<T> dq0Var, @x1 wp0 wp0Var) {
        final eq0 eq0Var = new eq0();
        wp0Var.b(new u11(eq0Var));
        dq0Var.q(new aq0() { // from class: com.p7700g.p99005.zy0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                u41.j(eq0.this, dq0Var2);
                return null;
            }
        });
        return eq0Var.a();
    }

    /* compiled from: RetryHelper.java */
    /* loaded from: classes.dex */
    public static class a implements b {
        @x1
        private final List<b> a;

        public a(@x1 List<b> list) {
            this.a = list;
        }

        public static /* synthetic */ Boolean b(dq0 dq0Var) throws Exception {
            List list = (List) dq0Var.F();
            for (int i = 0; list != null && i < list.size(); i++) {
                Boolean bool = (Boolean) list.get(i);
                if (bool != null && !bool.booleanValue()) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        @Override // com.p7700g.p99005.u41.b
        @x1
        public dq0<Boolean> a(int i, @x1 Throwable th) {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.a) {
                arrayList.add(bVar.a(i, th));
            }
            return dq0.b0(arrayList).q(vy0.a);
        }

        public a(@x1 b... bVarArr) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            arrayList.addAll(Arrays.asList(bVarArr));
        }
    }

    @r2(otherwise = 2)
    public u41(@x1 Executor executor, long j, long j2) {
        this.f = executor;
        this.g = j;
        this.h = j2;
    }
}