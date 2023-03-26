package com.p7700g.p99005;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.xq2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultHeartBeatInfo.java */
/* loaded from: classes3.dex */
public class uq2 implements xq2 {
    private static final ThreadFactory a = nq2.a;
    private er2<yq2> b;
    private final Set<vq2> c;
    private final Executor d;

    private uq2(final Context context, Set<vq2> set) {
        this(new ep2(new er2() { // from class: com.p7700g.p99005.pq2
            @Override // com.p7700g.p99005.er2
            public final Object get() {
                return uq2.h(context);
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), a));
    }

    @x1
    public static so2<xq2> d() {
        return so2.a(xq2.class).b(zo2.j(Context.class)).b(zo2.l(vq2.class)).f(rq2.a).d();
    }

    public static /* synthetic */ xq2 e(to2 to2Var) {
        return new uq2((Context) to2Var.a(Context.class), to2Var.e(vq2.class));
    }

    /* renamed from: f */
    public /* synthetic */ List g() throws Exception {
        xq2.a aVar;
        ArrayList arrayList = new ArrayList();
        yq2 yq2Var = this.b.get();
        List<ar2> f = yq2Var.f(true);
        long e = yq2Var.e();
        for (ar2 ar2Var : f) {
            boolean g = yq2.g(e, ar2Var.c());
            if (g) {
                aVar = xq2.a.COMBINED;
            } else {
                aVar = xq2.a.SDK;
            }
            if (g) {
                e = ar2Var.c();
            }
            arrayList.add(zq2.a(ar2Var.d(), ar2Var.c(), aVar));
        }
        if (e > 0) {
            yq2Var.k(e);
        }
        return arrayList;
    }

    public static /* synthetic */ yq2 h(Context context) {
        return yq2.d(context);
    }

    public static /* synthetic */ Thread i(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    private /* synthetic */ Void j(String str) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.b.get().i(str, currentTimeMillis)) {
            this.b.get().j(str, currentTimeMillis);
            return null;
        }
        return null;
    }

    @Override // com.p7700g.p99005.xq2
    public Task<Void> a(@x1 final String str) {
        if (this.c.size() <= 0) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.d, new Callable() { // from class: com.p7700g.p99005.qq2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                uq2.this.k(str);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.xq2
    @x1
    public xq2.a b(@x1 String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean i = this.b.get().i(str, currentTimeMillis);
        boolean h = this.b.get().h(currentTimeMillis);
        if (i && h) {
            return xq2.a.COMBINED;
        }
        if (h) {
            return xq2.a.GLOBAL;
        }
        if (i) {
            return xq2.a.SDK;
        }
        return xq2.a.NONE;
    }

    @Override // com.p7700g.p99005.xq2
    public Task<List<zq2>> c() {
        return Tasks.call(this.d, new Callable() { // from class: com.p7700g.p99005.oq2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return uq2.this.g();
            }
        });
    }

    public /* synthetic */ Void k(String str) {
        j(str);
        return null;
    }

    @r2
    public uq2(er2<yq2> er2Var, Set<vq2> set, Executor executor) {
        this.b = er2Var;
        this.c = set;
        this.d = executor;
    }
}