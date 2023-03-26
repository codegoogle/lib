package com.p7700g.p99005;

import com.anchorfree.sdk.SessionConfig;

/* compiled from: RouterProvider.java */
/* loaded from: classes.dex */
public class v41 {
    @x1
    private final String a;
    @x1
    private final r41 b;
    private final boolean c;
    @x1
    private final o51 d;

    public v41(@x1 o51 o51Var, @x1 String str, @x1 r41 r41Var, boolean z) {
        this.d = o51Var;
        this.a = str;
        this.b = r41Var;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ td1 b(SessionConfig sessionConfig, dq0 dq0Var) throws Exception {
        td1 td1Var = (td1) dq0Var.F();
        boolean z = true;
        if (td1Var != null && sessionConfig != null) {
            if (sessionConfig.isKeepVpnOnReconnect() && !this.c) {
                z = false;
            }
            return new jd1(z, td1Var, this.a);
        } else if (!this.c || td1Var == null) {
            return null;
        } else {
            return new jd1(true, td1Var, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ dq0 d(dq0 dq0Var) throws Exception {
        final SessionConfig sessionConfig = (SessionConfig) dq0Var.F();
        return this.b.h().q(new aq0() { // from class: com.p7700g.p99005.dz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                return v41.this.b(sessionConfig, dq0Var2);
            }
        });
    }

    @x1
    @r2(otherwise = 3)
    public dq0<td1> e() {
        return this.d.m0().u(new aq0() { // from class: com.p7700g.p99005.cz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return v41.this.d(dq0Var);
            }
        });
    }

    public v41(@x1 o51 o51Var, @x1 String str, @x1 r41 r41Var) {
        this(o51Var, str, r41Var, false);
    }
}