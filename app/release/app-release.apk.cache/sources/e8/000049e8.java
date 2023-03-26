package com.p7700g.p99005;

import com.p7700g.p99005.u92;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes2.dex */
public class j72 implements l72 {
    private static final Logger a = Logger.getLogger(z42.class.getName());
    private final i82 b;
    private final Executor c;
    private final g52 d;
    private final i92 e;
    private final u92 f;

    @ml4
    public j72(Executor executor, g52 g52Var, i82 i82Var, i92 i92Var, u92 u92Var) {
        this.c = executor;
        this.d = g52Var;
        this.b = i82Var;
        this.e = i92Var;
        this.f = u92Var;
    }

    private /* synthetic */ Object b(v42 v42Var, p42 p42Var) {
        this.e.v1(v42Var, p42Var);
        this.b.a(v42Var, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(final v42 v42Var, i32 i32Var, p42 p42Var) {
        try {
            p52 p52Var = this.d.get(v42Var.b());
            if (p52Var == null) {
                String format = String.format("Transport backend '%s' is not registered", v42Var.b());
                a.warning(format);
                i32Var.a(new IllegalArgumentException(format));
                return;
            }
            final p42 b = p52Var.b(p42Var);
            this.f.a(new u92.a() { // from class: com.p7700g.p99005.i72
                @Override // com.p7700g.p99005.u92.a
                public final Object w0() {
                    j72.this.c(v42Var, b);
                    return null;
                }
            });
            i32Var.a(null);
        } catch (Exception e) {
            Logger logger = a;
            StringBuilder G = wo1.G("Error scheduling event ");
            G.append(e.getMessage());
            logger.warning(G.toString());
            i32Var.a(e);
        }
    }

    @Override // com.p7700g.p99005.l72
    public void a(final v42 v42Var, final p42 p42Var, final i32 i32Var) {
        this.c.execute(new Runnable() { // from class: com.p7700g.p99005.h72
            @Override // java.lang.Runnable
            public final void run() {
                j72.this.e(v42Var, i32Var, p42Var);
            }
        });
    }

    public /* synthetic */ Object c(v42 v42Var, p42 p42Var) {
        this.e.v1(v42Var, p42Var);
        this.b.a(v42Var, 1);
        return null;
    }
}