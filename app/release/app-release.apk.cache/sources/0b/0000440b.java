package com.p7700g.p99005;

import com.p7700g.p99005.u92;
import java.util.concurrent.Executor;

/* compiled from: WorkInitializer.java */
/* loaded from: classes2.dex */
public class g82 {
    private final Executor a;
    private final i92 b;
    private final i82 c;
    private final u92 d;

    @ml4
    public g82(Executor executor, i92 i92Var, i82 i82Var, u92 u92Var) {
        this.a = executor;
        this.b = i92Var;
        this.c = i82Var;
        this.d = u92Var;
    }

    private /* synthetic */ Object b() {
        for (v42 v42Var : this.b.j0()) {
            this.c.a(v42Var, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e() {
        this.d.a(new u92.a() { // from class: com.p7700g.p99005.x72
            @Override // com.p7700g.p99005.u92.a
            public final Object w0() {
                g82.this.c();
                return null;
            }
        });
    }

    public void a() {
        this.a.execute(new Runnable() { // from class: com.p7700g.p99005.y72
            @Override // java.lang.Runnable
            public final void run() {
                g82.this.e();
            }
        });
    }

    public /* synthetic */ Object c() {
        b();
        return null;
    }
}