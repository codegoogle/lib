package com.p7700g.p99005;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p7700g.p99005.j52;
import com.p7700g.p99005.u92;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Uploader.java */
/* loaded from: classes2.dex */
public class e82 {
    private static final String a = "Uploader";
    private final Context b;
    private final g52 c;
    private final i92 d;
    private final i82 e;
    private final Executor f;
    private final u92 g;
    private final v92 h;

    @ml4
    public e82(Context context, g52 g52Var, i92 i92Var, i82 i82Var, Executor executor, u92 u92Var, @ca2 v92 v92Var) {
        this.b = context;
        this.c = g52Var;
        this.d = i92Var;
        this.e = i82Var;
        this.f = executor;
        this.g = u92Var;
        this.h = v92Var;
    }

    private /* synthetic */ Iterable b(v42 v42Var) {
        return this.d.T(v42Var);
    }

    private /* synthetic */ Object d(j52 j52Var, Iterable iterable, v42 v42Var, int i) {
        if (j52Var.c() == j52.a.TRANSIENT_ERROR) {
            this.d.L1(iterable);
            this.e.a(v42Var, i + 1);
            return null;
        }
        this.d.x(iterable);
        if (j52Var.c() == j52.a.OK) {
            this.d.c0(v42Var, j52Var.b() + this.h.a());
        }
        if (this.d.G1(v42Var)) {
            this.e.b(v42Var, 1, true);
            return null;
        }
        return null;
    }

    private /* synthetic */ Object f(v42 v42Var, int i) {
        this.e.a(v42Var, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(final v42 v42Var, final int i, Runnable runnable) {
        try {
            try {
                u92 u92Var = this.g;
                final i92 i92Var = this.d;
                Objects.requireNonNull(i92Var);
                u92Var.a(new u92.a() { // from class: com.p7700g.p99005.r72
                    @Override // com.p7700g.p99005.u92.a
                    public final Object w0() {
                        return Integer.valueOf(i92.this.u());
                    }
                });
                if (!a()) {
                    this.g.a(new u92.a() { // from class: com.p7700g.p99005.w72
                        @Override // com.p7700g.p99005.u92.a
                        public final Object w0() {
                            e82.this.g(v42Var, i);
                            return null;
                        }
                    });
                } else {
                    j(v42Var, i);
                }
            } catch (t92 unused) {
                this.e.a(v42Var, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public /* synthetic */ Iterable c(v42 v42Var) {
        return this.d.T(v42Var);
    }

    public /* synthetic */ Object e(j52 j52Var, Iterable iterable, v42 v42Var, int i) {
        d(j52Var, iterable, v42Var, i);
        return null;
    }

    public /* synthetic */ Object g(v42 v42Var, int i) {
        this.e.a(v42Var, i + 1);
        return null;
    }

    public void j(final v42 v42Var, final int i) {
        j52 a2;
        p52 p52Var = this.c.get(v42Var.b());
        final Iterable<o92> iterable = (Iterable) this.g.a(new u92.a() { // from class: com.p7700g.p99005.v72
            @Override // com.p7700g.p99005.u92.a
            public final Object w0() {
                return e82.this.c(v42Var);
            }
        });
        if (iterable.iterator().hasNext()) {
            if (p52Var == null) {
                d72.b(a, "Unknown backend for %s, deleting event batch for it...", v42Var);
                a2 = j52.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (o92 o92Var : iterable) {
                    arrayList.add(o92Var.b());
                }
                a2 = p52Var.a(i52.a().b(arrayList).c(v42Var.c()).a());
            }
            final j52 j52Var = a2;
            this.g.a(new u92.a() { // from class: com.p7700g.p99005.t72
                @Override // com.p7700g.p99005.u92.a
                public final Object w0() {
                    e82.this.e(j52Var, iterable, v42Var, i);
                    return null;
                }
            });
        }
    }

    public void k(final v42 v42Var, final int i, final Runnable runnable) {
        this.f.execute(new Runnable() { // from class: com.p7700g.p99005.u72
            @Override // java.lang.Runnable
            public final void run() {
                e82.this.i(v42Var, i, runnable);
            }
        });
    }
}